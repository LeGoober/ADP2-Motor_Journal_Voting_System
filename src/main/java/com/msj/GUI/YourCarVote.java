package com.msj.GUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class YourCarVote extends JFrame implements ActionListener{
        private Image vintage_car_voting_screen;
        private JPanel pnl_vintage_car_vote;
        private JButton btn_vintage_astonm_vote, btn_vintage_ferrari_vote, btn_vintage_century_vote, btn_vintage_bugatti_vote, btn_return_selection_page;

        public YourCarVote(){
        setGUI();
        setSize(1200, 750);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pnl_vintage_car_vote = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(vintage_car_voting_screen, 0, 0, getWidth(), getHeight(), this);                
            }
        };
        
        vintage_car_voting_screen = new ImageIcon("C:/Users/roris/Documents/NetBeansProjects/ADP2-Motor_Sport_Journal-Client/src/vote_selection-modern.png").getImage();

        }
        
        public void setGUI(){
        pnl_vintage_car_vote.setLayout(new BorderLayout());

        }
        
        
        protected void paintComponent(Graphics g){
        super.paintComponents(g);
        g.drawImage(vintage_car_voting_screen, 0, 0, this);
    }
}
