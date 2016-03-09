package restApi;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@PreAuthorize("authenticated")
@RestController
@RequestMapping(Uris.SERVLET_MAP)
public class MiResource {

	@RequestMapping(value = Uris.ADMINS + Uris.START, method = RequestMethod.GET)
	public String start() {
		return "{\"response\":\"OK " + Uris.VERSION + "\"}";
	}

	@RequestMapping(value = Uris.ADMINS + Uris.ECHO + Uris.ID, method = RequestMethod.GET)
	public String echo(@RequestHeader(value = "token", required = false) String token,
			@PathVariable(value = "id") int id, @RequestParam(defaultValue = "Non") String param) {
		String response = "{\"id\":%d,\"token\":\"%s\",\"param\":\"%s\"}";
		return String.format(response, id, token, param);
	}

	@RequestMapping(value = Uris.ADMINS + Uris.BODY, method = RequestMethod.POST)
	public Wrapper body(@RequestBody Wrapper wrapper) {
		return wrapper;
	}

	@PreAuthorize("hasRole('PLAYER')")
	@RequestMapping(value = Uris.SECURITY + Uris.SECURITY_ANNOTATION, method = RequestMethod.GET)
	public String player() {
		return "OK. Acceso permitido al recurso player";
	}

	@RequestMapping(value = Uris.SECURITY + Uris.SECURITY_URI, method = RequestMethod.GET)
	public String playerUri() {
		return "OK. Acceso permitido al recurso player";
	}

}
