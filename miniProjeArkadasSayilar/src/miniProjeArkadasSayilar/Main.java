package miniProjeArkadasSayilar;

public class Main {

	public static void main(String[] args) {

		/* Girilen sayinin arkadas sayisinin olup olmadigini ve
		   eger varsa sayilari belirten program */

		int toplam1 = 0;
	        	
                int sayi = 1184; //Girilen Sayi
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

			System.out.println("Arkadas Sayisi Var\n\nArkadas Sayilar:");
			System.out.println(toplam1+"\n"+toplam2);
		}

		else {
			System.out.println("Arkadas Sayisi Yok");
		}
	}
}
