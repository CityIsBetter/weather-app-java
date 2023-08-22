
package com.mahesh.weather_app;


public class Weather_App extends javax.swing.JFrame {
  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UI().setVisible(true);
            }
        });
    }
               
}
