/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;




/**
 *
 * @author siduncuNotebook
 */
public class Simulador {
    static Scanner scan;
    
    String[] nombres = {"America", "Belen", "Camilo", "Celeste","Dario","Romina","Dolores","Horacio", "Fermin","Lucho", "Alma","Sebastian","Fabricio","Anahí","Noelia","Lucas","Florencia","Felipe","Lorenzo", "Fausto","Tomas"};
    String[] apellidos = {"Fernandez","Riquelme","Pereyra","Garcia","Viñafañe","Fuseneco", "Argento","Durango","Bucaramanga","Esposito","Zolá", "Benitez", "Castro","Winkhaus","Renold","Martinez","San Felipe", "Carballo","Naranjo"};
    String[] nombresCompletos;
    ArrayList<Alumno> listaDefinitiva;
    ArrayList<String> votosDados;
    ArrayList<String> copyList;

    public Simulador() {
        listaDefinitiva=new ArrayList<>();
        scan=new Scanner(System.in).useDelimiter("\n");
        votosDados = new ArrayList<>();
    }
    
    public ArrayList<Alumno> generarNombresAleatorios(){
        System.out.println("------- GENERADOR DE NOMBRES ALEATORIOS ---;");
        System.out.println("       ☺        ☺       ☺        ☺");
        System.out.println("------- ¡¡¡¿Cuántos nombres deseas generar?! ---;");
        System.out.println(" ");
        Integer responde = scan.nextInt();
        nombresCompletos= new String[responde];
        for (int i = 0; i < responde; i++) {
            nombresCompletos[i]= apellidos[(int)(Math.floor(Math.random()* ((apellidos.length - 1) - 0 + 1)+0) )]+ " " 
                    + nombres[(int)(Math.floor(Math.random() * ((nombres.length - 1) -0 +1)+ 0))] ;
             
        }
        for (int i = 0; i < responde; i++) {
            Alumno d1 = new Alumno();
            d1.setNombreCompleto(nombresCompletos[i]);
            d1.setDni(generarDni());
            listaDefinitiva.add(d1);
        
            }
        return listaDefinitiva;
        }
    public ArrayList<Alumno> ordenarPorOrdenDni(ArrayList lista){
        Collections.sort(lista, (Alumno d1, Alumno d2) -> Integer.compare(d1.getDni(),d2.getDni()));
        return lista;
    }
    
//    public int enviarCantidad(){
//        return 
//    
//    }
        
    
//    public ArrayList listaDeAlumnos(int cantidad){
//        for (int i = 0; i < cantidad; i++) {
//            Alumno d1 = new Alumno(nombresCompletos[i]);
//            d1.setDni(generarDni());
//            listaDefinitiva.add(d1);
//        }
//        return listaDefinitiva;
//        
//    }
    
    public void mostrarLista(ArrayList<Alumno> lista){
        for (Alumno aux : lista) {
            System.out.println(" "+aux.getNombreCompleto()+" "+aux.getDni()+" ha votado a: " + aux.getVotosDados()+" " + " y ha recibido: " + aux.getCantVotos() +" votos.");
        }
    }
    public Integer generarDni(){
        Integer dni;
        dni = (int)((Math.random()*99999999 +1)+0+1)-(int)((Math.random()*99999 +1)+0+1);
        return dni;
    }
    public void emitirVoto(ArrayList<Alumno> lista){
        String name;
        int h;
        int y;
        //Collections.shuffle(lista);
        copyList = new ArrayList<>();
        
        for (Alumno alumno : lista) {
            int contador=0;
            do{
            y= (int)(Math.random()*lista.size()-1) ;
            if(contador==y){
                
            } else{
            h = lista.get(y).getCantVotos()+1;
            lista.get(y).setCantVotos(h);
            name = lista.get(y).getNombreCompleto();
            alumno.getVotosDados().add(name);    
            votosDados.add(name);
            break;
//            alumno.getVotosDados().add(name);
//            votosDados.add(lista.get(y).getNombreCompleto());
//            copyList.addAll(votosDados);
//            alumno.setVotosDados(copyList);
//            votosDados.clear();
//            lista.get(i).getVotosDados().add(lista.get(y).getNombreCompleto());
            }
            } while(contador!=y);
            contador++;
//                    
        }
        
        
        
        
//        Iterator it = lista.iterator();1
//        while(it.hasNext()){
//            
        }
    
    public void mostrarVotos(){
        for (String votosDado : votosDados) {
            System.out.println(votosDado);
        }
    }
    public void simuladorDeVoto(ArrayList<Alumno> lista){
        boolean salir=false;
        while(!salir){
        System.out.println("      ☺        ☺       ☺        ☺");
        System.out.println("----------SIMULADOR DE VOTO--------;");
        System.out.println("      ☺        ☺       ☺        ☺");
        System.out.println("1. Emitir votos");
        System.out.println("2. Mostrar alumnos con más votos");
        System.out.println("3. Mostrar a quien voto cada uno");
        System.out.println("4. Elegir facilitador de la semana ");
        System.out.println("5. Salir");
        System.out.println(" ");
        System.out.println("--------------;");
            int respon= scan.nextInt();
            switch(respon){
                case 1: emitirVoto(lista);
                Collections.shuffle(lista);
                break;
                case 2:
                mostrarLista(ordenarPorVotos(lista));
                break;
                case 3: mostrarVotos();
                break;
                case 4: elegirFacilitador(lista);
                break;
                case 5: salir=true;
                break;
                default: System.out.println("Elige otra vez ...");
            }
    }
    }
    public ArrayList<Alumno> ordenarPorVotos(ArrayList lista){
        Collections.sort(lista, new Comparator<Alumno>(){
            public int compare(Alumno d1, Alumno d2){
            return Integer.compare(d2.getCantVotos(),d1.getCantVotos());
            }
        
        });
        return lista;
        }
    public void elegirFacilitador(ArrayList lista){
        int wow =  (int) (Math.random() * lista.size());
        System.out.println("El facilitador de la semana ha sido elegido: ");
        System.out.println("     ----> " + lista.get(wow).toString());
    }
//    public ArrayList<Alumno> ordenarAlfabeticamente(ArrayList lista){
//        lista.sort(new Comparator<Alumno>()({
//            @Override
//        public int compararLetra(Alumno t, Alumno t1) {
//        String letra1 = t.getNombreCompleto().substring(0);
//        String letra2 = t1.getNombreCompleto().substring(0);
//        char a = letra1.charAt(0);
//        char b = letra2.charAt(0);
//        if(a < b){
//            return 1;
//        }else if (a>b){
//            return -1;
//        } else{
//            return 0;
//        }
//    }
       
        
}

