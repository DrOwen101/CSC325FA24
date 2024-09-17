public class caleTonazziAS2d {
    int[] arr = {1, 2, 3, 4};
    public int whileCounter() {
        int count = 0;
        while (count < arr.length) {
            count++;
        }
        return count;
    }
    
    public String forCounter() {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            count++;
        }
        return "I counted to " + count;
    }

}
