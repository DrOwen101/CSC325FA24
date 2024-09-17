public class BrooklynWellsAS2d {

    int[] arr = {1,2,3,4}; // instantiating the array 

    public String funWithLooops(){ // method to hold my loops

        int  i = 0; // index
        int  n = 0; // number of iterations
        int  c; // for my counting

        while(i < arr.length) { // while loop
            i++;
            n++;        
        }

        for(c = 0; c < 100;) { // a for loop that counts to 100 and breaks at 101
                c++;
            }

        return "While Loop: " + n + " For Loop: I Counted to " + c; // my return statement
        }

    }