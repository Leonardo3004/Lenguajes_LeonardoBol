package main;

import java.util.ArrayList;
import java.util.List;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Funciones fun = new Funciones();

        String exp = fun.solicitarExp();

        List<String> elementos = new ArrayList<>();

        elementos = fun.Token(exp);
        
        int num = fun.formular(elementos);

        if (num == -1) {
            System.err.println("El resultado de la operacion es:" + num);
            System.err.println("Operacion invalida.");
        } else {
            System.out.println("El resultado de la operacion es:" + num);
        }
    }

}
