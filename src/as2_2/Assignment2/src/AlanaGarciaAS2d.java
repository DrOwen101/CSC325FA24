public class AlanaGarciaAS2d {

    public String loops() {
        //array initialization
        int[] arr = { 1, 2, 3, 4 };

        int index = 0;
        int count = 0;

        //while loop
        while (index < arr.length) {
            index++;
            count++;
        }

        String result = "Iterations: " + count + ".";

        //for loop
        int x = 0;

        for(int i = 1; i < 101; i++){
          x=i;
        }
        
        result += "\nI counted to " + x + ".\n";

        return result;

    }
}