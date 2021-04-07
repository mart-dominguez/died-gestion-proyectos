package isi.died.lab99.domain.exceptions;

public class HorasNoDisponiblesException extends Exception {

	public HorasNoDisponiblesException() {
		super("El empleado no tiene mas horas disponibles en el dia");
	}
}
