package org.example.menues.takslist;

import javax.swing.*;
import java.awt.*;

public class TaskListPanel extends JPanel {
    public TaskListPanel() {
        super();
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setVisible(true);
        addTaskButtons();
    }

    private void addTaskButtons() {
        for (Task task : Task.values()) {
            TaskListButtonListener buttonListener = new TaskListButtonListener();
            JButton button = new JButton(task.name());
            button.addActionListener(buttonListener);
            this.add(button);
        }
    }
}
