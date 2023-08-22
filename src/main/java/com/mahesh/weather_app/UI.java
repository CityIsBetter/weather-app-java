package com.mahesh.weather_app;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

public class UI extends javax.swing.JFrame {
    
    public String weatherIconId = "";

    public UI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        LocationLabel = new javax.swing.JLabel();
        WeatherLabel = new javax.swing.JLabel();
        GetWeatherBtn = new javax.swing.JButton();
        LocationField = new javax.swing.JTextField();
        WeatherField = new javax.swing.JTextField();
        weatherIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weather App");
        setMaximumSize(new java.awt.Dimension(500, 250));
        setMinimumSize(new java.awt.Dimension(500, 250));
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 153, 255));

        LocationLabel.setBackground(new java.awt.Color(255, 255, 255));
        LocationLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LocationLabel.setForeground(new java.awt.Color(255, 255, 255));
        LocationLabel.setText("Location:");
        LocationLabel.setToolTipText("Enter name of the City to look up the weather");

        WeatherLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        WeatherLabel.setForeground(new java.awt.Color(255, 255, 255));
        WeatherLabel.setText("Weather:");

        GetWeatherBtn.setBackground(new java.awt.Color(204, 255, 204));
        GetWeatherBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GetWeatherBtn.setForeground(new java.awt.Color(51, 102, 255));
        GetWeatherBtn.setText("Get Weather");
        GetWeatherBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        GetWeatherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetWeatherBtnActionPerformed(evt);
            }
        });

        LocationField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LocationField.setActionCommand("<Not Set>");
        LocationField.setBorder(null);
        LocationField.setCaretColor(new java.awt.Color(255, 51, 102));
        LocationField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LocationFieldKeyPressed(evt);
            }
        });

        WeatherField.setEditable(false);
        WeatherField.setBackground(new java.awt.Color(255, 255, 255));
        WeatherField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        WeatherField.setBorder(null);

        weatherIcon.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://openweathermap.org/img/wn/"+weatherIconId+"@2x.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(WeatherLabel)
                            .addComponent(LocationLabel))
                        .addGap(18, 18, 18)
                        .addComponent(LocationField, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                    .addComponent(WeatherField))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GetWeatherBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weatherIcon))
                .addGap(22, 22, 22))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LocationLabel)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LocationField)
                            .addComponent(GetWeatherBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(WeatherLabel)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(weatherIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WeatherField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GetWeather(){
        String location = LocationField.getText();
        try {
            String temperature = getTemperature(location);
            WeatherField.setText(temperature);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    UI.this,
                    "Error retrieving temperature: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    private void GetWeatherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetWeatherBtnActionPerformed
        GetWeather();
    }//GEN-LAST:event_GetWeatherBtnActionPerformed

    private void LocationFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LocationFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            GetWeather();
        }
    }//GEN-LAST:event_LocationFieldKeyPressed

    private String getTemperature(String location) throws IOException {
        String url = "http://api.openweathermap.org/data/2.5/weather?q="
                + location
                + "&appid=aba6ff9d6de967d5eac6fd79114693cc";

        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("GET");

        if (connection.getResponseCode() == 200) {
            InputStream responseBody = connection.getInputStream();
            String response = new String(responseBody.readAllBytes());
            responseBody.close();

            // Extract temperature from response
            int start = response.indexOf("\"temp\":") + 7;
            int end = response.indexOf(",", start);
            double temperature = Double.parseDouble(response.substring(start, end));

            // Convert temperature from Kelvin to Celsius
            double temperatureCelsius = temperature - 273.15;

            // Extract weather condition from response
            start = response.indexOf("\"main\":\"") + 8;
            end = response.indexOf("\"", start);
            String weatherCondition = response.substring(start, end);

            //Extract weather icon from response
            start = response.indexOf("\"icon\":\"") + 8;
            end = response.indexOf("\"", start);
            weatherIconId = response.substring(start, end);
            
            weatherIcon.setIcon(new javax.swing.JLabel() {
            @Override
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://openweathermap.org/img/wn/"+weatherIconId+"@2x.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
            
            // Update the weather condition label
            return String.format("%.2f °C (%s)", temperatureCelsius, weatherCondition);
        } else {
            throw new IOException("HTTP error code: " + connection.getResponseCode());
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GetWeatherBtn;
    private javax.swing.JTextField LocationField;
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JTextField WeatherField;
    private javax.swing.JLabel WeatherLabel;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel weatherIcon;
    // End of variables declaration//GEN-END:variables
}
