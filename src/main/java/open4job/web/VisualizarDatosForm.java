package open4job.web;

import org.apache.struts.action.ActionForm;
 
public class VisualizarDatosForm extends ActionForm{
 
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
	

}
