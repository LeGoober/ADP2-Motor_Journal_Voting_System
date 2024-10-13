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
    private JPanel pnl_main;
    private JMenu jm_menu;
    private JMenuItem jmi_votes, jmi_homepage, jmi_exit;
    private JMenuBar jmb_Bar;
    private Image background_image;
    Image background_img;

    public ClientGUI(){
        pnl_main = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(background_img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        background_img = new ImageIcon("C:/Users/roris/Documents/NetBeansProjects/ADP2-Motor_Sport_Journal-Client/src/homepage.png").getImage();
        setGUI();
        
        jmb_Bar = new JMenuBar();
        jmi_votes = new JMenuItem("Cast Votes");
        jmi_homepage = new JMenuItem("Home");
        jmi_exit = new JMenuItem("Exit Application");
        jm_menu.add(jmi_votes);
        jm_menu.add(jmi_homepage);
        jm_menu.add(jmi_exit);
        jmb_Bar.add(jm_menu);
        add(jmb_Bar);
        
    }
    public void setGUI(){
        pnl_main.setLayout(new BorderLayout());
        this.add(pnl_main);
    }

    protected void paintComponent(Graphics g){
        super.paintComponents(g);
        g.drawImage(background_img, 0, 0, this);
    }
}
