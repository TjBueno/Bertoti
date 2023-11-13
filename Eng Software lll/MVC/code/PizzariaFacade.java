// Classe Facade
public class PizzariaFacade {
    private PizzariaController controller;
    private PizzariaModel model;
    private PizzariaView view;

    public PizzariaFacade() {
        model = new PizzariaModel();
        view = new PizzariaView(model);
        controller = new PizzariaController(model, view);
        model.addObserver(view);
    }

    public void addPizza(String title, String tamanho) {
        controller.addPizza(title, tamanho);
    }

    public void removePizza(String title) {
        controller.removePizza(title);
    }

    public void searchPizzasByTitle(String keyword) {
        controller.searchPizzasByTitle(keyword);
    }

    public void searchPizzasByTamanho(String keyword) {
        controller.searchPizzasByTamanho(keyword);
    }
}

