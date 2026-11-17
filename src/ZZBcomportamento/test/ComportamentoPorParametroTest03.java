package ZZBcomportamento.test;

import ZZBcomportamento.dominio.Car;
import ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(
            new Car("blue", 2022),
            new Car("red" , 2018),
            new Car("green", 2026));

    public static void main(String[] args) {
//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });
//        System.out.println(greenCars);
//    }
      List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
      List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
      List<Car> filterBefore = filter(cars, car -> car.getYear() < 2025);
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(filterBefore);
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println(filter(nums, num -> num % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filterList = new ArrayList<>();
        for (T e : list){
            if (predicate.test(e)){
                filterList.add(e);
            }
        }
        return filterList;
    }



}
