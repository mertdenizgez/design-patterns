package com.builderPattern;

public class Main {
        public static void main(String[] args) {
                var hamburger = new Hamburger.Builder()
                                .tomato(true)
                                .breadType("susamesee")
                                .meatType("cow")
                                .drink("ice tea")
                                .ketchup(false)
                                .lettuce(true)
                                .potatoPortion("medium")
                                .onion(false)
                                .build();

                var hamburger1 = new Hamburger.Builder()
                                .tomato(true)
                                .breadType("normal")
                                .meatType("chicken")
                                .drink("cola")
                                .ketchup(true)
                                .lettuce(true)
                                .potatoPortion("large")
                                .onion(true)
                                .build();

                var hamburger2 = new Hamburger.Builder()
                                .tomato(false)
                                .build();

                System.out.println(hamburger.toString());
                System.out.println(hamburger1.toString());
                System.out.println(hamburger2.toString());

        }
}
