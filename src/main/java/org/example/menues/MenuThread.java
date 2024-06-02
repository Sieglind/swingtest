package org.example.menues;

import org.example.menues.login.LoginJpanel;

public class MenuThread implements Runnable {

    @Override
    public void run() {
        MainMenuFrame menuFrame = MainMenuFrame.getMainMenuFrame();
        menuFrame.setContentPane(new LoginJpanel());
    }
}
