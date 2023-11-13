import java.util.ArrayList;
import java.util.List;

public class SearchByTamanhoStrategy implements SearchStrategy {
    @Override
    public List<Pizza> search(List<Pizza> pizzas, String keyword) {
        List<Pizza> results = new ArrayList<>();
        for (Pizza pizza : pizzas) {
            if (pizza.getTamanho().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(pizza);
            }
        }
        return results;
    }
}

