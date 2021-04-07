package isi.died.lab99.domain;

import isi.died.lab99.domain.exceptions.HorasNoDisponiblesException;
import isi.died.lab99.domain.exceptions.SeniorityNoAlcanzadaException;

public class Efectivo extends Empleado {

	private Double sueldoBase;
	private Integer antig;
	public Double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(Double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public Integer getAntig() {
		return antig;
	}
	public void setAntig(Integer antig) {
		this.antig = antig;
	}
	
	@Override
	public Double costo(Tarea t) {
		Double precioHora = this.sueldoBase / 20 / this.horasMaxDevDia + this.horasMaxOtrasDia;
		return (t.duracion() * precioHora) * t.incremento();
	}
	
	@Override
	public void agregar(Agendable a) throws HorasNoDisponiblesException,SeniorityNoAlcanzadaException {
		// TODO Auto-generated method stub
		
	}
	
	
}
