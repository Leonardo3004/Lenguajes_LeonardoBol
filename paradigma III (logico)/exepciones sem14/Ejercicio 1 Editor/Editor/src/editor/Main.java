
package editor;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Main {
    public static ArrayList<figuraGeometrica> listaGeom = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        linea L=new linea(4);
        Circulo C=new Circulo(5);
        texto T=new texto("hola buenas tardes");
        grupo G=new grupo();
        G.addGeom(L);
        G.addGeom(C);
        G.addTexto(T);
        Elipse E=new Elipse(3,5);
        grupo G2=new grupo();
        G2.addGeom(E);
        G2.addGrupos(G);
        
        texto T2=new texto("titulo");
        
        
        hoja H=new hoja();
        H.addGrupos(G2);
        H.addTexto(T2);
        
        texto T3=new texto("cubitos");
        
        Cuadrado C2=new Cuadrado(5);
        Rectangulo R=new Rectangulo(5,4);
        hoja H2=new hoja();
        H2.addGeom(C2);
        H2.addGeom(R);
        
        Documento D=new Documento();
        D.addHoja(H);
        D.addHoja(H2);
        
        System.out.println(D.toString());

        
    }

    
    
}
