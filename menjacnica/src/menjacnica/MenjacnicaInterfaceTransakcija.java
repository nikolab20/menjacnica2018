package menjacnica;

import java.util.LinkedList;

public interface MenjacnicaInterfaceTransakcija {

	public double izvrsiTransakciju(Valuta valuta, boolean prodaja, double iznos);

	public LinkedList<Valuta> vratiKursnuListu();
}
