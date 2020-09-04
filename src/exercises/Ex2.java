public class Ex2 {
    public static void main(String[] args) {
        int a = 6;
        System.out.println("Czy liczba jest pierwsza? " + isNumberPrime(a));
    }

    public static boolean isNumberPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}

