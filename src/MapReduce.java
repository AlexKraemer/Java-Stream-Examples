/* MapReduce.java
 * ---------------
 * This simple program sums the squares from 1 to 100
 * using Java's Stream class.
 *
 * @author Alex Kraemer
 * @version November 16, 2014
 */
package streamassignment;

import java.util.Arrays;

public class MapReduce {

    public static void main(String[] args) {
        int[] numbers = new int[100];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        
        // Square each value and sum them.
        System.out.println(Arrays.stream(numbers)
                .map(n -> {return n * n;})
                .sum());
    }
}
