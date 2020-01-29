package Negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Datos.HistorialDAO;
import Modelo.Historial;

@Stateless
public class GestionHistorial implements GestionHistorialLocal {
	
	@Inject
	private HistorialDAO hdao;

	@Override
	public void insertar(Historial historial) {
		// TODO Auto-generated method stub
		hdao.insertar(historial);
	}

	@Override
	public void actualizar(Historial historial) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Historial leer(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Historial> getHistoriales() {
		// TODO Auto-generated method stub
		return hdao.getHistoriales();
	}

}
