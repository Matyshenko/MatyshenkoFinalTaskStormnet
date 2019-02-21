package by.matyshenko.finaltask.car;

import by.matyshenko.finaltask.specifications.Color;
import by.matyshenko.finaltask.specifications.Model;
import by.matyshenko.finaltask.specifications.Transmission;

public class CarWithTrailer extends Car {
private boolean isCarWithTrailer;

    public CarWithTrailer(Model model, Color color, Transmission transmission, int powerOfEngine, int weight, boolean isCarWithTrailer) {
        super(model, color, transmission, powerOfEngine, weight);
    }

    public boolean isCarWithTrailer() {
        return isCarWithTrailer;
    }

    public CarWithTrailer(){

    }

}
