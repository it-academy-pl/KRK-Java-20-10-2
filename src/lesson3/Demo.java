package lesson3;

public class Demo {
    public static void main(String[] args) {
        int[] integers = new int[3]; // [_ , _ , _]
        integers[0] = 10; // [10 , _ , _]
        integers[2] = 20; // [10 , _ , 20]
        integers[1] = 30; // [10 , 30 , 20]

        System.out.println(integers[2]);
        System.out.println(integers[0]);

        char[] chars = {'J', 'A', 'V', 'A'};
        System.out.println(chars[2]);


        String[][] strings = {{"Java", "is"}, {"difficult", "but"}, {"amazing"}};
        // 0           1
        // Java        is       0
        // difficult   but      1
        // amazing              2
        System.out.println(strings[0][0] + " " + strings[0][1] + " " + strings[2][0]);
        System.out.println("Size of outer array is: " + strings.length);
        System.out.println("Size of first inner array is: " + strings[0].length);



        String[][] anotherStrings = new String[2][2]; // like { {"one", "two"}, {"three", "four"} };
        // _  _
        // _  _

    }
}
