package com.msj.GUI;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class ModernCarVotePage extends JFrame implements ActionListener{
    private JButton btn_modern_astonm_vote, btn_modern_ferrari_vote, btn_modern_lamborghini_vote, btn_modern_bugatti_vote, btn_return_selection_page;
    private JPanel pnl_modern_car_vote;
    private Image modern_car_voting_screen;
    
    
    public ModernCarVotePage(){
        //Modern Car Vote Page
        pnl_modern_car_vote = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(modern_car_voting_screen, 0, 0, getWidth(), getHeight(), this);
            }
        };
       //Setting up the background image
       modern_car_voting_screen = new ImageIcon("C:/Users/roris/Documents/NetBeansProjects/ADP2-Motor_Sport_Journal-Client/src/vote_selection-vintage.png").getImage();
        setGUI();
        setSize(1200, 750);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
        public void setGUI(){
            pnl_modern_car_vote.setLayout(new BorderLayout());
            
        }
        
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == btn_return_selection_page){
                VoteSelectionPage vsp = new VoteSelectionPage();
            }
        }
        
        protected void paintComponent(Graphics g){
        super.paintComponents(g);
        g.drawImage(modern_car_voting_screen, 0, 0, this);
    }
}
