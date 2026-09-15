package lab1;

public class Multiples {
    public static void main() {
        System.out.println(multiples(1000, 3, 5));
    }

    private static int multiples(int n, int a, int b) {
        int counta = n / a;
        int countb = n / b;
        int countab =  n / (a * b);
        int count = counta + countb - countab;
        return count;
    }
}
