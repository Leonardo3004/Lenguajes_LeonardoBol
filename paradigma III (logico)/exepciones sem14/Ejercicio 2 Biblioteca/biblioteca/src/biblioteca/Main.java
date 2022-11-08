/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Main {

    public static ArrayList<Libro> listaLibros = new ArrayList<>();
    public static ArrayList<Socio> listaSocios = new ArrayList<>();
    public static ArrayList<Prestamo> listaPrestamos = new ArrayList<>();

    public static void main(String[] args) {

        Libro libro1 = new Libro(1, "Libro1", "Autor1");
        Libro libro2 = new Libro(2, "Libro2", "Autor2");
        Libro libro3 = new Libro(3, "Libro3", "Autor3");
        Libro libro4 = new Libro(4, "Libro4", "Autor4");
        Libro libro5 = new Libro(5, "Libro5", "Autor5");
        Libro libro6 = new Libro(6, "Libro6", "Autor6");
        Libro libro7 = new Libro(7, "Libro7", "Autor7");
        Libro libro8 = new Libro(8, "Libro8", "Autor8");
        Libro libro9 = new Libro(9, "Libro9", "Autor9");
        Libro libro10 = new Libro(10, "Libro10", "Autor10");
        

        listaLibros.add(libro1);
        listaLibros.add(libro2);
        listaLibros.add(libro3);
        listaLibros.add(libro4);
        listaLibros.add(libro5);
        listaLibros.add(libro6);
        listaLibros.add(libro7);
        listaLibros.add(libro8);
        listaLibros.add(libro9);
        listaLibros.add(libro10);

        Socio socio1 = new Socio(0, "Socio1", "Dir1");
        Socio socio2 = new Socio(1, "Socio2", "Dir2");
        Socio socio3 = new Socio(2, "Socio3", "Dir3");
        Socio socio4 = new Socio(3, "Socio4", "Dir4");
        Socio socio5 = new Socio(4, "Socio5", "Dir5");

        listaSocios.add(socio1);
        listaSocios.add(socio2);
        listaSocios.add(socio3);
        listaSocios.add(socio4);
        listaSocios.add(socio5);
        
        realizarPrestamo(libro1, socio1);
        realizarPrestamo(libro2, socio1);
        realizarPrestamo(libro3, socio1);
        
        realizarPrestamo(libro4, socio2);
        realizarPrestamo(libro5, socio2);
        
        devolverLibro(libro5, socio2);
        
        System.out.println("------------Libros-------------");
        imprimirLibros();
        System.out.println("-------------Socios------------");
        imprimirSocios();
        System.out.println("-------------Prestamos------------");
        imprimirPrestamos();
        System.out.println("-------------Socios con 3 Libros------------");
        sociosCon3Prestamos();

    }
    public static void realizarPrestamo(Libro Libro, Socio Socio){
        boolean LibroExiste= listaLibros.contains(Libro);
        boolean SocioExiste= listaSocios.contains(Socio);
        if(LibroExiste && SocioExiste && Libro.getEstado()){
            Prestamo P = new Prestamo(Libro.getCodigo(), Socio.getNumSocio());
            listaPrestamos.add(P);
            Socio.prestamos.add(P);
            Libro.setEstado(false);
            System.out.println("Prestamo realizado");
        }else{System.out.println("Prestamo NO realizado");}
    }
    public static void devolverLibro(Libro Libro, Socio Socio){
        boolean tienelibro=Socio.tieneLibro(Libro.getCodigo());
        if(tienelibro){
            int x=0;
            for (Prestamo P : listaPrestamos){

                if(P.getCodigoLibro()==Libro.getCodigo() ){
                    listaPrestamos=borraPrestamo(x,listaPrestamos);
                    
                    Socio.quitarLibro(P);
                    Libro.setEstado(true);
                }
                x++;
            }
        }
    }
    private static ArrayList<Prestamo> borraPrestamo(int x, ArrayList<Prestamo> LP){
        ArrayList<Prestamo> NP=new ArrayList<>();
        int index=0;
        for (Prestamo P : LP){
            if (index!=x){NP.add(P);}
            index++;
        }
        return NP;
    }
    
    private static void imprimirLibros(){
        for (Libro L : listaLibros){System.out.println(L.toString());}
    }
    private static void imprimirSocios(){
        for (Socio S : listaSocios){System.out.println(S.toString());}
    }
    private static void imprimirPrestamos(){
        for (Prestamo P : listaPrestamos){System.out.println(P.toString());}
    }
    private static void sociosCon3Prestamos(){
        for (Socio S : listaSocios){
            if(S.CantLibros()>=3){System.out.println(S.toString());}
        }
    }
}
