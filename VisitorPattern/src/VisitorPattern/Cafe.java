package VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class Cafe implements InsuranceCompany {
    public void accept(Visitor obj) {
        obj.Visit(this);
    }

    List<String> insurances = new ArrayList<String>();

    public String toString() {
        return "Cafe " + this.insurances.toString();
    }
}
