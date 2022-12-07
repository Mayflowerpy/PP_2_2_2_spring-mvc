package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{

    private List<Car> carList;

    {
        carList  = new ArrayList<>();
        carList.add(new Car("Toyota", "White", 554329987));
        carList.add(new Car("Audi", "Black", 532523523));
        carList.add(new Car("Mazda", "Red", 765676456));
        carList.add(new Car("Hyundai ", "Grey", 223443563));
        carList.add(new Car("LADA", "Purple", 655549233));
    }

    public List<Car> getCarList() {
        return carList;
    }


    @Override
    public List<Car> getCountCarList(List<Car> allCarList, int count) {
        if (count == 0 || count > 5) return allCarList;
        return allCarList.stream().limit(count).collect(Collectors.toList());
    }



}
