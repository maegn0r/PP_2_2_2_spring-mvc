package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService {
    static {
        fillListOfCars();
    }

    private static final List<Car> cars = new ArrayList<>();

    public static void fillListOfCars() {
        cars.add(new Car("BMW", "101", "black"));
        cars.add(new Car("Mercedes", "202", "white"));
        cars.add(new Car("Kia", "303", "grey"));
        cars.add(new Car("Jeep", "404", "red"));
        cars.add(new Car("Haval", "505", "blue"));
    }


    @Override
    public List<Car> getListOfCars(Long carsCount) {
        return cars.stream().limit(carsCount).collect(Collectors.toList());
    }

}
