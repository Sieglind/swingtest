package org.example.menues.takslist;

import org.example.menues.MainMenuFrame;
import org.example.menues.takslist.actionlists.clientactions.ClientActionListPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskListButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
        JButton button = (JButton) event.getSource();
        MainMenuFrame mainFrame = MainMenuFrame.getMainMenuFrame();
        mainFrame.setContentPane(renderizarAccionesDeTarea(Task.valueOf(button.getText())));
        mainFrame.revalidate();
        mainFrame.repaint();
    }

    private JPanel renderizarAccionesDeTarea(Task task) {
        switch (task){
            case CLIENTES -> {
                return new ClientActionListPanel();
            }
        }
        return null;
    }
}
