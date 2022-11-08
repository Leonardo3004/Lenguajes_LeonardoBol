/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editor;

/**
 *
 * @author Admin
 */
public class Circulo extends figuraGeometrica{
    private int radio=0;
    public Circulo(int R) {
        super("circulo");
        this.radio=R;
    }
    
    @Override
    public String toString(){
        return "Figura{"+" radio:"+radio+" nombre"+super.getNombre()+"}";
    }
}
