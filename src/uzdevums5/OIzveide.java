package uzdevums5;

import javax.swing.JOptionPane;

import uzd1.MinkuTante;

public class OIzveide {
	
	static int cPIzvele() {
		if(Figuras.centraObjekti.size() < 1)
			return -1;
		
		
		return Integer.parseInt(JOptionPane.showInputDialog(null,
				IzveidotieObjekti.izvadit(Figuras.centraObjekti)));
	}
	
	
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
			
			JOptionPane.showMessageDialog(null, "Centra punkts izveidots!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
			
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
				JOptionPane.showMessageDialog(null, "Noklusējuma četrstūris izveidots!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case "Centra punkts un malas":
				cPNr = cPIzvele();
				if (cPNr == -1) {
					JOptionPane.showMessageDialog(null, "Nav centra punkts ko izvēlēties!", "Kļūda", JOptionPane.ERROR_MESSAGE);
					break;
				}

				p = MinkuTante.skaitlaParbaude("Ievadi četrstūra platumu", 1, 100);
				a = MinkuTante.skaitlaParbaude("Ievadi četrstūra augstumu", 1, 100);
				Figuras.cetrsturaObjekti.add(new Cetrsturis(Figuras.centraObjekti.get(cPNr), p, a));
				
				JOptionPane.showMessageDialog(null, "Četrstūris izveidots!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			break;
			
		case 2:
			cPNr = cPIzvele();
			int r = MinkuTante.skaitlaParbaude("Ievadi apļa rādiusu", 1, 100);
			Figuras.aplaObjekti.add(new Aplis(Figuras.centraObjekti.get(cPNr), r));
			
			JOptionPane.showMessageDialog(null, "Aplis izveidots!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 3:
			cPNr = cPIzvele();
			int m1 = MinkuTante.skaitlaParbaude("Ievadi primās malas garumu", 1, 100);
			int m2 = MinkuTante.skaitlaParbaude("Ievadi otrās malas garumu", 1, 100);
			int m3 = MinkuTante.skaitlaParbaude("Ievadi trešās malas garumu", 1, 100);
			if (m1 == -1 || m2 == -1 || m3 == -1)
				break;
			
			Figuras.trijsturaObjekti.add(new Trijsturis(Figuras.centraObjekti.get(cPNr), m1, m2, m3));
			
			JOptionPane.showMessageDialog(null, "Trijstūris izveidots!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 4:
			JOptionPane.showMessageDialog(null, "Atgriežas uz galveno izvēlni!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}
}
