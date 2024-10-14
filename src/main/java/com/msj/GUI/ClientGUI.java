package com.msj.GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.*;
import java.io.*;

public class ClientGUI extends JFrame implements ActionListener{
    protected static ObjectInputStream input;
    protected static ObjectOutputStream output;
    private JPanel pnl_homepage, pnl_selection_screen, pnl_vintage_car_vote, pnl_modern_car_vote;
    private JButton btn_selection_page_rvote, btn_selection_page_mvote, btn_selection_page_yourvote, btn_return_homepage;
    private JButton btn_homescreen_view_cars, btn_homsecreen_view_votes, btn_exit;
    private JButton btn_modern_astonm_vote, btn_modern_ferrari_vote, btn_modern_lamborghini_vote, btn_modern_bugatti_vote, btn_return_selection_page;
    private JButton btn_vintage_astonm_vote, btn_vintage_ferrari_vote, btn_vintage_century_vote, btn_vintage_bugatti_vote;
    private Image background_image;
    private Image selection_screen;
    private Image vintage_car_voting_screen;
    private Image modern_car_voting_screen;
    

    public ClientGUI(){
        //Adding a Image to the JPanel component through the paint component
        //Home Page
        pnl_homepage = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(background_image, 0, 0, getWidth(), getHeight(), this);
                g.drawImage(modern_car_voting_screen, 0, 0, getWidth(), getHeight(), this);
            }
        };
        //Selection Page
        pnl_selection_screen = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(selection_screen, 0, 0, getWidth(), getHeight(), this);
            }
        };
        //Vintage Car Vote Page
        pnl_vintage_car_vote = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(vintage_car_voting_screen, 0, 0, getWidth(), getHeight(), this);                
            }
        };
        //Modern Car Vote Page
        pnl_modern_car_vote = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(modern_car_voting_screen, 0, 0, getWidth(), getHeight(), this);
            }
        };
        //Setting up the background images 
        background_image = new ImageIcon("C:/Users/roris/Documents/NetBeansProjects/ADP2-Motor_Sport_Journal-Client/src/homepage.png").getImage();
        selection_screen = new ImageIcon("C:/Users/roris/Documents/NetBeansProjects/ADP2-Motor_Sport_Journal-Client/src/voting_selection_pages.png").getImage();
        vintage_car_voting_screen = new ImageIcon("C:/Users/roris/Documents/NetBeansProjects/ADP2-Motor_Sport_Journal-Client/src/vote_selection-modern.png").getImage();
        modern_car_voting_screen = new ImageIcon("C:/Users/roris/Documents/NetBeansProjects/ADP2-Motor_Sport_Journal-Client/src/vote_selection-vintage.png").getImage();
        
        //Adding the Buttons that will be used on each screen, made the buttons transparent
        btn_return_selection_page = new JButton("Return to Selection Page");
        btn_return_selection_page.setContentAreaFilled(false);
        btn_return_selection_page.setOpaque(false);
        btn_return_selection_page.setBounds(0,0, 100, 200);

        btn_selection_page_mvote = new JButton("Vote From the Vintage Selection");
        btn_selection_page_mvote.setContentAreaFilled(false);
        btn_selection_page_mvote.setOpaque(false);
        btn_selection_page_mvote.setBounds(120, 0, 100, 200);
        //calling the setGUI method in the Constructor so that we create instance on main method run
        setGUI();
        
    }
    public void setGUI(){
        pnl_homepage.setLayout(new BorderLayout());
        pnl_selection_screen.setLayout(new BorderLayout());
        pnl_vintage_car_vote.setLayout(new BorderLayout());
        pnl_modern_car_vote.setLayout(new BorderLayout());
        
        pnl_modern_car_vote.add(btn_return_selection_page);
        
        pnl_selection_screen.add(btn_selection_page_mvote);
        
        this.add(pnl_homepage);
        this.add(pnl_selection_screen);
        this.add(pnl_vintage_car_vote);
        this.add(pnl_modern_car_vote);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn_selection_page_mvote){
            
        }
    }
    
    protected void paintComponent(Graphics g){
        super.paintComponents(g);
        g.drawImage(background_image, 0, 0, this);
        g.drawImage(selection_screen, 0, 0, this);
        g.drawImage(vintage_car_voting_screen, 0, 0, this);
        g.drawImage(modern_car_voting_screen, 0, 0, this);
    }
}
