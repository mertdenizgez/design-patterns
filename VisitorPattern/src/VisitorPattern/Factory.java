package VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class Factory implements InsuranceCompany {
    public void accept(Visitor obj) {
        obj.Visit(this);
    }

    List<String> insurances = new ArrayList<String>();

    public String toString() {
        return "Factory " + this.insurances.toString();
    }
}
