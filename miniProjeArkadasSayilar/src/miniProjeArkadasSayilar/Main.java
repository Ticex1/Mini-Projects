package miniProjeArkadasSayilar;

public class Main {

	public static void main(String[] args) {

		// Girilen sayýnýn arkadaþ sayýsýnýn olup olmadýðýný
		// eðer varsa olduðunu belirten program

		int toplam1 = 0;
		int sayi = 1184;
		for (int i = 1; i < sayi; i++) {

			if (sayi % i == 0) {
				toplam1 += i;

			}

		}
		
		
		int toplam2 = 0;
		for (int i = 1; i < toplam1; i++) {

			if (toplam1 % i == 0) {
				toplam2 += i;

			}

		}
		

		if (toplam2 == sayi) {

			System.out.println("Arkadaþ Sayýsý Var\n\nArkadaþ Sayýlar:");
			System.out.println(toplam1);
			System.out.println(toplam2);
		}

		else {
			System.out.println("Arkadaþ Sayýsý Yok");
		}
	}
}
