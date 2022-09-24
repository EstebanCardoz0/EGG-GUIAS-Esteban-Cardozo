/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_ejercicio.servicio;

import jdbc_ejercicio.entidades.Producto;
import jdbc_ejercicio.persistencia.ProductoDao;

/**
 *
 * @author Usuario
 */
public class ProductoServicios {

    public static void crearProducto(String nombre, Double precio, Integer codigo_fabricante) throws Exception {
        try {
            if (nombre == null) {
                throw new Exception(" Debe indicar un nombre ");
            }
            if (precio == null) {
                throw new Exception(" Debe indicar un precio ");
            }
            if (codigo_fabricante == null) {
                throw new Exception(" Debe indicar un Codigo de fabricante ");
            }
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigo_fabricante(codigo_fabricante);
            ProductoDao.guardarProducto(producto);
        } catch (Exception e) {
            throw e;
        }

    }

}//final
