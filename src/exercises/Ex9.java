package exercises;

public class Ex9 {

    public static int modulo(int dividend, int divider) {

        int division, result;

        if (divider == 0) {
            System.out.println("Dzielnik nie może wynosić 0");
            System.exit(0);
        }

        division = dividend / divider;
        result = dividend - (division * divider);
        System.out.print("Reszta z dzielenia: ");
        return result;
    }

    public static void printModulo(int dividend, int divider){
        System.out.println(modulo(dividend,divider));
    }

    public static void main(String[] args) {
        //System.out.println(modulo(7, 5));
        printModulo(7,5);
    }
}
