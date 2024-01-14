package com.ObjectPool;

public class Restaurant extends Thread {
    
    @Override
    public void run() {
        Reception tableManager = Reception.getInstance();
        Table table;

        while ((table = tableManager.takeTable()) == null) {
        }

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tableManager.releaseTable(table);
    }
}
