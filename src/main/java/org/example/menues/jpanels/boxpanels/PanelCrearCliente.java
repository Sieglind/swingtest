package org.example.menues.jpanels.boxpanels;

import org.example.menues.actionlisteners.SaveActionListener;

import javax.swing.*;

public class PanelCrearCliente extends PanelCrearEmpleado {

    public enum Segmento {
        BRONCE,
        PLATA,
        ORO
    }

    public PanelCrearCliente() {
        super();

        this.add(createCenteredLabel("Segmento"));
        JComboBox<Segmento> valoresDeSegmento = new JComboBox<>(Segmento.values());
        valoresDeSegmento.setMaximumSize(DIMENSION);
        this.add(valoresDeSegmento);

        this.add(ESPACIO);
        this.add(createCenteredButton("Guardar",new SaveActionListener()));
    }
}
