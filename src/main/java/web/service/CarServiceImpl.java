package web.service;

import web.model.Car;
import java.util.List;

public class CarServiceImpl implements CarService{
    @Override
    public void getCarList(List<Car> carList, int numOfCars) {
        for (int i = 0; i < numOfCars; i++) {
            System.out.println(carList.get(i).toString());
        }
    }



}
