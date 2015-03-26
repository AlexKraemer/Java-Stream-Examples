/* ClassAverage.java
 * ---------------
 * This simple program uses Java's Stream class
 * to calculate the class average given a file of 
 * letter grades.
 *
 * @author Alex Kraemer
 * @version November 16, 2014
 */

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ClassAverage {

    public static void main(String[] args) throws Exception {
        System.out.println("Class average: " + Files.lines(Paths.get("grades.txt"))
                .map(e -> e.split("A-F+?-?"))
                .flatMap(a -> Arrays.stream(a))
                .mapToDouble(e -> convert(e))
                .average()
                .getAsDouble());
    }
    
    // Method for converting letter grades into GPA.
    public static double convert(String grade){
        switch (grade) {
            case "A":
                return 4.0;
            case "A-":
                return 3.67;
            case "B+":
                return 3.33;
            case "B":
                return 3.0;
            case "B-":
                return 2.67;
            case "C+":
                return 2.33;
            case "C":
                return 2.0;
            case "C-":
                return 1.67;
            case "D+":
                return 1.33;
            case "D":
                return 1.0;
            case "D-":
                return 0.67;
            default:
                return 0.0;
        }
    }
}
