package uzdevums5;

public class Aplis {
	public Centrs punkts;
	public double radiuss;

	public Aplis (Centrs p, double r) {
		punkts = p;
		radiuss = r;
	}
	
	public String izvaditAplaInfo() {
		return "Rādiuss: "+radiuss;
	}
	
	// Izveidot metodi riņķa līnijas aprēķināšanai
	public double RinkaLinija() {
		
		double C = 2 * Math.PI*radiuss;
		return Math.round(C*100.0)/100.0;
	}
	
	// Riņķa laukuma aprēķināšanai
	public double rLaukums() {
		double S = Math.PI*Math.pow(radiuss, 2);
		return Math.round(S*100.0)/100.0;
	}
}
