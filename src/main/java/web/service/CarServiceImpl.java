package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{

    private CarDaoImpl carDao = new CarDaoImpl();
    @Override
    public List<Car> getSomeCars(Integer count) {
        return carDao.getSomeCars(count);
    }
}
