package lesson4;

public class BooleanOperationsDemo {
    public static void main(String[] args) {
        int temperature = 20;

        boolean isRainingNow = true;

        boolean isPandemiaTime = false;

        if (temperature > 19) {
            if (!isRainingNow) {
                System.out.println("I will go for a walk");
            }
        }
        // & &&
        if (temperature > 19 && !isRainingNow && !isPandemiaTime) {
            System.out.println("I will go for a walk");
        }

        // |  ||
        boolean warmOutside = isWarmOutside();
        if (isPandemiaTime || isRainingNow || warmOutside) {
            System.out.println("I will stay at home");
        }


    }

    public static boolean isWarmOutside() {
        return false;
    }
}
