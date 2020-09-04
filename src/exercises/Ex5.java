package exercises;

public class Ex5 {
    public static void main(String[] args) {
        int[] a = {23, 235, 453, 3, 4};
        showBiggestAndSmallestFromTable(a);
    }

    public static void showBiggestAndSmallestFromTable(int[] numbers) {
        if (numbers.length < 1) {
            System.out.println("Array is empty");
        } else {
            int min = numbers[0];
            int max = min;
            for (int number : numbers) {
                if (min > number) min = number;
                if (max < number) max = number;
            }
            System.out.println("Max: " + max + " min: " + min);
        }
    }
}

