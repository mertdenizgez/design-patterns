package VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public interface InsuranceCompany {
    void accept(Visitor obj);
}
