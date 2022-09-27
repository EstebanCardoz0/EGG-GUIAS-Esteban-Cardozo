/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_ejercicio.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import jdbc_ejercicio.entidades.Producto;

/**
 *
 * @author Usuario
 */
public final class ProductoDao extends DAO {

    public void guardarProducto(Producto producto) throws Exception {
        try {
            String sql = "INSERT INTO Producto (nombre,precio,codigo_fabricante)"
                    + " VALUES ('" + producto.getNombre() + "', " + producto.getPrecio() + ", " + producto.getCodigo_fabricante() + ");";

            System.out.println("PRODUCTO " + producto.getNombre() + " AGREGADO CORRECTAMENTE A LA BASE DE DATOS");

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarPrecio(String nombre, Double precio) throws Exception {
        try {
            if (nombre == null) {
                throw new Exception("Debe indicar el producto al cual modificar su precio");
            }
            String sql = "UPDATE Producto SET precio = " + precio + " WHERE nombre = '" + nombre + "';";
            System.out.println("PRODUCTO " + nombre + " MODIFICADO CORRECTAMENTE");
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarProducto(Producto producto) throws Exception {

        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto a eliminar ");
            }

            String sql = "DELETE FROM Producto WHERE nombre = '" + producto.getNombre() + "';";
            System.out.println("PRODUCTO " + producto.getNombre() + " MODIFICADO CORRECTAMENTE");
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void verProductos() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto;";
            consultarBase(sql);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre"));

            }
            desconectarBase();
            // return productos ;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema ");
        }
    }

    public void verProductosPrecio2() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto;";
            consultarBase(sql);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre") + ", " + resultado.getString("precio"));

            }
            desconectarBase();
            // return productos ;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema ");
        }
    }

    public Collection< Producto> verProductosPrecio() throws Exception {
        try {
            String sql = "SELECT nombre , precio FROM producto ;";
            consultarBase(sql); // aca se lleno el resultado ( dentro de este metodo )
            Producto producto;
            Collection<Producto> productos = new ArrayList();

            while (resultado.next()) {

                producto = new Producto();
                //producto.setCodigo ( resultado.getInt ( " codigo " ) ) ;
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                //producto.setCodigo Fabricante ( resultado.getInt ( " codigo fabricante " ) ) ;
                productos.add(producto);

            }
            desconectarBase();

            return productos;
        } catch (Exception e) {
            e.printStackTrace();

            desconectarBase();
            throw new Exception("Error de sistema ");
        }
    }

    public Collection< Producto> verProductosPrecio202y120() throws Exception {
        try {
            String sql = "SELECT nombre , precio FROM producto WHERE precio between 120 and 202 ;";
            consultarBase(sql); // aca se lleno el resultado ( dentro de este metodo )
            Producto producto;
            Collection< Producto> productos = new ArrayList();
            while (resultado.next()) {

                producto = new Producto();
                //producto.setCodigo ( resultado.getInt ( " codigo " ) ) ;
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                //producto.setCodigo Fabricante ( resultado.getInt ( " codigo fabricante " ) ) ;
                productos.add(producto);
            }
            desconectarBase();
            return productos;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception(" Error de sistema ");

        }
    }

    public Collection< Producto> verProductosPortatiles() throws Exception {

        try {
            String sql = "SELECT * FROM Producto WHERE nombre like '%Portátil%';";
            consultarBase(sql); // aca se lleno el resultado ( dentro de este metodo )
            Producto producto;
            Collection< Producto> productos = new ArrayList();
            while (resultado.next()) {

                producto = new Producto();
                producto.setCodigo(resultado.getInt("codigo"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                producto.setCodigo_fabricante(resultado.getInt("codigo_fabricante"));
                productos.add(producto);
            }
            desconectarBase();

            return productos;
        } catch (Exception e) {
            e.printStackTrace();

            desconectarBase();
            throw new Exception("Error de sistema ");
        }
    }

    public Collection< Producto> verProductosPrecioBajo() throws Exception {
        try {
            String sql = "SELECT min(precio) as 'precio', nombre FROM PRODUCTO;";
            consultarBase(sql);
            Producto producto;
            Collection< Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString("nombre"));

                producto.setPrecio(resultado.getDouble("precio"));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();

            desconectarBase();
            throw new Exception("Error de sistema ");
        }

    }

    public void buscarProdXfab(String fab) throws Exception {
        try {
            String sql = "select * from producto  join fabricante on fabricante.nombre='" + fab + "';";
            consultarBase(sql);

            while (resultado.next()) {

                System.out.println(resultado.getString(1));
                System.out.println(resultado.getString(2));
                System.out.println(resultado.getString(6));

            }
            desconectarBase();

        } catch (Exception e) {
            e.printStackTrace();

            desconectarBase();
            throw new Exception("Error de sistema ");
        }

    }

}//final
