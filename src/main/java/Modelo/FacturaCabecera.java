package Modelo;

import java.util.Date;
import java.util.List;

public class FacturaCabecera {

	private String numeroFactura;
	private Paciente paciente;
	private Date Fecha;
	private List<FacturaDetalle> facturaDetalles;
	
	public String getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "FacturaCabecera [numeroFactura=" + numeroFactura + ", paciente=" + paciente + ", Fecha=" + Fecha + "]";
	}
	
	
	
}
