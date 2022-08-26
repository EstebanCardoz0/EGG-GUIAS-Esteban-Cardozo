/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Esteban
 */
public class Barco {
    
    public String matricula;
    protected int eslora;
    protected int aniofab;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int aniofab) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.aniofab = aniofab;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAniofab() {
        return aniofab;
    }

    public void setAniofab(int aniofab) {
        this.aniofab = aniofab;
    }
    
    
    
    public int modulo(){
        
       
        int modulo=eslora*10;
        
        
        return modulo;
    
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", aniofab=" + aniofab + '}';
    }
    
    
    
}
