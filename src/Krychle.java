
public class Krychle {
	int strana;

	public int getStrana() {
		return strana;
	}

	public void setStrana(int strana) {
		this.strana = strana;
	}

	public Krychle(int strana) {
		this.strana = strana;
	}

	public Krychle() {
		
	}

	int povrch() {
		return 6 * strana * strana;
	}

	int objem() {
		return strana * strana * strana;
	}

	
	public  String toString() {
		return "Krychle s objemem :" + this.objem() + " povrchem :" + povrch()+" a stranou :"+strana;
	}

}