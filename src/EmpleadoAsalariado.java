public class EmpleadoAsalariado extends Empleado{
    private int salario;

    //CONSTRUCTOR
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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString(){
        String text = "EmpleadoAsalariado { nombre="+this.getNombre();
        text=text+" empresa="+this.getEmpresa();
        text=text+" salario="+this.getSalario()+" USD }";
        return text;

    }
}
