/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra
(String o char) que le corresponde. Dispondrá de los siguientes métodos:
• Métodos getters y setters para el número de DNI y la letra.
 * @author Esteban
 */
public class NIF {
    long DNI;
    String letra;
    int div;

    public void setDiv(int div) {
        this.div = div;
    }

    public int getDiv() {
        return div;
    }

    public long getDNI() {
        return DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public NIF() {
    }

    public NIF(long DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }
    
}
