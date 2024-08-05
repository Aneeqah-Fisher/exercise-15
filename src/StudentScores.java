import java.util.*;

public class StudentScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        List<Map.Entry<String, Double>> students = new ArrayList<>();

        // Input student names and scores
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter the score of " + name + ": ");
            double score = scanner.nextDouble();
            scanner.nextLine();
            students.add(new AbstractMap.SimpleEntry<>(name, score));
        }

        // Sort students based on scores in descending order
        students.sort((s1, s2) -> Double.compare(s2.getValue(), s1.getValue()));

        // Display sorted results
        System.out.println("\nStudents sorted by scores in decreasing order:");
        for (Map.Entry<String, Double> student : students) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }

        scanner.close();
    }
}