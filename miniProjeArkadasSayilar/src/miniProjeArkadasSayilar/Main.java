package miniProjeArkadasSayilar;

public class Main {

	public static void main(String[] args) {

		// Girilen say�n�n arkada� say�s�n�n olup olmad���n�
		// e�er varsa oldu�unu belirten program

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

			System.out.println("Arkada� Say�s� Var\n\nArkada� Say�lar:");
			System.out.println(toplam1);
			System.out.println(toplam2);
		}

		else {
			System.out.println("Arkada� Say�s� Yok");
		}
	}
}
