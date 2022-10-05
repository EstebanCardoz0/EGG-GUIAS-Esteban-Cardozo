/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.servicios;

import Libreria.entidades.Cliente;
import Libreria.persistencia.ClienteDAO;
import java.util.Random;

/**
 *
 * @author Esteban
 */
public class ServicioCliente {
    
    private ClienteDAO clienteDAO;
  
    public ServicioCliente(){
    clienteDAO=new ClienteDAO();
    }
    
    public Cliente creaCliente(String nombre,String apellido, Long documento,String telefono) {
        Cliente clientenuevo = new Cliente();
        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre del cliente");
            }
            clientenuevo.setNombre(nombre);
            Random azar=new Random();
            clientenuevo.setId(azar.nextInt(159));
         
            clientenuevo.setApellido(apellido);
            clientenuevo.setDocumento(documento);
            clientenuevo.setTelefono(telefono);
         
            clienteDAO.guardarCliente(clientenuevo);

            return clientenuevo;

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }
    
    public Cliente buscaCliente (String nombre) throws Exception  {
        try {
            if (nombre == null) {
                throw new Exception("Debe ingresar un nombre");
            }
            Cliente cliente = clienteDAO.buscarPorNombre(nombre);
            return cliente;
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    
    
}//final
//SEGUIR POR ACÁ TAMBIÉN




