import java.util.Random;
import java.util.Scanner;

public class Main {

	private static Scanner sc1;
	// Odebrani nepotøebnych Scanneru

	public static void main(String[] args) {
		// Odstraneni nepotrebnych promennych.
		System.out.println("Zadej poèet krychlí");
		sc1 = new Scanner(System.in);
		int pocet = sc1.nextInt();
		int temp;

		System.out.println("Maximum");

		int max = sc1.nextInt();

		System.out.println("Minimum");

		int min = sc1.nextInt();

		if (max < min) {

			temp = max;
			max = min;
			min = temp;

		}
		Random r = new Random();
		int nv = -2147483648, pozice = 555, ns = 2147483647;
		for (int i = 1; i < pocet + 1; i++) { // Pricteni 1 aby se vypsal spravny poèet krychli.
			String sl, sl2;
			int rand = r.nextInt(max - 1) + min; // Zmena random aby byla cisla v zadanem rozmezi.
			if (rand < ns) {
				ns = rand;
				pozice = i;
			}
			if (rand > nv) { // 40 - 53 - definovani pozic a stran
				nv = rand;
			}
			if (i % 2 == 1) {
				sl = " Lichá pozice";
			} else {
				sl = " Sudá pozice";
			}

			if (rand % 2 == 1) {
				sl2 = " a lichá strana";
			} else {
				sl2 = " a sudá strana";
			}

			Krychle k1 = new Krychle(rand);

			System.out.println(i + ". " + "" + k1 + sl + sl2);

		}

		System.out.println("Nejvìtší objem: " + nv * nv * nv);
		System.out.println("Nejmenší povrch: " + 6 * ns * ns + " na pozici: " + pozice);
	}

}
