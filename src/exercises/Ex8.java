package exercises;

public class Ex8 {
    public static boolean isTableArithmeticRow(int[] row) {
        int difference = row[1] - row[0];

        for (int i = 2; i < row.length; i++) {
            if (row[i] - row[i - 1] != difference) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int []a = {1,2,3};
        int []b = {2,3,10};
        int []c = {1};
        int []d = {10,6,1};
        int []e = {2,4,6};

        System.out.println(isTableArithmeticRow(a));
        System.out.println(isTableArithmeticRow(b));
        System.out.println(isTableArithmeticRow(d));
        System.out.println(isTableArithmeticRow(e));
    }
}
