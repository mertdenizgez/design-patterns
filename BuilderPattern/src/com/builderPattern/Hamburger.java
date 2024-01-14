package com.builderPattern;

public class Hamburger {

    private final String breadType;
    private final String meatType;
    private final String drink;
    private final String potatoPortion;
    private final boolean ketchup;
    private final boolean mayonnaise;
    private final boolean lettuce;
    private final boolean onion;
    private final boolean tomato;

    private Hamburger(Builder builder) {
        this.breadType = builder.breadType;
        this.meatType = builder.meatType;
        this.drink = builder.drink;
        this.potatoPortion = builder.potatoPortion;
        this.ketchup = builder.ketchup;
        this.mayonnaise = builder.mayonnaise;
        this.lettuce = builder.lettuce;
        this.onion = builder.onion;
        this.tomato = builder.tomato;
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeatType() {
        return meatType;
    }

    public String getDrink() {
        return drink;
    }

    public String getPotatoPortion() {
        return potatoPortion;
    }

    public boolean isKetchup() {
        return ketchup;
    }

    public boolean isMayonnaise() {
        return mayonnaise;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isTomato() {
        return tomato;
    }

    public String toString() {
        return "Hamburger hasCode" + this.hashCode() + ": \nMeat Type:" + getMeatType() + " \nBread Type" + getBreadType()
                + " \nDrink:" + getDrink() + " \nPotato Portion:" + getPotatoPortion() + " \nTomato:" + isTomato()
                + " \nKetchup:" + isKetchup() + " \nLettuce:" + isLettuce() + " \nMayonnaise:" + isMayonnaise()
                + " \nOnion:" + isOnion() + "\n";
    }

    public static class Builder {
        private String breadType = "normal";
        private String meatType = "chicken";
        private String drink = "cola";
        private String potatoPortion = "small";
        private boolean ketchup = true;
        private boolean mayonnaise = true;
        private boolean lettuce = true;
        private boolean onion = true;
        private boolean tomato = true;

        public Builder breadType(String breadType) {
            this.breadType = breadType;
            return this;
        }

        public Builder meatType(String meatType) {
            this.meatType = meatType;
            return this;
        }

        public Builder drink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder potatoPortion(String potatoPortion) {
            this.potatoPortion = potatoPortion;
            return this;
        }

        public Builder ketchup(Boolean ketchup) {
            this.ketchup = ketchup;
            return this;
        }

        public Builder mayonnaise(Boolean mayonnaise) {
            this.mayonnaise = mayonnaise;
            return this;
        }

        public Builder lettuce(Boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public Builder onion(Boolean onion) {
            this.onion = onion;
            return this;
        }

        public Builder tomato(Boolean tomato) {
            this.tomato = tomato;
            return this;
        }

        public Hamburger build() {
            var hamburger = new Hamburger(this);
            return hamburger;
        }
    }
}
