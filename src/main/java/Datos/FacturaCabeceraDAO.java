package Datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import Modelo.FacturaCabecera;
import Modelo.Medico;
import Modelo.Paciente;
import Modelo.Receta;


@Stateless
public class FacturaCabeceraDAO {

	@Inject
	private EntityManager em;
	
	public void insert(FacturaCabecera fc) {
		em.persist(fc);
	}
	
	public void update(FacturaCabecera fc) {
		em.merge(fc);
	}
	
	public FacturaCabecera read(String numeroFactura) {
		return em.find(FacturaCabecera.class, numeroFactura);
	}
	
	public void delete(String numeroFactura) {
		em.remove(this.read(numeroFactura));
	}
	
	public List<FacturaCabecera> getFacturaCabecera(){
		String jpql = "SELECT f FROM FacturaCabecera f";
		Query query = em.createQuery(jpql, FacturaCabecera.class);
		List<FacturaCabecera> listado = query.getResultList();		
		return listado;
	}

	public List<FacturaCabecera> getFacturaCabeceraActivo(){
		String jpql = "SELECT f FROM FacturaCabecera f where f.estado = :estado";
		Query query = em.createQuery(jpql, FacturaCabecera.class);
		query.setParameter("estado", "1");
		List<FacturaCabecera> listado = query.getResultList();		
		return listado;
	}

	
	public List<FacturaCabecera> getFacturaCabeceraMedico(Medico medico){
		String jpql = "SELECT f FROM FacturaCabecera f WHERE f.medico = :medico";
		Query query = em.createQuery(jpql, FacturaCabecera.class);
		query.setParameter("medico", medico);
		List<FacturaCabecera> listado = query.getResultList();		
		return listado;
	}
	
	public List<FacturaCabecera> getFacturaCabeceraPaciente(Paciente paciente){
		String jpql = "SELECT f FROM FacturaCabecera f WHERE f.paciente = :paciente";
		Query query = em.createQuery(jpql, FacturaCabecera.class);
		query.setParameter("paciente", paciente);
		List<FacturaCabecera> listado = query.getResultList();		
		return listado;
	}
	
}
