package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    @GetMapping
    public String carsList(ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "101", "black"));
        cars.add(new Car("Mercedes", "202", "white"));
        cars.add(new Car("Kia", "303", "grey"));
        cars.add(new Car("Jeep", "404", "red"));
        cars.add(new Car("Haval", "505", "blue"));
        model.addAttribute("cars", cars);
        return "cars";
    }
}
