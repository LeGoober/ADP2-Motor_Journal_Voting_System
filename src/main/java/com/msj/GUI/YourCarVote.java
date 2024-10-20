package com.msj.GUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class YourCarVote extends JFrame implements ActionListener{
        private Image your_car_screen;
        private JPanel pnl_your_car_vote;
        private JButton btn_return_selection_page;

        public YourCarVote(){
        setGUI();
        setSize(1200, 750);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pnl_your_car_vote = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(your_car_screen, 0, 0, getWidth(), getHeight(), this);                
            }
        };
        
        your_car_screen = new ImageIcon("C:/Users/roris/Documents/NetBeansProjects/ADP2-Motor_Sport_Journal-Client/src/vote_selection-your_own_vehicle.png").getImage();
        //Buttons for the Selection Page GUI and ensuring that components are transparent, also have action listener
        btn_return_selection_page = new JButton("Return to Selection Page");
        btn_return_selection_page.setContentAreaFilled(false);
        btn_return_selection_page.setOpaque(false);
        btn_return_selection_page.setBounds(0, 0, 100, 200);
        btn_return_selection_page.addActionListener(this);
        
        }
        
        public void setGUI(){
        pnl_your_car_vote.setLayout(new BorderLayout());
        pnl_your_car_vote.add(btn_return_selection_page);
        }
        
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == btn_return_selection_page){
                VoteSelectionPage vsp = new VoteSelectionPage();
            }
        }
        
        protected void paintComponent(Graphics g){
        super.paintComponents(g);
        g.drawImage(your_car_screen, 0, 0, this);
    }
}
