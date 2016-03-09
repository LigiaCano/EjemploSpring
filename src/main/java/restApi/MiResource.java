package restApi;

import java.net.URI;
import java.util.GregorianCalendar;

import org.junit.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping(Uris.SERVLET_MAP + Uris.ADMINS)
public class MiResource {
	
	 @RequestMapping(value = Uris.START, method = RequestMethod.GET)
	 public String start() {
		 return "{\"response\":\"OK " + Uris.VERSION + "\"}";
	 }
	 
	 @RequestMapping(value = Uris.ECHO + Uris.ID, method = RequestMethod.GET)
	 public String echo(@RequestHeader(value = "token", required = false) String token, @PathVariable(value = "id") int id,
			 @RequestParam(defaultValue = "Non") String param) {
	         String response = "{\"id\":%d,\"token\":\"%s\",\"param\":\"%s\"}";
	        return String.format(response, id, token, param);
	 }
	 
	 @RequestMapping(value = Uris.BODY, method = RequestMethod.POST)
	 public Wrapper body(@RequestBody Wrapper wrapper) {
	      return wrapper;
	 }
	 
}
