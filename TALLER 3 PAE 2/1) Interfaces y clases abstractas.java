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