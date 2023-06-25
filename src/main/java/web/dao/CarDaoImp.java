package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.List;
@Repository
public class CarDaoImp implements CarDao {
    private final Car car;
    @Autowired
    public CarDaoImp(Car car) {
        this.car = car;
    }

    @Override
    public List<Car> getListCar() {
        return List.of(
                car.createCar("blue", "BMW", 345334L),
                car.createCar("yellow", "LADA", 464123L),
                car.createCar("green", "SKODA", 67831L),
                car.createCar("orange", "OPEL", 4351L),
                car.createCar("white", "BMW", 54353004L)
        );
    }
}
