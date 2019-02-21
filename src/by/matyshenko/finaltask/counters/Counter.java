package by.matyshenko.finaltask.counters;

import by.matyshenko.finaltask.Parking;
import by.matyshenko.finaltask.car.Car;
import by.matyshenko.finaltask.car.CarWithTrailer;
import by.matyshenko.finaltask.specifications.Color;
import by.matyshenko.finaltask.specifications.Transmission;

import java.util.List;
import java.util.Scanner;

import static by.matyshenko.finaltask.Parking.cars;

public class Counter {


    public int countWhiteColorCars(Color color) {

        int counter = 0;
        for (Car car : cars) {
            if (color == car.getColor()) {
                counter++;
            }
        }
        return counter;
    }

    public int countCarsWithAutomatic(Transmission transmission) {
        int counter = 0;
        for (Car carTransmission : cars) {
            if (transmission == carTransmission.getTransmission()) {
                counter++;
            }
        }
        return counter;
    }
}
