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