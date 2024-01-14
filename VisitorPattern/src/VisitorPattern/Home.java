package VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class Home implements InsuranceCompany {
    List<String> insurances = new ArrayList<String>();

    public void accept(Visitor obj) {
        obj.Visit(this);
    }

    public String toString() {
        return "Home " + this.insurances.toString();
    }
}
