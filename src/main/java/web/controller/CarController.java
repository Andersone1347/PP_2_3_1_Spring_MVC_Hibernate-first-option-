package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;
@Controller
public class CarController {

    private  final CarServiceImpl carServiceImpl;
@Autowired
    public CarController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping(value = "/cars")
    public String printWelcomeCar(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
       model.addAttribute("car_list",carServiceImpl.printWelcomeCar(count));
        return "cars";
    }
}