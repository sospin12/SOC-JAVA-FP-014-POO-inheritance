public class Empleado extends Persona{

    public Empleado(){
    }

    public Empleado(String nombre){
        super(nombre);
    }

    private String empresa;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        String text = "Empleado {nombre=" + this.getNombre();
        text = text + " empresa=" + this.empresa + "}";
        return text;
    }

}
