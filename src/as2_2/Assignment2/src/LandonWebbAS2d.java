public class LandonWebbAS2d {
    
    int[] arr = {1,2,3,4};  
    
    
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

        return "Iterations: " + iterations;
    }

    public String forLoop() {

        int counter = 0;
        for(int i = 1; i <= 100; i++){
            counter++;
        }

        return "I counted to " + counter;
    }
}

