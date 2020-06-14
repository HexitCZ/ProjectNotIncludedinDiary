
public class Krychle {
	int strana;

	// Odstraneni nevyuziteho setteru a getteru.

	public Krychle(int strana) {
		this.strana = strana;
	}

	// Odstraneni prazdneho konstruktoru.

	int povrch() {
		return 6 * strana * strana;
	}

	int objem() {
		return strana * strana * strana;
	}

	public String toString() {
		return "Krychle s objemem :" + this.objem() + " povrchem :" + povrch() + " a stranou :" + strana;
	}

}