/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.partner;

import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import komunikacija.Komunikacija;
import model.ModelTabeleKlijent;
//import transfer.KlijentTransferObjekat;
//import transfer.ServerTransferObjekat;

/**
 *
 * @author student1
 */
public class FmKlijent extends javax.swing.JFrame {

    /**
     * Creates new form FmKlijent
     */
    public FmKlijent() {
        initComponents();
//        napuniKombo();
//        srediTabelu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSifra = new javax.swing.JTextField();
        txtDatume = new javax.swing.JTextField();
        btnPronadji = new javax.swing.JButton();
        cbomboklijent = new javax.swing.JComboBox<>();
        btnDodaj = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        btnSacuvaj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Sifra");

        jLabel2.setText("Klijent");

        jLabel3.setText("Datum");

        btnPronadji.setText("Pronadji");
        btnPronadji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPronadjiActionPerformed(evt);
            }
        });

        cbomboklijent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnDodaj.setText("Dodaj stavku");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obrisi stavku");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        btnSacuvaj.setText("Sacuvaj");
        btnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSifra, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(btnPronadji, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbomboklijent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDatume, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSifra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPronadji))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbomboklijent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(btnObrisi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnSacuvaj)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPronadjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPronadjiActionPerformed
       String procitaj =txtSifra.getText();
       if(procitaj != null || procitaj != ""){
           int idRacuna =Integer.parseInt(txtSifra.getText());
//           vratiRacun(idRacuna);
       }else{
           JOptionPane.showMessageDialog(this, "Sifra mora biti int!");
       }
        
       
    }//GEN-LAST:event_btnPronadjiActionPerformed

//    public Racun vratiPoIDju(int ID){
//     KlijentTransferObjekat kto = new KlijentTransferObjekat();
//     kto.setOperacija(konstante.Konstante.VRATI_RACUNE);
//     Komunikacija.getInstanca().posaljiZahtev(kto);
//     
//     ServerTransferObjekat sto = Komunikacija.getInstanca().primiOdgovor();
//     ArrayList<Racun> racuni =(ArrayList<Racun>) sto.getOdgovor();
//     
//     for(Racun r: racuni){
//         if(r.getRacunID()== ID){
//             return r;
//         }
//     }
//     return null;
//    }
    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
       ModelTabeleKlijent mtk = (ModelTabeleKlijent) jTable1.getModel();
        
        int red = jTable1.getSelectedRow();
        
        if(red == -1){
            JOptionPane.showMessageDialog(this, "Odaberite red");
        }else{
            mtk.obrisiREd(red);
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        ModelTabeleKlijent mtk = (ModelTabeleKlijent) jTable1.getModel();
        mtk.dodajRed();
        jTable1.setModel(mtk);
        JComboBox kombo = new JComboBox();
        kombo.removeAllItems();
//        for (Proizvod proizvod : vratiProizvode()) {
//            kombo.addItem(proizvod);
//            System.out.println(proizvod);
//        }
        
        TableColumnModel tcm = jTable1.getColumnModel();
        TableColumn kolona = tcm.getColumn(0);
        kolona.setCellEditor(new DefaultCellEditor(kombo));
        
        
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajActionPerformed
       ModelTabeleKlijent mtk = (ModelTabeleKlijent) jTable1.getModel();
//       ArrayList<Stavka> listaZaBrisanje = new ArrayList<>();
//       ArrayList<Stavka> lista = mtk.getListaStavki();
//       int racunId = Integer.parseInt(txtSifra.getText());
//       for(Stavka s: lista){
//           if(s.getRb() != 0){
//               listaZaBrisanje.add(s);
//           }else{
//               s.setRacun(vratiPoIDju(racunId));
//               
//           }
//       }
//       int i =1;
//       for(Stavka s: lista){
//           s.setRb(vratiStavke().size()+i);
//           i++;
//       }
//       
//       ArrayList<Stavka> listObrisi = vratiStavke();
//       ArrayList<Stavka> listAzuriraj = new ArrayList<>();
//       for(Stavka s : listaZaBrisanje){
//           for(Stavka s2 :listObrisi){
//               if(s.getRb() == s2.getRb()){
//                   listObrisi.remove(s2);
//                   listAzuriraj.add(s);
//               }
//           }
//       }
//       obrisi(listObrisi);
////       azuriraj(listAzuriraj);
//       sacuvaj(lista);
//       Racun racun = new Racun();
//       azurirajRacun(racun);
    }//GEN-LAST:event_btnSacuvajActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FmKlijent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmKlijent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmKlijent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmKlijent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmKlijent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPronadji;
    private javax.swing.JButton btnSacuvaj;
    private javax.swing.JComboBox<Object> cbomboklijent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDatume;
    private javax.swing.JTextField txtSifra;
    // End of variables declaration//GEN-END:variables

// public void napuniKombo(){
//     KlijentTransferObjekat kto = new KlijentTransferObjekat();
//     kto.setOperacija(konstante.Konstante.VRATI_KUPCE);
//     Komunikacija.getInstanca().posaljiZahtev(kto);
//     
//     ServerTransferObjekat sto = Komunikacija.getInstanca().primiOdgovor();
//     ArrayList<Klijent> lista = (ArrayList<Klijent>) sto.getOdgovor();
//     System.out.println(lista);
//     cbomboklijent.removeAllItems();
//     for(Klijent k : lista){
//        cbomboklijent.addItem(k);
//     }
// }
//
//    private void srediTabelu() {
//        ModelTabeleKlijent mtk = new ModelTabeleKlijent();
//        jTable1.setModel(mtk);
//        JComboBox kombo = new JComboBox();
//        kombo.removeAllItems();
//        for (Proizvod proizvod : vratiProizvode()) {
//            kombo.addItem(proizvod);
//            System.out.println(proizvod);
//        }
//        
//        TableColumnModel tcm = jTable1.getColumnModel();
//        TableColumn kolona = tcm.getColumn(0);
//        kolona.setCellEditor(new DefaultCellEditor(kombo));
//        
//    }

}
