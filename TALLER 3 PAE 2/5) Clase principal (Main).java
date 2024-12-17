// Clase principal
public class Main {
    public static void main(String[] args) {
        // Preparacion de pizza italiana
        FabricaDePizza fabricaItaliana = new FabricaPizzaItaliana();
        PreparacionDePizza pizzaItaliana = new PreparacionDePizza(fabricaItaliana);
        System.out.println("Pizza Italiana:");
        pizzaItaliana.prepararPizza();

        System.out.println();

        // Preparacion de pizza americana
        FabricaDePizza fabricaAmericana = new FabricaPizzaAmericana();
        PreparacionDePizza pizzaAmericana = new PreparacionDePizza(fabricaAmericana);
        System.out.println("Pizza Americana:");
        pizzaAmericana.prepararPizza();
    }
}