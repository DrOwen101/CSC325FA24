public class justiceNobackAS2d {
    public String loopExecute() {
        int[] arr = {1 ,2 , 3, 4};

        int whileCount = 0;
        int index = 0;
        //while loop that breaks at index #3
        while (index < arr.length) {
            index++;
            whileCount++;
        }
    
        //for loop that breaks when i = 100
        String forMessage = ""; 
        for (int i = 1; i <= 100; i++) {
            if (i == 101) {
                break;
            }

        }
        forMessage = "I counted to 100";
    
        return "While loop result: " + whileCount + ", For Loop result: " + forMessage;
    }
    
}
