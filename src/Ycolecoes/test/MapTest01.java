package Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        //Nao pode ter chaves duplicadas
        Map<String, String> map = new HashMap<>();

        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "voce");
        map.put("vc2", "voce");

        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println("_______");

        for (String value : map.values()) {
            System.out.println(value);
        }
        System.out.println("_______");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
