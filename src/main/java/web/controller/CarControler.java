package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.servise.CarServise;

import java.util.List;

@Controller
public class CarControler {

    private final CarServise carService;

    @Autowired
    public CarControler(CarServise carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", defaultValue = "5") Integer count, Model model) {
//        List<Car> cars = carService.showCars(count);
        model.addAttribute("cars", carService.showCars(count));
        return "cars";
    }
    
    
}
