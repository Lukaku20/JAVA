/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entida;

/**
 *
 * @author lukaku20
 */
public class Student {
    
    String name;
    int notO;
    int notI;
    int notII;
    int notEnd;
    

    public Student(String name, int notO, int notI, int notII, int notEnd) {
        this.name = name;
        this.notO = notO;
        this.notI = notI;
        this.notII = notII;
        this.notEnd = notEnd;
     
    }

   

    public Student() {
   
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNotO() {
        return notO;
    }

    public void setNotO(int notO) {
        this.notO = notO;
    }

    public int getNotI() {
        return notI;
    }

    public void setNotI(int notI) {
        this.notI = notI;
    }

    public int getNotII() {
        return notII;
    }

    public void setNotII(int notII) {
        this.notII = notII;
    }

    public int getNotEnd() {
        return notEnd;
    }

    public void setNotEnd(int notEnd) {
        this.notEnd = notEnd;
    }

    @Override
    public String toString() {
        return "Student:" + name + " notI: " + notO + " notII: " + notI + " notIII: " + notII + " notEnd: " + notEnd;
    }
}

