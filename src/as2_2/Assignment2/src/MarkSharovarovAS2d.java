

public class MarkSharovarovAS2d {
    private int[] arr = {1,2,3,4};

    public String loopsMethod()
    {
        //While loop
        int i = 0;
        while(i<arr.length)
        {
            i++;
        }
    
        int counter = 1;
        //For loop
        for(int j = 1;j<100;j++)
        {
            counter++;
        }

        return "WHILE LOOP: It took " + i + " iterations in the while loop. FOR LOOP: I counted to 100!"; 
    }
}
