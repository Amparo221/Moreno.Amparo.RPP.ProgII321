package sistemabaseespacial;


public class SistemaBaseEspacial {
    public static void main(String[] args) {
        
        BaseEspacialInternacional base = new BaseEspacialInternacional("Base abc234");
        
        System.out.println("Base: " + base.getNombreBase());
        System.out.println("=" .repeat(50));
        
        try {
            
            System.out.println("\n--- AGREGANDO UNIDADES OPERATIVAS ---");
            base.agregarUnidadOperativa(
                new Astronauta("martin", "M1", TipoAtmosfera.PRESURIZADA, 8));
            base.agregarUnidadOperativa(
                new Robot("avf4w", "M1", TipoAtmosfera.VACIO, 72));
            base.agregarUnidadOperativa(
                new Experimento("Cristales", "M2", TipoAtmosfera.PRESURIZADA, 30));
            base.agregarUnidadOperativa(
                new Astronauta("Carlos", "M2", TipoAtmosfera.VACIO, 6));
            base.agregarUnidadOperativa(
                new Robot(" 4RQ34RVQW", "M2", TipoAtmosfera.PRESURIZADA, 48));
            
            // base.agregarUnidadOperativa(
            //     new Astronauta("martin", "M1", TipoAtmosfera.PRESURIZADA, 8));
                
        } catch (UnidadDuplicadaException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
   
        System.out.println("\n" + "=".repeat(50));
        base.mostrarUnidades();
        
  
        System.out.println("\n" + "=".repeat(50));
        base.moverUnidades();
     
        System.out.println("\n" + "=".repeat(50));
        base.realizarFuncionesBase();
        
       
        System.out.println("\n" + "=".repeat(50));
        base.filtrarUnidadesPorTipoAtmosfera(TipoAtmosfera.PRESURIZADA);
        
        System.out.println("\n" + "=".repeat(50));
        base.filtrarUnidadesPorTipoAtmosfera(TipoAtmosfera.VACIO);
        
    }
}
