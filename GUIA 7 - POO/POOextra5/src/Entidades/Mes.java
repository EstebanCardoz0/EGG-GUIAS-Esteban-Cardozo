/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *Crea una clase en Java donde declares una variable de tipo array de Strings
 * que contenga los doce meses del año, en minúsculas. A continuación, declara
 * una variable mesSecreto de tipo String, y hazla igual a un elemento del array
 * (por ejemplo, mesSecreto = mes[9].
 * @author Usuario
 */
public class Mes {
    
    String meses[];
    String secreto;

    public Mes() {
        
    }

    public Mes(String[] meses, String secreto) {
        this.meses = meses;
        this.secreto = secreto;
    }

    public String[] getMeses() {
        return meses;
    }

    public String getSecreto() {
        return secreto;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public void setSecreto(String secreto) {
        this.secreto = secreto;
    }
   

    
}
