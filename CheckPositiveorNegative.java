package week1.assignment;

public class CheckPositiveorNegative {

	public static void main(String[] args) {
		int number = 35;
		if (number > 0) {
			System.out.println("Positive");
		} else {
			if (number < 0) {
				System.out.println("Negative");
			} 
			else {
				System.out.println("Number is neither Positive or Negative");
			}
		}
	}

}
