package service;

import dto.GutendexResponse;
import model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class LibroService {

    private final WebClient webClient;

    @Autowired
    public LibroService(WebClient webClient) {
        this.webClient = webClient;
    }

    public List<Libro> buscarPorTitulo(String titulo) {
        Mono<GutendexResponse> responseMono = webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/books")
                        .queryParam("search", titulo)
                        .build())
                .retrieve()
                .bodyToMono(GutendexResponse.class);

        GutendexResponse response = responseMono.block();
        return response != null ? response.getResults() : List.of();
    }

    public List<Libro> buscarPorAutor(String autor) {
        Mono<GutendexResponse> responseMono = webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/books")
                        .queryParam("search", autor)
                        .build())
                .retrieve()
                .bodyToMono(GutendexResponse.class);

        GutendexResponse response = responseMono.block();
        return response != null ? response.getResults() : List.of();
    }

    public List<Libro> listarUltimosLibros() {
        Mono<GutendexResponse> responseMono = webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/books")
                        .queryParam("sort", "latest")
                        .build())
                .retrieve()
                .bodyToMono(GutendexResponse.class);

        GutendexResponse response = responseMono.block();
        return response != null ? response.getResults() : List.of();
    }

    public Flux<Libro> buscarLibrosEnGutendex() {
        // Aquí puedes implementar la lógica para buscar libros en Gutendex con la query proporcionada
        return null;
    }
}



