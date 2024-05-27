package org.example.menues;

public class MenuThread implements Runnable {

    LoginJpanel loginJpanel = new LoginJpanel();

    @Override
    public void run() {
        MainMenuFrame menuFrame = new MainMenuFrame();
        menuFrame.setContentPane(loginJpanel);
    }
}
