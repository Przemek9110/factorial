package pl.sdacademy.factorial;

public class Main {
    public static void main(String[] args) {
        int[] data = new int[]{0, 2, 5, 10};
        for (int value : data) {
            System.out.printf("%d! = %d \n", value, factorial(value));
        }
    }

    public static long factorial(int value) {
        int n = 1;
        for (int i = 1; i <= value; i++) {
            n *= i;
        }
        return n;
    }
}
