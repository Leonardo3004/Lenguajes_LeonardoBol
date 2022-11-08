/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editor;

/**
 *
 * @author Admin
 */
public class linea extends figuraGeometrica{
    private int longitud=0;
    public linea(int L) {
        super("linea");
        longitud=L;
    }
    @Override
    public String toString(){
        return "Figura{"+" longitud:"+longitud+" nombre"+super.getNombre()+"}";
    }
}
