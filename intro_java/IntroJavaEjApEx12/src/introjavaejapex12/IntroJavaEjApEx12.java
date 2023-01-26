/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejapex12;

/**
 *
 * @author lukaku20
 */
public class IntroJavaEjApEx12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int a = 2;
        String b = String.valueOf(a);
        System.out.println(b);
        String cadena = b+"-"+b+"-"+b;
        System.out.println(cadena);*/
        String i2, j2, k2;
        for (int i = 0; i < 10; i++) {
            if(i==3){
                i2 = "E";
            }else{
                i2 = String.valueOf(i);
            }
            
            for (int j = 0; j < 10; j++) {
                if(j==3){
                j2 = "E";
                }else{
                j2 = String.valueOf(j);
                }
                
                for (int k = 0; k < 10; k++) {
                    if(k==3){
                    k2 = "E";
                    }else{
                        k2 = String.valueOf(k);
                    }
                String encadenado = i2+"-"+j2+"-"+k2;
                System.out.println(encadenado);    
                }
                
        }
    }
    
}
}
