package com.msj_client;
import java.net.*;
import java.io.*;

public class ClientSocket {
    private Socket server_connection;
    protected static ObjectInputStream input;
    protected static ObjectOutputStream output;
    
    public ClientSocket(){
            server_connection = new Socket();        
    }
}
