package mapaInteractivo;

import java.util.Set;

public class Local extends TipoPOI {

	/*****Atributos*****/
	private Set<IntervaloHorario> horarios;
	private Rubro rubro;
	/*****Atributos*****/
	
	/*****Getters y Setters*****/
	public Set<IntervaloHorario> getHorarios() {
		return horarios;
	}
	public void setHorarios(Set<IntervaloHorario> horarios) {
		this.horarios = horarios;
	}
	public Rubro getRubro() {
		return rubro;
	}
	public void setRubro(Rubro rubro) {
		this.rubro = rubro;
	}
	/*****Getters y Setters*****/
}
