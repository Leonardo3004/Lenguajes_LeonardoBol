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
public class grupo {
    private ArrayList<figuraGeometrica> listaGeom = new ArrayList<>();
    private ArrayList<texto> listaTexto = new ArrayList<>();
    private ArrayList<grupo> listaGrupos = new ArrayList<>();
    
    public void addGeom(figuraGeometrica G){
        listaGeom.add(G);
    }
    public void addTexto(texto T){
        listaTexto.add(T);
    }
    public void addGrupos(grupo G){
        listaGrupos.add(G);
    }
    
    
    @Override
    public String toString(){
        String T="";
        for (texto Tex : listaTexto){
            T=T+Tex.getTexto()+"\n";
        }
        
        for (figuraGeometrica Tex : listaGeom){
            T=T+Tex.toString()+"\n";
        }
        
        for (grupo Tex : listaGrupos){
            T=T+Tex.toString()+"\n";
        }
        return T;
    }
    
}
