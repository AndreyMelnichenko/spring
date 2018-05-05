package com.music.musiclibrary.web;

import com.music.musiclibrary.model.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/car")
public class CarController {
    @GetMapping
    public Car getCarCollection(@RequestParam("id") int id){
        Car car = new Car();
        if (id == 1){
            car.setId(1);
            car.setBrand("BMW");
            car.setModel(Arrays.asList("X5","X1","725"));
        }else if(id==2){
            car.setId(2);
            car.setBrand("Mercedes Benz");
            car.setModel(Arrays.asList("C","E","S"));
        }
        return car;
    }
}
