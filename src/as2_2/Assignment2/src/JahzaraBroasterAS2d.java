public class JahzaraBroasterAS2d
{
    int[] arr = {1, 2, 3, 4};
    
    // Method with the while-loop and for-loop
    public String Loops() 
    {
        int index = 0;
        
        // While loop that breaks when index #3 from your array is read and returns the count of iterations through the loop it takes
        while (index < arr.length) 
        {
            if (index == 3) 
            {
                break;
            }
            index++;
        }
        
        // Store the result of the first loop
        String result1 = "Result 1: " + index;
    
        // For-loop that increments a counter from 1 to 100 and returns a message saying “I counted to 100”
        for (int i = 1; i <= 100; i++) 
        {
            // Runs until i is less than or equal to 100
        }
        String result2 = "I counted to 100";
    
        // Return both the results
        return result1 + "\n" + result2;
    }
}

