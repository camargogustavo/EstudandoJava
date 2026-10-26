package Ycolecoes.test;

import Ycolecoes.domain.SmartPhone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneTest01 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("1ABC1","IPhone");
        SmartPhone s2 = new SmartPhone("1ABC2","Pixel");
        SmartPhone s3 = new SmartPhone("1ABC3","Samsung");

        List<SmartPhone> smartPhones = new ArrayList<>();

        smartPhones.add(s1);
        smartPhones.add(s2);
        smartPhones.add(s3);

        for (SmartPhone smartPhone :smartPhones){
            System.out.println(smartPhone.toString());
        }
        SmartPhone s4 = new SmartPhone("1ABC2","Pixel");

        System.out.println(smartPhones.contains(s4));


    }
}
