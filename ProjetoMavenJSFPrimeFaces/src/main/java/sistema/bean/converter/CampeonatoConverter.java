package sistema.bean.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import sistema.modelos.Campeonato;
import sistema.service.CampeonatoService;

@FacesConverter("campeonatoConverter")
public class CampeonatoConverter  implements Converter {
	
	CampeonatoService service = new CampeonatoService();

	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {

		if (value != null && !value.isEmpty()) {
			for (Campeonato c : service.getCampeonatos())
				if (c.getNomeCampeonato().equals(value))
					return c;
		}

		return null;
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic, Object campeonato) {

		if (campeonato == null || campeonato.equals(""))
			return null;

		else
			return ((Campeonato) campeonato).getNomeCampeonato();
	}

}
