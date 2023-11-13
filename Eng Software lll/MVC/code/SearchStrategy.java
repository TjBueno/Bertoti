// Classe Strategy

import java.util.List;

public interface SearchStrategy {
    List<Pizza> search(List<Pizza> pizza, String keyword);
}

