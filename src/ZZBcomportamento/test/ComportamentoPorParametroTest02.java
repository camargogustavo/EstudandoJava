package ZZBcomportamento.test;

import ZZBcomportamento.dominio.Car;
import ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(
            new Car("blue", 2022),
            new Car("red" , 2018),
            new Car("green", 2026));

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        });
        System.out.println(greenCars);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if(carPredicate.test(car)){
                filterCar.add(car);
            }
        }
        return filterCar;

    }



}
