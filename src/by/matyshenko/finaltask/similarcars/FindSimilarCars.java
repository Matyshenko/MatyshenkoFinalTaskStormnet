package by.matyshenko.finaltask.similarcars;

import by.matyshenko.finaltask.car.Car;
import by.matyshenko.finaltask.specifications.Color;
import by.matyshenko.finaltask.specifications.Model;

import static by.matyshenko.finaltask.Parking.cars;

public class FindSimilarCars {

    public void similarCars(Model model, Color color) {
        for (Car modelOfCars : cars) {
            if (model == modelOfCars.getModel() && color == modelOfCars.getColor()) {
                System.out.println("Find similar car! This is: " + modelOfCars.getModel() + ". This color is: " + modelOfCars.getColor());
            }
        }
    }
}
