package exercises;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        int[] a = {12, 7, 9};

        a = swapFirstToThird(a);
        System.out.println(Arrays.toString(a));
    }

    public static int[] swapFirstToThird(int[] numbers) {
        int buf;
        if (numbers.length < 3) {
            return numbers;
        }
        buf = numbers[0];
        numbers[0] = numbers[2];
        numbers[2] = buf;
        return numbers;
    }
}

