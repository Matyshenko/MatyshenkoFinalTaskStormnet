package by.matyshenko.finaltask.specifications;

public enum Color {
    RED("Red"),
    BLUE("Blue"),
    GREEN("Green"),
    YELLOW("Yellow"),
    WHITE("White"),
    BLACK("Black");

private String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
