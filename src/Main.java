import java.util.Random;
import java.util.Scanner;

public class Main {

	private static Scanner sc1;
	// Odebrani nepot�ebnych Scanneru

	public static void main(String[] args) {
		// Odstraneni nepotrebnych promennych.
		System.out.println("Zadej po�et krychl�");
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
		for (int i = 1; i < pocet + 1; i++) { // Pricteni 1 aby se vypsal spravny po�et krychli.
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
				sl = " Lich� pozice";
			} else {
				sl = " Sud� pozice";
			}

			if (rand % 2 == 1) {
				sl2 = " a lich� strana";
			} else {
				sl2 = " a sud� strana";
			}

			Krychle k1 = new Krychle(rand);

			System.out.println(i + ". " + "" + k1 + sl + sl2);

		}

		System.out.println("Nejv�t�� objem: " + nv * nv * nv);
		System.out.println("Nejmen�� povrch: " + 6 * ns * ns + " na pozici: " + pozice);
	}

}
