package mapaInteractivo;

public class Rubro {

	/*****Atributos*****/
	private String nombre;
	private double radioCercania;
	/*****Atributos*****/
	
	/*****Getters y Setters*****/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getRadioCercania() {
		return radioCercania;
	}
	public void setRadioCercania(double radioCercania) {
		this.radioCercania = radioCercania;
	}
	/*****Getters y Setters*****/
	
	/*****Metodos*****/
	public boolean estaCercaDe(Geolocalizacion unaGeolocalizacion, Geolocalizacion miUbicacion) {
		return Double.compare(miUbicacion.distanciaConGeolocalizacion(unaGeolocalizacion), this.getRadioCercania() * 100) == 0;
	}
}
