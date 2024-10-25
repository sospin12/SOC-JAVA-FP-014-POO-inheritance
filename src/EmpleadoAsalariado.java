public class EmpleadoAsalariado extends Empleado{
    private int salario;

    //CONSTRUCTORES
    public EmpleadoAsalariado(){
    }

    public EmpleadoAsalariado(String nombre){
        super(nombre);
    }

    public EmpleadoAsalariado(String empresa, String nombre, int salario){
        super(nombre);
        setEmpresa(empresa);
        setSalario(salario);
    }

    //GETTERS AND SETTERS
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    //SOBRE ESCRIBE UNA FUNCION IMPLICITA EN LA CREACION DEL OBJETO DE LA CLASE OBJETO 
    @Override
    public String toString(){
        String text = "EmpleadoAsalariado { nombre="+this.getNombre();
        text=text+" empresa="+this.getEmpresa();
        text=text+" salario="+this.getSalario()+" USD }";
        return text;

    }
}
