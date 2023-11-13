import java.util.List;

public class PizzariaController {
    private PizzariaModel model;
    private PizzariaView view;

    public PizzariaController(PizzariaModel model, PizzariaView view) {
        this.model = model;
        this.view = view;
    }

    public void addPizza(String title, String tamanho) {
        model.addPizza(title, tamanho);
    }

    public void removePizza(String title) {
        model.removePizza(title);
    }

    public void searchPizzasByTitle(String keyword) {
        List<Pizza> Pizzas = model.getAllPizzas();
        SearchStrategy strategy = new SearchByTitleStrategy();
        List<Pizza> results = strategy.search(Pizzas, keyword);
        view.displayPizzas(results);
    }

    public void searchPizzasByTamanho(String keyword) {
        List<Pizza> Pizzas = model.getAllPizzas();
        SearchStrategy strategy = new SearchByTamanhoStrategy();
        List<Pizza> results = strategy.search(Pizzas, keyword);
        view.displayPizzas(results);
    }
}

