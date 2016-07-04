/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student1
 */
public class DBBroker {
    Connection konekcija;
    
    public void ucitajDrajver(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Nije se ucitao drajver");
        }
    }
    public void otvoriKonekciju(){
        try {
         
            konekcija = DriverManager.getConnection("jdbc:mysql://localhost:3306/prosoftjul16g2", "root", "");
            konekcija.setAutoCommit(false);
        } catch (SQLException ex) {
            System.out.println("Nije otvorena konekcija");
        }
    }
    public void zatvoriKonekciju(){
        try {
            konekcija.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void komit(){
        try {
            konekcija.commit();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void rollback(){
        try {
            konekcija.rollback();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    public ArrayList<Klijent> vratiListuKlijenta() {
//        String upit = "Select * from klijent";
//        ArrayList<Klijent> lista = new ArrayList<>();
//        
//        try {
//            Statement s = konekcija.createStatement();
//            ResultSet rs = s.executeQuery(upit);
//            while(rs.next()){
//                int ID= rs.getInt("KlijentID");
//                String naziv = rs.getString("Naziv");
//                String adresa = rs.getString("adresa");
//                Klijent k = new Klijent(ID, naziv, adresa);
//                
//                lista.add(k);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        return lista;
//    }

  

//    public void sacuvajStavku(Stavka stavka) throws SQLException {
//        String upit = "INSERT INTO stavkaracuna(RacunID,RB,Kolicina,ProizvodID,Iznos) VALUES (?,?,?,?,?)";
//        
//        PreparedStatement ps = konekcija.prepareStatement(upit);
//        ps.setInt(1, stavka.getRacun().getRacunID());
//        ps.setInt(2, stavka.getRb());
//        ps.setInt(3, stavka.getKolicina());
//        ps.setInt(4, stavka.getProizvod().getProizvodId());
//        ps.setDouble(5, stavka.getIznos());
//        
//        ps.executeUpdate();
//    }
//
//      public void sacuvajListuStavki(List<Stavka> lista) throws SQLException {
//        
//        for(Stavka s: lista){
//                sacuvajStavku(s);
//            
//        }
//    }
//
//      public void obrisi(Stavka s){
//          String deleteSQL = "DELETE FROM stavkaracuna WHERE RacunID=? AND RB=?";
//          PreparedStatement preparedStatement;
//        try {
//            preparedStatement = konekcija.prepareStatement(deleteSQL);
//            preparedStatement.setInt(1, s.getRacun().getRacunID());
//            preparedStatement.setInt(2, s.getRb());
//            preparedStatement.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
//        }
//      }
//      public void obrisiListuStavki(List<Stavka> lista) throws SQLException {
//        
//        for(Stavka s: lista){
//                obrisi(s);
//            
//        }
//    }
//      public void azuriraj(Racun r){
//          String azurirajSQL = "UPDATE Racun SET Datum=?,KlijentID=?,UkupanIznos=? WHERE RacunID=?";
//          PreparedStatement preparedStatement;
//          double ukupanIznos = 0;
//          for(Stavka s: vratiStavkeRacuna()){
//              if(s.getRacun().getRacunID() == r.getRacunID()){
//                  ukupanIznos+=s.getIznos();
//              }
//          }
//        try {
//            preparedStatement = konekcija.prepareStatement(azurirajSQL);
//            preparedStatement.setDate(1, parseri.DateParser.vratiSqlDatum(r.getDatum()));
//            preparedStatement.setInt(2, r.getKlijent().getKlijentID());
//            preparedStatement.setDouble(3, ukupanIznos);
//            preparedStatement.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
//        }
//      }
      
      private int vratiMaksID() {
        String upit = "Select max(id) as maks from tabela";
        int maks = 0;
        
        try {
            Statement s = konekcija.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while(rs.next()){
                maks= rs.getInt("maks");
             
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return maks ;
    }
}
