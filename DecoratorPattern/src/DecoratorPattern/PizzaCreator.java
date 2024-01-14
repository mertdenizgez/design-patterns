package DecoratorPattern;

import java.util.ArrayList;
import java.util.List;

public class PizzaCreator implements Pizza {

    private final List<String> toppings = new ArrayList<>();
    private double prize = 0;

    public String getToppings() {
        return toppings.toString();
    }

    public void setToppings(String topping) {
        toppings.add(topping);
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize += prize;
    }
}
