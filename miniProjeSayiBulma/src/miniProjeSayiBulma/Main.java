package miniProjeSayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 3, 4, 5, 7, 8, 9, 0 };
		int aranacak = 6;

		for(int rakam:sayilar) {
			
			if(rakam==aranacak) {
				
				System.out.println("Aran�lan Say� Mevcut");
			}
			else {
				System.out.println("Aran�lan Say� Bulunmamaktad�r");
				break;
			}
			
		}
	}

}
