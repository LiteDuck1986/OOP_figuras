package uzdevums5;

public class Figuras {

	public static void main(String[] args) {
		// Izveido Centrs objektu
		Centrs centraP1 = new Centrs(-10, 12);
		System.out.println(centraP1.izvaditKoordinatas());
		centraP1.parvietot(5, -2);
		System.out.println(centraP1.izvaditKoordinatas());
		
		// Izveido Cetrsturis objektu
		Cetrsturis cetrsturis1 = new Cetrsturis();
		System.out.println(cetrsturis1.izvaditCetrsturaInfo());
		
		// Izvadīt ši četrstūra atrašanās vietu
		System.out.println(cetrsturis1.punkts.izvaditKoordinatas());
		
		Cetrsturis cetrsturis2 = new Cetrsturis(centraP1, 5, 11);
		System.out.println(cetrsturis2.izvaditCetrsturaInfo()+"\n"+cetrsturis2.punkts.izvaditKoordinatas()+"\ns = "+cetrsturis2.cetrsturaLaukums());

		Centrs punkts2 = new Centrs (5, 23);
		Aplis aplis1 = new Aplis(punkts2, 5);
		System.out.println(aplis1.izvaditAplaInfo()+"\n"+aplis1.rLaukums()+"\n"+"C = "+ aplis1.rLaukums());
	}

}
