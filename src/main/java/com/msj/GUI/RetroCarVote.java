package com.msj.GUI;

import com.msj_client.ClientSocket;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RetroCarVote extends JFrame implements ActionListener {

    private JButton btn_retro_astonm_vote, btn_retro_ferrari_vote, btn_retro_toyota_century_vote, btn_retro_bugatti_vote, btn_return_selection_page;
    private JPanel pnl_retro_car_vote;
    private Image retro_car_voting_screen;
    private ClientSocket client;
    protected static ObjectInputStream input;
    protected static ObjectOutputStream output;
    public RetroCarVote() {
        setSize(1200, 750);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setGUI();
        
        //Retro Car Vote Page
        pnl_retro_car_vote = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(retro_car_voting_screen, 0, 0, getWidth(), getHeight(), this);
            }
        };

        retro_car_voting_screen = new ImageIcon("C:/Users/roris/Documents/NetBeansProjects/ADP2-Motor_Sport_Journal-Client/src/vote_selection-vintage.png").getImage();

        btn_return_selection_page = new JButton("Return to Selection Page");
        btn_return_selection_page.setContentAreaFilled(false);
        btn_return_selection_page.setOpaque(false);
        btn_return_selection_page.setBounds(200, 200, 100, 200);
        btn_return_selection_page.addActionListener(this);
        
        btn_retro_astonm_vote = new JButton("Aston Martin");
        btn_retro_astonm_vote.setContentAreaFilled(false);
        btn_retro_astonm_vote.setOpaque(false);
        btn_retro_astonm_vote.setBounds(200, 250, 100, 200);
        btn_retro_astonm_vote.addActionListener(this);
        
        btn_retro_ferrari_vote = new JButton("Ferrari");
        btn_retro_ferrari_vote.setContentAreaFilled(false);
        btn_retro_ferrari_vote.setOpaque(false);
        btn_retro_ferrari_vote.setBounds(200, 300, 100, 200);
        btn_retro_ferrari_vote.addActionListener(this);
        
        btn_retro_toyota_century_vote = new JButton("Toyota Century");
        btn_retro_toyota_century_vote.setContentAreaFilled(false);
        btn_retro_toyota_century_vote.setOpaque(false);
        btn_retro_toyota_century_vote.setBounds(200, 350, 100, 200);
        btn_retro_toyota_century_vote.addActionListener(this);
        
        btn_retro_bugatti_vote = new JButton("Bugatti");
        btn_retro_bugatti_vote.setContentAreaFilled(false);
        btn_retro_bugatti_vote.setOpaque(false);
        btn_retro_bugatti_vote.setBounds(200, 400, 100, 200);
        btn_retro_bugatti_vote.addActionListener(this);
    }
    
    public void setGUI(){
        pnl_retro_car_vote.setLayout(new BorderLayout());
        pnl_retro_car_vote.add(btn_return_selection_page);
        pnl_retro_car_vote.add(btn_retro_astonm_vote);
        pnl_retro_car_vote.add(btn_retro_ferrari_vote);
        pnl_retro_car_vote.add(btn_retro_toyota_century_vote);
        pnl_retro_car_vote.add(btn_retro_bugatti_vote);
        
        this.add(pnl_retro_car_vote);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_return_selection_page) {
            //Ensuring that we are then able to navigate to various GUI windows within our Project
            VoteSelectionPage vsp = new VoteSelectionPage();
        }
        else if(e.getSource() instanceof JButton){
            String car_vote =((JButton)e.getSource()).getText();
            client.sendVote(car_vote);
            System.out.println("Vote Successful");
        }
    }
    private void sendVote(String carVote){
        try {
            // Send the car vote text directly to the server
            client.sendVote(carVote); // Call the method in ClientSocket to send the text
        } catch (Exception e) {
            e.printStackTrace(); // Handle exceptions appropriately
        }
    }
    
    
    protected void paintComponent(Graphics g) {
        super.paintComponents(g);
        g.drawImage(retro_car_voting_screen, 0, 0, this);
    }

}
