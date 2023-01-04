package experimentsclassdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**      //\\
 **     ///\\\
 * @author lukaku20
 */
public class ExperimentsClassDate {

    
    public static void main(String[] args) {
        //Formatear Date ...
        Date dNow = new Date();
        SimpleDateFormat fm = new SimpleDateFormat("E dd.MM.yyyy'at' hh:mm:ss a zzz" );
        
        System.out.println("Current date: " + fm.format(dNow));
        
        //Averigua una fecha en el tiempo
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String input = args.length == 0 ? "1810-05-25" : args[0];

        System.out.print(input + " Parses as ");
        Date t;
        //Use try & catch ...
        try {
            t = ft.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }
        //Sleeping for a while ... Time Watch
//        boolean exit = false;
//        while(!exit){ 
        try {
            System.out.println(new Date() + "\n");
            Thread.sleep(50*60*10);
            System.out.println(new Date() + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
            
        }
         //Measuring elapsed time ...
         try {
         long start = System.currentTimeMillis( );
         System.out.println(new Date( ) + "\n");
         
         Thread.sleep(5*60*10);
         System.out.println(new Date( ) + "\n");
         
         long end = System.currentTimeMillis( );
         long diff = end - start;
         System.out.println("Difference is : " + diff);
      } catch (Exception e) {
         System.out.println("Got an exception!");
      }

    }
    

}