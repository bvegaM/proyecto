package Util;


import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import Modelo.Especialidad;
import Modelo.Servicio;
import Vista.GestionFacturaBean;
import Vista.GestionFacturaCabeceraBean;
import Vista.GestionMedicoBean;


@FacesConverter(value = "servicioConverter")
public class ServicioConverter implements Converter {

	    @Override
	    public Object getAsObject(FacesContext ctx, UIComponent uiComponent, String beerId) {
	        ValueExpression vex =
	                ctx.getApplication().getExpressionFactory()
	                        .createValueExpression(ctx.getELContext(),
	                                "#{gestionFacturaCabeceraBean}", GestionFacturaCabeceraBean.class);

	        GestionFacturaCabeceraBean bean = (GestionFacturaCabeceraBean)vex.getValue(ctx.getELContext());
	        for(Servicio m: bean.getServicios()) {
	        	System.out.println(m);
	        	if(m.getCodigo() == Integer.valueOf(beerId)) {
	        		System.out.println("encontrado");
	        		return m;
	        	}
	        		
	        }
	        return null;
	    }

	    @Override
	    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object beer) {
	        return "" + ((Servicio)beer).getCodigo();
	    }

	}