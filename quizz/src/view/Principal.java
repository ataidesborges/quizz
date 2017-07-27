/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPanel2 = new javax.swing.JPanel();
        pnl_principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuarq = new javax.swing.JMenu();
        mnicad = new javax.swing.JMenuItem();
        mnuopc = new javax.swing.JMenu();
        mnini = new javax.swing.JMenuItem();
        mnisair = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        pnl_principal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_principalLayout = new javax.swing.GroupLayout(pnl_principal);
        pnl_principal.setLayout(pnl_principalLayout);
        pnl_principalLayout.setHorizontalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        pnl_principalLayout.setVerticalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/b9527340bd8a94a4bcf07539a65ca336.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pnl_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 460, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pnl_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(148, 43, 181));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(100, 30));

        mnuarq.setBackground(new java.awt.Color(148, 43, 181));
        mnuarq.setForeground(new java.awt.Color(255, 255, 255));
        mnuarq.setText("Arquivo");

        mnicad.setBackground(new java.awt.Color(148, 43, 181));
        mnicad.setForeground(new java.awt.Color(255, 255, 255));
        mnicad.setText("Cadastrar Perguntas");
        mnicad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnicadActionPerformed(evt);
            }
        });
        mnuarq.add(mnicad);

        jMenuBar1.add(mnuarq);

        mnuopc.setBackground(new java.awt.Color(148, 43, 181));
        mnuopc.setForeground(new java.awt.Color(255, 255, 255));
        mnuopc.setText("Opções");

        mnini.setBackground(new java.awt.Color(148, 43, 181));
        mnini.setForeground(new java.awt.Color(255, 255, 255));
        mnini.setText("Iniciar");
        mnini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniniActionPerformed(evt);
            }
        });
        mnuopc.add(mnini);

        mnisair.setBackground(new java.awt.Color(148, 43, 181));
        mnisair.setForeground(new java.awt.Color(255, 255, 255));
        mnisair.setText("Sair");
        mnisair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnisairActionPerformed(evt);
            }
        });
        mnuopc.add(mnisair);

        jMenuBar1.add(mnuopc);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnisairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnisairActionPerformed
    this.dispose();
    }//GEN-LAST:event_mnisairActionPerformed

    private void mnicadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnicadActionPerformed
     Cadastro cad = new Cadastro();
     pnl_principal.removeAll();
     pnl_principal.add(cad);
     pnl_principal.updateUI();
        
    }//GEN-LAST:event_mnicadActionPerformed

    private void mniniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniniActionPerformed
    try {
            PerguntaShow show = new PerguntaShow();    
                pnl_principal.removeAll();
                pnl_principal.add(show);
                pnl_principal.updateUI(); 
        
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mniniActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JMenuItem mnicad;
    private javax.swing.JMenuItem mnini;
    private javax.swing.JMenuItem mnisair;
    private javax.swing.JMenu mnuarq;
    private javax.swing.JMenu mnuopc;
    private javax.swing.JPanel pnl_principal;
    // End of variables declaration//GEN-END:variables
}
