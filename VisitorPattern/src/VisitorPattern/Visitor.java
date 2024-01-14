package VisitorPattern;

public interface Visitor {
    void Visit(Bank obj);

    void Visit(Cafe obj);

    void Visit(Factory obj);

    void Visit(Home obj);
}
