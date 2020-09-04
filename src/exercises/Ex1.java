package exercises;

public class Ex1 {
    public static void main(String[] args) {
        // write your code here
        int a = 5;
        printMultiplyTableForN(a);
        printMultiplyTableForN(3);
        printMultiplyTableForN(7);
        printMultiplyTableForN(11);

    }

    public static void printMultiplyTableForN(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}

