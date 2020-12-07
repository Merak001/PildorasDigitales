package POO;

public class Pruebas {
    public static void main(String[] args) throws Exception {

        Empleados trabajador1 = new Empleados("Paco");
        Empleados trabajador2 = new Empleados("Rulo");
        Empleados trabajador3 = new Empleados("Pedro");
        trabajador1.cambiaSeccion("RH");

        System.out.println(trabajador1.devulveDatos());
        System.out.println(trabajador2.devulveDatos());
        System.out.println(trabajador3.devulveDatos());

    }
}

class Empleados {
    private final String nombre;
    private String seccion;
    /**
     * Las variables staticas le pertenecen a la clase no los metodos
     */
    private static int iDEmpleado=0;
    private int id;

    /**
     * Metodo Constructor Donde le estamos pasando los parmetros de nombreEmpleado
     * como obligatorio
     * gvsdfsdfsd
     */
    public Empleados(String nombreEmpleado) {
        nombre = nombreEmpleado;
        seccion = "Administración";
        
        id=iDEmpleado;
        id++;
        iDEmpleado=id;
        
        // this es el valor de la clase
    }

    public void cambiaSeccion(String seccion) {
        this.seccion = seccion;
    }

    // Retornamos los datos que tenemos en la clase ya que son accesibles por que
    // estan declados
    // a nivel clase
    public String devulveDatos() {
        return "El nombre es: " + nombre + " Su Id es : "+id+ " y la seccion es " + seccion;

    }
}