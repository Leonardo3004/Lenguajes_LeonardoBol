/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editor;

/**
 *
 * @author Admin
 */
public class Cuadrado extends figuraGeometrica{
    private int Area=0;
    public Cuadrado( int A) {
        super("cuadrado");
        this.Area=A;
    }
    @Override
    public String toString(){
        return "Figura{"+" area:"+Area+" nombre"+super.getNombre()+"}";
    }
}
