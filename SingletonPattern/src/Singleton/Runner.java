package Singleton;

public class Runner extends Thread {

    public Student obj;
    private String name;

    public Runner(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Student obj = Student.getInstance(this.name);
        System.out.println(name + " " + obj);
    }

}
