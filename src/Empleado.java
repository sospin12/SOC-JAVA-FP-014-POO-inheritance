public class Empleado extends Persona{

    //CONSTRUCTOR
    public Empleado(){
    }

    public Empleado(String nombre){
        super(nombre);
    }

    //STRING EMPRESA
    private String empresa;

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
