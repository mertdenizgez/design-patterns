public class Student {
    private static Student obj;

    private int number;
    private String name;

    private Student() {
    }

    synchronized public static Student getInstance(String name) {
        if (obj == null) {
            obj = new Student();
            System.out.println(name + " thread created " + obj);
        }
        return obj;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}