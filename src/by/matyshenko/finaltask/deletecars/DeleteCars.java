package by.matyshenko.finaltask.deletecars;

import by.matyshenko.finaltask.car.Car;
import by.matyshenko.finaltask.car.CarWithTrailer;

import static by.matyshenko.finaltask.Parking.cars;

public class DeleteCars {
    public void deleteInvalidCars() {
        for (Car weigth : cars){
            if (weigth.getWeight() > 3000){ // Удаление машин, которые весят больше 3000 кг
                cars.remove("");
                System.out.println("Remove car then weight > 3000 kg. ");
            }
        }
        for (Car avtoTrailer : cars){
            if (avtoTrailer.getClass() == CarWithTrailer.class){ // Удаление объектов, которые принадлежат к классу автомобилей с прицепом
                cars.remove("");
                System.out.println("Remove car with trailer. ");
            }
        }

    }
}
