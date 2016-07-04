/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logika;

import db.DBBroker;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student1
 */
public class Kontroler {

    private static Kontroler instanca;
    DBBroker db;
    
    
    private Kontroler() {
        db = new DBBroker();
    }

    public static Kontroler getInstanca() {
        if(instanca == null)
            instanca = new Kontroler();
        return instanca;
    }

//   
//    public ArrayList<Object> vratiListu() {
//        db.ucitajDrajver();
//        db.otvoriKonekciju();
//        ArrayList<Object> lista = db.vratiStavkeRacuna();
//        db.zatvoriKonekciju();
//        return lista;
//
//    }
//    public boolean sacuvaj(ArrayList<Stavka> lista) {
//        boolean sacuvano = false;
//        try {
//            
//            db.ucitajDrajver();
//            db.otvoriKonekciju();
//            db.sacuvajListuStavki(lista);
//            db.komit();
//            sacuvano = true;
//        } catch (SQLException ex) {
//       Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
//            db.rollback();
//            sacuvano = false;
//        }
//        db.zatvoriKonekciju();
//        return sacuvano;
//    }    
//    
}
