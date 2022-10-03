/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.servicios;

import Libreria.entidades.Editorial;
import Libreria.persistencia.EditorialDAO;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Esteban
 */
public class EditorialServicio {
    
    
      private EditorialDAO editorialDAO;

    public EditorialServicio() {
        editorialDAO = new EditorialDAO();

    }

    public Editorial creaEditorial(String nombre) {
        Editorial editorialnuevo = new Editorial();
        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre del editorial");
            }
            editorialnuevo.setNombre(nombre);
        //    editorialnuevo.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        Random azar=new Random();
            editorialnuevo.setId(azar.nextInt(259));
            editorialnuevo.setAlta(Boolean.TRUE);
            editorialDAO.guardarEditorial(editorialnuevo);

            return editorialnuevo;

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public void eliminaEditorial(Editorial edit) {
        try
        {
            if (edit == null)
            {
                throw new Exception("Editorial no valida");
            }
            editorialDAO.eliminar(edit);
        } catch (Exception e)
        {
            System.out.println("\nLA EDITORIAL NO SE PUDO BORRAR");
            //System.out.println(e.getMessage());
        }

    }

    public void modificarEditorial(String nombre, String nuevonombre) {
        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre de la Editorial");
            }
            if (nuevonombre == null || nuevonombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre de la Editorial");
            }

            List<Editorial> edit = editorialDAO.buscarPorNombre(nombre);

            for (Editorial aux : edit)
            {
                if (aux.getNombre().equals(nombre))
                {
                    aux.setNombre(nuevonombre);
                    editorialDAO.modificarEditorial(aux);
                }
            }

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

    public List<Editorial> buscaTodo() {
        List<Editorial> buscado = null;

        try
        {
            buscado = editorialDAO.listarTodos();
            return buscado;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public List<Editorial> buscaEdit(String nombre) {
        List<Editorial> buscado = null;

        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre de la Editorial");
            }

            buscado = editorialDAO.buscarPorNombre(nombre);
            return buscado;

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }
    
    
    
    
}//final
