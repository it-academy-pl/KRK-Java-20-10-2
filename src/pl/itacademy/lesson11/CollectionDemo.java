package pl.itacademy.lesson11;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionDemo {
    public static void main(String[] args) {
        Chair fromIkea = new Chair("plastic", 120, 4, false);
        Chair chair = new Chair("plastic", 120, 4, false);
        Chair third = fromIkea;
        Chair fourth = new Chair("wooden", 120, 4, false);

        Chair[] chairs = {fromIkea, chair, fourth};
//        chairs = new Chair[4];
//        chairs[0] = fromIkea;
//        chairs[1] = chair;
//and so on...

        System.out.println(Arrays.toString(chairs));

        ArrayList<Chair> chairList = new ArrayList<>();
        chairList.add(fromIkea);
        chairList.add(third);
        chairList.add(fourth);
        chairList.add(chair);
        chairList.add(fourth);
        System.out.println(chairList);

        chairList.remove(fromIkea);
        System.out.println(chairList);

        chairList.remove(0);
        System.out.println(chairList);

        chairList.remove(1);
        System.out.println(chairList);
    }
}
