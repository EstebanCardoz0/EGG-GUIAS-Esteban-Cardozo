/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Mes;
import java.util.Scanner;

/**
 * 
 *
 * @author Usuario
 */
public class MesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Mes llenarMes(){
        Mes mesi=new Mes() ;
        
        String llenar[]=mesi.getMeses();
        
        llenar=new String [12];
      
       llenar[0]="enero";
       llenar[1]="febrero";
       llenar[2]="marzo";
       llenar[3]="abril";
       llenar[4]="mayo";
       llenar[5]="junio";
       llenar[6]="julio";
       llenar[7]="agosto";
       llenar[8]="septiembre";
       llenar[9]="octubre";
       llenar[10]="noviembre";
       llenar[11]="diciembre";
        
              mesi.setSecreto(llenar[0]);
              
              
        //System.out.println(llenar[1]);
        
        
        // String[] mes.setMes()={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};        

     
        
        return mesi;
    
    }
 
}
