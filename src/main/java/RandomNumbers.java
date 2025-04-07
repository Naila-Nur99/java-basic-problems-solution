import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            numbers[i] = rand.nextInt(100);
        }
        System.out.print("Generated numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("\nMaximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}

