package colectionsej01;

import Servicios.CanService;


/**
 * @author lukaku20
 */
public class ColectionsEj01 {

    
    public static void main(String[] args) {
      
        CanService under = new CanService();
        
    /*    
        while (true){
            System.out.println("¿Do you want to create a Dog?");
            String s = (leer.next()); 
            if (s.equalsIgnoreCase("yes")){
                dogs.add(under.crearDog());
                under.asignarNumber(dogs);
                } else{
                    leer.nextLine();
                    System.out.println("You want to exit?");
                    anwser = leer.nextLine();   
                } 
            if (anwser.equals("yes")) {
                
                break;
            } else {
                System.out.println("¿You want to see printed the dogs on the screen?");
                leer.nextLine();
                imprime = leer.nextLine();

            }
            if (imprime.equalsIgnoreCase("yes")) {
            */    
            //Convertir ciclo repetitivo en un menú:
            //Menu en el Service.
            under.menuDogs();
        
    
}
}

