package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    @GetMapping
    public String carsList(@RequestParam(required = false) Long carsCount, ModelMap model) {
        model.addAttribute("cars", carService.getListOfCars(carsCount));
        return "cars";
    }

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }
}
