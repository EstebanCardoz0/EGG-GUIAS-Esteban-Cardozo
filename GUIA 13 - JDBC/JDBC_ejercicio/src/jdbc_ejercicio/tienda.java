/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_ejercicio;

import java.util.Scanner;
import jdbc_ejercicio.entidades.Producto;
import jdbc_ejercicio.persistencia.ProductoDao;
import jdbc_ejercicio.servicio.ProductoServicios;
import jdbc_ejercicio.servicio.TiendaServicios;

/**
 *
 * @author Usuario
 */
public class tienda {

    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int opcion;
        ProductoDao pd=new ProductoDao();
        
        //pd.verProductos();
        
        pd.buscarProdXfab("Lenovo");
        
//        for (Producto producto : pd.verProductosPrecio()) {
//            System.out.println(producto);
//        }
        System.out.println("");
        System.out.println("");
        
     
        
        
        
        
        

        do {
            System.out.println("---SELECCIONE OPCION---");
            System.out.println("1 - INGRESAR UN PRODUCTO A LA BASE DE DATOS ");
            System.out.println("2 - LISTAR TODOS LOS PRODUCTOS POR NOMBRES ");
            System.out.println("3 - LISTAR TODOS LOS PRODUCTOS POR NOMBRES Y PRECIOS ");
            System.out.println("4 - LISTAR TODOS LOS PRODUCTOS POR NOMBRES Y PRECIOS ENTRE 120 y 202 ");
            System.out.println("5 - LISTAR TODOS LOS PORTÁTILES ");
            System.out.println("6 - INGRESAR UN FABRICANTE A LA BASE DE DATOS ");
            System.out.println("7 - EDITAR UN PRODUCTO SEGUN NOMBRE ");
            System.out.println("8 - VER PRODUCTO(S) CON PRECIO MAS BAJO ");
            System.out.println("9 - SALIR ");

            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    try {
                        ProductoServicios producto = new ProductoServicios();
                        System.out.println("Ingrese el nombre del producto");
                        String nombre = leer.next();
                        System.out.println("Ingrese el precio ");
                        Double precio = leer.nextDouble();
                        System.out.println("Ingrese el código de fabricante ");
                        Integer codigo_fabricante = leer.nextInt();
                        producto.crearProducto(nombre, precio, codigo_fabricante);
                    } catch (Exception e) {
                        throw e;
                    }
                    break;

                case 2:
                    try {

                        System.out.println("LISTA DE PRODUCTOS");
                        ProductoDao.verProductos();
//                    for (Producto i : ProductoDao.verProductosPrecio()) {
//                        System.out.println(i.getNombre());
//                    }

                    } catch (Exception e) {
                        throw e;
                    }
                    break;

                case 3:
                    try {

                        System.out.println("LISTA DE PRODUCTOS - PRECIOS");

                        for (Producto i : ProductoDao.verProductosPrecio()) {
                            System.out.println("Nombre: " + i.getNombre() + " - Precio: $" + i.getPrecio());
                        }

                    } catch (Exception e) {
                        throw e;
                    }
                    break;

                case 4:
                    try {

                        System.out.println("PRODUCTOS CON PRECIO ENTRE 120 Y 202");
                        for (Producto i : ProductoDao.verProductosPrecio202y120()) {
                            System.out.println("Nombre: " + i.getNombre() + " - Precio: $" + i.getPrecio());

                        }

                    } catch (Exception e) {
                        throw e;
                    }
                    break;

                case 5:
                    try {

                        System.out.println("PRODUCTOS PORTÁTILES");
                        for (Producto i : ProductoDao.verProductosPortatiles()) {
                            System.out.println("Código: " + i.getCodigo() + " - Nombre: " + i.getNombre() + " - Precio: $" + i.getPrecio());

                        }

                    } catch (Exception e) {
                        throw e;
                    }
                    break;

                case 6:
                    try {
                        TiendaServicios tienda = new TiendaServicios();

                        System.out.println("Ingrese el nombre del fabricante");
                        String nombre = leer.next();
                        TiendaServicios.crearTienda(nombre);

                    } catch (Exception e) {
                        throw e;
                    }
                    break;

                case 7:
                    try {

                        System.out.println("Ingrese el nombre del producto que desea modificar");
                        String nombre = leer.next();
                        System.out.println("Ingrese el precio deseado");
                        Double precio = leer.nextDouble();
                        ProductoDao.modificarPrecio(nombre, precio);

                    } catch (Exception e) {
                        throw e;
                    }
                    break;

                case 8:
                    try {

                        System.out.println("PRODUCTO(S) CON PRECIO MÁS BAJO");
                        for (Producto i : ProductoDao.verProductosPrecioBajo()) {
                            System.out.println("Nombre: " + i.getNombre() + " - Precio: $" + i.getPrecio());

                        }

                    } catch (Exception e) {
                        throw e;
                    }
                    break;

                default:
                    System.out.println("GRACIAS VUELVAS PRONTOS");
                    return;

            }//final switch

        } while (opcion != 9);

    }//final

}
