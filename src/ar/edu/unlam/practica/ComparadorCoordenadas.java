package ar.edu.unlam.practica;

import java.util.Comparator;

public class ComparadorCoordenadas implements Comparator<Coordenada> {
	
	@Override
	public int compare(Coordenada c1, Coordenada c2) {
		if (c1.getLatitud().compareTo(c2.getLatitud()) != 0) {
			return c1.getLatitud().compareTo(c2.getLatitud());
		}
		return c1.getLongitud().compareTo(c2.getLongitud());
	}

}
