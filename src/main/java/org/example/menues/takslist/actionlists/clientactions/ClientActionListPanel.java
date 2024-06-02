package org.example.menues.takslist.actionlists.clientactions;

import javax.swing.*;
import java.awt.*;

public class ClientActionListPanel extends JPanel {

    public ClientActionListPanel() {
        super();
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setVisible(true);
        addTaskButtons();
    }

    private void addTaskButtons() {
        for (ClientAction action : ClientAction.values()) {
            ClientActionButtonListener clientActionButtonListener = new ClientActionButtonListener();
            JButton button = new JButton(action.getEtiqueta());
            button.setName(action.name());
            button.addActionListener(clientActionButtonListener);
            this.add(button);
        }
    }
}
