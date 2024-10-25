public class Persona {
    
    private String nombre;

    //constructuor
    public Persona(){
    }

    public Persona(String nombre){
        this.nombre=nombre;
    }

    public void setNombre(String n){
        this.nombre=n;
    }
    public String getNombre(){
        return this.nombre;
    }
}
