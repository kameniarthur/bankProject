
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author kameni-arthur
 */
public class FenetrePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FenetrePrincipal
     */
    public FenetrePrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Client = new javax.swing.JMenu();
        ajouterclient = new javax.swing.JMenuItem();
        listeclient = new javax.swing.JMenuItem();
        suppclient = new javax.swing.JMenuItem();
        Compte = new javax.swing.JMenu();
        ncompte = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        suppcompte = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        propos = new javax.swing.JMenuItem();
        quitter = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Deconnection");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Client.setText("client");

        ajouterclient.setText("Ajouter Un Client");
        ajouterclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterclientActionPerformed(evt);
            }
        });
        Client.add(ajouterclient);

        listeclient.setText("Liste De Client");
        listeclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listeclientActionPerformed(evt);
            }
        });
        Client.add(listeclient);

        suppclient.setText("Supprimer Un Client");
        suppclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppclientActionPerformed(evt);
            }
        });
        Client.add(suppclient);

        jMenuBar1.add(Client);

        Compte.setText("Compte");

        ncompte.setText("Nouveau Compte");
        ncompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ncompteActionPerformed(evt);
            }
        });
        Compte.add(ncompte);

        jMenuItem1.setText("Liste De Compte");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Compte.add(jMenuItem1);

        suppcompte.setText("Supprimer Un Compte");
        suppcompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppcompteActionPerformed(evt);
            }
        });
        Compte.add(suppcompte);

        jMenuBar1.add(Compte);

        jMenu5.setText("Aide");

        propos.setText("A Propos");
        jMenu5.add(propos);

        quitter.setText("Quitter");
        jMenu5.add(quitter);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(539, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(414, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listeclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listeclientActionPerformed
        // TODO add your handling code here:
      ListerClient nouvelleFenetre = new ListerClient();
        nouvelleFenetre.setVisible(true);
        
        
    }//GEN-LAST:event_listeclientActionPerformed

    private void ajouterclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterclientActionPerformed
        // TODO add your handling code here:
        AjouterClient nouvelleFenetre = new AjouterClient();
        nouvelleFenetre.setVisible(true);
        
        
    }//GEN-LAST:event_ajouterclientActionPerformed

    private void suppclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppclientActionPerformed
        // TODO add your handling code here:
        SupprimerClient nouvelleFenetre = new SupprimerClient();
        nouvelleFenetre.setVisible(true);
        
        
    }//GEN-LAST:event_suppclientActionPerformed

    private void ncompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ncompteActionPerformed
        // TODO add your handling code here:
        NouveauCompte nouvelleFenetre = new NouveauCompte();
        nouvelleFenetre.setVisible(true);
        
    }//GEN-LAST:event_ncompteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        ListerCOMPTE nouvelleFenetre = new ListerCOMPTE();
        nouvelleFenetre.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void suppcompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppcompteActionPerformed
        // TODO add your handling code here:
        SupprimerCompte nouvelleFenetre = new SupprimerCompte();
        nouvelleFenetre.setVisible(true);
    }//GEN-LAST:event_suppcompteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connexion nouvelleFenetre = new Connexion();
        nouvelleFenetre.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FenetrePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Client;
    private javax.swing.JMenu Compte;
    private javax.swing.JMenuItem ajouterclient;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JMenuItem listeclient;
    private javax.swing.JMenuItem ncompte;
    private javax.swing.JMenuItem propos;
    private javax.swing.JMenuItem quitter;
    private javax.swing.JMenuItem suppclient;
    private javax.swing.JMenuItem suppcompte;
    // End of variables declaration//GEN-END:variables
}