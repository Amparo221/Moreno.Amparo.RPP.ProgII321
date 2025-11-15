package sistemabaseespacial;

//no implementa mover
public class Experimento extends UnidadOperativa{
    private int duracionIdeal;
    
    
    public Experimento(String nombre, String modulo, TipoAtmosfera tipoAtmosfera, int duracionIdealDias) {
        super(nombre, modulo, tipoAtmosfera);
        this.duracionIdeal = duracionIdeal;
    }
    
    @Override
    public void reabastecerse() {
        System.out.println("El experimento se esta reabasteciendo...");
    }
    
    @Override
    public void mantenerAtmosfera() {
        System.out.println("El experimento mantiene sus condiciones atmosfericas");
    }
    
    @Override
    public void replicarse() {
        System.out.println("El experimento se clona con protocolos experimentales");
        System.out.println();
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(", Tipo: Experimento, Duracion: %d dias", duracionIdeal);
    }
    
    public int getDuracionIdealDias() { return duracionIdeal; }
}
