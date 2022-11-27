package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public interface CarService {
    List<Car> getCarList(int count);
}