public class firstLastAS2d {
    // Instantiate the array
    int[] arr = {1, 2, 3, 4};

    // Method that contains both loops
    public String loopMethods() {
        // Initialize variables
        int count = 0;
        int i = 0;

        // While loop to break at index 3
        while (i < arr.length) {
            count++;
            if (i == 3) {
                break;
            }
            i++;
        }

        // For loop to count to 100
        for (int j = 1; j <= 100; j++) {
            if (j == 100) {
                return "Iterations through while loop: " + count + ", I counted to 100";
            }
        }

        return "Iterations through while loop: " + count;
    }
}
