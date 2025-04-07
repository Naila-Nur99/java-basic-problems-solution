import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "!@#$%&";

        String all = capital + small + digits + special;

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        password.append(capital.charAt(random.nextInt(capital.length())));
        password.append(small.charAt(random.nextInt(small.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(special.charAt(random.nextInt(special.length())));
        while (password.length() < 8) {
            password.append(all.charAt(random.nextInt(all.length())));
        }
        System.out.println("Generated Password: " + password.toString());
    }
}
