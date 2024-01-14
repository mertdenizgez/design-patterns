public class Main {
    public static void main(String[] args) {

        Subject sbj = new Subject();
        new Observer1(sbj);
        new Observer2(sbj);
        new Observer3(sbj);

        int i = 0;
        while (i < 1000) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    sbj.setState("15");
                }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    sbj.setState("20");
                }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    sbj.setState("25");
                }
            }).start();

            i++;
        }

    }
}
