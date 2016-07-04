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
public class ModelTabeleServer extends AbstractTableModel{

    ArrayList<Object> lista;
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object r = lista.get(rowIndex);
        
        switch(columnIndex){
//            case 0: return r.getKlijent();
//            case 1: return r.getIznos();
            default:return "N/A";
        }
    }
    
    String[] kolone = {"Klijent","Ukupan Iznos"};

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
    
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Object racun = lista.get(rowIndex);
        
        switch(columnIndex){
//            case 0: racun.setKlijent((Klijent) aValue);break;
//            case 1: racun.setIznos((double) aValue);break;                
        }
    }
    
}
