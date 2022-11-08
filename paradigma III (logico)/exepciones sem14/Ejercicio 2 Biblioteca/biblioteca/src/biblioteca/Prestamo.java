/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Admin
 */
public class Prestamo {
    
    private int codigoLibro;
    private int numSocio;

    public Prestamo(int codigoLibro, int numSocio) {
        this.codigoLibro = codigoLibro;
        this.numSocio = numSocio;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "codigoLibro=" + codigoLibro + ", numSocio=" + numSocio + '}';
    }
    
    
}