package com.mahesh.weather_app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;
        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
            backgroundColor = new Color(92, 84, 112);
            
        }
        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//             
        }
    }

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
        weatherField = new javax.swing.JLabel();
        jPanel1 = new RoundedPanel(20);
        weatherDescLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new RoundedPanel(20);
        humidLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new RoundedPanel(20);
        windLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new RoundedPanel(20,new Color(185, 180, 199));
        weatherIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weather App");
        setBackground(new java.awt.Color(255, 153, 153));
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(53, 47, 68));
        kGradientPanel1.setkStartColor(new java.awt.Color(53, 47, 68));
        kGradientPanel1.setMaximumSize(new java.awt.Dimension(400, 641));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(400, 641));

        LocationLabel.setBackground(new java.awt.Color(255, 255, 255));
        LocationLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LocationLabel.setForeground(new java.awt.Color(250, 240, 230));
        LocationLabel.setText("Location:");
        LocationLabel.setToolTipText("Enter name of the City to look up the weather");

        WeatherLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        WeatherLabel.setForeground(new java.awt.Color(250, 240, 230));
        WeatherLabel.setText("Weather:");

        GetWeatherBtn.setBackground(new java.awt.Color(250, 240, 230));
        GetWeatherBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GetWeatherBtn.setForeground(new java.awt.Color(92, 84, 112));
        GetWeatherBtn.setText("Get Weather");
        GetWeatherBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        GetWeatherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetWeatherBtnActionPerformed(evt);
            }
        });

        LocationField.setBackground(new java.awt.Color(92, 84, 112));
        LocationField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LocationField.setForeground(new java.awt.Color(250, 240, 230));
        LocationField.setToolTipText("search");
        LocationField.setActionCommand("<Not Set>");
        LocationField.setBorder(null);
        LocationField.setCaretColor(new java.awt.Color(255, 51, 102));
        LocationField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LocationFieldKeyPressed(evt);
            }
        });

        weatherField.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        weatherField.setForeground(new java.awt.Color(250, 240, 230));
        weatherField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weatherField.setText("--");

        jPanel1.setBackground(new java.awt.Color(53, 47, 68));

        weatherDescLabel.setBackground(new java.awt.Color(92, 84, 112));
        weatherDescLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        weatherDescLabel.setForeground(new java.awt.Color(250, 240, 230));
        weatherDescLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weatherDescLabel.setText("---");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(185, 180, 199));
        jLabel1.setText("Weather Description:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(weatherDescLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weatherDescLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(53, 47, 68));

        humidLabel.setBackground(new java.awt.Color(92, 84, 112));
        humidLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        humidLabel.setForeground(new java.awt.Color(250, 240, 230));
        humidLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        humidLabel.setText("--");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(185, 180, 199));
        jLabel3.setText("Humidity:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(humidLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(humidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(53, 47, 68));

        windLabel.setBackground(new java.awt.Color(92, 84, 112));
        windLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        windLabel.setForeground(new java.awt.Color(250, 240, 230));
        windLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        windLabel.setText("--");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(185, 180, 199));
        jLabel2.setText("Wind Speed:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(windLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(windLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(53, 47, 68));

        weatherIcon.setBackground(new java.awt.Color(185, 180, 199));
        weatherIcon.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        weatherIcon.setForeground(new java.awt.Color(255, 255, 255));
        weatherIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(weatherIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(weatherIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(LocationField)
                        .addGap(18, 18, 18)
                        .addComponent(GetWeatherBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WeatherLabel)
                            .addComponent(LocationLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(weatherField, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LocationLabel)
                .addGap(3, 3, 3)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GetWeatherBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WeatherLabel)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(weatherField, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            weatherField.setText(temperature);
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
            
            // Extract weather description from response
            start = response.indexOf("\"description\":\"") + 15;
            end = response.indexOf("\"", start);
            String weatherDescription = response.substring(start, end);
            weatherDescLabel.setText(""+weatherDescription);
            
            // Extract humidity from response
            start = response.indexOf("\"humidity\":") + 11;
            end = response.indexOf("}", start);
            double weatherHumidity = Double.parseDouble(response.substring(start, end));
            humidLabel.setText("Humidity: "+weatherHumidity+"%");
            
            // Extract humidity from response
            start = response.indexOf("\"speed\":") + 8;
            end = response.indexOf(",", start);
            double windSpeed = Double.parseDouble(response.substring(start, end));
            windLabel.setText("Wind Speed: "+windSpeed+"km/h");

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
            return String.format("%.2f °C", temperatureCelsius);
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
    private javax.swing.JLabel WeatherLabel;
    private javax.swing.JLabel humidLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel weatherDescLabel;
    private javax.swing.JLabel weatherField;
    private javax.swing.JLabel weatherIcon;
    private javax.swing.JLabel windLabel;
    // End of variables declaration//GEN-END:variables
}
