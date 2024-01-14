package Singleton;

public class Main {

    public static void main(String args[]) {

        Student obj1 = Student.getInstance("Created Object");
        obj1.setName("Mert Denizgez");
        obj1.setNumber(160201036);

        Runner t1 = new Runner("t1");
        Runner t2 = new Runner("t2");
        Runner t3 = new Runner("t3");
        Runner t4 = new Runner("t4");
        Runner t5 = new Runner("t5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

}
