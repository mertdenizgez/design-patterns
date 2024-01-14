package DecoratorPattern;

public class BreadType extends ToppingsDecorator {

    private final String bread;

    public BreadType(Pizza pizza, String breadType) {
        super(pizza);
        this.prize = 7.5;

        System.out.println("BreadType Added.");

        this.bread = breadType;
        setToppings();
        setPrize();
    }

    public void setToppings() {
        super.setToppings(bread);
    }

    public void setPrize() {
        super.setPrize(this.prize);
    }

}
