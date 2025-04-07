import java.util.Scanner;

public class IPAddressValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an IP address: ");
        String ipAddress = sc.nextLine();

        String[] parts = ipAddress.split("\\.");
        if (parts.length != 4) {
            System.out.println("Invalid IP");
            return;
        }

        for (int i = 0; i < 4; i++) {
            String part = parts[i];

            if (!part.matches("\\d+")) {
                System.out.println("Invalid IP");
                return;
            }

            int num = Integer.parseInt(part);
            if (num < 0 || num > 255) {
                System.out.println("Invalid IP");
                return;
            }
            if (i == 0 && num == 0) {
                System.out.println("Invalid IP");
                return;
            }
            if (i == 0 && num == 1) {
                System.out.println("Invalid IP");
                return;
            }
        }

        System.out.println("Valid IP");
    }
}
