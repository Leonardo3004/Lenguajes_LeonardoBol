
import java.util.LinkedList;


public class Agenda {
    private LinkedList<Contacto>contactos;
    
    private LinkedList<Evento>eventosT1;

    public Agenda() {
        this.contactos = new LinkedList<>();
        this.eventosT1 = new LinkedList<>();
        
    }
    
    public void agregarContacto (Contacto contactos){
        this.contactos.add(contactos);  
    }
     
    public void modificarContacto(String nombre, Contacto C){
        boolean X=false;
        for(Contacto contactos : this.contactos){
            if (contactos.getPersona().getNombre().equals(nombre)){
                this.contactos.remove(contactos);
                X=true;
                
            }  
            
        }
        if(X)this.contactos.add(C);
     
    }
     
    public void eliminarContacto(String nombre){
        for(Contacto contactos : this.contactos){
            if (contactos.getPersona().getNombre().equals(nombre))
                this.contactos.remove(contactos);
        }
     
    }
    
 
    public void imprimirContacto(){
      
    for (Contacto c: this.contactos){
        System.out.println(c.toString());
    }
    
    }
    public void agregarEvento (Evento eventosT1){
        this.eventosT1.add(eventosT1);
    }
    
    public void eliminarEvento(String fecha){
        for(Evento eventosT1 : this.eventosT1){
            if (eventosT1.getFecha().equals(fecha))
                this.eventosT1.remove(eventosT1);
        }
    }
    
    public void imprimirEvento (){
      
        for (Evento e: this.eventosT1){
            System.out.println(e.toString());
        }
    }
}