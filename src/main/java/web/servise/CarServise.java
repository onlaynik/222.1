package web.servise;

import web.model.Car;

import java.util.List;

public interface CarServise {
    List<Car> showCars(Integer count);
}
