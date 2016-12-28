package br.com.hustik.curso.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.hustik.curso.beans.Interesse;
import br.com.hustik.curso.beans.PerfilUsuarioBean;

@FacesConverter("interesseCO")
public class InteresseConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null) {
			for (Interesse interesse : PerfilUsuarioBean.INTERESSES) {
				if (value.equals(interesse.getNomeIcone())) {
					return interesse;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value != null) {
			Interesse interesse = (Interesse) value;
			// geralmente se utiliza algo que define o meu objeto (ID, por exemplo)
			return interesse.getNomeIcone();
		}
		return null;
	}
	
}
