public class Empleado extends Persona{//clase modelo, esta tiene como base la clase Object, la cual se crea implicitamente.

    //DEFINICION DE VARIABLES
    private String empresa;

    //CONSTRUCTOR
    public Empleado(){//si se crea otro constructor con datos de entrada, este constructor vacio debe existir tambien
    }

    public Empleado(String nombre){
        super(nombre);//Se utiliza super para rlacionar el constructor de la calse padre que tinee como entrada el string nombre
    }

    //GETTERS AND SETTERS
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    //SOBRE ESCRIBE EL toString QUE ES UN METODO DE LA CLASE PRINCPAL OBJECT
    @Override
    public String toString() {
        String text = "Empleado {nombre=" + this.getNombre();
        text = text + " empresa=" + this.empresa + "}";
        return text;
    }

}
