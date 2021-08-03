package ar.edu.unlam.practica;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class MonitoreoTest {

	
	@Test
	public void queSePuedanIncorporarDistintosVehiculosAlMonitoreo() {
		Monitoreo centro = new Monitoreo("Centro");
		Coordenada c1 = new Coordenada(10.0,10.0);
		Coordenada c2 = new Coordenada(19.0,10.0);
		Coordenada c3 = new Coordenada(20.0,10.0);
		Vehiculo auto = new Auto("mnv900",c1);
		Vehiculo colectivo = new Colectivo("mnv988",c2);
		Vehiculo moto = new Moto("fgh765",c3);
		centro.agregarVehiculoAlMonitoreo(moto);
		centro.agregarVehiculoAlMonitoreo(auto);
		centro.agregarVehiculoAlMonitoreo(colectivo);
		
		assertEquals(3,centro.getVehiculosMonitoreados(),0.1);
	}
	
	@Test(expected = CollitionException.class)
	public void queSiDosVehiculosEstanEnLaMismaPosicionSeGenereLaExcepcion() throws CollitionException{
		Monitoreo centro = new Monitoreo("Centro");
		Coordenada c1 = new Coordenada(10.0,10.0);
		Coordenada c2 = new Coordenada(10.0,10.0);
		Vehiculo auto = new Auto("mnv900",c1);
		Vehiculo moto = new Moto("fgh765",c2);
		centro.agregarVehiculoAlMonitoreo(moto);
		centro.agregarVehiculoAlMonitoreo(auto);
		centro.actualizarCoordenadas();
	}
	
	@Test
	public void queNoSePuedanAgregarDosVehiculosConLaMismaPatente() {
		Monitoreo centro = new Monitoreo("Centro");
		Coordenada c1 = new Coordenada(10.0,10.0);
		Coordenada c2 = new Coordenada(10.0,10.0);
		Vehiculo auto = new Auto("mnv900",c1);
		Vehiculo moto = new Moto("mnv900",c2);
		centro.agregarVehiculoAlMonitoreo(moto);
		centro.agregarVehiculoAlMonitoreo(auto);
		assertEquals(1,centro.getVehiculosMonitoreados(),0.1);
	}
	
	@Test
	public void queDosVehiculosConDistintaPosicionPuedanCircularSinProblemas() throws CollitionException {
		Monitoreo centro = new Monitoreo("Centro");
		Coordenada c1 = new Coordenada(10.0,20.0);
		Coordenada c2 = new Coordenada(30.0,40.0);
		Vehiculo auto = new Auto("mnv900",c1);
		Vehiculo moto = new Moto("fgh765",c2);
		centro.agregarVehiculoAlMonitoreo(moto);
		centro.agregarVehiculoAlMonitoreo(auto);
		centro.actualizarCoordenadas2();
		//assertFalse(auto.getPosicion().equals(moto.getPosicion()));
		//assertFalse(centro.compararCoordenadas(auto, moto));
	}
	
}
