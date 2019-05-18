package DAWM05_UF2_analisisCode;

public class Factorial {

	public static double factorial(double numero) {
		if (numero == 0) {
			return 1;
		} else {

			double resultat = factorial(numero - 1) + factorial(numero - 2);
			return resultat;
		}
	}
	
	public static void main() {
		System.out.println(factorial(5));
	}
}