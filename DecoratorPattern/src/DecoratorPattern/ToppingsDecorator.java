package DecoratorPattern;

public abstract class ToppingsDecorator implements Pizza {

    private Pizza pizza;

    protected double prize;

    public ToppingsDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getToppings() {
        return pizza.getToppings();
    }

    public double getPrize() {
        return pizza.getPrize();
    }

    public void setToppings(String topping) {
        pizza.setToppings(topping);
    }

    public void setPrize(double prize) {
        pizza.setPrize(prize);
    }

}
