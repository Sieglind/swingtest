package org.example.menues.login;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class LoginJpanel extends JPanel {

    private static final int HEIGHT = 30;
    private static final int WIDTH = 300;
    private static final JTextField userField = new JTextField(10);
    private static final JPasswordField passwordField = new JPasswordField(10);

    public LoginJpanel() {
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        this.add(createCenteredLabel("Bienvenido"));
        this.add(createCenteredLabel("Usuario: "));

        userField.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        this.add(userField);

        this.add(createCenteredLabel("Contraseña: "));

        passwordField.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        this.add(passwordField);

        JButton loginButton = new JButton("Enviar");
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginButton.addActionListener(new LoginButtonListener(this,userField,passwordField));
        this.add(loginButton);

        this.setBorder(new TitledBorder("Login"));

        this.setVisible(true);
    }

    private JLabel createCenteredLabel(String text) {
        JLabel label = new JLabel(text);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        return label;
    }
}
