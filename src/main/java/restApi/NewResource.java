package restApi;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Uris.SERVLET_MAP + Uris.ADMINS)
public class NewResource {
	
	 @RequestMapping(value = Uris.CALCULADORA , method = RequestMethod.GET)
	 public String calculadora( @RequestParam(value = "dividendo", required = true) int  dividendo,
			 @RequestParam(value = "divisor", required = true) int  divisor){
		 	double resul = dividendo/divisor;
		 	String response = "{\"respuesta\":%d";
	        return String.format(response, resul);
	 }
	 
	 @RequestMapping(value = Uris.CALCULADORA2 , method = RequestMethod.POST)
	 public Double calculadora2( @RequestBody Fraccion fraccion){
		 double resul = fraccion.getDividendo()/fraccion.getDivisor();
		 return resul;
	 }
	 
	 
}
