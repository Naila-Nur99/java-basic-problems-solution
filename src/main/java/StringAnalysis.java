import java.util.Scanner;


public class StringAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        int wordCount = 0, charCount = 0, vowelCount = 0, consonantCount = 0;
        String[] words = input.split(" ");
        wordCount = words.length;
        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (ch != ' ') {
                charCount++;
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                }
                else if (Character.isLetter(ch)) {
                    consonantCount++;
                }
            }
        }
        System.out.println("Words: " + wordCount);
        System.out.println("Chars: " + charCount);
        System.out.println("Vowel: " + vowelCount);
        System.out.println("Consonant: " + consonantCount);
        sc.close();
    }
}
