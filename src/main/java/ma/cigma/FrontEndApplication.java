package ma.cigma;

import io.jsonwebtoken.Claims;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import static ma.cigma.config.security.JWTDemo.createJWT;
import static ma.cigma.config.security.JWTDemo.decodeJWT;

@SpringBootApplication
public class FrontEndApplication {

	/*public static RestTemplate main(String[] args) {
		SpringApplication.run(FrontEndApplication.class, args);
		public RestTemplate getRestTemplate () {
			return new RestTemplate();
		}
	}*/
	@Bean
	public static void main(String[] args) {
		String token=createJWT( "id", "issuer", "subject",
				10000000l);
		System.out.println(token);
		Claims claims=decodeJWT(token);
		System.out.println(claims);
	}
}
