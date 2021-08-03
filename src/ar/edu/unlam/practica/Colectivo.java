package ar.edu.unlam.practica;

public class Colectivo extends Vehiculo {

	public Colectivo(String patente, Coordenada posicion) {
		super(patente, posicion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Vehiculo o) {
		return this.getPatente().compareTo(o.getPatente());
	}

}
