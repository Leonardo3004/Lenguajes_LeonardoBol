class Persona {
  private String nombre;
  private String edad;
  private String genero;

    
  
  public Persona(String nombre, String edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "\nPersona("+"nombre: " + nombre + "  edad: " + edad + "  genero: " + genero + ')';
    }
    
    public void setAll(String nombre, String edad, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }
        
  
}
