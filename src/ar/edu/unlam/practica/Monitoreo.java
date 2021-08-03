package ar.edu.unlam.practica;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Monitoreo {
	
	private String nombre;
	private Set<Vehiculo> vehiculos;
	
	public Monitoreo(String nombre) {
		this.nombre = nombre;
		this.vehiculos = new TreeSet<Vehiculo>();
	}
	
	public void agregarVehiculoAlMonitoreo(Vehiculo vehiculo) {
		this.vehiculos.add(vehiculo);
	}
	
	public Integer getVehiculosMonitoreados() {
		return this.vehiculos.size();
	}
	
	
	public Boolean actualizarCoordenadas() throws CollitionException {
		Iterator<Vehiculo> it = vehiculos.iterator();
		while (it.hasNext()) {
			Vehiculo vehiculo1 = it.next();
			if(vehiculo1.getPosicion().equals(it.next().getPosicion()))
				throw new CollitionException("Choque");
		}
		return null;
	}
	
	
		
	
	public Boolean compararCoordenadas(Vehiculo v1, Vehiculo v2) {
		if(v1.getPosicion().equals(v2.getPosicion())) {
			return true;
		}return false;
	}
	
	
}
