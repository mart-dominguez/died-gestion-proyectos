package isi.died.lab99.domain;

import isi.died.lab99.domain.exceptions.SeniorityNoAlcanzadaException;

public class Mantenimiento extends Tarea {

	private Boolean rutinaria;
	
	

	public Boolean getRutinaria() {
		return rutinaria;
	}



	public void setRutinaria(Boolean rutinaria) {
		this.rutinaria = rutinaria;
	}



	@Override
	public void asignarEmpleado(Empleado e) throws SeniorityNoAlcanzadaException {
		// el empleado tiene la seniority requerida?
		if ((!(e.getSeniority()>= this.nivelRequerido)) || (!this.rutinaria && this.nivelRequerido<2)) {
			throw new SeniorityNoAlcanzadaException(this.nivelRequerido,e.getSeniority().intValue());
		} else {
			this.responsable = e;
		}
	}
	
	@Override
	public Double incremento() {
		return this.rutinaria ?  1 : 1.2;
	}

	@Override
	public Boolean esDesarrollo() {
		return false;
	}

}
