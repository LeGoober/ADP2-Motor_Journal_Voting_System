package com.msj.run;

import com.msj.GUI.ClientGUI;
import javax.swing.JFrame;

public class ClientRun {
    public static void main(String[] args) {
        ClientGUI client = new ClientGUI();
        client.setSize(1200, 750);
        client.setVisible(true);
        client.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
