/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author STEVEN
 */
public class ServicioTaxi extends Servicio{
    private int numPersonas;
    public ServicioTaxi(String fecha,String origen,String destino,double valorPagar,String numServicio,int idServicio,int numPersonas){
        super(fecha,origen,destino,valorPagar,numServicio,idServicio);
        this.numPersonas=numPersonas;
    }
    public void ingresarDatos(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el origen de su viaje: ");
        origen =sc.nextLine();
        System.out.println("Ingrese el destino de su viaje: ");
        destino=sc.nextLine();
        System.out.println("Ingrese la fecha y hora de su viaje: ");
        fecha=sc.nextLine();
        System.out.println("Ingrese la forma de pago: ");
        String tipoPago=sc.nextLine();
        System.out.println("Ingrese el numero de personas que viajan: ");
        numPersonas = sc.nextInt();
        sc.nextLine();
    }
    @Override
    public double calcularValorPagar(){
        Random rd=new Random();
        int distancia =rd.nextInt(41)+5;
        double costoPorKm=0.50;
        double subtotal=distancia*costoPorKm;
        System.out.println("El subtotal a pagar es: "+subtotal);
        return subtotal;
    }
    public void calcularValorPagar(String numTarjCredito){
        System.out.println("El subtotal a pagar es: $"+(calcularValorPagar()*1.10));
    }
    
}
