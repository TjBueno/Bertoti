import java.util.ArrayList;
import java.util.List;

public class PizzariaModel {
    private List<Pizza> pizzas;
    private List<Observer> observers;

    public PizzariaModel() {
        pizzas = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void addPizza(String title, String tamanho) {
        Pizza pizza = new Pizza(title, tamanho);
        pizzas.add(pizza);
        notifyObservers();
    }

    public void removePizza(String title) {
        Pizza pizzaToRemove = null;
        for (Pizza pizza : pizzas) {
            if (pizza.getTitle().equalsIgnoreCase(title)) {
                pizzaToRemove = pizza;
                break;
            }
        }
        if (pizzaToRemove != null) {
            pizzas.remove(pizzaToRemove);
            notifyObservers();
        }
    }

    public List<Pizza> getAllPizzas() {
        return pizzas;
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
