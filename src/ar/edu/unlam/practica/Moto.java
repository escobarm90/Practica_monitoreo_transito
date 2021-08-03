package ar.edu.unlam.practica;

public class Moto extends Vehiculo {

	public Moto(String patente, Coordenada posicion) {
		super(patente, posicion);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compareTo(Vehiculo o) {
		return this.getPatente().compareTo(o.getPatente());
	}

}
