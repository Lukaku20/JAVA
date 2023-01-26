
package Entida;

/**         //--\\
 *         ( |..| )
 *          \\\///
 *            VV
 * @author lukaku20
 */
public class Can {
    
    int numer;
    String name;
    String raza;
    String color;
    int age;
    double size;
    String sex;

    public Can() {
    }

    public Can(int numer, String name, String raza, String color, int age, double size, String sex) {
        this.numer = numer;
        this.name = name;
        this.raza = raza;
        this.color = color;
        this.age = age;
        this.size = size;
        this.sex = sex;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "_________________________________________________" + "\n"+
                "|Dog " + numer + "|Name: " + name + "| Raza: " + raza + "|Color: " + color+" \n"
                 + "|Age: " + age + "|Weigth: " + size + "kg.|Sex: " + sex + '|';
                
    }
    
}
