package osvezi;

import forme.FmServer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cule
 */
public class NitOsvezi extends Thread{
    
    FmServer sf;
    JLabel labela;
    public NitOsvezi(FmServer sf, JLabel labela) {
        this.sf = sf;
        this.labela = labela;
    }
    
    

    @Override
    public void run() {
        while (true) {            
            sf.srediTabelu();
            
            System.out.println("Osvezio");
            try {
                sleep(10000);
                labela.setText("Curko");
            } catch (InterruptedException ex) {
                Logger.getLogger(NitOsvezi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
