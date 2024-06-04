package org.example.menues.jpanels.boxpanels;

import javax.swing.*;
import javax.swing.border.TitledBorder;

abstract class PanelCrearEmpleado extends CustomBoxPanel {
    protected JTextField camponNombre = new JTextField(COLUMNS);
    protected JTextField campoApellido = new JTextField(COLUMNS);
    protected JTextField campoDNI =  new JTextField(COLUMNS);

    public PanelCrearEmpleado() {
        super();
        setupPanel();
    }

    private void setupPanel() {
        this.setBorder(new TitledBorder("Crear..."));

        this.add(createCenteredLabel("Nombre: "));
        camponNombre.setMaximumSize(DIMENSION);
        this.add(camponNombre);

        this.add(createCenteredLabel("Apellido: "));
        campoApellido.setMaximumSize(DIMENSION);
        this.add(campoApellido);

        this.add(createCenteredLabel("DNI: "));
        campoDNI.setMaximumSize(DIMENSION);
        this.add(campoDNI);
    }

}