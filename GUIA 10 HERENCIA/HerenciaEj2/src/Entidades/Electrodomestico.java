/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import ENUM.ColorEnum;
import ENUM.ConsumoEnum;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Electrodomestico {

    Double precio;
    String color;
    String consumo;
    Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, String consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    protected void comprobarConsumo(String letra) {
        int aux = 0;
        for (Object value : ConsumoEnum.values()) {
            if (letra.equalsIgnoreCase(value.toString())) {
                setConsumo(letra.toUpperCase());
                aux++;
            }
        }
        if (aux != 0) {
            setConsumo("F");
            System.out.println("Valor incorrecto. Se usa F por defecto");
        }

    }

    protected void comprobarColor(String color) {
        int aux = 0;
        for (Object value : ColorEnum.values()) {
            if (color.equalsIgnoreCase(value.toString())) {
                setColor(color);
                aux++;
            }
        }
        if (aux != 0) {
            setColor("BLANCO");
            System.out.println("Color incorrecto. Se usa BLANCO por defecto");
        }

    }

    protected void crearElectrodomestico() {
//        le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Escriba el color: ");
        setColor(leer.next());
        comprobarColor(getColor());
        System.out.print("Escriba el consumo: ");
        setConsumo(leer.next());
        comprobarConsumo(getConsumo());
        System.out.print("Escriba el peso (kg): ");
        setPeso(leer.nextDouble());
        System.out.println("Precio base: $1000");
        setPrecio(1000.0);

    }

    protected void precioFinal() {

        switch (getConsumo()) {
            case "A":
                setPrecio(getPrecio() + 1000);
                System.out.println("(por su consumo aumenta $1000)");
                break;
            case "B":
                setPrecio(getPrecio() + 800);
                System.out.println("(por su consumo aumenta $800)");

                break;
            case "C":
                setPrecio(getPrecio() + 600);
                System.out.println("(por su consumo aumenta $600)");

                break;
            case "D":
                setPrecio(getPrecio() + 500);
                System.out.println("(por su consumo aumenta $500)");

                break;
            case "E":
                setPrecio(getPrecio() + 300);
                System.out.println("(por su consumo aumenta $300)");

                break;
            case "F":
                setPrecio(getPrecio() + 100);
                System.out.println("(por su consumo aumenta $100)");

                break;

        }

        if (getPeso() <= 19) {
            setPrecio(getPrecio() + 100);
            System.out.println("(por su peso aumenta $100)");

        } else if (getPeso() >= 20 & getPeso() <= 49) {
            setPrecio(getPrecio() + 500);
            System.out.println("(por su peso aumenta $500)");

        } else if (getPeso() >= 50 & getPeso() <= 79) {
            setPrecio(getPrecio() + 800);
            System.out.println("(por su peso aumenta $800)");

        } else if (getPeso() >= 80) {
            setPrecio(getPrecio() + 1000);
            System.out.println("(por su peso aumenta $1000)");

        }

    }

}//final clase
