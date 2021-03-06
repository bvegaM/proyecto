package Negocio;

import java.util.List;

import Modelo.FacturaCabecera;
import Modelo.Paciente;
import Modelo.Medico;

public interface GestionFacturaCabeceraLocal {

	public void insert(FacturaCabecera fc);
	public void update(FacturaCabecera fc);
	public FacturaCabecera read(String numeroFactura);
	public void delete(String numeroFactura);
	public List<FacturaCabecera> getFacturaCabecera();
	public List<FacturaCabecera> getFacturaCabeceraActivo();
	public List<FacturaCabecera> getFacturaCabeceraMedico(Medico medico);
	public List<FacturaCabecera> getFacturaCabeceraPacente(Paciente paciente);
}
