package mapaInteractivo;

public class POI {

	/*****Atributos*****/
	private String nombre;
	private Ubicacion ubicacion;
	private Geolocalizacion geolocalizacion;
	private TipoPOI tipo;
	//private Estadisticas historialConsultas;
	/*****Atributos*****/
	
	/*****Getters y Setters*****/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Ubicacion getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Geolocalizacion getGeolocalizacion() {
		return geolocalizacion;
	}
	public void setGeolocalizacion(Geolocalizacion geolocalizacion) {
		this.geolocalizacion = geolocalizacion;
	}
	public TipoPOI getTipo() {
		return tipo;
	}
	public void setTipo(TipoPOI tipo) {
		this.tipo = tipo;
	}
	/*****Getters y Setters*****/
	
	/*****Metodos*****/
	public boolean esValido() {
		return !this.getNombre().isEmpty() && this.getGeolocalizacion() != null;
	}
	
	public boolean distanciaConPOIMenorQue(POI unPOI, int unaDistancia) {
		return this.distanciaConPOI(unPOI) == unaDistancia;
	}
	
	public double distanciaConPOI(POI unPOI) {
		return this.getGeolocalizacion().distanciaConGeolocalizacion(unPOI.getGeolocalizacion());
	}
}
