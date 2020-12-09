package pl.itacademy.lesson17;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {
    public static void main(String[] args) {
        TVSet samsung = new TVSet(42, true, "Samsung", false);
        TVSetChecker checker = new WithWiFiChecker();
        boolean result = checkTvWithTvChecker(checker, samsung);
        System.out.printf("Is TV with WI-FI: %s%n", result);

        checker = new WithBigDiagonalChecker();
        result = checkTvWithTvChecker(checker, samsung);
        System.out.printf("Is TV with diagonal more than 42\": %s%n", result);


        checker = new TVSetChecker() {
            @Override
            public boolean checkTV(TVSet tvSet) {
                return tvSet.getDiagonal() > 42;
            }
        };
        result = checkTvWithTvChecker(checker, samsung);
        System.out.printf("Is TV with diagonal more than 42\": %s%n", result);

        checker = (TVSet tvSet) -> {
                return tvSet.getDiagonal() > 42;
        };
        result = checkTvWithTvChecker(checker, samsung);
        System.out.printf("Is TV with diagonal more than 42\": %s%n", result);

        checker = (tvSet) -> {
            return tvSet.getDiagonal() > 42;
        };
        result = checkTvWithTvChecker(checker, samsung);
        System.out.printf("Is TV with diagonal more than 42\": %s%n", result);

        checker = tvSet -> {
            return tvSet.getDiagonal() > 42;
        };
        result = checkTvWithTvChecker(checker, samsung);
        System.out.printf("Is TV with diagonal more than 42\": %s%n", result);

        checker = tvSet -> tvSet.getDiagonal() > 42;
        result = checkTvWithTvChecker(checker, samsung);
        System.out.printf("Is TV with diagonal more than 42\": %s%n", result);

        result = checkTvWithTvChecker(tvSet -> tvSet.getDiagonal() > 42, samsung);
        System.out.printf("Is TV with diagonal more than 42\": %s%n", result);

        result = checkTvWithTvChecker(tvSet -> "Samsung".equals(tvSet.getBrand()), samsung);
        System.out.printf("Is it Samsung: %s%n", result);

        result = checkTvWithTvChecker(tv -> tv.isWithBlueTooth(), samsung);
        System.out.printf("Is it TV with BlueTooth: %s%n", result);

        result = checkTvWithTvChecker(TVSet::isWithWiFi, samsung);
        System.out.printf("Is it TV with WiFi: %s%n", result);

        printTvProperty(tv -> System.out.println(tv.getBrand()), samsung);

        TVSet toshiba = new TVSet(42, false, "Toshiba", true);
        printTvProperty(System.out::println, toshiba);

        TVSet sony = createTV(() -> new TVSet(50, false, "Sony", false));
        System.out.println(sony);

        TVSet someTV = createTV(() -> new TVSet());
        System.out.println(someTV);

        TVSet someAnotherTV = createTV(TVSet::new);
        System.out.println(someAnotherTV);

        result = checkTvWithPredicate(TVSet::isWithWiFi, samsung);
        System.out.printf("Is it TV with WiFi: %s%n", result);

        printTvWithConsumer(System.out::println, someAnotherTV);

        someAnotherTV = createTVWithSupplier(TVSet::new);
        System.out.println(someAnotherTV);
    }

    private static boolean checkTvWithTvChecker(TVSetChecker checker, TVSet tvSet) {
        return checker.checkTV(tvSet);
    }

    private static void printTvProperty(TVSetPropertiesPrinter printer, TVSet tvSet) {
        printer.printProperty(tvSet);
    }

    private static TVSet createTV(TVSetCreator creator) {
        return creator.createTV();
    }

    private static boolean checkTvWithPredicate(Predicate<TVSet> checker, TVSet tvSet) {
        return checker.test(tvSet);
    }

    private static void printTvWithConsumer(Consumer<TVSet> consumer, TVSet tvSet) {
        consumer.accept(tvSet);
    }

    private static TVSet createTVWithSupplier(Supplier<TVSet> creator) {
        return creator.get();
    }

    static class WithWiFiChecker implements TVSetChecker {
        @Override
        public boolean checkTV(TVSet tvSet) {
            return tvSet.isWithWiFi();
        }
    }

    public static class WithBigDiagonalChecker implements TVSetChecker {
        @Override
        public boolean checkTV(TVSet tvSet) {
            return tvSet.getDiagonal() > 42;
        }
    }
}
