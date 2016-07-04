/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import konstante.Konstante;
import logika.Kontroler;
import transfer.KlijentTransferObjekat;
import transfer.ServerTransferObjekat;

/**
 *
 * @author student1
 */
public class NitKlijent extends Thread{
    
    Socket soket;

    public NitKlijent(Socket soket) {
        this.soket = soket;
    }

    @Override
    public void run() {
        while (true) {            
            KlijentTransferObjekat kto = primiZahtev();
            ServerTransferObjekat sto = new ServerTransferObjekat();
//            switch(kto.getOperacija()){
//                case Konstante.VRATI_KUPCE: 
//                    ArrayList<Klijent> lista = Kontroler.getInstanca().vratiListuKlijenta();
//                    sto.setOdgovor(lista);
//                    System.out.println(lista);
//                    break;
//                
//                case Konstante.SACUVAJ: 
//                    ArrayList<Stavka> stavkeRacuna = (ArrayList<Stavka>) kto.getParametar();
//                    boolean sacuvano = Kontroler.getInstanca().sacuvaj(stavkeRacuna);
//                    if(sacuvano){
//                        sto.setPoruka("Sve uspesno sacuvano");
//                    }else{
//                        sto.setPoruka("Doslo je do greske, nije sacuvano");
//                    }
//                    sto.setOdgovor(sacuvano);
//                    break;
//            }
            posalji(sto);
        }
    }
    
    public void posalji(ServerTransferObjekat sto){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(soket.getOutputStream());
            oos.writeObject(sto);
        } catch (IOException ex) {
            Logger.getLogger(NitKlijent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public KlijentTransferObjekat primiZahtev(){
        KlijentTransferObjekat kto = new KlijentTransferObjekat();
        try {
            ObjectInputStream ois = new ObjectInputStream(soket.getInputStream());
            kto = (KlijentTransferObjekat) ois.readObject();
        } catch (IOException ex) {
            Logger.getLogger(NitKlijent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NitKlijent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return kto;
    }
}
