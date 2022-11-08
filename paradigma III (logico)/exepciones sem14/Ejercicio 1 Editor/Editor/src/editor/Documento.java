/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editor;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Documento {
    private ArrayList<hoja> listaHoja = new ArrayList<>();
    public void addHoja(hoja H){
        listaHoja.add(H);
    }
    public String toString(){
        String T="";
        int c=1;
        for (hoja Tex : listaHoja){
            T=T+"-----hoja "+c+"------";
            T=T+Tex.toString()+"\n";
            c++;
        }
        
        return T;
    }
}
