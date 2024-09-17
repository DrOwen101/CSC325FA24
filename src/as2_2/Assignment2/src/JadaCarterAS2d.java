public class JadaCarterAS2d
{
    int[] arr = {1, 2, 3, 4};
    int iter = 0;
    int i = 0;
    int count = 0;

    //Method to both:
    //Get the amount of times it takes to go through the "arr" array
    //Count from 1 to 100, inclusively 
    public String getIterationsAndCounts()
    {
        //Loop to get the iterations of the "arr" array
        while (i < arr.length)
        {
            iter++;
            i++;
        }

        //Loop to count from 1 to 101
        for(int j = 1; j < 101; j++)
        {
            count++;
        }

        //Returns the Iteration Count of the While Loop and The Count of the For Loop
        return "Jada Carter - The while loop goes through " + iter + " iterations. For the for loop: I counted to " + count + ".";
    }
}