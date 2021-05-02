package miniProjeSesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'A';

		switch (harf) {

		case 'A','a','I','i','O','o','U','u':
			System.out.println("Kalýn sesli harf");
			break;
			default:
				System.out.println("Ýnce sesli harf");
		}

	}

}
