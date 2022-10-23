
public abstract class Contacto {
    Persona persona; 
    private String direccion;
    private int telefono;


    public Contacto(String nombre, String edad,String genero,String direccion, int telefono) {
        this.persona = new Persona (nombre,edad,genero);
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return  persona + "Contacto["  +" direccion: " + direccion + ", telefono: " + telefono + ']';
    }

    public Persona getPersona() {
        return persona;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }
    
    
        
    
}
