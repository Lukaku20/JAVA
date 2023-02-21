
package com.mycompany.cronometro;

import javax.swing.*;
import java.awt.event.*;

public class Cronometro extends JFrame implements ActionListener{
    
    JLabel tiempo;
    JButton iniciar, detener, reiniciar;
    int centesimas = 0;
    int segundos = 0;
    int minutos = 0;
    int horas = 0;
    Timer timer = new Timer(10, this);
    
    public Cronometro(){
        tiempo = new JLabel("Tiempo: 0");
        iniciar = new JButton("Iniciar");
        detener = new JButton("Detener");
        reiniciar = new JButton ("Reiniciar");
        
        iniciar.addActionListener(this);
        detener.addActionListener(this);
        reiniciar.addActionListener(this);
        
        JPanel panel = new JPanel();
        panel.add(tiempo);
        panel.add(iniciar);
        panel.add(detener);
        panel.add(reiniciar);
        
        this.add(panel);
        this.setTitle("Cronómetro");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource()== iniciar){
            timer.start();
        } else if(e.getSource()== detener){
            timer.stop();
        }else if(e.getSource()==reiniciar){
            timer.stop();
            centesimas = 0;
            segundos = 0;
            minutos = 0;
            horas = 0;
            tiempo.setText(String.format("Tiempo: %02d : %02d : %02d : %02d", horas, minutos, segundos, centesimas));
        }
        else{
            agregarTiempo();
            
            
            
        }
        
    }
    public void agregarTiempo(){
        if(centesimas == 100){
            centesimas = 0;
            segundos++;
        }
        if(segundos == 60){
            segundos = 0;
            minutos++;
        }
        if(minutos == 60){
            minutos = 0;
            horas++;
        }
        
        tiempo.setText(String.format("Tiempo: %02d : %02d : %02d : %02d", horas, minutos, segundos, centesimas));
        centesimas++;
    }
    
    //end cronometro
    
    public static void main(String Args[]){
        Cronometro cronometro = new Cronometro();
    }
}
