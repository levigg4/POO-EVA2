package eva2_3_extends;
//RODRIGO LEVI GARCIA GARAY 
public class EVA2_3_EXTENDS {

    public static void main(String[] args) {
        Estudiante estu = new Estudiante();
        estu.setNombre("Levi");
        estu.setApellido("Garcia");
        estu.setEdad(19);
        estu.setNoControl("22550379");
        System.out.println("IMPRIMIR DATOS");
        System.out.println("Nombre: "+estu.getNombre());
        System.out.println("Apellid: "+estu.getApellido());
        System.out.println("Edad: "+estu.getEdad());
        System.out.println("No de Control: "+estu.getNoControl());
        Proveedores prove = new Proveedores();
        prove.setNombre("Juan");
        prove.setApellido("Peréz");
        prove.setEdad(37);
        prove.setRfc("adadad32");
        System.out.println("IMPRIMIR DATOS");
        System.out.println("Nombre: "+prove.getNombre());
        System.out.println("Apellid: "+prove.getApellido());
        System.out.println("Edad: "+prove.getEdad());
        System.out.println("No de Control: "+prove.getRfc());

    }
    
}
