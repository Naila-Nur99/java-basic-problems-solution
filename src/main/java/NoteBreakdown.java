import java.util.Scanner;

public class NoteBreakdown {
    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = input.nextInt();

        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                int count = amount / notes[i];
                System.out.println(notes[i] + " " + count);
                amount = amount % notes[i];
            }
        }

        input.close();
    }
}

