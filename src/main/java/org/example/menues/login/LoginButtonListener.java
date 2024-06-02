package org.example.menues.login;

import org.example.gestor.GestorDeHotel;
import org.example.menues.MainMenuFrame;
import org.example.menues.takslist.TaskListPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginButtonListener implements ActionListener {

    private final JPanel parent;
    private final JTextField userField;
    private final JPasswordField passwordField;

    public LoginButtonListener(JPanel parent, JTextField userField, JPasswordField passwordField) {
        this.parent = parent;
        this.userField = userField;
        this.passwordField = passwordField;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GestorDeHotel gestor = GestorDeHotel.getGestorDeHotel();
        if (gestor.login(userField.getText(), new String(passwordField.getPassword()))) {
            MainMenuFrame mainFrame = MainMenuFrame.getMainMenuFrame();
            mainFrame.setContentPane(new TaskListPanel());
            mainFrame.revalidate();
            mainFrame.repaint();
        } else {
            JOptionPane.showMessageDialog(this.parent,
                    "Usuario o contraseña incorrectos",
                    "Error de Login", JOptionPane.ERROR_MESSAGE);
        }
    }
}
