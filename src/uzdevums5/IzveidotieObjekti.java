package uzdevums5;

import java.util.ArrayList;

public class IzveidotieObjekti {
	static String izvaditCentru(ArrayList<Centrs> centruSaraksts) {
		String str = "";
		for (int i=0; i<centruSaraksts.size(); i++) {
			str += i+". objekts "+centruSaraksts.get(i).izvaditKoordinatas()+"\n";
		}
		return str;
	}

	static String izvaditCet(ArrayList<Cetrsturis> cetrsturaObjekti) {
		String str = "";
		for (int i=0; i<cetrsturaObjekti.size(); i++) {
			str += i+". objekts "+cetrsturaObjekti.get(i).izvaditCetrsturaInfo()+"\n";
		}
		return str;
	}

	static String izvaditAplis(ArrayList<Aplis> aplaObjekti) {
		String str = "";
		for (int i=0; i<aplaObjekti.size(); i++) {
			str += i+". objekts "+aplaObjekti.get(i).izvaditAplaInfo()+"\n";
		}
		return str;
	}

	static String izvaditTris(ArrayList<Trijsturis> trijsturaObjekti) {
		String str = "";
		for (int i=0; i<trijsturaObjekti.size(); i++) {
			str += i+". objekts "+trijsturaObjekti.get(i).izvaditTrijsturaInfo()+"\n";
		}
		return str;
	}
}
