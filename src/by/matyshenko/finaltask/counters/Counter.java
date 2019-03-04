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


    public int countWhiteColorCars(Color color) { // тут лучше на3вать метод countCarsByColour
        // ибо мы можем вы3ывать метод не только для белого цвета

        int counter = 0;
        for (Car car : cars) {
            if (color == car.getColor()) {
                counter++;
            }
        }
        return counter;
    }

    public int countCarsWithAutomatic(Transmission transmission) { // аналогично тут с на3ванием
        int counter = 0;
        for (Car carTransmission : cars) {
            if (transmission == carTransmission.getTransmission()) {
                counter++;
            }
        }
        return counter;
    }
}
