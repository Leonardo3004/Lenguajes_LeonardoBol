
public class ContactoT1 extends Contacto{
   private String email; 

    

    public ContactoT1(String email, String nombre, String edad, String genero, String direccion, int telefono) {
        super(nombre, edad, genero, direccion, telefono);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }


    @Override
   public String toString() {
        return 
                super.toString()  +"ContactoT1(" +
                "email: '" + email  +
                ')';
    }
    






}
