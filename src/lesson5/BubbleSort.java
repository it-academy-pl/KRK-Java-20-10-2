package lesson5;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 9, 1, 0, -2, 3};
        System.out.println(Arrays.toString(array));

        int n = 0;
        boolean sorted;
        int counter = 0;

        do {
            sorted = true;
            for (int k = 0; k < array.length - 1 - n; k++) {
                if(array[k] > array[k+1]) {
                    sorted = false;
                    int tmp = array[k];
                    array[k] = array[k+1];
                    array[k+1] = tmp;
                }
                counter++;
            }
            n++;
        } while (!sorted);

        System.out.println(Arrays.toString(array));
        System.out.printf("Performed %d steps", counter);
    }
}
