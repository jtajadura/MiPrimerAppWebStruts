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
 
		//HelloWorldForm helloWorldForm = (HelloWorldForm) form;
		//helloWorldForm.setMessage("Hello World! Struts");
 
		String texto = request.getParameter("texto");
		String nombre = request.getParameter("nombre");
		
		request.setAttribute("texto", texto);
		request.setAttribute("nombre", nombre);

		
		//la cacdena success es un alias para llamar con el forward a cualquier .jsp
		//que estarán definidos en el struts-config.xml
		return mapping.findForward("success");
	}
 
}
