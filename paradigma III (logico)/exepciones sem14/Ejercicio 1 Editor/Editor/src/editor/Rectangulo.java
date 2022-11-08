/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editor;

/**
 *
 * @author Admin
 */
public class Rectangulo extends figuraGeometrica{
    private int largo=0;
    private int alto=0;

    public Rectangulo( int L, int A) {
        super("rectangulo");
        largo=L;
        alto=A;
    }
    @Override
    public String toString(){
        return "Figura{"+" largo:"+largo+" alto:"+alto+" nombre"+super.getNombre()+"}";
    }
}
