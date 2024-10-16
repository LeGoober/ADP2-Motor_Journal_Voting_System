package com.msj.GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;

public class ClientGUI extends JFrame implements ActionListener{
    protected static ObjectInputStream input;
    protected static ObjectOutputStream output;
    private JPanel pnl_homepage, pnl_selection_screen, pnl_vintage_car_vote;
    private JButton btn_selection_page_rvote, btn_selection_page_mvote, btn_selection_page_yourvote, btn_return_homepage, btn_return_selection_page;
    private JButton btn_homescreen_view_cars, btn_homsecreen_view_votes, btn_exit;
    private Image background_image;
    

    public ClientGUI(){
        //Adding a Image to the JPanel component through the paint component
        //Home Page
        pnl_homepage = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(background_image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        //Setting up the background images 
        background_image = new ImageIcon("C:/Users/roris/Documents/NetBeansProjects/ADP2-Motor_Sport_Journal-Client/src/home_screen.png").getImage();
        
        //Setting up the Buttons to view the Car Vote Selection page
        btn_homescreen_view_cars = new JButton("View the Cars to Vote For");
        btn_homescreen_view_cars.setContentAreaFilled(false);
        btn_homescreen_view_cars.setOpaque(false);
        btn_homescreen_view_cars.setBounds(0,0, 100, 200);
        
        //Setting up the Button to view the Total Votes
        btn_homsecreen_view_votes = new JButton("View The Total Votes for the Various Cars");
        btn_homescreen_view_cars.setContentAreaFilled(false);
        btn_homescreen_view_cars.setOpaque(false);
        btn_homescreen_view_cars.setBounds(0,0, 100, 200);
        
        
//        Adding the Buttons that will be used on each screen, made the buttons transparent
//        btn_return_selection_page = new JButton("Return to Selection Page");
//        btn_return_selection_page.setContentAreaFilled(false);
//        btn_return_selection_page.setOpaque(false);
//        btn_return_selection_page.setBounds(0,0, 100, 200);

//        //Buttons for the Selection Page GUI and ensuring that components are transparent
//        btn_selection_page_mvote = new JButton("Vote From the Vintage Selection");
//        btn_selection_page_mvote.setContentAreaFilled(false);
//        btn_selection_page_mvote.setOpaque(false);
//        btn_selection_page_mvote.setBounds(120, 0, 100, 200);
        //calling the setGUI method in the Constructor so that we create instance on main method run
        setGUI();
        setSize(1200, 750);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void setGUI(){
        pnl_homepage.setLayout(new BorderLayout());
//        pnl_vintage_car_vote.setLayout(new BorderLayout());
//        pnl_modern_car_vote.setLayout(new BorderLayout());
//        
//        pnl_modern_car_vote.add(btn_return_selection_page);
        
        pnl_selection_screen.add(btn_selection_page_mvote);
        
        this.add(pnl_homepage);
//        this.add(pnl_selection_screen);
//        this.add(pnl_vintage_car_vote);
//        this.add(pnl_modern_car_vote);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn_selection_page_mvote){
            VoteSelectionPage vsp = new VoteSelectionPage();
        }
    }
    
    protected void paintComponent(Graphics g){
        super.paintComponents(g);
        g.drawImage(background_image, 0, 0, this);
    }
}
