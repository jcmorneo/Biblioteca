package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import service.LibroService;

@Configuration
public class AppConfig {

    @Bean
    public WebClient webClient(WebClient.Builder webClientBuilder) {
        return webClientBuilder.baseUrl("https://gutendex.com").build();
    }

    @Bean
    public LibroService libroService(WebClient webClient) {
        return new LibroService(webClient);
    }
}




