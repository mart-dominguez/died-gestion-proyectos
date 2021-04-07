package isi.died.lab99.domain;

import isi.died.lab99.domain.exceptions.SeniorityNoAlcanzadaException;

public interface Agendable {
	
	// retorna la duracion en horas
	public Integer duracion();
	public abstract void asignarEmpleado(Empleado e) throws SeniorityNoAlcanzadaException;
	public Boolean esDesarrollo();

}
