package com.prototypePattern;

import java.util.ArrayList;

public class DroidFactory extends SoldierFactory{
    // Federation
    // Generate Object with Shallow Copy

    public DroidFactory(){
        this.side = "Federation";
        this.equipment = new ArrayList<>();
        fillEquipment();
    }

    protected void fillEquipment(){
        this.equipment.add("CPU");
        this.equipment.add("Camera");
        this.equipment.add("Laser Gun");
        this.equipment.add("Harita");
    }

    public SoldierFactory clone(){
        return this;
    }

}
