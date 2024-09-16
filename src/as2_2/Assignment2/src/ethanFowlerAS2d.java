public class ethanFowlerAS2d {
    int[] arr = {1, 2, 3, 4};
    public String ethanFowlerLoop() {
        int i = 0;
        int j = 0;
        while(i < arr.length) {
            System.out.println(arr[i]);
            i++;
            if (i == 3) {
                break;
            }
        }
        for(int k = 1; k < 101; k++) {
            System.out.println(k);
            j++;
        }
        return "Ethan Fowler's while loop iterated " + i + " times, and I counted to " + j;
    }
}