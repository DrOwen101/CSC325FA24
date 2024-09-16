public class EmiliaKubikAS2d {
    int[] arr = {1, 2, 3, 4};

    public int searchArray(){
        int iterations = 0;
        while(iterations < arr.length){
            iterations++;
        }
        return iterations;
    }

    public String Counter(){
        int incrementCounter = 0;
        for (int i = 0; i < 101; i++){
            incrementCounter = i;
        }
        return "I counted to " + incrementCounter;
    }
}
