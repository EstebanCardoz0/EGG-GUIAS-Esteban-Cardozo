/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidaes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Baraja {

    int num;
    String palo;

    @Override
    public String toString() {
        return num + " de " + palo;
    }

    public Baraja(int num, String palo) {
        this.num = num;
        this.palo = palo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public ArrayList<Baraja> llenarBaraja() {

        ArrayList<Baraja> Barajas = new ArrayList();

        Baraja one = new Baraja(1, "basto");
        Baraja dos = new Baraja(1, "espada");
        Baraja tres = new Baraja(3, "oro");
        Baraja cuatro = new Baraja(4, "copas");
        Baraja cinco = new Baraja(7, "espada");
        Baraja seis = new Baraja(7, "oro");
        Baraja siete = new Baraja(3, "copa");
        Baraja ocho = new Baraja(5, "basto");
        Baraja nueve = new Baraja(12, "oro");
        Baraja diez = new Baraja(2, "espada");

        Barajas.add(one);
        Barajas.add(dos);
        Barajas.add(tres);
        Barajas.add(cuatro);
        Barajas.add(cinco);
        Barajas.add(seis);
        Barajas.add(siete);
        Barajas.add(ocho);
        Barajas.add(nueve);
        Barajas.add(diez);

        return Barajas;
    }

    public void barajar(ArrayList eso) {

        Collections.shuffle(eso);
        System.out.println("Mazo barajado");
        System.out.println("");

    }

    public Baraja() {
    }

    public void siguienteCarta(ArrayList eso, ArrayList monton) {
        if (eso.size() != 0) {
            System.out.println("Mostrar carta: "+eso.get(0));
            monton.add(eso.get(0));
            eso.remove(eso.get(0));

        } else {
            System.out.println("ya no hay más cartas en la baraja");
        }

    }

    public void cartasDisponibles(ArrayList eso) {

        System.out.println("Cartas por repartir: " + eso.size());
    }

//    darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
    public void darCartas(ArrayList eso, ArrayList monton) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("¿Cuántas cartas querés mostrar?: ");
        int cantidad = leer.nextInt();

        if (cantidad <= eso.size()||cantidad!=0) {

            for (int i = 0; i < cantidad; i++) {
                System.out.println(eso.get(i));
                monton.add(eso.get(i));
                eso.remove(eso.get(i));
            }

        } else {
            System.out.println("no hay tantas cartas por mostrar    ");
        }

    }

    public void mostrarBaraja(ArrayList eso,ArrayList monton) {
        
        if (eso.size()!=0) {
          System.out.println("---CARTAS RESTANTES---");
        for (Object object : eso) {
            System.out.println(eso.get(num));
            monton.add(eso.get(num));
            num++;
        }   
        }else{
                System.out.println("ya no hay más cartas en la baraja");}
        
        eso.clear();
    }

    public void CartasMonton(ArrayList eso,ArrayList monton) {
        System.out.println("---CARTAS REPARTIDAS---");
        if (monton.size()!=0) {
            System.out.println(monton);
        }else{System.out.println("todavía no salió ninguna carta");}
        

    }

}//final clase
