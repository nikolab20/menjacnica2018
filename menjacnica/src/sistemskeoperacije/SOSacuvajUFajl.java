package sistemskeoperacije;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import menjacnica.Valuta;

public class SOSacuvajUFajl {

	public void sacuvajUFajl(String putanja, LinkedList<Valuta> kursnaLista) {
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(putanja)))) {

			out.writeObject(kursnaLista);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
