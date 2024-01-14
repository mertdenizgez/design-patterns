package DecoratorPattern;

public class Corn extends ToppingsDecorator {

    public Corn(Pizza obj) {
        super(obj);
        this.prize = 5;

        System.out.println("Corn Added.");
        
        setToppings();
        setPrize();
    }

    public void setToppings() {
        super.setToppings("corn");
    }

    public void setPrize() {
        super.setPrize(this.prize);
    }

}
