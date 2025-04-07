import java.util.Scanner;

public class CGPABinarySearch {
    public static void main(String[] args) {
        double[] scores = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        for (int i = 0; i < scores.length; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[i] > scores[j]) {
                    double temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a CGPA to search: ");
        double target = sc.nextDouble();
        int low = 0, high = scores.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (scores[mid] == target) {
                found = true;
                break;
            } else if (scores[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (found) {
            System.out.println("CGPA " + target + " is found in the array.");
        } else {
            System.out.println("CGPA " + target + " is NOT found in the array.");
        }

        sc.close();
    }
}
