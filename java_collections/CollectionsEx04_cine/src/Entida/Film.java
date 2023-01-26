
package Entida;




/**
 *
 * @author lukaku20
 */
public class Film {
 
    String titule;
    String director;
    String hours;
    int minutes;

    public Film() {
        
    }

    public String getTitule() {
        return titule;
    }

    public void setTitule(String titule) {
        this.titule = titule;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public Film(String titule, String director, String hours, int minutes) {
        this.titule = titule;
        this.director = director;
        this.hours = hours;
        this.minutes = minutes;
    }


    @Override
    public String toString() {
        return "Film: '" + titule + "', director is " + director + ", hours |" + hours + "|";
    }

    
    }



