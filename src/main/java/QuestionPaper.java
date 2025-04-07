public class QuestionPaper {
    public static void main(String[] args) {

        int totalQuestions = 15;
        int totalMarks = 100;

        for (int x = 0; x <= totalQuestions; x++) {

            int y = totalQuestions - x;

            if (5 * x + 10 * y == totalMarks) {
                System.out.println("5-mark questions: " + x);
                System.out.println("10-mark questions: " + y);
                break;
            }
        }
    }
}

