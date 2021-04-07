package isi.died.lab99.domain;

import java.util.List;

import isi.died.lab99.domain.exceptions.HorasNoDisponiblesException;
import isi.died.lab99.domain.exceptions.SeniorityNoAlcanzadaException;

public abstract class Empleado {

	protected String nombre;
	protected Long cuit;
	protected Byte seniority;
	protected Integer horasMaxDevDia;
	protected Integer horasMaxOtrasDia;
	
	protected List<Agendable> tareasAgendadas;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getCuit() {
		return cuit;
	}
	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}
	public Byte getSeniority() {
		return seniority;
	}
	public void setSeniority(Byte seniority) {
		this.seniority = seniority;
	}
	public Integer getHorasMaxOtrasDia() {
		return horasMaxOtrasDia;
	}
	public void setHorasMaxOtrasDia(Integer horasMaxOtrasDia) {
		this.horasMaxOtrasDia = horasMaxOtrasDia;
	}
	
	public abstract Double costo(Tarea t) ;

	public abstract void agregar(Agendable a) throws HorasNoDisponiblesException, SeniorityNoAlcanzadaException ;

}
