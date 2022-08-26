/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra4;

import Entidad.Empleado;
import Entidad.Estudiante;
import Entidad.Persona;
import Entidad.PersonalServicio;
import Entidad.Profesor;

/**
 *
 * @author Usuario
 */
public class HerenciaExtra4 {

    /**
     * • Imprimir toda la información de cada tipo de individuo. Incluya un
     * programa de prueba que instancie objetos de los distintos tipos y pruebe
     * los métodos desarrollados.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona per = new Persona("Esteban", "Cardozo", 12, "Soltero");
        Empleado em = new Empleado(2001, 123, "El", "Señor", 12345, "Casado");
        Estudiante est = new Estudiante("Gráfico I", "Romina", "López", 7895, "Soltera");
        Profesor profe = new Profesor("Método", 2009, 852, "Cristian", "Ruiz Díaz", 7895, "Soltero");
        PersonalServicio serv = new PersonalServicio("pasillo", 2015, 458, "Sergio", "Casas", 741, "Casado");

        per.cambioEstado();
        em.Reasignacion();
        est.matriculacion();
        profe.cambioDepto();
        serv.cambioSeccion();

        System.out.println(per.toString());
        System.out.println("");
        System.out.println(em.toString());
        System.out.println("");

        System.out.println(est.toString());
        System.out.println("");

        System.out.println(profe.toString());
        System.out.println("");

        System.out.println(serv.toString());

    }

}
