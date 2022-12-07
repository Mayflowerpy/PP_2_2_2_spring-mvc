package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarDao carDao;

    public List<Car> getCarList() {
        return carDao.getCarList();
    }

    @Override
    public List<Car> getCountCarList(List<Car> allCarList, int count) {
        return carDao.getCountCarList(allCarList, count);
    }
}
