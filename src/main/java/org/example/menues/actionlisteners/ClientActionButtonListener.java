package org.example.menues.actionlisteners;

import org.example.menues.MainMenuFrame;
import org.example.menues.jpanels.boxpanels.PanelCrearCliente;
import org.example.menues.jpanels.flowpanels.ClientActionListPanel;
import org.example.menues.enums.ClientAction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientActionButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
        JButton button = (JButton) event.getSource();
        MainMenuFrame mainFrame = MainMenuFrame.getMainMenuFrame();
        mainFrame.setContentPane(renderizarAccionesDeTarea(ClientAction.valueOf(button.getName())));
        mainFrame.revalidate();
        mainFrame.repaint();
    }

    private Container renderizarAccionesDeTarea(ClientAction action) {
        switch (action) {
            case CREAR_CLIENTE -> System.out.println("Creando Cliente");
            case BUSCAR_CLIENTE -> System.out.println("Buscando Cliente");
            case BORRAR_CLIENTE -> System.out.println("Borrando Cliente");
        }
        return new PanelCrearCliente();
    }
}
