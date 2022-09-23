/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.dominio.mascota;

import java.util.Collection;
import principal.dominio.usuario.usuario;
import principal.persistencia.DAO;
import principal.persistencia.mascotaDAO;

/**
 *
 * @author Esteban
 */
public class mascotaServicio {
    private mascotaDAO dao;

    public mascotaServicio() {
        this.dao = new mascotaDAO();
    }

    public void crearMascota(String apodo, String raza, usuario usuario) throws Exception {

        try {
            //Validamos
            if (apodo == null || apodo.trim().isEmpty()) {
                throw new Exception("Debe indicar el apodo");
            }

            if (raza == null || raza.trim().isEmpty()) {
                throw new Exception("Debe indicar la raza");
            }

            if (usuario == null) {
                throw new Exception("Debe indicar el Usuario");
            }

            //Creamos el mascota
            mascota mascota = new mascota();
            mascota.setApodo(apodo);
            mascota.setRaza(raza);
            mascota.setUsuario(usuario);

            //dao.guardarMascota(mascota);
            dao.guardarMascota(mascota);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarClaveMascota(int id, String apodo, String raza, int idUsuario) throws Exception {

        try {

            //Validamos
            if (id > 0) {
                throw new Exception("Debe indicar el id");
            }

            if (apodo == null || apodo.trim().isEmpty()) {
                throw new Exception("Debe indicar el apodo");
            }

            if (raza == null || raza.trim().isEmpty()) {
                throw new Exception("Debe indicar la raza");
            }

            if (idUsuario < 0) {
                throw new Exception("Debe indicar el Usuario");
            }

            //Buscamos
            mascota mascota = buscarMascotaPorId(id);

            dao.modificarMascota(mascota);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarMascota(int id) throws Exception {

        try {

            //Validamos 
            if (id < 0) {
                throw new Exception("Debe indicar el Id");
            }
            dao.eliminarMascota(id);
        } catch (Exception e) {
            throw e;
        }
    }

    public mascota buscarMascotaPorId(int id) throws Exception {

        try {

            //Validamos
            if (id < 0) {
                throw new Exception("Debe indicar el id");
            }
            mascota mascota = dao.buscarMascotaPorId(id);
            //Verificamos
            if (mascota == null) {
                throw new Exception("No se econtró mascota para el correo electrónico indicado");
            }

            return mascota;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<mascota> listarMascota() throws Exception {

        try {

            Collection<mascota> mascotas = dao.listarMascotas();

            return mascotas;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirMascotas() throws Exception {

        try {

            //Listamos los mascotas
            Collection<mascota> mascotas = listarMascota();

            //Imprimimos los mascotas
            if (mascotas.isEmpty()) {
                throw new Exception("No existen mascotas para imprimir");
            } else {
                for (mascota u : mascotas) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
