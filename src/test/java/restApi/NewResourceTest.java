package restApi;

import static org.junit.Assert.assertEquals;

import java.net.URI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import config.TestsApiConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestsApiConfig.class})
public class NewResourceTest {
	
	 private static final String URL_API = "http://localhost:8080/EjemploSpring.0.0.1-SNAPSHOT" + Uris.SERVLET_MAP;
	 
	 @Test
	    public void testCalculadora() {
		// Header
	        HttpHeaders headers = new HttpHeaders();
	      
	        // Params
	        MultiValueMap<String, String> params = new HttpHeaders();
	        params.add("dividendo", "5");
	        params.add("divisor", "5");

	        // Uri
	        URI uri = UriComponentsBuilder.fromHttpUrl(URL_API).path(Uris.ADMINS).path(Uris.CALCULADORA).queryParams(params)
	                .buildAndExpand().encode().toUri();
	        System.out.println("URI: " + uri);

	        RequestEntity<Object> requestEntity = new RequestEntity<>(headers,HttpMethod.GET, uri);
	        String response = new RestTemplate().exchange(requestEntity, String.class).getBody();
	        System.out.println("Response: " + response);
	        assertEquals("{\"respuesta\":1", response);
	    }

}
