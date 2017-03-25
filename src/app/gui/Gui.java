/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Gui.java
 *
 * Created on 9-lug-2011, 11.18.14
 */

package app.gui;

import archive.system.AgenziaSystem;
import java.io.*;
import javax.swing.*;

public class Gui extends javax.swing.JFrame {
private final JFrame frame = new JFrame();
private AgenziaSystem agenzia;
    /** Creates new form Gui */
    public Gui()  {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMApri = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMGofferta = new javax.swing.JMenu();
        jMGOPacchetto = new javax.swing.JMenuItem();
        jMGOVoli = new javax.swing.JMenuItem();
        jMRprenotazione = new javax.swing.JMenu();
        jMRPPacchetto = new javax.swing.JMenuItem();
        jMRPVoli = new javax.swing.JMenuItem();
        jMGprenotazione = new javax.swing.JMenu();
        jMGPPacchetto = new javax.swing.JMenuItem();
        jMGPVoli = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jMenu1.setText("File");

        jMApri.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMApri.setText("Apri File");
        jMApri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMApriActionPerformed(evt);
            }
        });
        jMenu1.add(jMApri);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Agenzia");

        jMGofferta.setText("Gestione Offerta");
        jMGofferta.setEnabled(false);

        jMGOPacchetto.setText("Pacchetto");
        jMGOPacchetto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGOPacchettoActionPerformed(evt);
            }
        });
        jMGofferta.add(jMGOPacchetto);

        jMGOVoli.setText("Voli");
        jMGOVoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGOVoliActionPerformed(evt);
            }
        });
        jMGofferta.add(jMGOVoli);

        jMenu2.add(jMGofferta);

        jMRprenotazione.setText("Richiesta Prenotazione");
        jMRprenotazione.setEnabled(false);

        jMRPPacchetto.setText("Pacchetto");
        jMRPPacchetto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRPPacchettoActionPerformed(evt);
            }
        });
        jMRprenotazione.add(jMRPPacchetto);

        jMRPVoli.setText("Voli");
        jMRPVoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRPVoliActionPerformed(evt);
            }
        });
        jMRprenotazione.add(jMRPVoli);

        jMenu2.add(jMRprenotazione);

        jMGprenotazione.setText("Gestione Prenotazione");
        jMGprenotazione.setEnabled(false);

        jMGPPacchetto.setText("Pacchetto");
        jMGPPacchetto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGPPacchettoActionPerformed(evt);
            }
        });
        jMGprenotazione.add(jMGPPacchetto);

        jMGPVoli.setText("Voli");
        jMGPVoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGPVoliActionPerformed(evt);
            }
        });
        jMGprenotazione.add(jMGPVoli);

        jMenu2.add(jMGprenotazione);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private String FileChooser() throws IOException{
    JFileChooser chooser = new JFileChooser();
    chooser.setSelectedFile(new File(new File(".txt").getCanonicalPath()));
    chooser.showOpenDialog(frame);
    File curFile = chooser.getSelectedFile();
    String s = curFile.getName();
    if (!(s.substring(s.length() - 4)).equals(".txt")) JOptionPane.showMessageDialog(frame, curFile.getAbsolutePath(),"FILE NON VISUALIZZABILE",JOptionPane.INFORMATION_MESSAGE);
    frame.dispose();
    return curFile.getAbsolutePath();
}

    private void jMApriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMApriActionPerformed
        try {
            agenzia = new AgenziaSystem(FileChooser());
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {
        }
       jMApri.setEnabled(false);
       jMGofferta.setEnabled(true);
       jMRprenotazione.setEnabled(true);
       jMGprenotazione.setEnabled(true);

    }//GEN-LAST:event_jMApriActionPerformed

    private void jMGOPacchettoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGOPacchettoActionPerformed

        java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                new GOffertaP().setVisible(true);

            }
           });
    }//GEN-LAST:event_jMGOPacchettoActionPerformed

    private void jMGOVoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGOVoliActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GOffertaV().setVisible(true);
            }
        });
    }//GEN-LAST:event_jMGOVoliActionPerformed

    private void jMRPPacchettoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRPPacchettoActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RPrenotazioneP().setVisible(true);
            }
        });
    }//GEN-LAST:event_jMRPPacchettoActionPerformed

    private void jMRPVoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRPVoliActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RPrenotazioneV().setVisible(true);
            }
        });
    }//GEN-LAST:event_jMRPVoliActionPerformed

    private void jMGPPacchettoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGPPacchettoActionPerformed
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GPrenotazioneP().setVisible(true);
            }
        });
    }//GEN-LAST:event_jMGPPacchettoActionPerformed

    private void jMGPVoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGPVoliActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GPrenotazioneV().setVisible(true);
            }
        });
    }//GEN-LAST:event_jMGPVoliActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            if (agenzia!=null) agenzia.save();
        } catch (FileNotFoundException ex) {
        }
    }//GEN-LAST:event_formWindowClosing

    /**
    * @param args the command line arguments
    */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMApri;
    private javax.swing.JMenuItem jMGOPacchetto;
    private javax.swing.JMenuItem jMGOVoli;
    private javax.swing.JMenuItem jMGPPacchetto;
    private javax.swing.JMenuItem jMGPVoli;
    private javax.swing.JMenu jMGofferta;
    private javax.swing.JMenu jMGprenotazione;
    private javax.swing.JMenuItem jMRPPacchetto;
    private javax.swing.JMenuItem jMRPVoli;
    private javax.swing.JMenu jMRprenotazione;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables

}
