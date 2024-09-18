public class CadenOutlandAS2d {
    
    int[] arr = {1,2,3,4}; //instantiate array


    public String Loop(){ //method of loops
        int index = 0;
        int count = 0;

        while(index < arr.length){ //while loop returning count of iterations
            index++; 
        }

        for (int i = 1; i < 101; i++){ //for loop returning count of increments
            count++;
        }

        return " - Iterations of first loop: " + index + " - I Counted to " + count; //output to terminal
    }
}
