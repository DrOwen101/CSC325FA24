public class KalebGoreAS2d {
	private int[] arr = { 1, 2, 3, 4 };

	public int whileLoop() {
		int i = 0;

		// Iterates up to the last index of the array which is 3
		while (i < arr.length) {
			i++;
		}
		return i;
	}

	public String forLoop() {
		String str = "I counted to ";
		int j = 0;

		// Iterates up to 100
		for (int i = 1; i < 101; i++) {
			j = i;
		}
		return str + j;
	}
}