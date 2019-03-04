package by.matyshenko.finaltask.deletecars;

import by.matyshenko.finaltask.car.Car;
import by.matyshenko.finaltask.car.CarWithTrailer;

import static by.matyshenko.finaltask.Parking.cars;

public class DeleteCars {
    public void deleteInvalidCars() {
        for (Car weigth : cars){
            if (weigth.getWeight() > 3000 || weigth.getClass() == CarWithTrailer.class){ // тут лучше совместить удаление обоих типов машин в один ИФ
                // чтобы 3а один пробег по коллекции все удалить
                // иначе если коллекция будет млн елементов будет достаточно 3атратно пробегаться по ней дважды
                cars.remove(""); // при таком вы3ове мы будет пытаться удалить пустую строку "" и3 коллекции
                // надо
                // да и у тебя тут будет ошибка
                // смотри тут https://javarush.ru/groups/posts/855-10-oshibok-zachastuju-dopuskaemihkh-java-razrabotchikami номер 3
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
