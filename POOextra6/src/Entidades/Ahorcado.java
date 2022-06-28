/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.ArrayBufferView.length;

/**
 * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá
 * contener como atributos, un vector con la palabra a buscar, la cantidad de
 * letras encontradas y la cantidad jugadas máximas que puede realizar el
 * usuario. Definir los siguientes métodos con los parámetros que sean
 * necesarios: • Constructores, tanto el vacío como el parametrizado.
 *
 * @author Esteban
 */
public class Ahorcado {

    String[] vector;
    int jugadas;
    int encontradas;

    public Ahorcado() {
    }

    public Ahorcado(String[] vector, int jugadas, int encontradas) {
        this.vector = vector;
        this.jugadas = jugadas;
        this.encontradas = encontradas;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public String[] getVector() {
        return vector;
    }

    public int getJugadas() {
        return jugadas;
    }

    public int getEncontradas() {
        return encontradas;
    }
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
//la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
//Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
//palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
//valor que ingresó el usuario y encontradas en 0.
    public Ahorcado crearJuego() {
        Ahorcado config = new Ahorcado();
        System.out.println("--- Configuración ---");
        System.out.println("Escribí la palabra a buscar");
        String palabra = leer.nextLine();
        config.setVector(new String[length(palabra)]);
        

        for (int i = 0; i < length(palabra); i++) {
            vector[]

        }

        return config;
    }

}
