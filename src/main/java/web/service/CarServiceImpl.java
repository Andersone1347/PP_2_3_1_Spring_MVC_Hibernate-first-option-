package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1,"MehaCar","car1"));
        cars.add(new Car(2,"MegaCar","car2"));
        cars.add(new Car(3,"UltraCar","car3"));
        cars.add(new Car(4,"HowMuchCar","car4"));
        cars.add(new Car(5,"RedCar","car5"));
        cars.add(new Car(6,"BlueCar","car6"));
        cars.add(new Car(7,"GreenCar","car7"));
        cars.add(new Car(8,"WhiteCar","car8"));
        cars.add(new Car(9,"OrangeCar","car9"));
        return cars;
    }

    public List<Car> printWelcomeCar(int count){
    List<Car> carsList = getCars();
    if (count >= 5){
        return carsList;
    } else {
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
}
