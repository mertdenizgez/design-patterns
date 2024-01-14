package DecoratorPattern;

public class Main {

    public static void main(String[] args) {
        Pizza pizza1 = new Corn(new Cheese(new BreadType(new PizzaCreator(), "Normal")));

        System.out.println("Pizza 1:");
        System.out.println("Toppings: " + pizza1.getToppings());
        System.out.println("Prize: " + pizza1.getPrize());

        Pizza pizza2 = new Corn(new Cheese(new PizzaCreator()));

        System.out.println("Pizza 2:");
        System.out.println("Toppings: " + pizza2.getToppings());
        System.out.println("Prize: " + pizza2.getPrize());

    }
}
