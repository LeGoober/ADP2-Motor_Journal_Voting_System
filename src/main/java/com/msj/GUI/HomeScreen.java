package com.msj.GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;

public class HomeScreen extends JFrame implements ActionListener {

    protected static ObjectInputStream input;
    protected static ObjectOutputStream output;
    private JPanel pnl_homepage;
    private JButton btn_homescreen_view_cars, btn_homsecreen_view_votes, btn_exit;
    private Image background_image;

    public HomeScreen() {
        //Adding a Image to the JPanel component through the paint component
        //Home Page
        pnl_homepage = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
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
        btn_homescreen_view_cars.setBounds(750, 480, 500, 70);
        btn_homescreen_view_cars.addActionListener(this);

        //Setting up the Button to view the Total Votes
        btn_homsecreen_view_votes = new JButton("View The Total Votes for the Various Cars");
        btn_homsecreen_view_votes.setContentAreaFilled(false);
        btn_homsecreen_view_votes.setOpaque(false);
        btn_homsecreen_view_votes.setBounds(500, 428, 500, 70);
        btn_homsecreen_view_votes.addActionListener(this);
        
        //Setting up the Button to view the Total Votes
        btn_exit = new JButton("Exit");
        btn_exit.setContentAreaFilled(false);
        btn_exit.setOpaque(false);
        btn_exit.setBounds(400, 428, 500, 70);
        btn_exit.addActionListener(this);

        //calling the setGUI method in the Constructor so that we create instance on main method run
        setGUI();
        setSize(1200, 750);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void setGUI() {
        pnl_homepage.setLayout(new BorderLayout());
        pnl_homepage.add(btn_homescreen_view_cars);
        pnl_homepage.add(btn_exit);
        pnl_homepage.add(btn_homsecreen_view_votes);
        this.add(pnl_homepage);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_homescreen_view_cars) {
            VoteSelectionPage vsp = new VoteSelectionPage();
        } else if (e.getSource() == btn_homsecreen_view_votes) {
            YourCarVote ycv_screen = new YourCarVote();
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponents(g);
        g.drawImage(background_image, 0, 0, this);
    }
}
