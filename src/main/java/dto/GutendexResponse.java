package dto;

import model.Libro;
import java.util.List;

public class GutendexResponse {

    private List<Libro> results;

    public List<Libro> getResults() {
        return results;
    }

    public void setResults(List<Libro> results) {
        this.results = results;
    }

    public List<Libro> toLibros() {
        return List.of();
    }
}
