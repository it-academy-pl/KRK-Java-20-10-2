package pl.itacademy.lesson18;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

public class OptionalDemo {

    private static List<Sweet> sweets = new ArrayList(List.of(
            new Sweet("Candy"),
            new Sweet("Chocolate Bar"),
            new Sweet("Ice Cream"),
            new Sweet("Lolly Pop")
    ));

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
//            Optional<Sweet> optionalSweet = getRandomSweet();
//            if(optionalSweet.isPresent()) {
//                System.out.println(optionalSweet.get().name);
//            } else {
//                System.out.println("Box is empty :( ");
//            }

            String name = getRandomSweet()
                    .map(sweet -> sweet.name)
                    .orElse("Box is empty :( ");
            System.out.println(name);

            Sweet sweet = getRandomSweet()
                    .orElseThrow();
//                    .orElseGet(() -> new Sweet("Jelly belly"));
//                    .orElse(new Sweet("Jelly belly"));
            System.out.println(sweet.name);
        }
    }

    private static Optional<Sweet> getRandomSweet() {
        if (sweets.isEmpty()) {
            return Optional.empty();
        }
        int randomIndex = ThreadLocalRandom.current().nextInt(sweets.size());
        return Optional.of(sweets.remove(randomIndex));
    }

    private static class Sweet {
        private String name;

        public Sweet(String name) {
            this.name = name;
        }
    }
}
