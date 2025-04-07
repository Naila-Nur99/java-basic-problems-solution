public class SecondHighestCGPA {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        double highest = 0, secondHighest = 0;

        for (double score : cgpa) {
            if (score > highest) {
                secondHighest = highest;
                highest = score;
            } else if (score > secondHighest) {
                secondHighest = score;
            }
        }

        System.out.println("Second highest CGPA: " + secondHighest);
    }
}
