package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {


    private final List<Car> cars;

    public void fillListOfCars() {
        cars.add(new Car("BMW", "101", "black"));
        cars.add(new Car("Mercedes", "202", "white"));
        cars.add(new Car("Kia", "303", "grey"));
        cars.add(new Car("Jeep", "404", "red"));
        cars.add(new Car("Haval", "505", "blue"));
    }


    @Override
    public List<Car> getListOfCars(Long carsCount) {
        if (carsCount == null) {
            carsCount = (long) Integer.MAX_VALUE;
        }
        return cars.stream().limit(carsCount).collect(Collectors.toList());
    }

    public CarServiceImp() {
        cars = new ArrayList<>();
        fillListOfCars();
    }


}
