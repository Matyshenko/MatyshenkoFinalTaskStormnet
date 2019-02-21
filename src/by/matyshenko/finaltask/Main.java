package by.matyshenko.finaltask;

/*Изначально парковка на 10 мест. Если пытается заехать 11-ая машина, то выводится
сообщение о том, что на парковке нету свободных мест. Пользователь должен выбрать
расширить парковку или нет. Если расширил, то идет подсчет белых, красных машин и
машин с автоматической коробкой передач. Также происходит сортировка по модели автомобиля.
Автомобили с массой более 3000 кг и которые принадлежат к классу автомобилей с прицепом
удаляются из коллекции. Поиск схожих автомобилей осуществляется по идентичной марке и
цвету.
*/

import by.matyshenko.finaltask.counters.Counter;
import by.matyshenko.finaltask.deletecars.DeleteCars;
import by.matyshenko.finaltask.similarcars.FindSimilarCars;
import by.matyshenko.finaltask.creatorparkingplaces.CreatorParkingPlace;
import by.matyshenko.finaltask.sort.SortForModel;
import by.matyshenko.finaltask.specifications.Color;
import by.matyshenko.finaltask.specifications.Model;
import by.matyshenko.finaltask.specifications.Transmission;

public class Main {
    public static void main(String[] args) {
        CreatorParkingPlace creatorParkingPlace = new CreatorParkingPlace();
        creatorParkingPlace.createCarPlaces(); // создание автомобилей с определенными параметрами


        SortForModel sortForModel = new SortForModel();
        sortForModel.sort(); // сортировка по модели

        DeleteCars deleteCars = new DeleteCars();
        deleteCars.deleteInvalidCars(); // удаление автомобилей по условиям

        Counter counter = new Counter();
        System.out.println("White cars: " + counter.countWhiteColorCars(Color.WHITE)); // Подсчет количества белых авто
        System.out.println("Red cars: " + counter.countWhiteColorCars(Color.RED)); // Подсчет количества красных авто
        System.out.println("Automatical cars: " + counter.countCarsWithAutomatic(Transmission.AUTOMATHICAL)); // Подсчет каоличества авто с АКПП

        FindSimilarCars findSimilarCars = new FindSimilarCars();
        findSimilarCars.similarCars(Model.RENAULT, Color.BLUE); // Поиск автомобиля Рено синего цвета.

    }
}
