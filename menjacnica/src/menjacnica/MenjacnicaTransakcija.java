package menjacnica;

import java.util.LinkedList;

import sistemskeoperacije.SOIzvrsiTransakciju;

public class MenjacnicaTransakcija implements MenjacnicaInterfaceTransakcija {

	private LinkedList<Valuta> kursnaLista = new LinkedList<Valuta>();

	@Override
	public double izvrsiTransakciju(Valuta valuta, boolean prodaja, double iznos) {
		return SOIzvrsiTransakciju.izvrsi(valuta, prodaja, iznos);
	}

	@Override
	public LinkedList<Valuta> vratiKursnuListu() {
		return kursnaLista;
	}

}
