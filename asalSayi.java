package asalSayi;

public class asalSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi = 97;
		int remainder = sayi % 2;
		System.out.println(remainder);
		System.out.println("-----------");
		boolean isPrime = true;
		
		if(sayi==1) {
			System.out.println("Asal degildir");
			return;
		}
		
		if(sayi<1) {
			System.out.println("Geçersiz sayi");
			return;
		}
		

		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				isPrime = false;

			}

		}
		if(isPrime) {
			
			System.out.println("Asaldir");
			
		}
		else {System.out.println("Asal degildir");}
		

	}

}
