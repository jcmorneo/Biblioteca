package client;

import dto.GutendexResponse;
import model.Libro;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Component
public class GutendexClient {

    private final WebClient webClient;

    public GutendexClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://gutendex.com/ebooks/").build();
    }

    public List<Libro> buscarLibros(String query, Integer authorYearStart, String languages) {
        String url = buildUrl(query, authorYearStart, languages);

        GutendexResponse response = webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(GutendexResponse.class)
                .block();

        return response != null ? response.toLibros() : List.of();
    }

    private String buildUrl(String query, Integer authorYearStart, String languages) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://gutendex.com/ebooks/")
                .queryParam("search", query);

        if (authorYearStart != null) {
            builder.queryParam("author_year_start", authorYearStart);
        }

        if (languages != null && !languages.isEmpty()) {
            builder.queryParam("languages", languages);
        }

        return builder.toUriString();
    }
}

