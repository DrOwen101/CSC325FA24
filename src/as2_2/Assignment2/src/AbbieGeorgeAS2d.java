public class AbbieGeorgeAS2d {
    
    //creates a private instance of an array
    private int[] arr = {1,2,3,4};

    //public method that holds the while and for loop, as well as returns results for both loops
    public String arrayMethod(){
        int count = 0;
        int index = 0;
        String message = "";

        //while loop that breaks out after index number three is read
        while (index < arr.length){
            count++;
            if (index == 3){
                break;
            }
            index++;
        }
        
        //a for loop that increments i to 100 and then outputs "I counted to 100" when it's reached 100
        for (int i = 1; i <= 100; i++){
            if (i == 100) {
                message = "I counted to 100";
            }
            

        }
        //returns the output for both the while and for loop
        return "Number of iterations: " + count + ". " + message;
    }

} //close class