package dio.minha_primeira_web_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MinhaPrimeiraWebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinhaPrimeiraWebApiApplication.class, args);
	}

}
