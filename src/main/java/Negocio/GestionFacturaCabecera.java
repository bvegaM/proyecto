package Negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Datos.FacturaCabeceraDAO;
import Modelo.FacturaCabecera;
import Modelo.Paciente;
import Modelo.Medico;


@Stateless
public class GestionFacturaCabecera implements GestionFacturaCabeceraLocal {

	@Inject
	private FacturaCabeceraDAO dao;
	
	@Override
	public void insert(FacturaCabecera fc) {
		dao.insert(fc);
	}

	@Override
	public void update(FacturaCabecera fc) {
		dao.update(fc);
	}

	@Override
	public FacturaCabecera read(String numeroFactura) {
		return dao.read(numeroFactura);
	}

	@Override
	public void delete(String numeroFactura) {
		dao.delete(numeroFactura);
	}

	@Override
	public List<FacturaCabecera> getFacturaCabecera() {
		return dao.getFacturaCabecera();
	}
	
	@Override
	public List<FacturaCabecera> getFacturaCabeceraActivo() {
		return dao.getFacturaCabeceraActivo();
	}

	public List<FacturaCabecera> getFacturaCabeceraMedico(Medico medico) {
		return dao.getFacturaCabeceraMedico(medico);
	}

	@Override
	public List<FacturaCabecera> getFacturaCabeceraPacente(Paciente paciente) {
		return dao.getFacturaCabeceraPaciente(paciente);
	}

}
