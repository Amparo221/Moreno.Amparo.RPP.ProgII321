package sistemabaseespacial;

public class Astronauta extends UnidadOperativa implements Movible {

    private int maxEVA;

    public Astronauta(String nombre, String modulo, TipoAtmosfera tipoAtmosfera, int maxHorasEVA) {
        super(nombre, modulo, tipoAtmosfera);
        this.maxEVA = maxEVA;
    }

    @Override
    public void mover() {
        System.out.println("Los astronautas se mueven de modulo.");
    }

    @Override
    public void reabastecerse() {
        System.out.println("Astronauta se esta reabasteciendo...");
    }

    @Override
    public void mantenerAtmosfera() {
        System.out.println("Astronauta se asegura de mantener las condiciones atmosfericas adecuadas.");
    }

    @Override
    public void replicarse() {
        System.out.println("Astronauta se replica con entrenamiento.");
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Tipo: Astronauta, Horas EVA: %d", maxEVA);
    }

    public int getMaxHorasEVA() {
        return maxEVA;
    }
}

