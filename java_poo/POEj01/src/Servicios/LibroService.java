/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Libro;
import java.util.Scanner;
        
/**
 *
 * @author lukaku20
 */
public class LibroService {
    
    Scanner leer = new Scanner(System.in);
   
    /**
     *
     * @return
     */
    public Libro cargarLibro(){
    //Instanciamos el libro
        Libro LL = new Libro();
    
        System.out.println("Ingresa el ISBN");
        LL.setISBN(leer.nextLine());
        System.out.println("Ingresa el tìtulo");
        LL.setTitulo(leer.nextLine());
        System.out.println("Ingresa el autor");
        LL.setAutor(leer.nextLine());
        System.out.println("Ingresa el numero de paginas que contiene");
        LL.setPaginas(leer.nextInt());
        
        return LL;
        
    }
    public void mostrarLibro(Libro libro){
        
         System.out.println("Los atributos del libro son: "
                + "ISBN = " + libro.getISBN());
        System.out.println("Titulo = " + libro.getTitulo());
        System.out.println("Autor = " + libro.getAutor());
        System.out.println("Paginas = " + libro.getPaginas());
    }
    
        
    }
    
            
          

