package uzdevums5;

import java.util.ArrayList;

public class IzveidotieObjekti {
	static String izvadit(ArrayList<Centrs> centruSaraksts) {
		String str = "";
		for (int i=0; i<centruSaraksts.size(); i++) {
			str += i+". objekts "+centruSaraksts.get(i).izvaditKoordinatas()+"\n";
		}
		return str;
	}
}
