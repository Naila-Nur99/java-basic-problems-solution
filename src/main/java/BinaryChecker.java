import java.util.Scanner;

public class BinaryChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean isBinary = true;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != '0' && ch != '1') {
                isBinary = false;
                break;
            }
        }
        System.out.println(isBinary);
        sc.close();
    }
}
