package stringsDemo;

public class stringsDemo {

	public static void main(String[] args) {
		//
		String mesaj = "Dolapta kac elma var?";
		System.out.println(mesaj);

		System.out.println("Eleman sayisi : " + mesaj.length());

		System.out.println("5. eleman : " + mesaj.charAt(4));

		System.out.println(mesaj.concat(" Bilmem."));
		
		System.out.println(mesaj.startsWith("D"));
		System.out.println(mesaj.startsWith("N"));
		System.out.println(mesaj.endsWith("?"));
		
		char[] karakterler = new char[7];
		mesaj.getChars(0, 7, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.indexOf("va"));
		System.out.println(mesaj.lastIndexOf('a'));

	}

}
