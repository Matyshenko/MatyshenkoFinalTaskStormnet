package by.matyshenko.finaltask.car;

import by.matyshenko.finaltask.specifications.Color;
import by.matyshenko.finaltask.specifications.Model;
import by.matyshenko.finaltask.specifications.Transmission;

public class FamilyCar extends Car {

    public FamilyCar(Model model, Color color, Transmission transmission, int powerOfEngine, int weight) {
        super(model, color, transmission, powerOfEngine, weight);
    }
    public FamilyCar(){

    }
}
