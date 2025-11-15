package sistemabaseespacial;

abstract class UnidadOperativa {

    private String nombre;
    private String modulo;
    private TipoAtmosfera tipoAtmosfera;

    public UnidadOperativa(String nombre, String modulo, TipoAtmosfera tipoAtmosfera) {
        this.nombre = nombre;
        this.modulo = modulo;
        this.tipoAtmosfera = tipoAtmosfera;
    }

    //operaciones en comun
    public abstract void reabastecerse();

    public abstract void mantenerAtmosfera();

    public abstract void replicarse();

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getModulo() {
        return modulo;
    }

    public TipoAtmosfera getTipoAtmosfera() {
        return tipoAtmosfera;
    }

    public boolean esTipo(TipoAtmosfera tipo) {
        return tipo == this.tipoAtmosfera;
    }
    
    @Override
    public String toString() {
        return String.format("Nombre: %s, Modulo: %s, Atmosfera: %s",
                nombre, modulo, tipoAtmosfera);

    }

    public boolean mismaUbicacion(String nombre, String modulo) {
        return this.nombre.equals(nombre) && this.modulo.equals(modulo);
    }

    
}
