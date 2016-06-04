package mapaInteractivo;

import java.util.Set;

public class CGP extends TipoPOI {
	
	/*****Atributos*****/
	private String comuna;
	private Set<Servicio> servicios;
	/*****Atributos*****/
	
	/*****Getters y Setters*****/
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public Set<Servicio> getServicios() {
		return servicios;
	}
	public void setServicios(Set<Servicio> servicios) {
		this.servicios = servicios;
	}
	/*****Getters y Setters*****/
}
