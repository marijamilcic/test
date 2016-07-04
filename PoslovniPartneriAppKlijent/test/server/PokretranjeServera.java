/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student1
 */
public class PokretranjeServera extends Thread{

    @Override
    public void run() {
        try {
            ServerSocket ss = new ServerSocket(9000);
            System.out.println("Server se pokrenuto");
            while (true) {                
                Socket s = ss.accept();
                System.out.println("Klijent se povezao");
                NitKlijent nk = new NitKlijent(s);
                nk.start();
        }
            } catch (IOException ex) {
            Logger.getLogger(PokretranjeServera.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
