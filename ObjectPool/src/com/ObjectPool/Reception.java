package com.ObjectPool;

import java.util.ArrayList;
import java.util.List;

public class Reception {

    private static Reception tableManager = null;
    private List<Table> availableTableList = null;
    private List<Table> reservedTableList = null;
    private List<String> waitingList = null;
    private int counter = 0;

    private Reception() {
        availableTableList = new ArrayList<>();
        reservedTableList = new ArrayList<>();
        waitingList = new ArrayList<>();
    }

    public static synchronized Reception getInstance() {
        if (tableManager == null) {
            tableManager = new Reception();
        }
        return tableManager;
    }

    public synchronized Table takeTable() {
        String threadName = Thread.currentThread().getName();
        if (!waitingList.isEmpty()) { // True if waiting list has a variable
            if (waitingList.contains(threadName)) { // True if thread is already in waiting list
                if (!availableTableList.isEmpty()) { // True if any table is available
                    Table table = availableTableList.get(0);
                    reservedTableList.add(table);
                    availableTableList.remove(0);
                    waitingList.remove(threadName);
                    System.out.println(Thread.currentThread().getName() + " takes the Table-" + table.getId() + " Table Hash Code:" + table.hashCode());
                    return table;
                }
                
                return null; //There is not any available table and the thread is already in the waiting list.
            }
            waitingList.add(threadName); // There is not any available table and the thread does not in the waiting list.
            return null;

        }

        if (!availableTableList.isEmpty()) { // Waiting list empty and there is available table in restaurant
            Table table = availableTableList.get(0);
            reservedTableList.add(table);
            availableTableList.remove(0);
            System.out.println(Thread.currentThread().getName() + " takes the Table-" + table.getId() + " Table Hash Code:" + table.hashCode());
            return table;
        }

        // Waiting list empty and there is not any available table in restaurant
        if (counter < 10) {// If program have a need to table and the current table count is below the max table count create a table.
            Table table = new Table();
            table.setId(counter);
            reservedTableList.add(table);
            counter++;
            System.out.println(Thread.currentThread().getName() + " takes the Table-" + table.getId() + " Table Hash Code:" + table.hashCode());
            return table;
        }

        // Otherwise add the thread to the list
        waitingList.add(threadName);
        return null;
    }

    public synchronized void releaseTable(Table table) {
        // Thread releases the table
        // Adds the table object into the available table list
        // Removes it from reserved table list
        System.out.println("Threads in waiting list:\n" + waitingList);
        System.out.println(Thread.currentThread().getName() + " releases the Table-" + table.getId() + " Table Hash Code: " + table.hashCode());
        reservedTableList.remove(table);
        availableTableList.add(table);
    }
}
