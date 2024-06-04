package org.example.menues.jpanels.flowpanels;

import org.example.menues.enums.ClientAction;
import org.example.menues.actionlisteners.ClientActionButtonListener;
import org.example.menues.jpanels.CustomPanel;

import javax.swing.*;
import java.awt.*;

public class ClientActionListPanel extends CustomPanel {

    public ClientActionListPanel() {
        super();
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setVisible(true);
        addTaskButtons();
    }

    private void addTaskButtons() {
        ClientActionButtonListener clientActionButtonListener = new ClientActionButtonListener();
        for (ClientAction action : ClientAction.values()) {
            JButton button = new JButton(action.getEtiqueta());
            button.setName(action.name());
            button.addActionListener(clientActionButtonListener);
            this.add(button);
        }
    }
}
