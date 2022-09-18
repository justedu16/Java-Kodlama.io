
public class StringsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String focus = "Never stop moving forward";
		System.out.println(focus);

		System.out.println("----------------");

		System.out.println(focus.replace(' ', '-'));

		System.out.println("----------------");

		String newFocus = focus.replace(' ', '.');
		System.out.println(newFocus);

		System.out.println(newFocus.substring(6));
		System.out.println(newFocus.substring(6, 10));

		for (String kelime : focus.split(" ")) {

			System.out.println(kelime);

		}
		System.out.println(focus.toLowerCase());
		System.out.println(newFocus.toUpperCase());
		
		System.out.println(focus.trim());

	}

}
