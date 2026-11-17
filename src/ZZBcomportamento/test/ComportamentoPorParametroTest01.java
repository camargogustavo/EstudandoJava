package ZZBcomportamento.test;

import ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(
            new Car("blue", 2022),
            new Car("red" , 2018),
            new Car("green", 2026));

    public static void main(String[] args) {
//        System.out.println(filterGreenCar(cars));
//        System.out.println(filterRedcars(cars));
//        System.out.println(filterByColor(cars, "red"));
//        System.out.println(filterByColor(cars, "blue"));
        System.out.println(filterByYear(cars, 2025));
    }

//    private static List<Car> filterGreenCar(List<Car> cars) {
//        List<Car> filterCar = new ArrayList<>();
//        for (Car car : cars) {
//            if (car.getColor().equals("green")) {
//                filterCar.add(car);
//            }
//        }
//        return filterCar;
//
//    }
//
//    private static List<Car> filterRedcars(List<Car> cars) {
//        List<Car> filterCar = new ArrayList<>();
//        for (Car car : cars) {
//            if (car.getColor().equals("green")) {
//                filterCar.add(car);
//            }
//        }
//        return filterCar;
//
//    }

    private static List<Car> filterByColor(List<Car> cars, String cor) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(cor)) {
                filterCar.add(car);
            }
        }
        return filterCar;

    }

    private static List<Car> filterByYear(List<Car> cars, int year){
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
}
