/* Points.java
 * ---------------
 * This simple program uses Java's Stream class
 * to find the maximum X value in a file containing
 * X and Y points.
 *
 * @author Alex Kraemer
 * @version November 16, 2014
 */

import java.nio.file.Files;
import java.nio.file.Paths;

public class Points {

    public static void main(String[] args) throws Exception{        
        System.out.println("Minimum X value: " + Files.lines(Paths.get("points.txt"))
                .map(e -> e.substring(0, e.indexOf(" ")))
                .map(e -> Integer.parseInt(e))
                .sorted()
                .toArray()[0]);
    }
}
