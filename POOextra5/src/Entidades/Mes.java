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
        meses=new String [12];
       
        meses[0]="enero";
        meses[1]="febrero";
        meses[2]="marzo";
        meses[3]="abril";
        meses[4]="mayo";
        meses[5]="junio";
        meses[6]="julio";
        meses[7]="agosto";
        meses[8]="septiembre";
        meses[9]="octubre";
        meses[10]="noviembre";
        meses[11]="diciembre";
         secreto=meses [0];
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
