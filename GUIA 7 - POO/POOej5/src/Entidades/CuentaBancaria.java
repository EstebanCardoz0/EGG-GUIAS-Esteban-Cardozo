/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Esteban
// *///



public class CuentaBancaria {
    
   Scanner leer = new Scanner(System.in);
     int numeroCuenta;
    long dni;
    int saldoActual;
    private int interes;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long dni, int saldoActual, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public int getInteres() {
        return interes;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }
    
    
}
