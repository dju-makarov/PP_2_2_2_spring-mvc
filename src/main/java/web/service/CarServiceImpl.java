package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{
    private List<Car> car = new ArrayList<>();
    private static int idCount = 0;

    {
        car.add(new Car(++idCount, "Skoda", 11));
        car.add(new Car(++idCount, "Toyota", 22));
        car.add(new Car(++idCount, "Mitsubishi", 33));
        car.add(new Car(++idCount, "KIA", 44));
        car.add(new Car(++idCount, "Mazda", 55));
    }

    @Override
    public List<Car> getSomeCars(Integer count) {
        return car.stream().limit(count).collect(Collectors.toList());
    }
}
