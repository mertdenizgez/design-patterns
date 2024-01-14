package VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class CreateInsurance implements Visitor {


    public void Visit(Bank obj) {
        obj.insurances.add(InsuranceType.Theft.toString());
        obj.insurances.add(InsuranceType.Earthquake.toString());
    }

    public void Visit(Cafe obj) {
        obj.insurances.add(InsuranceType.Theft.toString());
        obj.insurances.add(InsuranceType.NaturalDisaster.toString());
    }

    public void Visit(Factory obj) {
        obj.insurances.add(InsuranceType.NaturalDisaster.toString());
    }

    public void Visit(Home obj) {
        obj.insurances.add(InsuranceType.Earthquake.toString());
        obj.insurances.add(InsuranceType.Health.toString());
    }
}
