public class WhileLoopExample {
    public int countIterationsToIndex3(int[] arr) {
        int count = 0;
        int i = 0;
        while (i < arr.length) {
            if (i == 3) {
                break;
            }
            count++;
            i++;
        }
        return count;
    }

    public String countTo100() {
        for (int i = 1; i <= 100; i++) {
            if (i == 101) {
                break;
            }
        }
        return "I counted to 100";
    }
}

public class app2 {
    public class MainApp {
        public static void main(String[] args) {
            LoopExample loopExample = new LoopExample();
            int[] arr = {1, 2, 3, 4};
    
            int iterations = loopExample.countIterationsToIndex3(arr);
            String countMessage = loopExample.countTo100();
    
            System.out.println("Your Name: " + iterations + " iterations to reach index 3. " + countMessage);
        }
    }
}

