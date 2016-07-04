/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komunikacija;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
//import transfer.KlijentTransferObjekat;
//import transfer.ServerTransferObjekat;

/**
 *
 * @author student1
 */
public class Komunikacija1 {
    
    private static Komunikacija1 instanca;
    Socket s;

    private Komunikacija1() {
        try {
            s = new Socket("localhost", 9000);
        } catch (IOException ex) {
            Logger.getLogger(Komunikacija1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Komunikacija1 getInstanca() {
        if(instanca == null)
            instanca = new Komunikacija1();
        return instanca;
    }
    
//    public void posaljiZahtev(KlijentTransferObjekat kto){
//        try {
//            ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
//            oos.writeObject(kto);
//        } catch (IOException ex) {
//            Logger.getLogger(Komunikacija.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//    public ServerTransferObjekat primiOdgovor(){
//        ServerTransferObjekat sto = new ServerTransferObjekat();
//        try {
//            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
//            sto = (ServerTransferObjekat) ois.readObject();
//        } catch (IOException ex) {
//            Logger.getLogger(Komunikacija.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Komunikacija.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        return sto;
//    }
}
