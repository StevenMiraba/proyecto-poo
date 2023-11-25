package ManejoArchivos;


import java.util.Calendar;
import java.util.Date;

/**
 * @author STEVEN
 */
public class TrabajoConArchivos {
     public static void main(String[] arg) {
        ManejoArchivos.EscribirArchivo("archivosalida.txt","Hola!");
        ManejoArchivos.EscribirArchivo("archivosalida.txt","Afios!");
        ManejoArchivos.EscribirArchivo("archivosalida.txt","NUevo!");
        ManejoArchivos.LeeFichero("archivo.txt");
        Date today = Calendar.getInstance().getTime();
         System.out.println(today);
        
        
    }
    
}
