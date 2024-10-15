package com.msj.GUI;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class VoteSelectionPage extends JFrame implements ActionListener{
    private JPanel pnl_selection_page;
    private JButton btn_selection_page_rvote, btn_selection_page_mvote, btn_selection_page_yourvote, btn_return_homepage;
    private Image selection_screen;

    
    //Adding all the necessary components to the constructor
    //The Your Vote Buttons
    public VoteSelectionPage(){
    //Buttons for the Selection Page GUI and ensuring that components are transparent
    btn_return_homepage = new JButton("Return to Home Page");
    btn_return_homepage.setContentAreaFilled(false);
    btn_return_homepage.setOpaque(false);
    btn_return_homepage.setBounds(0, 0, 100, 200);
    
    //Buttons for the Selection Page GUI and ensuring that components are transparent
    //The Your Vote Buttons
    btn_selection_page_yourvote = new JButton("Vote For Your Own Vehicle");
    btn_selection_page_yourvote.setContentAreaFilled(false);
    btn_selection_page_yourvote.setOpaque(false);
    btn_selection_page_yourvote.setBounds(120, 0, 100, 200);
    
    //Buttons for the Selection Page GUI and ensuring that components are transparent
    //The Retro page votes
    btn_selection_page_rvote = new JButton("Vote From the Vintage Selection");
    btn_selection_page_rvote.setContentAreaFilled(false);
    btn_selection_page_rvote.setOpaque(false);
    btn_selection_page_rvote.setBounds(120, 0, 100, 200);
    btn_selection_page_rvote.addActionListener(this);
    
    //Buttons for the Selection Page GUI and ensuring that components are transparent
    //The Modern page votes
    btn_selection_page_mvote = new JButton("Vote From the Vintage Selection");
    btn_selection_page_mvote.setContentAreaFilled(false);
    btn_selection_page_mvote.setOpaque(false);
    btn_selection_page_mvote.setBounds(120, 0, 100, 200);
    
    
    //Constructing the JPanel class so that we can have a component that stores the Paint Component and actually displays the background image  
            //Selection Page
        pnl_selection_page = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(selection_screen, 0, 0, getWidth(), getHeight(), this);
            }
        };
        
        setGUI();
        setSize(1200, 750);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void setGUI(){
        pnl_selection_page.setLayout(new BorderLayout());
        pnl_selection_page.add(btn_selection_page_mvote);
        pnl_selection_page.add(btn_selection_page_rvote);
        pnl_selection_page.add(btn_selection_page_yourvote);
        pnl_selection_page.add(btn_return_homepage);
        
        
        this.add(pnl_selection_page);
    }
    
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == btn_return_homepage){
                ClientGUI cg = new ClientGUI();
            }
        }
    
        protected void paintComponent(Graphics g){
        super.paintComponents(g);
        g.drawImage(selection_screen, 0, 0, this);
    }
}
