package pl.itacademy.lesson16;

public class MonthDemo {
    private static final String JAN = "January";
    private static final String FEB = "February";
    private static final String MAR = "March";

    public static void main(String[] args) {
        System.out.println(getMonthNumber(JAN));
        System.out.println(getMonthNumber(FEB));
        System.out.println(getMonthNumber(MAR));
        System.out.println(getMonthNumber("Marth"));

        System.out.println("========================");
        System.out.println(getMonthNumber(Month.JAN));
        System.out.println(getMonthNumber(Month.MAY));

        System.out.println(Month.values().length);

        System.out.println(Month.MAY.getName());

        System.out.println(Month.JAN.monthTillNewYear());
        System.out.println(Month.MAY.monthTillNewYear());

        System.out.println(Month.APR.name());
        System.out.println(Month.APR.toString());
        System.out.println(Month.APR);

        System.out.println(Month.APR.equals(Month.FEB));
        System.out.println(Month.APR == Month.FEB);

        System.out.println(Month.JAN.compareTo(Month.MAR));

        System.out.println(Month.valueOf("MAY"));

        System.out.println(Month.getByOrder(3));
        System.out.println(Month.getByOrder(6));

        System.out.println(Month.MAY.getDeclaringClass());

    }

    private static int getMonthNumber(String month) {
        switch (month) {
            case JAN:
                return 1;
            case FEB:
                return 2;
            case MAR:
                return 3;
            default:
                return 0;
        }
    }

    private static int getMonthNumber(Month month) {
        return month.getOrder();
    }
}
