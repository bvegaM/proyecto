package Exception;

import Modelo.Cita;

public class ExcepcionCita extends Exception {
	
	public ExcepcionCita() {
		super("El horario que eligio no esta disponible. Intente seleccionando otro horario.");
	}

	
	public boolean verificarCita(int i) {
		if(i==0) {
			return false;
		}else {
			return true;
		}
	}
}
