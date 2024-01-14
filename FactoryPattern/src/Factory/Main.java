package Factory;

public class Main {
    public static void main(String[] args) {
        HumanFactory human = new HumanFactory();

        Worker student = human.getWho("Student");
        student.job();

        Worker teacher = human.getWho("Teacher");
        teacher.job();

        Worker professor = human.getWho("Professor");
        professor.job();
    }
}
