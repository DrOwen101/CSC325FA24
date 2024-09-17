public class AbbieGeorgeAS2d {
    
    private int[] arr = {1,2,3,4};

    public String arrayMethod(){
        int count = 0;
        int index = 0;
        String message = "";

        while (index < arr.length){
            count++;
            if (index == 3){
                break;
            }
            index++;
        }
        
        for (int i = 1; i <= 100; i++){
            if (i == 100) {
                message = "I counted to 100";
            }
            

        }

        return "Number of iterations: " + count + ". " + message;
    }

}