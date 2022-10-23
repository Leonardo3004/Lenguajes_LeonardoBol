public class EventoT1 extends Evento{
    private String lugar;
    public EventoT1( String fecha, String hora, String nombre, String Descripcion, String lugar){
        super(fecha, hora, nombre, Descripcion);
        this.lugar=lugar;
    }
    
    public String getLugar() {
        return this.lugar;
    }
    
    public void setLugar(String lugar) {
        this.lugar=lugar;
    }
    
    @Override
    public String toString() {
        return  super.toString() +"EventoT1( lugar: " + lugar +')' ;
    }
}