/* Othello.java
 * ---------------
 * This simple program uses Java's Stream class
 * to count the occurences of each word in othello. 
 *
 * @author Alex Kraemer
 * @version November 16, 2014
 */

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Othello {
    public static void main(String[] args) throws Exception {
        Object[] arr = Files.lines(Paths.get("othello.txt"))
                .map(e -> e.split("\\W+"))
                .flatMap(a -> Arrays.stream(a))
                .filter (e -> !e.equals(""))
                .map(e -> e.toLowerCase())
                .sorted()
                .toArray();
        addToCount(arr);
    }
    
    // Increment count.
    public static void addToCount(Object[] arr){
        int j = 0;
        int count = 0;
        String temp = arr[0].toString();
        for (Object arr1 : arr) {
            if (arr1.toString().equals(temp)) {
                count++;
            } else {
                System.out.println( count + " " + temp);
                count = 1;
                temp = arr1.toString();
                j++;
            }
        }
        System.out.println(count + " " + temp);
    }
}
