package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

     void getCarList(List<Car> carList, int numOfCars);
}
