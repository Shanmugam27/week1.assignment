package week1.assignment;

public class PrimeorNot {

	public static void main(String[] args) {
		int a = 13;
		boolean flag = false;
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {

				flag = true;
				break;

			}
		}
		System.out.println("Non Prime");
		if (!flag) {
			System.out.println("Prime");
		}

	}
}