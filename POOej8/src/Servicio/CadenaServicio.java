/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class CadenaServicio {

    Cadena cad1 = new Cadena();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        System.out.println("Escribí una palabra o frase");
        cad1.setFrase(leer.nextLine());
        cad1.setLongi(cad1.getFrase().length());

        return cad1;

    }

//    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
//ingresada.
    public void mostrarVocales(Cadena cad1) {
        int contvol = 0;
        //System.out.println(cad1.getFrase().substring(1, 2));
        for (int i = 0; i < cad1.getLongi(); i++) {

            if ("a".equals(cad1.getFrase().substring(i, i + 1)) || "e".equals(cad1.getFrase().substring(i, i + 1)) || "i".equals(cad1.getFrase().substring(i, i + 1)) || "o".equals(cad1.getFrase().substring(i, i + 1)) || "u".equals(cad1.getFrase().substring(i, i + 1))) {
                contvol++;
            }
        }
        System.out.println("Cantidad de vocales: " + contvol);

    }

//b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public void invertirFrase(Cadena cad1) {

        StringBuilder sb = new StringBuilder(cad1.getFrase());
        System.out.println("Frase invertida: " + sb.reverse());

    }

//c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    public void vecesRepetido(Cadena cad1) {
        System.out.println("Escribí un caracter:");
        String letra = leer.next();
        int contLetra = 0;
        for (int i = 0; i < cad1.getLongi(); i++) {

            if (letra.equals(cad1.getFrase().substring(i, i + 1))) {
                contLetra++;
            }
        }
        if (contLetra == 1) {
            System.out.println("el caracter '" + letra + "' se repite una vez");
        } else {
            System.out.println("el caracter '" + letra + "' se repite " + contLetra + " veces");

        }
    }

//e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
//compone la clase con otra nueva frase ingresada por el usuario.
    public void compararLongitud(Cadena cad1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("escribí una nueva palabra o frase:");
        String nuevafrase = leer.nextLine();
        //int compareTo = cad1.getFrase().compareTo(nuevafrase);
        System.out.println("la diferencia de caracteres entre la 1ra y la 2da frase es de " + cad1.getFrase().compareTo(nuevafrase));
    }

//f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
//una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void unirFrases(Cadena cad1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("escribí una nueva palabra o frase:");
        String nuevafrase = leer.nextLine();
        System.out.println("Concatenación: " + cad1.getFrase().concat(nuevafrase));
    }

//g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
//frase resultante.
    public void reemplazar(Cadena cad1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresá un caracter para reemplazar a la(s) 'a'");
        String caracter = leer.nextLine();
        System.out.println("Queda así: " + cad1.getFrase().replaceAll("a", caracter));

    }
//h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.

    public void contiene(Cadena cad1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresá una letra a buscar:");
        String letra = leer.next();
        boolean contains = cad1.getFrase().contains(letra);
        if (contains == true) {
            System.out.println("la letra " + letra + " está en la frase");
        } else {
            System.out.println("la letra '" + letra + "' NO está en la frase");

        }
    }

}//final
