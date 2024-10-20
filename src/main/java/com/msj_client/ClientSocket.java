package com.msj_client;
import java.net.*;
import java.io.*;

public class ClientSocket {
    private Socket server_connection;
    protected static ObjectInputStream input;
    protected static ObjectOutputStream output;
    
    public ClientSocket(){
        try{
            server_connection = new Socket("127.0.0.1",2020);    
        }
        catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
    
    public void serverProcessor(){
        try{
        output = new ObjectOutputStream(server_connection.getOutputStream());
        input = new ObjectInputStream(server_connection.getInputStream());
        
        }
        catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
        // Method to send a vote to the server
    public void sendVote(String carVote) {
        try {
            output.writeObject(carVote); // Send the vote string to the server
            output.flush(); // Ensure all data is sent
        } catch (IOException ioe) {
            System.out.println("Error sending vote: " + ioe.getMessage());
        }
    }
    
}
