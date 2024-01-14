public class Observer3 extends Observer {
    public Observer3(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void update() {
        System.out.println(this + ":" + subject.getState());
    }
}