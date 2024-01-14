public class Observer1 extends Observer {
    public Observer1(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void update() {
        System.out.println(this + ":" + subject.getState());
    }
}
