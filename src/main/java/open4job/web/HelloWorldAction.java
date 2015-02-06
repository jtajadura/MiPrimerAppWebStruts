package open4job.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
 
//import com.mkyong.common.form.HelloWorldForm;
 
public class HelloWorldAction extends Action{
 
	public ActionForward execute(ActionMapping mapping,ActionForm form,
		HttpServletRequest request,HttpServletResponse response)
        throws Exception {
 
		
		 
/*		SIN USAR FORMULARIO	
 * 
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		
		request.setAttribute("nombre", nombre);
		request.setAttribute("apellido", apellido);

*/
		
		//la cacdena success es un alias para llamar con el forward a cualquier .jsp
		//que estarán definidos en el struts-config.xml
		return mapping.findForward("success");
	}
 
}
