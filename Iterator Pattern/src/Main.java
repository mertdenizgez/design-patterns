public class Main {

    public static void main(String[] args) {
        String[] standings = { "lvp", "manu", "chl", "ars" };

        var itr = new StringArrayIterator(standings);
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
