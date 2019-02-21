package by.matyshenko.finaltask.specifications;

public enum Transmission {
    AUTOMATHICAL("Automatical"),
    MECHANICAL("Mechanical");

    private String name;

    public String getName() {
        return name;
    }

    Transmission(String name) {
        this.name = name;
    }
}
