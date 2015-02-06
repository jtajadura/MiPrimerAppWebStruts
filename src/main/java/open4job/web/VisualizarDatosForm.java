package open4job.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class VisualizarDatosForm extends ActionForm {

	String nombre;
	String apellido;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		
				// crear nueva instancia de action errors
				ActionErrors errors = new ActionErrors();
				
				// validar nombre
				if (this.nombre == null || this.nombre.trim().equals(""))
					errors.add("nombre", new ActionMessage("errors.required", "Nombre"));
				
				// validar apellido
				if (this.apellido == null || this.apellido.trim().equals(""))
					errors.add("apellido", new ActionMessage("errors.required",
							"Apellido"));
				
				// devolver colección de action messages
				return errors;
		
	
		
		/* De esta forma NO FUNCIONA falta algo
		 * 
				// create a new instance of actionErrors
				ActionErrors actionErrors = new ActionErrors();

				// validate nombre
				if (nombre == null) {
					actionErrors.add("nombre", new ActionMessage("errors.required", "Nombre"));
				}

				// validate apellido
				if (apellido == null) {
					actionErrors.add("apellido", new ActionMessage("errors.required", "Apellido"));
				}

				// return collection of action messages
				return actionErrors;
		*/
		
	}

}
