public class CGPACalculator {
    public static void main(String[] args) {

        int students = 5;
        int subjects = 5;

        double[][] marks = {
            {3.5, 3.0, 4.0, 3.7, 3.8},
            {2.5, 3.2, 3.0, 3.5, 3.0},
            {4.0, 4.0, 3.8, 3.9, 4.0},
            {3.0, 2.8, 3.2, 3.0, 3.5},
            {3.7, 3.6, 3.8, 3.9, 4.0}
        };

        int[] credits = {3, 4, 2, 3, 3};

        for (int i = 0; i < students; i++) {

            double totalPoints = 0;
            int totalCredits = 0;

            for (int j = 0; j < subjects; j++) {
                totalPoints += marks[i][j] * credits[j];
                totalCredits += credits[j];
            }

            double cgpa = totalPoints / totalCredits;

            System.out.printf("Student %d CGPA = %.2f%n", (i + 1), cgpa);
        }
    }
}