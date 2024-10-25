public class Persona {
    
    private String nombre;

    //CONSTRUCTORES
    public Persona(){
    }

    public Persona(String nombre){
        this.nombre=nombre;
    }

    //GETTERS AND SETTERS
    public void setNombre(String n){
        this.nombre=n;
    }
    public String getNombre(){
        return this.nombre;
    }
}
