package by.matyshenko.finaltask.creatorparkingplaces;

import by.matyshenko.finaltask.car.Car;
import by.matyshenko.finaltask.car.CarWithTrailer;
import by.matyshenko.finaltask.car.FamilyCar;
import by.matyshenko.finaltask.car.SportCar;
import by.matyshenko.finaltask.specifications.Color;
import by.matyshenko.finaltask.specifications.Model;
import by.matyshenko.finaltask.specifications.Transmission;

import java.util.Scanner;

import static by.matyshenko.finaltask.Parking.cars;

public class CreatorParkingPlace {


    public void createCarPlaces() {
        Car firstCarWithTrailer = new CarWithTrailer(Model.NISSAN, Color.WHITE, Transmission.AUTOMATHICAL, 210, 30000, true);
        Car secondCarWithTrailer = new CarWithTrailer(Model.TOYOTA, Color.RED, Transmission.MECHANICAL, 250, 25000, false);
        Car firstSportCar = new SportCar(Model.RENAULT, Color.BLUE, Transmission.MECHANICAL, 150, 1850);
        Car secondSportCar = new SportCar(Model.MAZDA, Color.WHITE, Transmission.MECHANICAL, 312, 1350);
        Car thirdSportCar = new SportCar(Model.TOYOTA, Color.RED, Transmission.MECHANICAL, 212, 1350);
        Car fourthSportCar = new SportCar(Model.MAZDA, Color.WHITE, Transmission.AUTOMATHICAL, 312, 1350);
        Car firstFamilyCar = new FamilyCar(Model.CITROEN, Color.YELLOW, Transmission.AUTOMATHICAL, 126, 1650);
        Car secondFamilyCar = new FamilyCar(Model.PEUGEOT, Color.BLUE, Transmission.AUTOMATHICAL, 138, 1750);
        Car thirdFamilyCar = new FamilyCar(Model.PEUGEOT, Color.WHITE, Transmission.AUTOMATHICAL, 186, 2750);
        Car fourthFamilyCar = new FamilyCar(Model.RENAULT, Color.BLUE, Transmission.MECHANICAL, 148, 4750);
        Car fifthFamilyCar = new FamilyCar(Model.TOYOTA, Color.WHITE, Transmission.AUTOMATHICAL, 178, 2550);

        CreatorParkingPlace creatorParkingPlace = new CreatorParkingPlace();

        creatorParkingPlace.moveCars(firstCarWithTrailer);
        creatorParkingPlace.moveCars(secondCarWithTrailer);
        creatorParkingPlace.moveCars(firstSportCar);
        creatorParkingPlace.moveCars(secondSportCar);
        creatorParkingPlace.moveCars(thirdSportCar);
        creatorParkingPlace.moveCars(fourthSportCar);
        creatorParkingPlace.moveCars(firstFamilyCar);
        creatorParkingPlace.moveCars(secondFamilyCar);
        creatorParkingPlace.moveCars(thirdFamilyCar);
        creatorParkingPlace.moveCars(fourthFamilyCar);
        creatorParkingPlace.moveCars(fifthFamilyCar);
    }

    public void moveCars(Car newCars) { //метод, который позволяет расширять парковку по выбору пользователя
        if (cars.size() <= 9) {
            System.out.println("In the parking " + cars.size() + " cars");
            cars.add(newCars);
        } else if (cars.size() >= 10) {
            System.out.println("No parking available!");
            System.out.println("Do you want add new parking places?");
            System.out.println("You need enter 'yes' or 'no': ");

            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();

            switch (answer) {
                case "yes":
                    cars.add(newCars);
                    System.out.println("In the parking " + cars.size() + " cars");
                    break;
                case "no":
                    System.out.println("In the parking " + cars.size() + " cars");
                    break;
                case "boom": // вариант для взрыва парковки :)
                    cars.clear();
                    System.out.println("Boom!!! In the parking " + cars.size() + " cars");
                    break;
                default:
                    System.out.println("Error. You enter no 'yes' or 'no'! ");
                    break;
            }
        }
    }
}
