/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra1;

import Entidades.Alquiler;
import Entidades.Amotor;
import Entidades.Barco;
import Entidades.Velero;
import Entidades.Yate;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 * Utilizando la herencia de forma apropiada, deberemos programar en Java, las
 * clases y los métodos necesarios que permitan al usuario elegir el barco que
 * quiera alquilar y mostrarle el precio final de su alquiler.
 *
 * @author Esteban
 */
public class HerenciaExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("-Alquiler de embarcaciones Don Cardozo-");

        Barco bar = new Barco();
        LocalDate fechaInicio = LocalDate.of(222, Month.JANUARY, 22);
        LocalDate fechaDevolucion = LocalDate.of(2023, Month.JANUARY, 7);

        System.out.println("");
        System.out.println("Complete sus datos");
        System.out.print("Nombre: ");
        String nombre = leer.next();
        System.out.print("DNI: ");
        int dni = leer.nextInt();
        System.out.println("Fecha de alquiler: ");
        System.out.print("Día: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        String mes = leer.next().toUpperCase();
        System.out.print("Año: ");
        int anio = leer.nextInt();
        System.out.println("Fecha de devolución: ");
        System.out.print("Día: ");
        int dia2 = leer.nextInt();
        System.out.print("Mes: ");
        String mes2 = leer.next().toUpperCase();
        System.out.print("Año: ");
        int anio2 = leer.nextInt();
        System.out.print("Posición de amarre: ");
        int amarre = leer.nextInt();

        switch (mes) {
            case "ENERO":
                fechaInicio = LocalDate.of(anio, Month.JANUARY, dia);

                break;
            case "FEBRERO":
                fechaInicio = LocalDate.of(anio, Month.FEBRUARY, dia);

                break;
            case "MARZO":
                fechaInicio = LocalDate.of(anio, Month.MARCH, dia);

                break;
            case "ABRIL":
                fechaInicio = LocalDate.of(anio, Month.APRIL, dia);

                break;
            case "MAYO":
                fechaInicio = LocalDate.of(anio, Month.MAY, dia);

                break;
            case "JUNIO":
                fechaInicio = LocalDate.of(anio, Month.JUNE, dia);

                break;
            case "JULIO":
                fechaInicio = LocalDate.of(anio, Month.JULY, dia);

                break;
            case "AGOSTO":
                fechaInicio = LocalDate.of(anio, Month.AUGUST, dia);

                break;
            case "SEPTIEMBRE":
                fechaInicio = LocalDate.of(anio, Month.SEPTEMBER, dia);

                break;
            case "OCTUBRE":
                fechaInicio = LocalDate.of(anio, Month.OCTOBER, dia);

                break;
            case "NOVIEMBRE":
                fechaInicio = LocalDate.of(anio, Month.NOVEMBER, dia);

                break;
            case "DICIEMBRE":
                fechaInicio = LocalDate.of(anio, Month.DECEMBER, dia);

                break;

        }
           switch (mes2) {
            case "ENERO":
                fechaDevolucion = LocalDate.of(anio2, Month.JANUARY, dia2);

                break;
            case "FEBRERO":
                fechaDevolucion = LocalDate.of(anio2, Month.FEBRUARY, dia2);

                break;
            case "MARZO":
                fechaDevolucion = LocalDate.of(anio2, Month.MARCH, dia2);

                break;
            case "ABRIL":
                fechaDevolucion = LocalDate.of(anio2, Month.APRIL, dia2);

                break;
            case "MAYO":
                fechaDevolucion = LocalDate.of(anio2, Month.MAY, dia2);

                break;
            case "JUNIO":
                fechaDevolucion = LocalDate.of(anio2, Month.JUNE, dia2);

                break;
            case "JULIO":
                fechaDevolucion = LocalDate.of(anio2, Month.JULY, dia2);

                break;
            case "AGOSTO":
                fechaDevolucion = LocalDate.of(anio2, Month.AUGUST, dia2);

                break;
            case "SEPTIEMBRE":
                fechaDevolucion = LocalDate.of(anio2, Month.SEPTEMBER, dia2);

                break;
            case "OCTUBRE":
                fechaDevolucion = LocalDate.of(anio2, Month.OCTOBER, dia2);

                break;
            case "NOVIEMBRE":
                fechaDevolucion = LocalDate.of(anio2, Month.NOVEMBER, dia2);

                break;
            case "DICIEMBRE":
                fechaDevolucion = LocalDate.of(anio2, Month.DECEMBER, dia2);

                break;

        }

        System.out.println("");
        System.out.println("¿Qué tipo de embarcación busca?");
        System.out.println("1- Barco");
        System.out.println("2- Barco a motor");
        System.out.println("3- Velero");
        System.out.println("4- Yate");
        System.out.print("Seleccione el número: ");
        int opc = leer.nextInt();

        switch (opc) {
            case 1:
                System.out.print("Ingrese la matrícula: ");
                String matri=leer.next();
                System.out.print("Ingrese la eslora (mts): ");
                int eslora=leer.nextInt();
                System.out.print("Ingrese el año de fabricación: ");
                int aniofab=leer.nextInt();
                bar = new Barco(matri, eslora, aniofab);

                break;
            case 2:
                System.out.print("Ingrese la potencia (CV): ");
                int potencia1=leer.nextInt();
                     System.out.print("Ingrese la matrícula: ");
                String matri1=leer.next();
                System.out.print("Ingrese la eslora (mts): ");
                int eslora1=leer.nextInt();
                System.out.print("Ingrese el año de fabricación: ");
                int aniofab1=leer.nextInt();
               
                bar = new Amotor(potencia1, matri1, eslora1, aniofab1);
                break;
            case 3:
                System.out.print("Ingrese la cantidad de mástiles: ");
                int mastiles2=leer.nextInt();
                     System.out.print("Ingrese la matrícula: ");
                String matri2=leer.next();
                System.out.print("Ingrese la eslora (mts): ");
                int eslora2=leer.nextInt();
                System.out.print("Ingrese el año de fabricación: ");
                int aniofab2=leer.nextInt();
                
                bar = new Velero(mastiles2, matri2, eslora2, aniofab2);
                break;
            case 4:
                System.out.print("Ingrese la potencia (CV): ");
                int potencia3=leer.nextInt();
                System.out.print("Ingrese la cantidad de camarotes: ");
                int camarotes3=leer.nextInt();
                     System.out.print("Ingrese la matrícula: ");
                String matri3=leer.next();
                System.out.print("Ingrese la eslora (mts): ");
                int eslora3=leer.nextInt();
                System.out.print("Ingrese el año de fabricación: ");
                int aniofab3=leer.nextInt();
                
                bar = new Yate(potencia3, camarotes3, matri3, eslora3, aniofab3);
                break;

        }

        Alquiler alqui = new Alquiler(nombre, dni, fechaInicio, fechaDevolucion, amarre, bar);

        System.out.println("");
        alqui.calcularAlquiler();

    }//final main

}
