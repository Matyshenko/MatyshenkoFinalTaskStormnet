package by.matyshenko.finaltask.specifications;

import by.matyshenko.finaltask.car.Car;

import java.util.Comparator;
import java.util.List;

public enum Model implements Comparator<Car> {
    RENAULT("Renault"),
    PEUGEOT("Peugeot"),
    CITROEN("Citroen"),
    TOYOTA("Toyota"),
    NISSAN("Nissan"),
    MAZDA("Mazda");

    private String name;

    Model(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compare(Car o1, Car o2) {
        return 0;
    }
}
