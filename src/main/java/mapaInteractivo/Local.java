package mapaInteractivo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

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
	
	/*****Metodos*****/
	public boolean estaCercaDe(Geolocalizacion unaGeolocalizacion) {
		return this.getRubro().estaCercaDe(unaGeolocalizacion);
	}
	

	public boolean estaDisponible() throws Exception {
		Calendar calendar = Calendar.getInstance();
		String dia = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("es", "AR"));
		
	    Set<IntervaloHorario> horariosDeHoy =
			this.
	    	getHorarios().
	    	stream().
	    	filter(each -> each.getDia() == dia).
	    	collect(Collectors.toSet());
	    
	    DateFormat dateFormat = new SimpleDateFormat("HH:mm");
	    
	    //Paso la hora actual a HH:mm
	    String horaFormateada = dateFormat.format(calendar.getTime());
	    
	    return horariosDeHoy.stream().anyMatch(each -> each.incluyeHorario(horaFormateada));
	}
}
