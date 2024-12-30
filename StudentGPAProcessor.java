import java.io.*;
import java.util.*;

public class StudentGPAProcessor {
    public static void main(String[] args) {
        String inputFile = "student_records.csv";
        String outputFile = "student_gpa_sorted.cvs";

        try {
            // Read student records from CSV file using Scanner
            Scanner scanner = new Scanner(new File(inputFile));
            Map studentGPAs = new HashMap<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String studentName = parts[1].trim();
                String[] gradeStrings = parts[2].trim().split(" ");

                // Calculate GPA
                double sum = 0;
                for (String gradeString : gradeStrings) {
                    sum += Double.parseDouble(gradeString);
                }
                double gpa = sum / gradeStrings.length;

                studentGPAs.put(studentName, gpa);
            }
            scanner.close();

            // Sort students by GPA
            List<Map.Entry<String, Double>> sortedStudents = new ArrayList<>(studentGPAs.entrySet());
            sortedStudents.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

            // Write sorted student GPAs to the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            for (Map.Entry<String, Double> entry : sortedStudents) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
            writer.close();

            System.out.println("Student GPAs written to " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
