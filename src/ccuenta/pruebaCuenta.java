/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccuenta;

/**
 *
 * @author Alumno Tarde
 */
public class pruebaCuenta {
    public static void main(String[] args) {
        CCuenta miCuenta=new CCuenta();
        System.out.println("Saldo inicial"+ miCuenta.dSaldo+ "euros");
        miCuenta.ingresar(-100);
        System.out.println("Saldo inicial"+ miCuenta.dSaldo+ "euros");
        miCuenta.ingresar(100);
        System.out.println("Saldo tras ingreso:" +miCuenta.dSaldo+ "euros");
        miCuenta.ingresar(200);
        System.out.println("Saldo tras ingreso:" +miCuenta.dSaldo+ "euros");
        miCuenta.ingresar(300);
        System.out.println("Saldo tras ingreso:" +miCuenta.dSaldo+ "euros");
        miCuenta.retirar(50);
        System.out.println("Saldo tras ingreso:" +miCuenta.dSaldo+ "euros");
        miCuenta.ingresar(300);
        System.out.println("Saldo tras ingreso:" +miCuenta.dSaldo+ "euros");
        miCuenta.retirar(50);
        System.out.println("Saldo tras ingreso:" +miCuenta.dSaldo+ "euros");
         
         
        
        
    }
    
}
