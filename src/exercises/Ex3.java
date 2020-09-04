package exercises;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Suma podanych liczb to: " + sumFromXtoY(5, 10));
    }

    public static int sumFromXtoY(int x, int y) {
        int suma = 0;
        for (int i = x; i <= y; i++) {
            suma += i;
        }
        return suma;
    }
}
