package isi.died.lab99.domain;

import java.time.Duration;
import java.time.Instant;

public abstract class Tarea implements Agendable{
	
	protected String descripcion;
	protected Integer nivelRequerido;
	protected Integer horasPresupuestadas;
	
	
	protected Instant fechaInicio;
	protected Instant fechaFin;
	protected Empleado responsable;
	
	/*
	 * sobrecarga el metodo inciar para poder ejecutarlo con arg o sin
	 */
	public final void iniciar() {
		this.fechaInicio = Instant.now();
	}

	public final void iniciar(Instant fechaIni) {
		// if(this.fechaInicio!=null) throw new RuntimeException("No puede cambiar la fecha");
		this.fechaInicio = fechaIni;
	}
	
	public final void finalizar() {
		this.fechaFin = Instant.now();
	}
	
	@Override
	public abstract void asignarEmpleado(Empleado e);
	
	@Override
	public final Integer duracion() {
		return horasPresupuestadas;
	}

	public Long dias() {
		return Duration.between(fechaInicio, fechaFin).toDays();
	}
