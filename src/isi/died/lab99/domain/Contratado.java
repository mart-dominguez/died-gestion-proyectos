package isi.died.lab99.domain;

import isi.died.lab99.domain.exceptions.HorasNoDisponiblesException;
import isi.died.lab99.domain.exceptions.SeniorityNoAlcanzadaException;

public class Contratado extends Empleado {

	private Double costoHora;

	@Override
	public Double costo(Tarea t) {
		// NO USAR INSTANCE OF
		//TODO si la tarea es de desarrollo se recarga la mitad del riesgo
//		if( t instanceof Desarrollo) {
//			double incremento = 1+ (((Desarrollo) t).getRiesgo()/2); // 1+(0.2/2) = 1.1
//			costoTmp = costoTmp*incremento; // 100 * 1.1
//		}
		//TODO: si la tarea es de mantenimiento NO rutinario se recarga 20%
		
		Double costoTmp = t.duracion() * this.costoHora;
		return costoTmp * t.incremento();
	}

	@Override
	public void agregar(Agendable a) throws HorasNoDisponiblesException, SeniorityNoAlcanzadaException {
		// TODO calcualr cuantas horas en este dia ya tengo agendadas
		if (a.esDesarrollo() && a.duracion() > this.horasMaxDevDia) {
			throw new  HorasNoDisponiblesException();
		}
		a.asignarEmpleado(this);
		this.tareasAgendadas.add(a);
	}
}
