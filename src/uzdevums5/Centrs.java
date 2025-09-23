package uzdevums5;

public class Centrs {

		// Atribūti
		public int x, y;

		// Konstruktors
		public Centrs (int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		// Metodes
		public String izvaditKoordinatas() {
			return "Centra punkts atrodas:\n x = "+x+" y = "+y;
		}
		
		public void parvietot (int koordX, int koordY) {
			x += koordX;
			y += koordY;
		}

}
