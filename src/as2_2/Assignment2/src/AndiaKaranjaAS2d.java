public class AndiaKaranjaAS2d {
    public int[] arr = {1, 2, 3, 4}; 

    public int methodWhileLoop(){
        int count = 0;  
        while (count <= arr.length){ 
            count += 1; 
            if ((count) == 3){
                break; 
            }
        }
        return count; 
    }

    public String methodForLoop(){
        int loopTwoCounter = 0; 
        for (int i = 1; i < 101; i++){
            loopTwoCounter ++; 
        }
        return ("I counted to " + loopTwoCounter); 
    }
}
