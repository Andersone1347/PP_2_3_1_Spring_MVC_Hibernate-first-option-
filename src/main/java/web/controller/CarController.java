package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getListCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("car_list", carService.getCarsByCount(count));
        return "cars";
    }
}
//class CarController
//
//- отступи 1 строку между импортами и описанием класса, сежду полями и между методами
//
//interface CarService
//
//- зачем тут @Component? Эта аннотация указывает спрингу и которого класса надо сделать бин, а бин это объект под управлением спринга. Создай мне объект из интерфейса...
//
//- имя метода говорит о том что он делает - что делает метод printWelcomeCar() ? Назови метод правильно getCarsByCount(count)
//
//- удали getCars()
//
//class CarServiceImpl
//
//(сейчас твоя реализация при каждом запросе создает новый спиок)
//
//- создай приватное поле список машин, инициализируй это поле при создании экземпляра класса (в конструкторе)
//
//- пусть getCarsByCount() обращается к этому списку
//
//- где оверайд над публичными методами?
//
//- почему поле публичное?







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