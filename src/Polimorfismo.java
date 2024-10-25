public class Polimorfismo {
    public static void main(String[] args) {
        Object o = new Empleado();
        System.out.println(o.toString());

        //Conversion implicita
        // Persona p1 = new Object();
        Persona p1 = new EmpleadoAsalariado();
        // Empleado e1 = new Persona();
        Empleado e1 = new EmpleadoAsalariado();
        Object o1 = new EmpleadoAsalariado();
        // EmpleadoAsalariado ea4 = new EmpleadoAsalariado();


        o1 = p1;
        // ea1 = e1;
        p1 = e1;
        // Empleado e1 = o1;

    }

}
