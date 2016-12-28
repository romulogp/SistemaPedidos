package br.com.hustik.curso.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.hustik.curso.beans.PaisBean;
import br.com.hustik.curso.pojo.Pais;

@FacesConverter("paisCO")
public class PaisConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String id) {
		if (id != null) {
			Integer codigo = Integer.valueOf(id);
		
			for (Pais pais : PaisBean.PAISES) {
				if (codigo.equals(pais.getCodigo())) {
					return pais;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object object) {
		if (object != null && !object.equals("")) {
			Pais pais = (Pais) object;
			return String.valueOf(pais.getCodigo());
		}
		return null;
	}
	
}
