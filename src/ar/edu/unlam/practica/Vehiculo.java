package ar.edu.unlam.practica;

public abstract class Vehiculo implements Comparable<Vehiculo>{

	private String patente;
	private Coordenada posicion;
	
	public Vehiculo(String patente, Coordenada posicion) {
		this.patente = patente;
		this.posicion = posicion;
	}
	
	public void setPosicion(Coordenada posicion) {
		this.posicion = posicion;
	}
	
	public Coordenada getPosicion() {
		return this.posicion;
	}
	
	public String getPatente() {
		return this.patente;
	}


	
}
