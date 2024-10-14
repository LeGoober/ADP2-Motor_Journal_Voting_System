package com.msj.GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.*;
import java.io.*;

public class ClientGUI extends JFrame{
    protected static ObjectInputStream input;
    protected static ObjectOutputStream output;
    private JPanel pnl_main, pnl_selection_screen, pnl_vintage_car_vote, pnl_modern_car_vote;
    private Image background_image;
    private Image selection_screen;
    private Image vintage_car_voting_screen;
    private Image modern_car_voting_screen;
    

    public ClientGUI(){
        pnl_main = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(background_image, 0, 0, getWidth(), getHeight(), this);
                g.drawImage(modern_car_voting_screen, 0, 0, getWidth(), getHeight(), this);
            }
        };
        pnl_selection_screen = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(selection_screen, 0, 0, getWidth(), getHeight(), this);
            }
        };
        pnl_vintage_car_vote = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(vintage_car_voting_screen, 0, 0, getWidth(), getHeight(), this);                
            }
        };
        pnl_modern_car_vote = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(modern_car_voting_screen, 0, 0, getWidth(), getHeight(), this);
            }
        };
        
        background_image = new ImageIcon("C:/Users/roris/Documents/NetBeansProjects/ADP2-Motor_Sport_Journal-Client/src/homepage.png").getImage();
        setGUI();
    }
    public void setGUI(){
        pnl_main.setLayout(new BorderLayout());
        this.add(pnl_main);
    }

    protected void paintComponent(Graphics g){
        super.paintComponents(g);
        g.drawImage(background_image, 0, 0, this);
    }
}
