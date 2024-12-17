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