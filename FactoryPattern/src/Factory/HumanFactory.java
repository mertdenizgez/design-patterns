package Factory;

public class HumanFactory {
    public Worker getWho(String job) {
        if (job.equals("Student"))
            return new Student();
        else if (job.equals("Teacher"))
            return new Teacher();
        else if (job.equals("Professor"))
            return new Professor();
        else
            return null;
    }
}
