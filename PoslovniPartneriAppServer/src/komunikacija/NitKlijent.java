/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komunikacija;

import domen.Mesto;
import domen.OpstiDomenskiObjekat;
import domen.PoslovniPartner;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
public class NitKlijent extends Thread {
    private Socket socket;
    private boolean aktivan;

    public NitKlijent(Socket socket) {
        this.socket = socket;
        this.aktivan = true;
    }

    @Override
    public void run() {
        try {
            izvrsenjeOperacija();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Nit je zavrsila sa radom.");
    }
    
    private void izvrsenjeOperacija() throws IOException, ClassNotFoundException {
        while (aktivan) {
            ObjectInputStream inSocket = new ObjectInputStream(socket.getInputStream());
            TransferObjekatZahtev toZahtev = (TransferObjekatZahtev) inSocket.readObject();
            TransferObjekatOdgovor toOdgovor = new TransferObjekatOdgovor();
            try {
                System.out.println("O: " + toZahtev.getOperacija());
                switch (toZahtev.getOperacija()) {
                    case Konstante.VRATI_MESTA:
                        List<OpstiDomenskiObjekat> lm = Kontroler.getInstance().vratiMesta();
                        toOdgovor.setRezultat(lm);
                        toOdgovor.setPoruka("Mesta su ucitana.");
                        break;
                    case Konstante.SACUVAJ_PARTNERA:
                        PoslovniPartner pp = (PoslovniPartner) toZahtev.getParametar();
                        Kontroler.getInstance().dodajPartnera(pp);
                        toOdgovor.setPoruka("Partner je uspesno sacuvan.");
                        break;
                    case Konstante.KRAJ_RADA:
                        aktivan = false;
                        break;
                }
            } catch (Exception ex) {
                toOdgovor.setPoruka(ex.getMessage());
                toOdgovor.setIzuzetak(ex);
            }
            posaljiOdgovor(toOdgovor);
        }
    }

    private void posaljiOdgovor(TransferObjekatOdgovor toOdgovor) throws IOException {
        ObjectOutputStream outSocket = new ObjectOutputStream(socket.getOutputStream());
        outSocket.writeObject(toOdgovor);
    }
    
}
