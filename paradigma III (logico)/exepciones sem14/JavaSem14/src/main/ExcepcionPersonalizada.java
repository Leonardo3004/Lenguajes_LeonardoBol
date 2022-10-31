
package main;


public class ExcepcionPersonalizada extends Exception {

    private int codigoError;

    public ExcepcionPersonalizada(int codigoError) {
        super();
        this.codigoError = codigoError;
    }

    @Override
    public String getMessage() {

        String mensaje = "";

        switch (codigoError) {
            case 110:
                mensaje = "Error, valor ingresado no es un numero o un operador.";
                break;
            case 111:
                mensaje = "Error, no cumple con el formato de expresion matematica infijo.";
                break;
            default:
                throw new AssertionError(); 
        }

        return mensaje;

    }
}
