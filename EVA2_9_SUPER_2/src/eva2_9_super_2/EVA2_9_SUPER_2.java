package eva2_9_super_2;
//Rodrigo levi garcia garay
public class EVA2_9_SUPER_2 {

    public static void main(String[] args) {
        System.out.println("ESTUDIANTE");
        Estudiante estudiante = new Estudiante("Levi", "Garcia", 19, "22550379");
        estudiante.imprimirDatos();
        //System.out.println("No de Control: "+ estudiante.getNoControl());
        
        System.out.println("\nDOCENTE");
        Docente docente = new Docente("Rodrigo", "Garcia", 45, "068897847");
        docente.imprimirDatos();
        //System.out.println("Plaza: "+ docente.getPlaza());
        
        System.out.println("\nPROVEDOOR");
        Proveedores proveedor = new Proveedores("Rigo", "Garcia", 55, "GAGR435CH04");
        proveedor.imprimirDatos();
        //System.out.println("RFC: "+ proveedor.getRfc() );
        
    }
    
}