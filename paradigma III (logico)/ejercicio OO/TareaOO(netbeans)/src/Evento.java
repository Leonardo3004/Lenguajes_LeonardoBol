
public abstract class Evento {
    private String fecha;
    private String hora;
    private String nombreEvento;
    private String Descricion;
    
    public Evento(String fecha, String hora, String nombre, String Descripcion){
        this.fecha=fecha;
        this.hora=hora;
        this.nombreEvento=nombre;
        this.Descricion=Descripcion;
    }
    
    public String getFecha() {
        return this.fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha=fecha;
    }
    
    public String getHora() {
        return this.hora;
    }
    
    public void setHora(String hora) {
        this.hora=hora;
    }
    
    public String getNombreEvento() {
        return this.nombreEvento;
    }
    
    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento=nombreEvento;
    }
    
    public String getDescricion() {
        return this.Descricion;
    }
    
    public void setDescricion(String Descricion) {
        this.Descricion=Descricion;
    }
    
    @Override
    public String toString() {
        return "Evento[ fecha: " + this.fecha + ", hora: " + this.hora + ", nombre: " + this.nombreEvento + ", descripcion: " + this.Descricion + ']';
    }

    
}
