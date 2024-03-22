package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;
import java.util.ArrayList;
import java.util.List;
@Controller
public class CarController {
    private final CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping(value = "/cars")
    public String printWelcomeCar(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("car_list", carService.printWelcomeCar(count));
        return "cars";
    }
}

//class CarController
//
//- поправь кодстайл
//
//- инжекть бины через интерфейсы
//
//class CarServiceImpl
//
//- аннотируй @Service
//
//- создай поле List<Car> внутри сервиса и пусть метод берет машины из этого метода в соответсвии с логикой описанной в пункте 6 ТЗ