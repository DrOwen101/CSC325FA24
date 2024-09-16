public class WilliamAshfordAS2d {

    public String loops()
    {
        int[] arr = {1,2,3,4};
        int j = 0;
        while(arr[j] < arr.length)
        {
            if(arr[j] == 3)
            {
                break;
            }
            j++;
        }
        int i = 0;
        while(i < 100 )
        {
            i++;
        }
        return "Loop 1: " + j + ". Loop2 I counted to " + i;
    }
}
