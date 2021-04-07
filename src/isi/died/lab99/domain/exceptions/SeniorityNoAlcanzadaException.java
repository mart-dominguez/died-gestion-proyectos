package isi.died.lab99.domain.exceptions;


public class SeniorityNoAlcanzadaException extends Exception {

	public SeniorityNoAlcanzadaException (Integer nivelReq,Integer nivelEmp) {
		super("Se requiere un nivel "+nivelReq+ " pero seleciono un empleado de nivel "+nivelEmp);
	}
}
