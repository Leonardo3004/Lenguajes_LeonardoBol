
public class Main {

    
    public static void main(String[] args) {
       Agenda agendaTrabajo = new Agenda ();
       Agenda agendaOcio = new Agenda ();
        //incersion de datos
        agendaTrabajo.agregarContacto(new ContactoT1("leonardo@gmail", "leonardo", "21", "H", "rio cuarto", 88888888));
        agendaTrabajo.agregarContacto(new ContactoT1("leonardo2@gmail", "rodrigo", "21", "H", "venecia", 77777777));
        agendaTrabajo.agregarContacto(new ContactoT1("leonardo3@gmail", "ignacio", "21", "H", "union", 66666666));
        agendaTrabajo.agregarContacto(new ContactoT1("leonardo4@gmail", "jesus", "21", "H", "tilaran", 55555555));
        agendaTrabajo.agregarContacto(new ContactoT1("leonardo5@gmail", "roberto", "21", "H", "pital", 44444444));
        
        agendaTrabajo.agregarEvento(new EventoT1("12/12/2020", "3:00", "tarea", "trabajo de mate","anexo"));
        agendaTrabajo.agregarEvento(new EventoT2("12/12/2020", "3:00", "tarea", "trabajo de mate","zoom"));
        
        agendaOcio.agregarContacto(new ContactoT2("Alfredo Alvarez", "Alfredo Alvarez", "Alfredo Alvarez","20", "H", "Ciudad Quesada", 35467354));
        agendaOcio.agregarContacto(new ContactoT2("Miguel Angel", "Miguel Angel", "Miguel Angel","30", "H", "Venecia", 54267894));
        agendaOcio.agregarContacto(new ContactoT2("Leonardo Vargas", "Leonardo Vargas", "Leonardo Vargas","20", "H", "Union", 54675432));
        agendaOcio.agregarContacto(new ContactoT2("Rafael.Alfaro", "Rafael Alfaro", "Rafael Alfaro","24", "H", "Rio Cuarto", 89987676));
        agendaOcio.agregarContacto(new ContactoT2("Lucio.Rodriguez", "Lucio Rodriguez", "Lucio Rodriguez","20", "H", "Pìtal", 90087672));
        
        agendaOcio.agregarEvento(new EventoT1("12/12/2020", "3:00", "jugar", "jugar futbol","sintetica"));
        agendaOcio.agregarEvento(new EventoT2("12/12/2020", "3:00", "jugar con amigos", "jugar amongus","zoom"));
        
        agendaTrabajo.agregarContacto(new ContactoT2("insta.gram", "Alfredo Alvarez", "Alfredo Alvarez","30", "H", "Ciudad Quesada", 35467354));
        
        
        
        //muestra datos
        System.out.println("~~~~~~~~~~~~~~~~~~~~agenda de trabajo(contactos)~~~~~~~~~~~~~~~~~~~~");
        agendaTrabajo.imprimirContacto();
        System.out.println("~~~~~~~~~~~~~~~~~~~~agenda de ocio(contactos)~~~~~~~~~~~~~~~~~~~~");
        agendaOcio.imprimirContacto();
        System.out.println("~~~~~~~~~~~~~~~~~~~~agenda de trabajo(eventos)~~~~~~~~~~~~~~~~~~~~");
        agendaTrabajo.imprimirEvento();
        System.out.println("~~~~~~~~~~~~~~~~~~~~agenda de ocio(eventos)~~~~~~~~~~~~~~~~~~~~");
        agendaOcio.imprimirEvento();
        
        

        
        
       
    }
    
}
