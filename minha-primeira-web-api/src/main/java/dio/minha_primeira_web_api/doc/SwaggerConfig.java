package dio.minha_primeira_web_api.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Title - Rest API")
                        .description("API exemplo de uso de Spring Boot com documentação via SpringDoc OpenAPI")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Seu Nome")
                                .email("voce@seusite.com.br")
                                .url("http://www.seusite.com.br")
                        )
                        .termsOfService("Termo de uso: Open Source")
                        .license(new io.swagger.v3.oas.models.info.License()
                                .name("Licença - Sua Empresa")
                                .url("http://www.seusite.com.br")
                        )
                );
    }
}
