public class CGPASorter {
    public static void main(String[] args) {
        double[] scores = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        for (int i = 0; i < scores.length; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[i] < scores[j]) {
                    double temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                }
            }
        }
        System.out.println("CGPA scores from highest to lowest:");
        for (double score : scores) {
            System.out.print(score + " ");
        }
    }
}
