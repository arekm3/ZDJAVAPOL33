package exercises;

import java.util.Arrays;

public class Ex7 {
    public static void getArithmeticSequence(int lenght, int firstNumber, int incrementValue) {
        int[] array = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            array[i] = firstNumber;
            firstNumber = firstNumber + incrementValue;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        getArithmeticSequence(5,2,3) ;
    }
}
