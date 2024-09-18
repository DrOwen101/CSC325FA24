public class JacksonCashAS2d {
    public int ArraySize() {
        int arr[] = {1,2,3,4};
        int j = 0;
        int count = 0;
        while(j <= 3) {
            if(arr[j] == 4) {
                break;
            }
            ++count;
            ++j;
        }
        return count;
    }
    public String HundCount() {
        int count;
        for(count = 1; count !=101; count++) {
            if(count == 100) {
                break;
            }
        }
        return "I counted to 100";
    }
}