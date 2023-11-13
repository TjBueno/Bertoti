import java.util.List;

public class PizzariaView implements Observer {
    private PizzariaModel model;

    public PizzariaView(PizzariaModel model) {
        this.model = model;
    }

    public void displayPizzas(List<Pizza> pizzas) {
        if (pizzas.isEmpty()) {
            System.out.println("Nenhum pizza encontrado.");
        } else {
            System.out.println("pizzas encontrados:");
            for (Pizza pizza : pizzas) {
                System.out.println("Título: " + pizza.getTitle());
                System.out.println("Tamanho: " + pizza.getTamanho());
                System.out.println("-----------------------");
            }
        }
    }

    @Override
    public void update() {
        List<Pizza> pizzas = model.getAllPizzas();
        displayPizzas(pizzas);
    }
}

