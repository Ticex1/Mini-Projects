package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 1000;

		boolean isPrime = true;
		if (number == 1) {
			System.out.println("Say� Asal De�ildir");
			return;
		}

		if (number < 1) {
			System.out.println("Ge�ersiz Say�");
			return;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {

				isPrime = false;
			}

		}
		if (isPrime) {
			System.out.println("Asal");
		} else {
			System.out.println("Asal De�il");
		}

	}

}
