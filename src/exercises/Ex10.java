package exercises;

public class Ex10 extends Ex9 {
    public static void separator() {
        System.out.println("-------------");
    }

    public static void buildInModulo(int dividend, int divider) {
        System.out.println(dividend % divider);
    }

    public static void main(String[] args) {
        printModulo(7, 5);
        printModulo(11,2);

        separator();

        buildInModulo(7,5);
        buildInModulo(11,2);



    }
}
