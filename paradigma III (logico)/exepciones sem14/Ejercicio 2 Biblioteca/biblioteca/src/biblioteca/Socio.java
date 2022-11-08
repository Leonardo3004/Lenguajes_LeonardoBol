package biblioteca;

import java.util.ArrayList;
public class Socio {
    
    private int numSocio;
    private String nombre;
    private String direccion;
    
    public ArrayList<Prestamo> prestamos;

    public Socio(int numSocio, String nombre, String direccion) {
        this.numSocio = numSocio;
        this.nombre = nombre;
        this.direccion = direccion;
        this.prestamos = new ArrayList<>();
    }
    public void quitarLibro(Prestamo Prestamo){
        ArrayList<Prestamo> NP=new ArrayList<>();
        for (Prestamo P : prestamos){
            if(P.getCodigoLibro()!=Prestamo.getCodigoLibro()){
                NP.add(P);
            }
        }
        prestamos=NP;
    }
    public int CantLibros(){
        int cantidad = prestamos.size();
        return cantidad;
    }
    public boolean tieneLibro(int numeroLibro){
        for (Prestamo P : prestamos){
            if(P.getCodigoLibro()==numeroLibro){return true;}
        } 
        return false;
    }
    
    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Socio{" + "numSocio=" + numSocio + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
    
}