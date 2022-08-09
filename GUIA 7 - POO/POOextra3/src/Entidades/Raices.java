/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
 * @author Esteban
 */
public class Raices {
    
    int coa;
    int cob;
    int coc;

    public Raices() {
    }

    public Raices(int coa, int cob, int coc) {
        this.coa = coa;
        this.cob = cob;
        this.coc = coc;
    }

    public int getCoa() {
        return coa;
    }

    public int getCob() {
        return cob;
    }

    public int getCoc() {
        return coc;
    }

    public void setCoa(int coa) {
        this.coa = coa;
    }

    public void setCob(int cob) {
        this.cob = cob;
    }

    public void setCoc(int coc) {
        this.coc = coc;
    }
    
    
    
}
