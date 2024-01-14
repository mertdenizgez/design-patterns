public class Observer2 extends Observer {
    public Observer2(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void update() {
        System.out.println(this + ":" + subject.getState());
    }
}
