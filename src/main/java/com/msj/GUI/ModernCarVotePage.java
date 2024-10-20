package com.msj.GUI;
import com.msj_client.ClientSocket;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

public class ModernCarVotePage extends JFrame implements ActionListener{
    private JButton btn_modern_astonm_vote, btn_modern_ferrari_vote, btn_modern_lamborghini_vote, btn_modern_bugatti_vote, btn_return_selection_page;
    private JPanel pnl_modern_car_vote;
    private Image modern_car_voting_screen;
    private ObjectInputStream input;
    private ObjectOutputStream output;
    private ClientSocket client;

    
    public ModernCarVotePage(){
        setSize(1200, 750);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setGUI();

        //Setting up the background image
       modern_car_voting_screen = new ImageIcon("C:/Users/roris/Documents/NetBeansProjects/ADP2-Motor_Sport_Journal-Client/src/vote_selection-vintage.png").getImage();
        //Modern Car Vote Page
        pnl_modern_car_vote = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(modern_car_voting_screen, 0, 0, getWidth(), getHeight(), this);
            }
        };
        
        //Buttons for the Selection Page GUI and ensuring that components are transparent, also have action listener
        btn_return_selection_page = new JButton("Return to Selection Page");
        btn_return_selection_page.setContentAreaFilled(false);
        btn_return_selection_page.setOpaque(false);
        btn_return_selection_page.setBounds(0, 0, 100, 200);
        btn_return_selection_page.addActionListener(this);
        
        //Button for Aston Martin Vote with ActionListener
        btn_modern_astonm_vote = new JButton("Aston Martin");
        btn_modern_astonm_vote.setContentAreaFilled(false);
        btn_modern_astonm_vote.setOpaque(false);
        btn_modern_astonm_vote.setBounds(0, 0, 100, 200);
        btn_modern_astonm_vote.addActionListener(this);
        
        //Button for Bugatti Vote with ActionListener
        btn_modern_bugatti_vote = new JButton("Bugatti");
        btn_modern_bugatti_vote.setContentAreaFilled(false);
        btn_modern_bugatti_vote.setOpaque(false);
        btn_modern_bugatti_vote.setBounds(0, 0, 100, 200);
        btn_modern_bugatti_vote.addActionListener(this);
        
        //Button for Ferrari Vote with ActionListener
        btn_modern_ferrari_vote = new JButton("Ferrari");
        btn_modern_ferrari_vote.setContentAreaFilled(false);
        btn_modern_ferrari_vote.setOpaque(false);
        btn_modern_ferrari_vote.setBounds(0, 0, 100, 200);
        btn_modern_ferrari_vote.addActionListener(this);     
        
    }
        public void setGUI(){
            pnl_modern_car_vote.setLayout(new BorderLayout());
            pnl_modern_car_vote.add(btn_return_selection_page);
            pnl_modern_car_vote.add(btn_modern_ferrari_vote);
            pnl_modern_car_vote.add(btn_modern_bugatti_vote);
            pnl_modern_car_vote.add(btn_modern_astonm_vote);
        }
        
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == btn_return_selection_page){
                //Ensuring that we are then able to navigate to various GUI windows within our Project0
                VoteSelectionPage vsp = new VoteSelectionPage();
            }
            else if(e.getSource() instanceof JButton){
            String car_vote =((JButton)e.getSource()).getText();
            client.sendVote(car_vote);
        }
        }
        
        protected void paintComponent(Graphics g){
        super.paintComponents(g);
        g.drawImage(modern_car_voting_screen, 0, 0, this);
    }
}
