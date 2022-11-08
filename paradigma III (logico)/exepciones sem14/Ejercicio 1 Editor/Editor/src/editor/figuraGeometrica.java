/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editor;

public class figuraGeometrica {
    private String nombre="";
    figuraGeometrica(String N){this.nombre=N;}
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String N){
        this.nombre=N;
    }
    public String getNombre(String N){
        return nombre;
    }
    public String toString(){
        return "Figura";
    }
}
