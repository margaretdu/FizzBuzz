package lab1;

public class Multiples {
    public static void main() {
        System.out.println(multiples(1000, 3, 5));
    }

    public static int multiples(int n, int a, int b) {
        int counta = (n - 1) / a;
        int countb = (n - 1) / b;
        int countab = 0;
        if (counta == countb) {
            countab = counta;
        } else {
            countab = n / (a * b);
        }
        int count = counta + countb - countab;
        return count;
    }
}
