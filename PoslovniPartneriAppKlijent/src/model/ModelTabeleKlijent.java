/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author student1
 */
public class ModelTabeleKlijent extends AbstractTableModel{

    ArrayList<Object> lista;
    
    public ModelTabeleKlijent() {
    lista=new ArrayList<>();
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
        
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Object s = lista.get(rowIndex);
        double cena;
        switch(columnIndex){
//            case 0: return s.getProizvod();
//            case 1: return cena;
//            case 2: return s.getKolicina();
//            case 3: return s.getIznos();
           default: return "N/A";
        }
        
    }
    
    String[] kolone = {"Kolona1"};

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Object s = lista.get(rowIndex);
        
        switch(columnIndex){
//            case 0: s.setProizvod((Proizvod) aValue);break;
//            case 1: s.getProizvod().setCena((Double) aValue);break;
//            case 2: s.setKolicina(Integer.parseInt((String) aValue));
//                    s.setIznos(s.getProizvod().getCena()*s.getKolicina());
//                    break;
//            case 3: s.setIznos(s.getProizvod().getCena()*s.getKolicina());break;
                                   
        }
        fireTableDataChanged();
    } 

    public void dodajRed() {
        lista.add(new Object());
        fireTableDataChanged();
    }

    public void obrisiREd(int red) {
        lista.remove(red);
        fireTableDataChanged();
    }

    public void skloniPodatke() {
        lista = new ArrayList<>();
        fireTableDataChanged();
    }
    
}
