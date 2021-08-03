package ar.edu.unlam.practica;



public class Coordenada {
	
	private Double latitud = null;
	private Double longitud = null;
	
	public Coordenada(Double latitud, Double longitud){
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	public Double getLatitud() {
		return this.latitud;
	}
	
	public Double getLongitud() {
		return this.longitud;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((latitud == null) ? 0 : latitud.hashCode());
		result = prime * result + ((longitud == null) ? 0 : longitud.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Coordenada other = (Coordenada) obj;
		if (latitud == null) {
			if (other.latitud != null)
				return false;
		} else if (!latitud.equals(other.latitud))
			return false;
		if (longitud == null) {
			if (other.longitud != null)
				return false;
		} else if (!longitud.equals(other.longitud))
			return false;
		return true;
	}

}
