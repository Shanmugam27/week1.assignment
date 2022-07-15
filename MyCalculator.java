package week1.assignment;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(59, 105, 227));
		System.out.println(calc.sub(794, 574));
		System.out.println(calc.mul(69d, 12d));
		System.out.println(calc.div(48L, 94L));

	}
}
