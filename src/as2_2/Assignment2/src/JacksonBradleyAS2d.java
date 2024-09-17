public class JacksonBradleyAS2d {

        int[] arr = {1, 2, 3, 4};
    
        
        public String loops() {
           
            int count = 0;
            int index = 0;
            while (index < arr.length) {
                
                count++;
                index++;
            }
    
          
            String message = "";
            for (int i = 1; i < 101; i++) {
               
             message = "I counted to "+ i;
                
            }
    
            // Return both results as a formatted string
            return "Iterations: " + count + " | " + message;
        }
    }
    