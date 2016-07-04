/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komunikacija;

import domen.Mesto;
import domen.PoslovniPartner;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import poslovnalogika.Kontroler;
import transfer.TransferObjekatOdgovor;
import transfer.TransferObjekatZahtev;
import util.Konstante;

/**
 *
 * @author student1
 */
public class Komunikacija {
    private boolean kraj = false;
    
    public void pokreniServer() throws IOException, ClassNotFoundException {
        ServerSocket ss = new ServerSocket(9000);
        System.out.println("Server je pokrenut.");
        while (!kraj) {
            Socket socket = ss.accept();
            System.out.println("Klijent se povezao.");
            NitKlijent nit = new NitKlijent(socket);
            nit.start();
        }
    }

    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new Komunikacija().pokreniServer();
    }
}
