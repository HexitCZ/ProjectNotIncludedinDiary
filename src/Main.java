import java.util.Random;
import java.util.Scanner;

public class Main {

	private static Scanner sc3;
	private static Scanner sc2;
	private static Scanner sc1;

	public static void main(String[] args) {
		int maxi, mini;
		System.out.println("Zadej poèet krychlí");
		sc1 = new Scanner(System.in);
		int pocet = sc1.nextInt();

		System.out.println("Maximum");
		sc2 = new Scanner(System.in);
		int max = sc2.nextInt();

		System.out.println("Minimum");
		sc3 = new Scanner(System.in);
		int min = sc3.nextInt();

		if (max < min) {
			maxi = max;
			mini = min;
			min = maxi;
			max = mini;
			System.out.println("Bacha na to maximum a minimum jsou prohozeny, ale když jsi to ty tak to vyøeším já  ;)");
		}
		Random r = new Random();
		int nv=-2147483648,pozice=555,ns=2147483647;
		for (int i = 1; i < pocet; i++) {
			String sl, sl2;
			int rand = r.nextInt((max) + 1);
			if(rand<ns) {
				ns=rand;
				pozice=i;
			}
			if(rand>nv) {
				nv=rand;
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

			System.out.println(i+". "+""+k1 + sl + sl2);

		}

		System.out.println("Nejvìtší objem: " + nv*nv*nv);
		System.out.println("Nejmenší povrch: "+6*ns*ns+" na pozici: "+pozice);
	}

}
