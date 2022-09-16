/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import ENUM.Columna;
import Entidades.Asiento;
import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class cepServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //SE ABRE UN CINE CON UNA PELICULA Y PRECIO PREVIAMENTE ESTABLECIDOS, Y TODOS LOS ASIENTOS VACIOS

    public Cine abrirCine() {
        Cine c = new Cine();
        
        System.out.println("----CINE EL JEFE----");
        System.out.println("");
        System.out.println("Cartelera:");
        System.out.println("1. El Padrino, dir. Francis F. Coppola (+18) $400");
        System.out.println("2. Volver al Futuro, dir. Robert Zemeckis (ATP) $200");
        System.out.println("3. El lobo de Wall Street, dir. Martin Scorsese (+18) $150");
        System.out.println("");
        System.out.print("Elegí una peli: ");
        int num=leer.nextInt();
        
        switch (num) {
            case 1:
                c.setPeli(new Pelicula("El Padrino", 120, 18, "Francis Ford Coppola"));
        c.setPrecio(400);
                break;
            case 2:
                c.setPeli(new Pelicula("Volver al Futuro", 120, 0, "Robert Zemeckis"));
        c.setPrecio(200);
                break;
            case 3:
                c.setPeli(new Pelicula("El lobo de Wall Street", 180, 18, "Martin Scorsese"));
        c.setPrecio(150);
                break;
            default:
                throw new AssertionError();
        }
        
        
        

        Asiento s[][] = new Asiento[8][6];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                Integer a = 8 - i;
                String b = a.toString();
                switch (j) {
                    case 0:
                        b = b.concat("A");
                        break;
                    case 1:
                        b = b.concat("B");
                        break;
                    case 2:
                        b = b.concat("C");
                        break;
                    case 3:
                        b = b.concat("D");
                        break;
                    case 4:
                        b = b.concat("E");
                        break;
                    case 5:
                        b = b.concat("F");
                        break;
                    default:
                        throw new AssertionError();
                }
                s[i][j] = new Asiento(b, null);
            }
        }
        c.setSala(s);

        ArrayList<String> a = new ArrayList();
        for (int i = 0; i < 8; i++) {
            for (Columna aux : Columna.values()) {
                String asiento = (8 - i) + aux.toString();
                a.add(asiento);
            }
        }
        c.setAsientosLibres(a);

        return c;

    }

    // MENU PARA CAMBIAR PELICULA Y PRECIO DEL CINE
    public Cine modificarCine(Cine c) {
        System.out.println("----- MENU CINE -----");
        System.out.println("en desarrollo");
        //incluir opciones de cambio de pelicula y precio de entrada
        return c;
    }
    // SE CREA UN UNIVERSO DE POSIBLES ESPECTADORES QUE INTENTARAN INGRESAR AL CINE

    public ArrayList<Espectador> crearPosiblesEspectadores() {
        ArrayList<Espectador> interesados = new ArrayList();
        int cantidad = 25 + (int) (Math.random() * 60);
        for (int i = 0; i < cantidad; i++) {
            Espectador e = new Espectador("Interesado " + (i + 1), (int) (Math.random() * 70), (int) (Math.random() * 1000));
            interesados.add(e);
        }
        System.out.println("Cantidad de posibles espectadores: " + interesados.size());
        return interesados;

    }
    // SE CONTROLAN LOS INTERESADOS Y SE COBRA Y ASIGNA UN ASIENTO DE CORRESPONDER

    public Cine recibirPosiblesEspectadores(Cine c, ArrayList<Espectador> interesados) {

        int rechazos = 0;
        int recibidos = 0;

        for (Espectador aux : interesados) {

            if (aux.getEdad() >= c.getPeli().getEdadMin() && aux.getDinero() >= c.getPrecio() && c.getAsientosLibres().size() > 0) {
                //resta dinero al visitante
                aux.setDinero(aux.getDinero() - c.getPrecio());
                //selecciona un lugar para ubicarlo
                int posicionLista = (int) (Math.random() * c.getAsientosLibres().size());
                String ubicacion = c.getAsientosLibres().get(posicionLista);
                c.getAsientosLibres().remove(posicionLista);

                Asiento visual[][] = c.getSala();
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (visual[i][j].getUbicacion().equalsIgnoreCase(ubicacion)) {
                            visual[i][j].setE(aux);
                        }
                    }
                }
                recibidos++;
            } else {
                rechazos++;
            }
        }
        System.out.println("Espectadores recibidos: " + recibidos);
        System.out.println("Recaudación de la funcion: " + recibidos * c.getPrecio());
        System.out.println("Ingresos rechazados por falta de edad, dinero o capacidad de sala agotada: " + rechazos);
        return c;
    }
    // SE VISUALIZA EL SUMARIO DE LA FUNCION

    public void verSala(Cine c) {
        System.out.println("");
        System.out.println("Pelicula: " + c.getPeli().getTitulo());
        System.out.println("Duración: " + c.getPeli().getDuracion() + " minutos");
        System.out.println("Estado de la sala durante la función: ");
        Asiento visual[][] = c.getSala();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(visual[i][j].toString());
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void revisarEspectadores(Cine c) {
        Asiento visual[][] = c.getSala();
        int ctrol = 0;
        System.out.println("Seleccione un asiento para visualizar la información del espectador: ");
        String asientoABuscar = leer.next();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (visual[i][j].getUbicacion().equalsIgnoreCase(asientoABuscar)) {
                    ctrol++;
                    //System.out.println(visual[i][j].getE().toString());
                    if (visual[i][j].getE() != null) {
                        System.out.println("Información del espectador ubicado en " + visual[i][j].getUbicacion());

                        System.out.println(visual[i][j].getE().toString());
                    } else {
                        System.out.println("Asiento vacío");
                    }
                    break;
                }
            }
        }

        if (ctrol == 0) {
            System.out.println("Asiento invalido. Ingrese una posición válida");
            revisarEspectadores(c);
        }
        System.out.println("Desea consultar otro asiento? s/n");
        String opc = leer.next();
        if (opc.equalsIgnoreCase("s")) {
            revisarEspectadores(c);
        }
    }

}//final servicio
