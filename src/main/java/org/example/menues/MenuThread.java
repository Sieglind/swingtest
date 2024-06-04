package org.example.menues;

import org.example.menues.jpanels.boxpanels.LoginJpanel;

public class MenuThread implements Runnable {

    @Override
    public void run() {
        MainMenuFrame menuFrame = MainMenuFrame.getMainMenuFrame();
        menuFrame.setContentPane(new LoginJpanel());
    }
}
