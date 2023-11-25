 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//import Servicio.*;
/**
 *
 * @author STEVEN
 */
public class Cliente extends Usuario{
    private String numTarjCredito;
    public Cliente(String nombre,String apellido,String user,String contraseña,String numCedula,String numCelular,typeUsuario tipoUsuario,int edad,String numTarjCredito){
       super(nombre,apellido,user,contraseña,numCedula,numCelular,tipoUsuario,edad);
       this.numTarjCredito=numTarjCredito;
    }
    public void registrarCliente(String nombreArchivo, String numcedula, int edad, String numTarjCredit){
        FileWriter fichero = null;
        BufferedWriter bw = null;

        try {
            fichero = new FileWriter(nombreArchivo, true);
            bw = new BufferedWriter(fichero);
            String linea = "\"" + numcedula + "\"," + edad + ",\"" + numTarjCredit + "\"";
            bw.write(linea + "\n");
            System.out.println("Cliente agregado al archivo.");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void presentarMenu(){
        System.out.println("/***************MENU***************/");
        System.out.println("/*                                */");
        System.out.println("/**********************************/");
        System.out.println("1. Solicitar servicio de taxi");
        System.out.println("2. Solicitar comida a domicilio");
        System.out.println("3. Solicitar entrega encomienda");
        System.out.println("4. Consultar servicios");
    }
    public void consultarServicio(){
        String entrada = "";
        Scanner sc=new Scanner(System.in);
        do{
            presentarMenu();
            System.out.print("Ingrese opcion: ");
            entrada = sc.nextLine();
            switch(entrada){
                case "1":
                    System.out.println("Ingrese el origen de su viaje: ");
                    String origen =sc.nextLine();
                    System.out.println("Ingrese el destino de su viaje: ");
                    String destino=sc.nextLine();
                    System.out.println("Ingrese la fecha de su viaje: ");
                    String fecha=sc.nextLine();
                    System.out.println("Ingrese la hora de su viaje: ");
                    String hora=sc.nextLine();
                    System.out.println("Ingrese la forma de pago: ");
                    String tipoPago=sc.nextLine();
                    System.out.println("Ingrese el numero de personas que viajan: ");
                    int pasajeros = sc.nextInt();
                    sc.nextLine();
            }
        }while(!entrada.equals(""));
    }
}
