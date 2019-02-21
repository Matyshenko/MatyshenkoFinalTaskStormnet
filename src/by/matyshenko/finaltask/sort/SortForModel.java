package by.matyshenko.finaltask.sort;

import java.util.Collections;

import static by.matyshenko.finaltask.Parking.cars;

public class SortForModel {
    public void sort() {
        Collections.sort(cars);
        System.out.println(cars);
    }

}
