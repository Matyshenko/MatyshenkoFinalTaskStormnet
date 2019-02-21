package by.matyshenko.finaltask.car;

import by.matyshenko.finaltask.specifications.Color;
import by.matyshenko.finaltask.specifications.Model;
import by.matyshenko.finaltask.specifications.Transmission;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private Model model;
    private Color color;
    private Transmission transmission;
    private int powerOfEngine;
    private int weight;

    public Car() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return powerOfEngine == car.powerOfEngine &&
                weight == car.weight &&
                model == car.model &&
                color == car.color &&
                transmission == car.transmission;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, transmission, powerOfEngine, weight);
    }

    @Override
    public int compareTo(Car cars) {
        return this.model
                .compareTo(cars.model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", color=" + color +
                ", transmission=" + transmission +
                ", powerOfEngine=" + powerOfEngine +
                ", weight=" + weight +
                '}';
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public int getPowerOfEngine() {
        return powerOfEngine;
    }

    public void setPowerOfEngine(int powerOfEngine) {
        this.powerOfEngine = powerOfEngine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Car(Model model, Color color, Transmission transmission, int powerOfEngine, int weight) {
        this.model = model;
        this.color = color;
        this.transmission = transmission;
        this.powerOfEngine = powerOfEngine;
        this.weight = weight;
    }
}
