/* Trinity Noble
 * CS325
 * This program is for the purpose of testing for and while loops in an array.
 * 16.09.24
 */

public class TrinityNobleAS2d {
    int[] arr = {1, 2, 3, 4}; // Instantiate array

    public String Loops() {
        int count = 0;
        int i = 0;

        // While loop to iterate through the array
        while (i < arr.length) {
            count++;
            i++;
        }

        int x = 0;
        // For loop to count from 1 to 100
        for (int j = 1; j <= 100; j++) {
            x = j;  
        }

        // Return the final result
        return "While Loop:" + count + ". For Loop: I counted to " + x + "!";
    }
}
