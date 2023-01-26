/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poej01;

import Entidad.Libro;
import Servicios.LibroService;

/**
 *
 * @author lukaku20
 */
public class POEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instanciamos un objeto del tipo servicio
        LibroService nuevoLibro = new LibroService();
        Libro libro = nuevoLibro.cargarLibro();

        nuevoLibro.mostrarLibro(libro);
//        System.out.println("Los atributos del libro son: "
//                + "ISBN = " + libro.getAutor());
//        System.out.println("Titulo = " + libro.getTitulo());
//        System.out.println("Autor = " + libro.getAutor());
//        System.out.println("Paginas = " + libro.getPaginas());

    }

}
