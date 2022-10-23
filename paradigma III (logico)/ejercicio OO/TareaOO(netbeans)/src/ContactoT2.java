
public class ContactoT2 extends Contacto{
    
    
    private String instagram;
    private String facebook;

    

    public ContactoT2(String instagram, String facebook, String nombre, String edad, String genero, String direccion, int telefono) {
        super(nombre, edad, genero, direccion, telefono);
        this.instagram = instagram;
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }
    
    public void setInstagram(String instagram) {
        this.instagram=instagram;
    }
    
    public String getFacebook() {
        return facebook;
    }
    
    public void setFacebook(String facebook) {
        this.facebook=facebook;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return  super.toString() +"ContactoT2(" +
                "instagram: " + instagram + 
                ", facebook: " + facebook +
                ')' ;
    }

    
    

    
    
    
    
}
