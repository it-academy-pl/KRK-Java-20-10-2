package pl.itacademy.lesson16;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class IceCreamFactory {
    private static IceCreamFactory instance;

    private final List<String> iceCreams = new ArrayList<>();

    private IceCreamFactory() {
    }

    public String getRandomIceCreamName() {
        int i = ThreadLocalRandom.current().nextInt(iceCreams.size());
        return iceCreams.get(i);
    }

    public void addNewIceCreamName(String name) {
        iceCreams.add(name);
    }

    public static IceCreamFactory getInstance() {
        if(instance == null) {
            instance = new IceCreamFactory();
        }
        return instance;
    }
}
