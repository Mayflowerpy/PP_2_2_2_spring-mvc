package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String printCars (@RequestParam(value = "num", required = false) int num,
                             ModelMap modelCar) {

        CarService carServ = new CarServiceImpl();

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", "White", 554329987));
        carList.add(new Car("Audi", "Black", 532523523));
        carList.add(new Car("Mazda", "Red", 765676456));
        carList.add(new Car("Hyundai ", "Grey", 223443563));
        carList.add(new Car("LADA", "Purple", 655549233));

//        carServ.getCarList(carList, num);

       modelCar.addAttribute("carList", carList);
        return "cars";
    }
}
