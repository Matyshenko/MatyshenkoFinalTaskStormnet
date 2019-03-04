package by.matyshenko.finaltask;

import by.matyshenko.finaltask.car.Car;
import java.util.*;

public class Parking {
    private String name;
    public static List<Car> cars = new ArrayList<>(10); // 10 - капасити по умолчанию
    // имеет смысл 3адавать тот параметр когда он отличен от 10
    // и тут лучше не делать static ето поле
    // иначе куча ра3ных парковок будет работать с одним и тем же списком машин

    public Parking(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "name='" + name + '\'' +
                ", cars=" + cars +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Parking() {

    }

    public Parking(String name, List<Car> cars) {
        this.name = name;
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parking parking = (Parking) o;
        return Objects.equals(name, parking.name) &&
                Objects.equals(cars, parking.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cars);
    }


}
