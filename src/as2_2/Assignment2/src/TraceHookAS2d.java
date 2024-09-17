public class TraceHookAS2d {
    
    // Initialize Array
    int[] arr = {1,2,3,4};

    /**
     * Runs a while loop that iterates through an array
     * and breaks when index 3 is reached.
     *
     * @return A string with the number of iterations before the loop ended
     */
    public String whileLoop() {

        int i = 0;
        int iterations = 0;

        while (i < arr.length) {
            iterations++;
            if (i==3) {
                break;
            }
            i++;
        }

        return "Iterations before break: " + iterations;
    }

    /**
     * This method runs a for loop that counts from 1 to 100, 
     * running 100 iterations.
     *
     * @return A string indicating that 100 iterations have been completed
     */
    public String forLoop() {

        int count = 0;
        for(int i = 1; i <= 100; i++){
            count++;
        }
        
        return "I counted " + count;
    }
}
