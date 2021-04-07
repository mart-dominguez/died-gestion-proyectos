package isi.died.lab99.app;

import isi.died.lab99.domain.Contratado;
import isi.died.lab99.domain.Empleado;
import isi.died.lab99.domain.Mantenimiento;
import isi.died.lab99.domain.Tarea;
import isi.died.lab99.domain.exceptions.HorasNoDisponiblesException;
import isi.died.lab99.domain.exceptions.SeniorityNoAlcanzadaException;

public class App {
	
	public static void main(String[] args) {
		Empleado e1 = new Contratado();
		Tarea t1 = new Mantenimiento();
		try {
			e1.agregar(t1);
		//} catch (HorasNoDisponiblesException | SeniorityNoAlcanzadaException e) {
		} catch (HorasNoDisponiblesException ex1) {
			ex1.printStackTrace();
			// mostrar ventana con mensaje de error
		} catch (SeniorityNoAlcanzadaException ex2) {
			ex2.printStackTrace();
		}
	}

}
