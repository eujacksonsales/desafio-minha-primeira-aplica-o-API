package dio.minha_primeira_web_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableFeignClients(basePackages = "dio.minha_primeira_web_api")
@SpringBootApplication
public class MinhaPrimeiraWebApiApplication {

	public static void main(String[] args) {
		System.setProperty("spring.context.parallel", "true");
		SpringApplication.run(MinhaPrimeiraWebApiApplication.class, args);
	}

}
