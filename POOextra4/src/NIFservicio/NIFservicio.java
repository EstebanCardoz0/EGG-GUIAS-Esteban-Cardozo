/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIFservicio;

import Entidades.NIF;
import java.util.Scanner;

/**
 *Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número
de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en
un array (vector) de caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 * @author Esteban
 */
public class NIFservicio {
    
    public NIF crearNIF(){
 NIF nif=new NIF();
               Scanner leer = new Scanner(System.in).useDelimiter("\n");
               System.out.println("Ingrese su DNI (sin puntos)");
               nif.setDNI(leer.nextLong());
               //System.out.println("");
               String[] vector=new String [23];
               int división=(int) (nif.getDNI()%23);
               nif.setDiv(división);
              switch (división) {
            case 0:
                vector[0]="T";
                nif.setLetra("T");
                break;
            case 1:
                  vector[1]="R";
                nif.setLetra("R");
                break;
            case 2:
                  vector[2]="W";
                nif.setLetra("W");
                break;
            case 3:
                  vector[3]="A";
                nif.setLetra("A");
                break;
            case 4:
                  vector[4]="G";
                nif.setLetra("G");
                break;
            case 5:
                  vector[5]="M";
                nif.setLetra("M");
                break;
            case 6:
                  vector[6]="Y";
                nif.setLetra("Y");
                break;
            case 7:
                  vector[7]="F";
                nif.setLetra("F");
                break;
            case 8:
                  vector[8]="P";
                nif.setLetra("P");
                break;
            case 9:
                  vector[9]="D";
                nif.setLetra("D");
                break;
            case 10:
                  vector[10]="X";
                nif.setLetra("X");
                break;
            case 11:
                  vector[11]="B";
                nif.setLetra("B");
                break;
            case 12:
                  vector[12]="N";
                nif.setLetra("N");
                break;
            case 13:
                  vector[13]="J";
                nif.setLetra("J");
                break;
            case 14:
                  vector[14]="Z";
                nif.setLetra("Z");
                break;
            case 15:
                  vector[15]="S";
                nif.setLetra("S");
                break;
            case 16:
                  vector[16]="Q";
                nif.setLetra("Q");
                break;
            case 17:
                  vector[17]="V";
                nif.setLetra("V");
                break;
            case 18:
                  vector[18]="H";
                nif.setLetra("H");
                break;
            case 19:
                  vector[19]="L";
                nif.setLetra("L");
                break;
            case 20:
                  vector[20]="C";
                nif.setLetra("C");
                break;
            case 21:
                  vector[21]="K";
                nif.setLetra("K");
                break;
            case 22:
                  vector[22]="E";
                nif.setLetra("E");
                break;
        }
          System.out.println("Su letra es la "+nif.getLetra());    
        return nif;
    }

    public void mostrar (NIF nif){
        System.out.println("--- Dígito verificador ---");
        String[] vector=new String [23];
               switch (nif.getDiv()) {
            case 0:
                vector[0]="T";
                nif.setLetra("T");
                break;
            case 1:
                  vector[1]="R";
                nif.setLetra("R");
                break;
            case 2:
                  vector[2]="W";
                nif.setLetra("W");
                break;
            case 3:
                  vector[3]="A";
                nif.setLetra("A");
                break;
            case 4:
                  vector[4]="G";
                nif.setLetra("G");
                break;
            case 5:
                  vector[5]="M";
                nif.setLetra("M");
                break;
            case 6:
                  vector[6]="Y";
                nif.setLetra("Y");
                break;
            case 7:
                  vector[7]="F";
                nif.setLetra("F");
                break;
            case 8:
                  vector[8]="P";
                nif.setLetra("P");
                break;
            case 9:
                  vector[9]="D";
                nif.setLetra("D");
                break;
            case 10:
                  vector[10]="X";
                nif.setLetra("X");
                break;
            case 11:
                  vector[11]="B";
                nif.setLetra("B");
                break;
            case 12:
                  vector[12]="N";
                nif.setLetra("N");
                break;
            case 13:
                  vector[13]="J";
                nif.setLetra("J");
                break;
            case 14:
                  vector[14]="Z";
                nif.setLetra("Z");
                break;
            case 15:
                  vector[15]="S";
                nif.setLetra("S");
                break;
            case 16:
                  vector[16]="Q";
                nif.setLetra("Q");
                break;
            case 17:
                  vector[17]="V";
                nif.setLetra("V");
                break;
            case 18:
                  vector[18]="H";
                nif.setLetra("H");
                break;
            case 19:
                  vector[19]="L";
                nif.setLetra("L");
                break;
            case 20:
                  vector[20]="C";
                nif.setLetra("C");
                break;
            case 21:
                  vector[21]="K";
                nif.setLetra("K");
                break;
            case 22:
                  vector[22]="E";
                nif.setLetra("E");
                break;
        }
        
        System.out.println(nif.getDNI()+"-"+vector[nif.getDiv()]);
    
    
    }
    
    
    
}
