package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Nissan", 12, 1995));
        cars.add(new Car("BMW", 5, 2017));
        cars.add(new Car("Renault", 47, 2009));
        cars.add(new Car("Lada", 2108, 1965));
        cars.add(new Car("Porsche", 911, 2022));
    }

    @Override
    public List<Car> getCarList(int count) {
        return (count >= 0) ? cars.subList(0, Math.min(count, cars.size())) : cars;
    }
}
