// Classe Singleton
public class PizzariaManager {
    private static PizzariaManager instance;
    private int PizzariaId;

    private PizzariaManager() {
        // Construtor privado para evitar instanciação direta
        PizzariaId = 1; // Defina o ID aqui
    }

    public static PizzariaManager getInstance() {
        if (instance == null) {
            instance = new PizzariaManager();
        }
        return instance;
    }

    public int getPizzariaId() {
        return PizzariaId;
    }

}

