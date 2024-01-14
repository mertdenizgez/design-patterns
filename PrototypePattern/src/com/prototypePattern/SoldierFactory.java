package com.prototypePattern;

import java.util.List;

public abstract class SoldierFactory implements Cloneable{
    public List<String> equipment = null;
    public String side;
    protected abstract void fillEquipment();
}
