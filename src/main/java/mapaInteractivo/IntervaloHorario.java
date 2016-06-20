package mapaInteractivo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class IntervaloHorario {
	
	/*****Atributos*****/
	private String dia;
	private String horaInicio;
	private String horaFin;
	/*****Atributos*****/
	
	/*****Getters y Setters*****/
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public String getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}
	/*****Getters y Setters*****/
	
	/*****Metodos*****/
	
	//@throws ParseException
	boolean incluyeHorario(String unHorario) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm");
		
	    Date timeInicio = dateFormat.parse(this.getHoraInicio());
	    Calendar calendarHoraInicio = Calendar.getInstance();
	    calendarHoraInicio.setTime(timeInicio);

	    Date timeFin = dateFormat.parse(this.getHoraFin());
	    Calendar calendarHoraFin = Calendar.getInstance();
	    calendarHoraFin.setTime(timeFin);

	    Date time = dateFormat.parse(unHorario);
	    
	    return time.after(calendarHoraInicio.getTime()) && time.before(calendarHoraFin.getTime());
	}
}
