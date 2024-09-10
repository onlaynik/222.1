package web.servise;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiseImpl implements CarServise {

    private List<Car> cars;

    public CarServiseImpl() {
        this.cars = new ArrayList<>();
        this.cars.add(new Car("Lada", "black", 2008, 199999));
        this.cars.add(new Car("Lada", "white", 2007, 19999));
        this.cars.add(new Car("Lada", "green", 2006, 1999));
        this.cars.add(new Car("Lada", "orange", 2005, 199));
        this.cars.add(new Car("Lada", "yelow", 2004, 19));
    }


    @Override
    public List<Car> showCars(Integer count) {
        if ((count == null) || (count >= cars.size())) {
            return cars;
        }
        return  cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }



}
