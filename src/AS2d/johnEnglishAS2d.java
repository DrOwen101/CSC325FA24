package AS2d;

public class johnEnglishAS2d {
    int[] arr = {1, 2, 3, 4};
    int x = 0;
    String result = "";

    public String testMethod() {
        while (x <= arr.length) {
            x++;
            if (x == 2) {break;}
        }

        for (int counter = 1; counter < 102; counter++) {
            if (counter == 101) {break;}
        }

        result = "This loop took " + (x + 1) + " iterations I counted to 100";

        return result;
    }
}
