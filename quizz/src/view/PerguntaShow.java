package view;

import dao.Perguntadao;
import dao.Respostadao;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import model.Pergunta;
import model.Resposta;

public class PerguntaShow extends javax.swing.JInternalFrame {
   Perguntadao perguntaDao;
   Respostadao respostaDao;
   List<Pergunta> listaPergunta;
   List<Resposta> listaResposta;
   int contador = 0;
   
   
    public PerguntaShow() throws SQLException {
        perguntaDao = new Perguntadao();
        respostaDao = new Respostadao();
        initComponents();
        this.setVisible(true);
        listaPergunta = perguntaDao.ListaPergunta();
        lbl_pgt.setText(listaPergunta.get(contador).getDescricao());
        listaResposta = respostaDao.Listaquiz(listaPergunta.get(contador).getId());
        rb1.setText(listaResposta.get(0).getDescricao());
        rb1.setText(listaResposta.get(1).getDescricao());
        rb1.setText(listaResposta.get(2).getDescricao());
        rb1.setText(listaResposta.get(3).getDescricao());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupbt1 = new javax.swing.ButtonGroup();
        pnl_perg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rb2 = new javax.swing.JRadioButton();
        rb1 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        btcorrigir = new javax.swing.JButton();
        btproximo = new javax.swing.JButton();
        lbl_pgt = new javax.swing.JLabel();
        lbl_resposta = new javax.swing.JLabel();

        setBorder(null);

        pnl_perg.setBackground(new java.awt.Color(255, 255, 255));
        pnl_perg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 165, 249), 1, true));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        jLabel1.setText("Pergunta:");

        rb2.setBackground(new java.awt.Color(255, 255, 255));
        grupbt1.add(rb2);
        rb2.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        rb2.setForeground(new java.awt.Color(148, 43, 181));

        rb1.setBackground(new java.awt.Color(255, 255, 255));
        grupbt1.add(rb1);
        rb1.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        rb1.setForeground(new java.awt.Color(148, 43, 181));

        rb4.setBackground(new java.awt.Color(255, 255, 255));
        grupbt1.add(rb4);
        rb4.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        rb4.setForeground(new java.awt.Color(148, 43, 181));

        rb3.setBackground(new java.awt.Color(255, 255, 255));
        grupbt1.add(rb3);
        rb3.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        rb3.setForeground(new java.awt.Color(148, 43, 181));

        btcorrigir.setBackground(new java.awt.Color(148, 43, 181));
        btcorrigir.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        btcorrigir.setForeground(new java.awt.Color(255, 255, 255));
        btcorrigir.setText("Corrigir");
        btcorrigir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 127, 194)));
        btcorrigir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcorrigirActionPerformed(evt);
            }
        });

        btproximo.setBackground(new java.awt.Color(148, 43, 181));
        btproximo.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        btproximo.setForeground(new java.awt.Color(255, 255, 255));
        btproximo.setText("Próximo");
        btproximo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 127, 194)));
        btproximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btproximoActionPerformed(evt);
            }
        });

        lbl_pgt.setBackground(new java.awt.Color(255, 255, 255));
        lbl_pgt.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        lbl_pgt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnl_pergLayout = new javax.swing.GroupLayout(pnl_perg);
        pnl_perg.setLayout(pnl_pergLayout);
        pnl_pergLayout.setHorizontalGroup(
            pnl_pergLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_pergLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(lbl_resposta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btcorrigir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btproximo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(pnl_pergLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(pnl_pergLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_pgt, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb4)
                    .addComponent(rb2)
                    .addComponent(jLabel1)
                    .addComponent(rb3)
                    .addComponent(rb1))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        pnl_pergLayout.setVerticalGroup(
            pnl_pergLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pergLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_pgt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(rb1)
                .addGap(30, 30, 30)
                .addComponent(rb2)
                .addGap(30, 30, 30)
                .addComponent(rb3)
                .addGap(30, 30, 30)
                .addComponent(rb4)
                .addGap(83, 83, 83)
                .addGroup(pnl_pergLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btcorrigir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btproximo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_resposta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_perg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_perg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcorrigirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcorrigirActionPerformed
if (rb1.isSelected()){
    if(listaPergunta.get(contador).getResposta_certa() == listaResposta.get(0).getId()){
        lbl_resposta.setText("Acertou");
    } else {
        JOptionPane.showMessageDialog(null, listaPergunta.get(contador).getComentario());
    }
}
if (rb2.isSelected()){
    if(listaPergunta.get(contador).getResposta_certa() == listaResposta.get(1).getId()){
        lbl_resposta.setText("Acertou");
    } else {
        JOptionPane.showMessageDialog(null, listaPergunta.get(contador).getComentario());
    }
}
if (rb3.isSelected()){
    if(listaPergunta.get(contador).getResposta_certa() == listaResposta.get(2).getId()){
        lbl_resposta.setText("Acertou");
    } else {
        JOptionPane.showMessageDialog(null, listaPergunta.get(contador).getComentario());
    }
}
if (rb4.isSelected()){
    if(listaPergunta.get(contador).getResposta_certa() == listaResposta.get(3).getId()){
        lbl_resposta.setText("Acertou");
    } else {
        JOptionPane.showMessageDialog(null, listaPergunta.get(contador).getComentario());
    }
}
    }//GEN-LAST:event_btcorrigirActionPerformed

    private void btproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btproximoActionPerformed
        lbl_resposta.setText("");
        grupbt1.clearSelection();
        contador = contador + 1;
        if (listaPergunta.size() > contador){

                lbl_pgt.setText(listaPergunta.get(contador).getDescricao());
            try {
                listaResposta = respostaDao.Listaquiz(listaPergunta.get(contador).getId());
                rb1.setText(listaResposta.get(0).getDescricao());
                rb2.setText(listaResposta.get(1).getDescricao());
                rb3.setText(listaResposta.get(2).getDescricao());
                rb4.setText(listaResposta.get(3).getDescricao());                

            } catch (SQLException ex) {
                Logger.getLogger(PerguntaShow.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else {
            JOptionPane.showMessageDialog(null,"Fim das Questões");
            btproximo.setEnabled(false);
        }
    }//GEN-LAST:event_btproximoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcorrigir;
    private javax.swing.JButton btproximo;
    private javax.swing.ButtonGroup grupbt1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_pgt;
    private javax.swing.JLabel lbl_resposta;
    private javax.swing.JPanel pnl_perg;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    // End of variables declaration//GEN-END:variables

}
