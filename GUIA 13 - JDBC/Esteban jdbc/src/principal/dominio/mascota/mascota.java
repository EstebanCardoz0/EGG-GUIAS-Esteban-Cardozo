/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.dominio.mascota;

import principal.dominio.usuario.usuario;

/**
 *
 * @author Esteban
 */
public class mascota {

    private int id;
    private String apodo;
    private String raza;
    private usuario usuario;

    public mascota() {
    }

    public mascota(int id, String apodo, String raza, usuario usuario) {
        this.id = id;
        this.apodo = apodo;
        this.raza = raza;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", apodo=" + apodo + ", raza=" + raza + ",\n usuario=" + usuario + '}';
    }

}
