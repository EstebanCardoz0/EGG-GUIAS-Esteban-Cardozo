/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import libreria.entidades.Cliente;
import libreria.persistencia.ClienteDAO;
import static org.eclipse.persistence.jaxb.javamodel.Helper.UUID;

/**
 *
 * @author Bangho
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
            clientenuevo.setId(UUID.randomUUID().toString().replaceAll("-", ""));
            clientenuevo.setApellido(apellido);
            clientenuevo.setDocumento(documento);
            clientenuevo.setTelefono(telefono);
            ClienteDAO.guardarCliente(clientenuevo);

            return clientenuevo;

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }
    
    
}
