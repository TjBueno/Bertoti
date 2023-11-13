public class PizzariaApp {
    public static void main(String[] args) {
        // Criação da instância do pizzariaFacade
        PizzariaFacade pizzariaFacade = new PizzariaFacade();

        // Adicionando algumas pizzas a pizzaria
        pizzariaFacade.addPizza("Calabresa com mussarela", "Normal");
        pizzariaFacade.addPizza("Calabresa mussarela", "Broto");
        pizzariaFacade.addPizza("Frango com catupiry", "Normal");
        pizzariaFacade.addPizza("Frango com catupiry", "Broto");

        // Realizando uma busca por título
        System.out.println("Busca por título:");
        pizzariaFacade.searchPizzasByTitle("Calabresa com mussarela");

        // Realizando uma busca por tamanho
        System.out.println("Busca por genro:");
        pizzariaFacade.searchPizzasByTamanho("Normal");

        // Removendo um Pizza da pizzaria
        pizzariaFacade.removePizza("Frango com catupiry");

        // Realizando uma nova busca por título
        System.out.println("Busca por título após remoção:");
        pizzariaFacade.searchPizzasByTitle("Frango com catupiry");
    }
}
