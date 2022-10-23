
public class EventoT2 extends Evento{
    private String plataforma;
    public EventoT2( String fecha, String hora, String nombre, String Descripcion, String lugar){
        super(fecha, hora, nombre, Descripcion);
        this.plataforma=lugar;
    }
    
    public String getLugar() {
        return this.plataforma;
    }
    
    public void setLugar(String plataforma) {
        this.plataforma=plataforma;
    }
    
    @Override
    public String toString() {
        return  super.toString() +"EventoT2( plataforma: " + plataforma +')' ;
    }
}
