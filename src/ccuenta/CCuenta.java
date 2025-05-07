/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ccuenta;

/**
 *
 * @author Alumno Tarde
 */
public class CCuenta {

    public double dSaldo;
    public int iCodErr;

    public int ingresar(double cantidad) {

        if (cantidad < 0) {
            System.out.println("No se puede ingresar una cantidad negativa");
            iCodErr = 1;
        } else if (cantidad == -3) {
            System.out.println("Eroor detectable en prueba de caja blanca");
            iCodErr = 2;

        } else {
            dSaldo = dSaldo + cantidad;
            iCodErr = 0;
        }
        return iCodErr;
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se puede retirar una cantidad negativa");
        } else if (dSaldo < cantidad) {
            System.out.println("No hay suficiente saldo");
        } else {
            System.out.println("Saldo restante:" + dSaldo);
        }

    }
} 
