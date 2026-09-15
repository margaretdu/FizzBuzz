package lab1;

public class Multiples {
    public static void main() {
        int count3 = 1000 / 3;
        int count5 = 1000 / 5;
        int count15 = 1000 / 15;
        int count = count3 + count5 - count15;
        System.out.println(count);
    }
}
