package VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class Bank implements InsuranceCompany {

    public void accept(Visitor obj) {

        obj.Visit(this);
    }

    List<String> insurances = new ArrayList<String>();

    @Override
    public String toString() {
        return "Bank " + this.insurances.toString();
    }
}
