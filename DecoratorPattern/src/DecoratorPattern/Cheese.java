package DecoratorPattern;

public class Cheese extends ToppingsDecorator {

    public Cheese(Pizza pizza) {
        super(pizza);
        this.prize = 10;

        System.out.println("Cheese Added.");

        setToppings();
        setPrize();
    }

    public void setToppings() {
        super.setToppings("mozeralla");
    }

    public void setPrize() {
        super.setPrize(this.prize);
    }

}
