import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача 1,2");
        int[] numbers = new int[]{1, 2, 3};
        double[] numbers2 = {1.57d, 7.654d, 9.986d};
        int[] numbers3 = {15, 17, 19, 69};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i]);
            if (i != numbers2.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < numbers3.length; i++) {
            System.out.print(numbers3[i]);
            if (i != numbers3.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("Задача 3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 3) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = numbers2.length - 1; i >= 0; i--) {
            System.out.print(numbers2[i]);
            if (i != numbers2.length - 3) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = numbers3.length - 1; i >= 0; i--) {
            System.out.print(numbers3[i]);
            if (i != numbers3.length - 4) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        int[] num = {1, 2, 3};
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                num[i] = num[i] + 1;
            }
        }
        System.out.print(Arrays.toString(num));
    }
}








