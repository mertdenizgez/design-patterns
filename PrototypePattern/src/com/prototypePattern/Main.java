package com.prototypePattern;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        StormtrooperFactory stormtrooper = new StormtrooperFactory();
        SoldierFactory stormtrooperCopy = (StormtrooperFactory) stormtrooper.clone();

        stormtrooperCopy.equipment.add("Brain");
        System.out.println("Stormtrooper Objects Deep Copy");
        System.out.println("Original Object Hash Code: " + stormtrooper.hashCode());
        System.out.println("Copy     Object Hash Code: " + stormtrooperCopy.hashCode());
        System.out.println("Original Object Equipment:" + stormtrooper.equipment + " Hash Code:" + stormtrooper.equipment.hashCode());
        System.out.println("Copy     Object Equipment:" + stormtrooperCopy.equipment + " Hash Code:" + stormtrooperCopy.equipment.hashCode());

        DroidFactory droid = new DroidFactory();
        SoldierFactory droidCopy = (DroidFactory) droid.clone();
        System.out.println();
        droidCopy.equipment.add("Update Manager");
        System.out.println("Droid Objects Shallow Copy");
        System.out.println("Original Object Hash Code: " + droid.hashCode());
        System.out.println("Copy     Object Hash Code: " + droidCopy.hashCode());
        System.out.println("Original Object Equipment: " + droid.equipment + " Hash Code:" + droid.equipment.hashCode());
        System.out.println("Copy     Object Equipment: " + droidCopy.equipment + " Hash Code:" + droidCopy.equipment.hashCode());
    }
}
