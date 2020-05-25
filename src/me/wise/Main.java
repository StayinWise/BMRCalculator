package me.wise;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main extends JFrame {

    private boolean metricSystemOn = false;

    public static void main(String[] args) throws IOException {
        Frame frame = new Frame(new Main(), new Calculator(new Main()), new Files());
        // Frame Customizing
        frame.setTitle("BMR Calculator");
        frame.setSize(750, 750);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setLocation(550, 150);
        frame.setResizable(false);
        String imageResource = "BMRIcon.png";
        Image image = ImageIO.read(Main.class.getResourceAsStream(imageResource));
        frame.setIconImage(image);
        frame.setVisible(true);
    }

    public void setMetricSystemOn(){
        this.metricSystemOn = true;
    }
    public void setMetricSystemOff(){
        this.metricSystemOn = false;
    }
    public boolean checkMetricSystemStatus(){
        return this.metricSystemOn;
    }

    public Image getIconImage(){
        String imageResource = "BMRIcon.png";
        Image image = null;
        try {
            image = ImageIO.read(Main.class.getResourceAsStream(imageResource));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }
}
