/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Esteban
 */
public class GestionIntegralCliente {
   
    private String nombre;
    private String apellido;
    private Long dni;
    private String mail;
    private String direccion;
    private Long telefono;

    public GestionIntegralCliente() {
    }

    public GestionIntegralCliente(String nombre, String apellido, Long dni, String mail, String direccion, Long telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.mail = mail;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Long getDni() {
        return dni;
    }
    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }
    public void setMail(String email) {
        this.mail = email;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Long getTelefono() {
        return telefono;
    }
    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }
    @Override
    public String toString() {
        return "GestionIntegralCliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", email=" + mail + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }   

    
    
}
