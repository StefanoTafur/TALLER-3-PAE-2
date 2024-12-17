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