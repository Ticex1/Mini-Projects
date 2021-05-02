package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number=0;
		String isPrime="Yes";
		
		if(number<1) {
			System.out.println("Invalid Number");
			return;
		}
		if(number==1) {
			System.out.println("No");
			return;
		}
		
		for(int i=2;i<number;i++) {
			
			if(number%i==0) {
				
				isPrime="No";
			}
			
		}

		System.out.println("Is It Prime? "+isPrime);
	}

}
