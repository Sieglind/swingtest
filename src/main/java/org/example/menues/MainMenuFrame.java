package org.example.menues;

import javax.swing.*;

public class MainMenuFrame extends JFrame {

    private static MainMenuFrame mainMenuFrame;

    private MainMenuFrame() {
        super("Hotel del Sur");
        setSize(1280, 768);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static MainMenuFrame getMainMenuFrame() {
        if (mainMenuFrame == null) {
            mainMenuFrame = new MainMenuFrame();
        }
        return mainMenuFrame;
    }
}
