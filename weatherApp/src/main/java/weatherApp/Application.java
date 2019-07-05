package weatherApp;

import com.google.gson.Gson;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;
import weatherApp.models.WeatherModel;
import java.util.Collections;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		String resourceUrl = "http://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=eb9e1c4a0134d4f7655c89bff7d0a371";
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<String> response = restTemplate.exchange(resourceUrl, HttpMethod.GET,entity,String.class);
		Gson g = new Gson();
		WeatherModel weatherModel = g.fromJson(response.getBody(), WeatherModel.class);
		System.out.println(response);
	}
}
