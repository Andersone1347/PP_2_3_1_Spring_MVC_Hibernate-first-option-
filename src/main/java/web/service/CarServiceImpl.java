package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> listCars = new ArrayList<>();

    public CarServiceImpl() {
        listCars.add(new Car(1, "MehaCar", "car1"));
        listCars.add(new Car(2, "MegaCar", "car2"));
        listCars.add(new Car(3, "UltraCar", "car3"));
        listCars.add(new Car(4, "HowMuchCar", "car4"));
        listCars.add(new Car(5, "RedCar", "car5"));
        listCars.add(new Car(6, "BlueCar", "car6"));
        listCars.add(new Car(7, "GreenCar", "car7"));
        listCars.add(new Car(8, "WhiteCar", "car8"));
        listCars.add(new Car(9, "OrangeCar", "car9"));
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        if (count >= 5) {
            return listCars;
        } else {
            return listCars.stream().limit(count).collect(Collectors.toList());
        }
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








////class CarController
////
////- поправь кодстайл
////
////- инжекть бины через интерфейсы
////
////class CarServiceImpl
////
////- аннотируй @Service
////
////- создай поле List<Car> внутри сервиса и пусть метод берет машины из этого метода в соответсвии с логикой описанной в пункте 6 ТЗ