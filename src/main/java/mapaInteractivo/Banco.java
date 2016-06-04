package mapaInteractivo;

import java.util.Set;

public class Banco extends TipoPOI {
	
	/*****Atributos*****/
	private Set<IntervaloHorario> horarios;
	/*****Atributos*****/
	
	/*****Getters y Setters*****/
	public Set<IntervaloHorario> getHorarios() {
		return horarios;
	}
	public void setHorarios(Set<IntervaloHorario> horarios) {
		this.horarios = horarios;
	}
	/*****Getters y Setters*****/
}
