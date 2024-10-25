public class App {
    public static void main(String[] args) throws Exception {
        Empleado  e1 = new Empleado();
        e1.setEmpresa("Mc Donalds");
        e1.setNombre("Luis");
        System.out.println(e1.getEmpresa());
        System.out.println(e1.toString());
        // System.out.println(e1.nombre);
        
        EmpleadoAsalariado ea2 = new EmpleadoAsalariado("Daniel");
        System.out.println(ea2.getNombre());
        ea2.setEmpresa("Google");
        ea2.setNombre("Santiago");
        ea2.setSalario(5000);
        System.out.println(ea2.toString());

        //UTILIZANDO UN CONSTRUCTOR PARA AHORRAR LINEAS DE CÓDIGO.
        EmpleadoAsalariado e3 = new EmpleadoAsalariado("Apple", "Maria", 100);
        System.out.println(e3.toString());

        //POLIMORFISMO
        Persona p1 = new Persona();
        System.out.println(ea2 instanceof Persona);
        System.out.println(ea2 instanceof Empleado);
        System.out.println(ea2 instanceof EmpleadoAsalariado);
        System.out.println(ea2 instanceof Object);
        System.out.println(p1 instanceof Empleado);
        System.out.println(p1 instanceof EmpleadoAsalariado);
        System.out.println(p1 instanceof Object);
        System.out.println(p1 instanceof Persona);

    }

}
