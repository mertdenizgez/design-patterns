package com.prototypePattern;

import java.util.ArrayList;

public class StormtrooperFactory extends SoldierFactory{
    // Republic
    // Generate Object with Deep Copy

    public StormtrooperFactory(){
        this.side = "Republic";
        this.equipment = new ArrayList<>();
        fillEquipment();
    }

    protected void fillEquipment(){
        this.equipment.add("Helmet");
        this.equipment.add("Laser Gun");
    }

    public Object clone() throws CloneNotSupportedException {
        SoldierFactory clone = (SoldierFactory)super.clone();
        clone.equipment = new ArrayList<>(this.equipment);
        return (SoldierFactory)clone;
    }
}
