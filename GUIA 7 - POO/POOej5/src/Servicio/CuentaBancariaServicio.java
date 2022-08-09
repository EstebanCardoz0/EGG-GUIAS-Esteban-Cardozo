/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

   

    public CuentaBancaria crearCuenta() {
         CuentaBancaria cb = new CuentaBancaria();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el número de cuenta");
        cb.setNumeroCuenta(leer.nextInt());
        System.out.println("ingrese el DNI del cliente");
        cb.setDni(leer.nextLong());
        System.out.println("ingrese el saldo actual");
        cb.setSaldoActual(leer.nextInt());
     

        return cb;

    }

    //d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
//y se la sumara a saldo actual.
    public void ingresar(CuentaBancaria cb) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingrese una cantidad de dinero");
        double ingreso = leer.nextDouble();
        cb.setSaldoActual(cb.getSaldoActual() + (int) ingreso);

    }

//e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
//restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
//saldo actual en 0.
    public void retirar(CuentaBancaria cb) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("¿Cuánto dinero desea retirar?");
        double retiro = leer.nextDouble();
        cb.setSaldoActual(cb.getSaldoActual() - (int) retiro);
    }

//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//usuario no saque más del 20%.
    public void extracciónRapida(CuentaBancaria cb) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("¿Cuánto dinero desea retirar?");
        double extrac = leer.nextDouble();
        if (extrac <= cb.getSaldoActual() * 0.2) {
            cb.setSaldoActual(cb.getSaldoActual() - (int) extrac);
        } else {
            System.out.println("el monto a extraer supera el 20% permitido");
        }
    }

//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//
    public void consultarSaldo(CuentaBancaria cb){
        System.out.println("su saldo es de $"+cb.getSaldoActual());
        
    }
    
    
    //h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos(CuentaBancaria cb){
        System.out.println("DATOS DE LA CUENTA");
        System.out.println("Número de cuenta: "+cb.getNumeroCuenta());
        System.out.println("DNI del cliente: "+cb.getDni());
        System.out.println("Saldo actual: "+cb.getSaldoActual());
        
    }
    
    
}//final

