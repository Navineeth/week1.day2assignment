package assignment;

public class Findoddnumbers {

	public static void main(String[] args) {
		int startrange = 1;
		int endrange = 25;
		int r;
		System.out.println("Printing only the odd numbers from 1 to 20");
		for (int i = startrange; i <= endrange; i++) {
			r = i % 2;
			if (r == 1) {
				System.out.println(i);
			}
		}

	}

}