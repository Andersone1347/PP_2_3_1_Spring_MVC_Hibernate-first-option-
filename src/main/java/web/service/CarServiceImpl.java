package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> printWelcomeCar(int count){
    List<Car> cars = new ArrayList<>();
    cars.add(new Car(1,"MehaCar","car1"));
    cars.add(new Car(2,"MegaCar","car2"));
    cars.add(new Car(3,"UltraCar","car3"));
    cars.add(new Car(4,"HowMuchCar","car4"));
    cars.add(new Car(5,"RedCar","car5"));
    return cars.stream().limit(count).collect(Collectors.toList());
}
}
