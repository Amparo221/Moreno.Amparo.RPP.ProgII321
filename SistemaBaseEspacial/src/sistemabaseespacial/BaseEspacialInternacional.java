package sistemabaseespacial;

import java.util.ArrayList;
import java.util.List;

public class BaseEspacialInternacional {

    private List<UnidadOperativa> unidades;
    private List<UnidadOperativa> unidadesFiltradas;
    private String nombreBase;

    public BaseEspacialInternacional(String nombreBase) {
        this.nombreBase = nombreBase;
        this.unidades = new ArrayList<>();
        this.unidadesFiltradas = new ArrayList<>();
    }

    public void agregarUnidadOperativa(UnidadOperativa nuevaUnidad) throws UnidadDuplicadaException {
        for (UnidadOperativa unidad : unidades) {
            if (unidad.getNombre().equals(nuevaUnidad.getNombre())
                    && unidad.getModulo().equals(nuevaUnidad.getModulo())) {
                throw new UnidadDuplicadaException(nuevaUnidad.getNombre(), nuevaUnidad.getModulo());
            }
        }

        unidades.add(nuevaUnidad);
        System.out.printf("Unidad %s agregada exitosamente al modulo %s\n",
                nuevaUnidad.getNombre(), nuevaUnidad.getModulo());
    }

    public void mostrarUnidades() {
        System.out.printf("Unidades operativas en %s\n", nombreBase);
        if (unidades.isEmpty()) {
            System.out.println("No hay unidades registradas.");
            return;
        }

        for (int i = 0; i < unidades.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, unidades.get(i));
        }
    }

    public void moverUnidades() {
        System.out.println("Movimiento de unidades");

        for (UnidadOperativa unidad : unidades) {
            if (unidad instanceof Movible) {
                Movible movil = (Movible) unidad;
                movil.mover();
            } else {
                System.out.println("No puede moverse los experimentos");
            }
        }
    }

    public void realizarFuncionesBase() {
        System.out.println("Ejecucion de funciones basicas");

        for (UnidadOperativa unidad : unidades) {
            unidad.reabastecerse();
            unidad.mantenerAtmosfera();
            unidad.replicarse();
        }
    }

    


    public void filtrarUnidadesPorTipoAtmosfera(TipoAtmosfera tipo) {
        unidadesFiltradas = new ArrayList<>();

        for (UnidadOperativa unidad : unidades) {
            if (unidad.esTipo(tipo)) {
                unidadesFiltradas.add(unidad);
            }
        }
        
        System.out.printf("Unidades con atmosfera %s \n", tipo);

        if (unidadesFiltradas.isEmpty()) {
            System.out.println("No hay unidades con este tipo de atmosfera.");
        } else {
            for (int i = 0; i < unidadesFiltradas.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, unidadesFiltradas.get(i));
            }
        }
    }

    public String getNombreBase() {
        return nombreBase;
    }

    public int getTotalUnidades() {
        return unidades.size();
    }
}
