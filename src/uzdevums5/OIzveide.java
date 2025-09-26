package uzdevums5;

import javax.swing.JOptionPane;

import uzd1.MinkuTante;

public class OIzveide {
	
	
	static void izveidotObjektu() {
		int x, y, cPNr;
		double p, a;
		
		int izvele = JOptionPane.showOptionDialog(null, "Kuru objektu veidot?", "Izvēle",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, Figuras.ObjektuPogas, Figuras.ObjektuPogas[0]);
		if (izvele == -1)
			izvele = 0;
		switch(izvele) {
		
		case 0:
			x = MinkuTante.skaitlaParbaude("Ievadi centra punkta x koordinātas", -100, 100);
			y = MinkuTante.skaitlaParbaude("Ievadi centra punkta y koordinātas", -100, 100);
			Figuras.centraObjekti.add(new Centrs(x, y));
			
			break;
		
		case 1:
			String[] ceIzvelesVeids = {"Noklusējuma", "Centra punkts un malas"};
			
			String veids = (String)JOptionPane.showInputDialog(null, "Izvēlies, kuru konstruktoru izsaukt", "Četrstūra izveide",
					JOptionPane.QUESTION_MESSAGE, null, ceIzvelesVeids, ceIzvelesVeids[0]);
			
			if(veids == null)
				veids = ceIzvelesVeids[0];
			
			switch (veids) {
			case "Noklusējuma":
				Figuras.cetrsturaObjekti.add(new Cetrsturis());
				break;
				
			case "Centra punkts un malas":
//				cPNr = cPIzvele();
				cPNr = 0;
				p = MinkuTante.skaitlaParbaude("Ievadi četrstūra platumu", 1, 100);
				a = MinkuTante.skaitlaParbaude("Ievadi četrstūra augstumu", 1, 100);
				Figuras.cetrsturaObjekti.add(new Cetrsturis(Figuras.centraObjekti.get(cPNr), p, a));
				break;
			}
			break;
			
		case 4:
			JOptionPane.showMessageDialog(null, "Atgriežas uz galveno izvēlni!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}
}
