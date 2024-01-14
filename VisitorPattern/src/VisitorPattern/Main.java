public class Main {
    public static void main(String[] args) {

        List<InsuranceCompany> liste = new ArrayList<InsuranceCompany>();
        liste.add(new Bank());
        liste.add(new Factory());
        liste.add(new Cafe());
        liste.add(new Home());

        CreateInsurance insurance = new CreateInsurance();

        for (int i = 0; i < liste.size(); i++) {
            liste.get(i).accept(insurance);
        }
        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i).toString());
        }
    }
}