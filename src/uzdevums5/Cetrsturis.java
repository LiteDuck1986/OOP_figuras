package uzdevums5;

public class Cetrsturis {
	public double platums, augstums;
	public Centrs punkts;
	
	// Konstruktoru pārslogošana
	public Cetrsturis() {
		punkts = new Centrs (0, 0);
	}
	
	public Cetrsturis(Centrs punkts, double p, double a) {
		this.punkts = punkts;
		platums = p;
		augstums = a;
	}
	
	public String izvaditCetrsturaInfo() {
		return "Platums: "+platums+"cm augstums: "+augstums+"cm";
	}
	
	// Uztaisīt metodi, kas aprēķina laukumu
	public double cetrsturaLaukums() {
		double S = platums * augstums;
		return S;
	}
}
