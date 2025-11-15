
package sistemabaseespacial;


public class Robot extends UnidadOperativa implements Movible{
    private int horasAutonomia;
    
    public Robot(String nombre, String modulo, TipoAtmosfera tipoAtmosfera, int autonomiaHoras) {
        super(nombre, modulo, tipoAtmosfera);
        this.horasAutonomia = horasAutonomia;
    }
    
    @Override
    public void mover() {
        System.out.printf("Los robots se mueven de modulo.\n");
    }
    
    @Override
    public void reabastecerse() {
        System.out.println("Robot se esta recargando.");
    }
    
    @Override
    public void mantenerAtmosfera() {
        System.out.println("Robot ajusta sistemas para atmosfera.");
    }
    
    @Override
    public void replicarse() {
        System.out.println("Robot se esta replicando");
        System.out.println();
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(", Tipo: Robot, Autonomia: %d horas", horasAutonomia);
    }
    
    public int getAutonomiaHoras() { return horasAutonomia; }
    
}
