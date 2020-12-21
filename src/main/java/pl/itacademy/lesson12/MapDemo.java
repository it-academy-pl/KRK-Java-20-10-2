package pl.itacademy.lesson12;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
//        Map<String, Integer> itemPrices = new HashMap<>();
        Map<String, Integer> itemPrices = new TreeMap<>();
        itemPrices.put("Milk", 250);
        itemPrices.put("Potato", 320);
        itemPrices.put("Cheese", 760);

        System.out.println(itemPrices);

        itemPrices.put("Milk", 210);
        System.out.println(itemPrices);

        System.out.println("Milk price is: " + itemPrices.get("Milk"));

        System.out.println(itemPrices.values());
        System.out.println(itemPrices.keySet());
        System.out.println(itemPrices.entrySet());

        for (Map.Entry<String, Integer> entry : itemPrices.entrySet()) {
            String name = entry.getKey();
            Integer price = entry.getValue();
        }

        System.out.println(itemPrices.get("Potato"));
    }
}
