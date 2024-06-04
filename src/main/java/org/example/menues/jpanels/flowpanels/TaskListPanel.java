package org.example.menues.jpanels.flowpanels;

import org.example.menues.enums.Task;
import org.example.menues.actionlisteners.TaskListButtonListener;
import org.example.menues.jpanels.CustomPanel;

import javax.swing.*;
import java.awt.*;

public class TaskListPanel extends CustomPanel {
    public TaskListPanel() {
        super();
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setVisible(true);
        addTaskButtons();
    }

    private void addTaskButtons() {
        TaskListButtonListener buttonListener = new TaskListButtonListener();
        for (Task task : Task.values()) {
            JButton button = new JButton(task.name());
            button.addActionListener(buttonListener);
            this.add(button);
        }
    }
}
