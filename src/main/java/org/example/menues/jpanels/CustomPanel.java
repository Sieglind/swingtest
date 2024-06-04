package org.example.menues.jpanels;

import javax.swing.*;
import java.awt.*;

public class CustomPanel extends JPanel {



    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Image background = new ImageIcon("src/main/java/org/example/menues/login/facundo.jpg").getImage();
        graphics.drawImage(background,0,0,1280,768,this);
    }
}
