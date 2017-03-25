/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DatiCliente.java
 *
 * Created on 9-lug-2011, 20.17.46
 */

package app.gui;

import archive.data.Carta;
import archive.data.Cliente;
import archive.interfacce.RichiestaPrenotazionePacchetto;
import archive.system.AgenziaSystem;
import archive.system.PRequestPacchettoManager;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;

public class DatiClienteP extends javax.swing.JFrame {

    /** Creates new form DatiCliente */
    public DatiClienteP() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTFCognome = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jTFTel = new javax.swing.JTextField();
        jTFTCarta = new javax.swing.JTextField();
        jTFNCarta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCmBTipo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jCBE = new javax.swing.JCheckBox();
        jCBB = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jCBV = new javax.swing.JCheckBox();
        jCBS = new javax.swing.JCheckBox();
        jCBT = new javax.swing.JCheckBox();
        jBPrenota = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jTFCognome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFCognomeKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 95;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(52, 4, 0, 0);
        getContentPane().add(jTFCognome, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 95;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        getContentPane().add(jTFNome, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 95;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        getContentPane().add(jTFTel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 95;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 0, 0);
        getContentPane().add(jTFTCarta, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 95;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 0, 0);
        getContentPane().add(jTFNCarta, gridBagConstraints);

        jLabel1.setText("Cognome Cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(55, 95, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setText("Nome Cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 109, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Numero di Telefono");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 85, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setText("Tipo Carta di Credito");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 79, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setText("Numero Carta di Credito");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 56, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

        jCmBTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "D", "S" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        getContentPane().add(jCmBTipo, gridBagConstraints);

        jLabel6.setText("Tipo Stanza");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 108, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        jCBE.setText("E");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 1, 0, 0);
        getContentPane().add(jCBE, gridBagConstraints);

        jCBB.setText("B");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 19;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        getContentPane().add(jCBB, gridBagConstraints);

        jLabel7.setText("Corsi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 108, 0, 0);
        getContentPane().add(jLabel7, gridBagConstraints);

        jCBV.setText("V");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 4, 0, 0);
        getContentPane().add(jCBV, gridBagConstraints);

        jCBS.setText("S");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        getContentPane().add(jCBS, gridBagConstraints);

        jCBT.setText("T");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 2, 0, 0);
        getContentPane().add(jCBT, gridBagConstraints);

        jBPrenota.setText("Prenota");
        jBPrenota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPrenotaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 16, 18, 70);
        getContentPane().add(jBPrenota, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPrenotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrenotaActionPerformed
          PRequestPacchettoManager rPren= new PRequestPacchettoManager();
          String cognome=jTFCognome.getText();
          String nome=jTFNome.getText();
          String telefono=jTFTel.getText();
          String carta=jTFTCarta.getText()+jTFNCarta.getText();
          String tipo=(String) jCmBTipo.getSelectedItem();
          String corsi="";
          if(jCBV.isSelected()) corsi+="V";
          if(jCBE.isSelected()) corsi+="E";
          if(jCBT.isSelected()) corsi+="T";
          if(jCBS.isSelected()) corsi+="S";
          if(jCBB.isSelected()) corsi+="B";
          rPren.isAvaible(RPrenotazioneP.getNsett(),RPrenotazioneP.getNomeVillaggio());
          rPren.setNomeVillaggio(RPrenotazioneP.getNomeVillaggio());
         try{
          if(rPren.doPrenotation(RPrenotazioneP.getNsett(), cognome, nome, telefono, new Carta(carta), tipo, corsi)){
              JOptionPane.showMessageDialog(rootPane, "Prenotazione effetuata");
          }
        }catch(NoSuchElementException e){
            int showConfirmDialog = JOptionPane.showConfirmDialog(rootPane, "Stanze doppie non disponibili vuoi aggiungere in lista di attessa?", "", JOptionPane.YES_NO_OPTION);
            if(showConfirmDialog==0){
                 rPren.setNomeVillaggio(RPrenotazioneP.getNomeVillaggio());
                if (rPren.addInListaAttesa(RPrenotazioneP.getNsett(), cognome)){
                    JOptionPane.showMessageDialog(rootPane, "Aggiunto in lista di attessa");
                }else
                    JOptionPane.showMessageDialog(rootPane, "Non aggiunto in lista di attessa (il cliente potrebbe essere gia presente)");
            }
        }catch(IllegalArgumentException ex){
           JOptionPane.showMessageDialog(rootPane, "Carta non Valida","",JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jBPrenotaActionPerformed

    private void jTFCognomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCognomeKeyReleased
        Cliente cliente = AgenziaSystem.archivio.getCliente(jTFCognome.getText());
        if(cliente!=null){
            jTFNome.setText(cliente.getNome());
            jTFTel.setText(cliente.getTelefono());
            jTFTCarta.setText(cliente.getCarta().getTipo());
            jTFNCarta.setText(cliente.getCarta().getNumero());

        }
    }//GEN-LAST:event_jTFCognomeKeyReleased

    /**
    * @param args the command line arguments
    */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPrenota;
    private javax.swing.JCheckBox jCBB;
    private javax.swing.JCheckBox jCBE;
    private javax.swing.JCheckBox jCBS;
    private javax.swing.JCheckBox jCBT;
    private javax.swing.JCheckBox jCBV;
    private javax.swing.JComboBox jCmBTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTFCognome;
    private javax.swing.JTextField jTFNCarta;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFTCarta;
    private javax.swing.JTextField jTFTel;
    // End of variables declaration//GEN-END:variables

}
