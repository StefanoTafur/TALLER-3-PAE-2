// Interfaces
interface Masa {
    String obtenerDescripcion();
}

interface Salsa {
    String obtenerDescripcion();
}

// Fábrica abstracta
interface FabricaDePizza {
    Masa crearMasa();
    Salsa crearSalsa();
}

// Productos concretos italianos
class MasaItaliana implements Masa {
    @Override
    public String obtenerDescripcion() {
        return "Masa delgada italiana";
    }
}

class SalsaItaliana implements Salsa {
    @Override
    public String obtenerDescripcion() {
        return "Salsa de tomate fresco";
    }
}

// Productos concretos americanos
class MasaAmericana implements Masa {
    @Override
    public String obtenerDescripcion() {
        return "Masa gruesa americana";
    }
}

class SalsaAmericana implements Salsa {
    @Override
    public String obtenerDescripcion() {
        return "Salsa barbacoa";
    }
}


// Fábricas concretas
class FabricaPizzaItaliana implements FabricaDePizza {
    @Override
    public Masa crearMasa() {
        return new MasaItaliana();
    }

    @Override
    public Salsa crearSalsa() {
        return new SalsaItaliana();
    }
}

class FabricaPizzaAmericana implements FabricaDePizza {
    @Override
    public Masa crearMasa() {
        return new MasaAmericana();
    }

    @Override
    public Salsa crearSalsa() {
        return new SalsaAmericana();
    }
}

// Cliente
class PreparacionDePizza {
    private Masa masa;
    private Salsa salsa;

    public PreparacionDePizza(FabricaDePizza fabrica) {
        this.masa = fabrica.crearMasa();
        this.salsa = fabrica.crearSalsa();
    }

    public void prepararPizza() {
        System.out.println("Preparando pizza con:");
        System.out.println("Masa: " + masa.obtenerDescripcion());
        System.out.println("Salsa: " + salsa.obtenerDescripcion());
    }
}

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
