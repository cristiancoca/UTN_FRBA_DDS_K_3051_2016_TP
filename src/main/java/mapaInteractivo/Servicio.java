package mapaInteractivo;

import java.util.Set;

public class Servicio {
	
	/*****Atributos*****/
	private String name;
	private Set<IntervaloHorario> intervaloHorario;
	/*****Atributos*****/
	
	/*****Getters y Setters*****/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<IntervaloHorario> getIntervaloHorario() {
		return intervaloHorario;
	}
	public void setIntervaloHorario(Set<IntervaloHorario> intervaloHorario) {
		this.intervaloHorario = intervaloHorario;
	}
	/*****Getters y Setters*****/
}
