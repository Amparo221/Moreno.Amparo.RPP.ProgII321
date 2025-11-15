package sistemabaseespacial;


public class UnidadDuplicadaException extends RuntimeException {
    public UnidadDuplicadaException(String nombre, String modulo) {
        super(String.format("Unidad duplicada: '%s' en modulo '%s'", nombre, modulo));
    }
    
    public UnidadDuplicadaException(String mensaje) {
        super(mensaje);
    }
}
