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
public class Yate extends Barco {

    protected int potencia;
    protected int camarotes;

    public Yate() {
    }

    public Yate(int potencia, int camarotes, String matricula, int eslora, int aniofab) {
        super(matricula, eslora, aniofab);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }
    
    @Override
    public int modulo() {
        
     int moduloYate=eslora*10;
       
        return moduloYate+potencia+camarotes; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAniofab(int aniofab) {
        super.setAniofab(aniofab); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAniofab() {
        return super.getAniofab(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEslora(int eslora) {
        super.setEslora(eslora); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getEslora() {
        return super.getEslora(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMatricula(String matricula) {
        super.setMatricula(matricula); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMatricula() {
        return super.getMatricula(); //To change body of generated methods, choose Tools | Templates.
    }

}
