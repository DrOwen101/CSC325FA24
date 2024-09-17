public class TuckerJonesAS2d {
    private int[] arr = {1,2,3,4};

    public int wLoop()
    {
        int i = 0;
        while (i < arr.length) 
        {
            i++;
        }
        return i;

    }

    public String fLoop()
    {
        int j = 0;
        for (int i = 0; i < 100; i++)
        {
            j++;
        }
        return "I counted to " + j; 

    }

    
}
