package org.example.menues.jpanels.boxpanels;

import org.example.menues.actionlisteners.LoginButtonListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class LoginJpanel extends CustomBoxPanel {


    private static final JTextField userField = new JTextField(COLUMNS);
    private static final JPasswordField passwordField = new JPasswordField(COLUMNS);

    public LoginJpanel() {
        super();
        setupPanel();
    }

    private void setupPanel() {
        this.setBorder(new TitledBorder("Login"));

        this.add(createCenteredLabel("Bienvenido"));

        this.add(createCenteredLabel("Usuario: "));
        userField.setMaximumSize(DIMENSION);
        this.add(userField);

        this.add(createCenteredLabel("Contraseña: "));
        passwordField.setMaximumSize(DIMENSION);
        this.add(passwordField);

        this.add(ESPACIO);
        this.add(createCenteredButton("Enviar", new LoginButtonListener(this,userField,passwordField)));
    }
}
