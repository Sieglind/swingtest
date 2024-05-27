package org.example;

import org.example.menues.MenuThread;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new MenuThread());
    }
}