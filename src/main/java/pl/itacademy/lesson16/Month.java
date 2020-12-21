package pl.itacademy.lesson16;

public enum Month implements WithDays {
    JAN(0, "January", 31),
    FEB(1, "February", 28),
    MAR(2, "March", 31),
    APR(3, "April", 30),
    MAY(4, "May", 31);

    private final int order;
    private final String name;
    private final int daysNumber;

    Month(int order, String name, int daysNumber) {
        this.order = order;
        this.name = name;
        this.daysNumber = daysNumber;
    }

    public int getOrder() {
        return order;
    }

    public String getName() {
        return name;
    }

    public int monthTillNewYear() {
        return 12 - order;
    }

    @Override
    public String toString() {
        return name;
    }

    public static Month getByOrder(int order) {
        for(Month month : values()) {
            if(month.order == order) {
                return month;
            }
        }
        return null;
    }

    @Override
    public int getDaysNumber() {
        return daysNumber;
    }
}
