package mapaInteractivo;

public class Geolocalizacion {
	
	/*****Atributos*****/
	private double latitud;
	private double longitud;
	/*****Atributos*****/
	
	/*****Getters y Setters*****/
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	/*****Getters y Setters*****/
	
	/*****Metodos*****/
	/*
	* Formula:
	* a = sin²(Δφ/2) + cos φ1 ⋅ cos φ2 ⋅ sin²(Δλ/2)
	* c = 2 ⋅ atan2( √a, √(1−a) )
	* d = R ⋅ c
	*/	
	public double distanciaConGeolocalizacion(Geolocalizacion unaGeolocalizacion) {
		final double RADIO_TIERRA = 6371e3; //En metros
		double lat1 = this.getLatitud();
		double lon1 = this.getLongitud();
		double lat2 = unaGeolocalizacion.getLatitud();
		double lon2 = unaGeolocalizacion.getLongitud();
		
		double difLat = Math.toRadians(lat2 - lat1);
		double difLon = Math.toRadians(lon2 - lon1);
		lat1 = Math.toRadians(lat1);
		lat2 = Math.toRadians(lat2);
	 
		double a = Math.pow(Math.sin(difLat / 2),2) + Math.pow(Math.sin(difLon / 2),2) * Math.cos(lat1) * Math.cos(lat2);
		double c = 2 * Math.asin(Math.sqrt(a));
		return RADIO_TIERRA * c;
	}
}
