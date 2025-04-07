import java.util.Scanner;
public class SecondLowestHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[10];
        System.out.println("Enter the heights of 10 babies (in cm):");
        for (int i = 0; i < 10; i++) {
            heights[i] = sc.nextDouble();
        }
        double lowest = Double.MAX_VALUE, secondLowest = Double.MAX_VALUE;
        for (double value : heights) {
            if (value < lowest) {
                secondLowest = lowest;
                lowest = value;
            } else if (value < secondLowest && value != lowest) {
                secondLowest = value;
            }
        }
        System.out.println("Second lowest height: " + secondLowest + " cm");
        sc.close();
    }
}

