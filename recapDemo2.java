package recapDemo2;

public class recapDemo2 {

	public static void main(String[] args) {
		double[] myList = {1.2,88.3,4.5,7.8};
		double total=0;
		double max = myList[0];
		for(double number:myList) {
			if(max<number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
			
			
			
			
		}
		System.out.println("Toplam =" + total);
		System.out.println("En buyuk =" + max);

	}

}
