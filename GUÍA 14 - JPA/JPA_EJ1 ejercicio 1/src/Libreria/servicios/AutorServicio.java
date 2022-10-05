/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.servicios;

import Libreria.entidades.Autor;
import Libreria.persistencia.AutorDAO;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 *
 * @author Esteban
 */
public class AutorServicio {

    private AutorDAO autorDAO;

    public AutorServicio() {
        autorDAO = new AutorDAO();

    }

    public Autor creaAutor(String nombre) {
        Autor autornuevo = new Autor();
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del autor");
            }
            autornuevo.setNombre(nombre);

           // autornuevo.setId(UUID.randomUUID().toString().replaceAll("-", ""));
           Random azar=new Random();
            autornuevo.setId(azar.nextInt(159));
            autornuevo.setAlta(Boolean.TRUE);
            autorDAO.guardarAutor(autornuevo);
            System.out.println(autornuevo);
            return autornuevo;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public void eliminarautor(String nombre) {

        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del autor");
            }
            autorDAO.eliminarPorNombre(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void modificaAutor(String nombre, String nuevonombre) {
        Autor aux = null;
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del autor");
            }
            if (nuevonombre == null || nuevonombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del autor");
            }
            aux = autorDAO.buscarPorNombre(nombre);
            aux.setNombre(nuevonombre);
            autorDAO.modificarAutor(aux);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public Autor buscaAutor(String nombre) {

        Autor buscado = null;

        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del Autor");
            }

            buscado = autorDAO.buscarPorNombre(nombre);

            return buscado;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public List<Autor> buscaTodo() {
        List<Autor> buscado = null;

        try {
            buscado = autorDAO.listarTodos();
            return buscado;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

}//final
