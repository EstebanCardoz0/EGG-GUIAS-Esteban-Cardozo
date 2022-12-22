package integrador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class Integrador {

    public static void main(String[] args) {

        Practica practica = new Practica();

        //EJERCICIO 1
//        for (int i = 2; i <= 128; i*=2) {
//            System.out.println("i ="+i);
//        }

//EJERCICIO 2
//        try {
//
//            double resul = 10 / 0;
//            System.out.println("exito");
//        } catch (ArithmeticException e) {
//            System.out.println("error aritmetico");
//
//        } catch (Exception e) {
//            System.out.println("error exception");
//
//        } finally {
//            System.out.println("terminamos");
//        }

//EJERCICIO 3
//Estudiante e1=new Estudiante("juan");
//Estudiante e2=new Estudiante("pedro");
//
//public static Comparator<Estudiante> compararEstudiantes=new Comparator<Estudiante>(){
//
//        @Override
//        public int compare(Estudiante e1, Estudiante e2) {
//          return e2.getNombre().compareTo(e1.getNombre());
//        }
//};




///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // System.out.println( (int) Math.log10(1000)+1);
        //Generar las variables necesarias para probar
        ArrayList<String> medias = new ArrayList(Arrays.asList(new String[]{"A", "B", "D", "C", "D", "A", "H", "H"}));

        //  System.out.println(practica.mediasAmigas(medias));
        //System.out.println(practica.numeroCapicua(1213));
        //System.out.println(practica.prisioneroDulce(455, 1585, 500));
    }
}
