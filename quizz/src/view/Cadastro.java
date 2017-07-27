package view;


import dao.Perguntadao;
import dao.Respostadao;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Pergunta;
import model.Resposta;

public class Cadastro extends javax.swing.JInternalFrame {

    Pergunta pergunta;
    Resposta resposta;
    Perguntadao perguntaDao;
    Respostadao respostaDao;
    List<Resposta> listaRespostas;

    public Cadastro() {
        perguntaDao = new Perguntadao();
        respostaDao = new Respostadao();
        listaRespostas = new ArrayList<Resposta>();
        initComponents();
        this.setVisible(true);
        atualizaTabelaResposta();
        desativacampos();
        
    }
    public void atualizaTabelaResposta(){
        resposta = new Resposta();
        try {
                listaRespostas = respostaDao.ListaResposta();
        } catch (Exception ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String dados[][] = new String[listaRespostas.size()][2];
        int i = 0;
        for(Resposta resposta : listaRespostas){
            dados[i][0] = String.valueOf(resposta.getId());
            dados[i][1] = resposta.getDescricao();
            
            i++;
        }
    String tituloColuna[] = {"ID Resposta", "Resposta"};
    DefaultTableModel tabelaresposta = new DefaultTableModel();
    tabelaresposta.setDataVector(dados, tituloColuna);
    tblResposta.setModel(new DefaultTableModel(dados,tituloColuna){
            boolean[] canEdit = new boolean[]{
                false,false
            };
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return canEdit[columnIndex];
            }
    });
    tblResposta.getColumnModel().getColumn(0).setPreferredWidth(100);
    tblResposta.getColumnModel().getColumn(1).setPreferredWidth(400);
    
    DefaultTableCellRenderer Centro = new DefaultTableCellRenderer();
    Centro.setHorizontalAlignment(SwingConstants.CENTER);
    tblResposta.getColumnModel().getColumn(0).setCellRenderer(Centro);
    
    tblResposta.setRowHeight(25);
    tblResposta.updateUI();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_cad = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_idpgt = new javax.swing.JTextField();
        txt_comentpgt = new javax.swing.JTextField();
        txt_descripgt = new javax.swing.JTextField();
        txt_respcert = new javax.swing.JTextField();
        bnovo_pgt = new javax.swing.JButton();
        bsalvar_pgt = new javax.swing.JButton();
        bcancel_pgt = new javax.swing.JButton();
        bexcluir_pgt = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_idresp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_descriresp = new javax.swing.JTextField();
        bnovo_resp = new javax.swing.JButton();
        bsalvar_resp = new javax.swing.JButton();
        bcancel_resp = new javax.swing.JButton();
        bexcluir_resp = new javax.swing.JButton();
        bdefine = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResposta = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(148, 43, 181), 1, true));
        setClosable(true);
        setVisible(true);

        pnl_cad.setBackground(new java.awt.Color(255, 255, 255));
        pnl_cad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(148, 43, 181), 1, true));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        jLabel2.setText("Comentário");

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        jLabel3.setText("Resposta Certa ");

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        jLabel4.setText("Descrição");

        bnovo_pgt.setBackground(new java.awt.Color(148, 43, 181));
        bnovo_pgt.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        bnovo_pgt.setForeground(new java.awt.Color(255, 255, 255));
        bnovo_pgt.setText("Novo");
        bnovo_pgt.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 0, 51), new java.awt.Color(153, 0, 153)));
        bnovo_pgt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnovo_pgtActionPerformed(evt);
            }
        });

        bsalvar_pgt.setBackground(new java.awt.Color(148, 43, 181));
        bsalvar_pgt.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        bsalvar_pgt.setForeground(new java.awt.Color(255, 255, 255));
        bsalvar_pgt.setText("Salvar");
        bsalvar_pgt.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 0, 51), new java.awt.Color(153, 0, 153)));
        bsalvar_pgt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalvar_pgtActionPerformed(evt);
            }
        });

        bcancel_pgt.setBackground(new java.awt.Color(148, 43, 181));
        bcancel_pgt.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        bcancel_pgt.setForeground(new java.awt.Color(255, 255, 255));
        bcancel_pgt.setText("Cancelar");
        bcancel_pgt.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 0, 51), new java.awt.Color(153, 0, 153)));
        bcancel_pgt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancel_pgtActionPerformed(evt);
            }
        });

        bexcluir_pgt.setBackground(new java.awt.Color(148, 43, 181));
        bexcluir_pgt.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        bexcluir_pgt.setForeground(new java.awt.Color(255, 255, 255));
        bexcluir_pgt.setText("Excluir");
        bexcluir_pgt.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 0, 51), new java.awt.Color(153, 0, 153)));

        javax.swing.GroupLayout pnl_cadLayout = new javax.swing.GroupLayout(pnl_cad);
        pnl_cad.setLayout(pnl_cadLayout);
        pnl_cadLayout.setHorizontalGroup(
            pnl_cadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_cadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_cadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_cadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnl_cadLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_idpgt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_descripgt))
                        .addGroup(pnl_cadLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_comentpgt, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_cadLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_respcert, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_cadLayout.createSequentialGroup()
                        .addComponent(bnovo_pgt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(bsalvar_pgt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(bcancel_pgt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(bexcluir_pgt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_cadLayout.setVerticalGroup(
            pnl_cadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_cadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(txt_idpgt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_descripgt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnl_cadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_comentpgt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_cadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_respcert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnl_cadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnovo_pgt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsalvar_pgt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcancel_pgt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bexcluir_pgt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(148, 43, 181), 1, true));

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        jLabel5.setText("ID");

        txt_idresp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idrespActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        jLabel6.setText("Descrição");

        bnovo_resp.setBackground(new java.awt.Color(148, 43, 181));
        bnovo_resp.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        bnovo_resp.setForeground(new java.awt.Color(255, 255, 255));
        bnovo_resp.setText("Novo");
        bnovo_resp.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 0, 51), new java.awt.Color(153, 0, 153)));
        bnovo_resp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnovo_respActionPerformed(evt);
            }
        });

        bsalvar_resp.setBackground(new java.awt.Color(148, 43, 181));
        bsalvar_resp.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        bsalvar_resp.setForeground(new java.awt.Color(255, 255, 255));
        bsalvar_resp.setText("Salvar");
        bsalvar_resp.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 0, 51), new java.awt.Color(153, 0, 153)));
        bsalvar_resp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalvar_respActionPerformed(evt);
            }
        });

        bcancel_resp.setBackground(new java.awt.Color(148, 43, 181));
        bcancel_resp.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        bcancel_resp.setForeground(new java.awt.Color(255, 255, 255));
        bcancel_resp.setText("Cancelar");
        bcancel_resp.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 0, 51), new java.awt.Color(153, 0, 153)));
        bcancel_resp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancel_respActionPerformed(evt);
            }
        });

        bexcluir_resp.setBackground(new java.awt.Color(148, 43, 181));
        bexcluir_resp.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        bexcluir_resp.setForeground(new java.awt.Color(255, 255, 255));
        bexcluir_resp.setText("Excluir");
        bexcluir_resp.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 0, 51), new java.awt.Color(153, 0, 153)));

        bdefine.setBackground(new java.awt.Color(148, 43, 181));
        bdefine.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        bdefine.setForeground(new java.awt.Color(255, 255, 255));
        bdefine.setText("Definir Resposta Correta");
        bdefine.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 0, 51), new java.awt.Color(153, 0, 153)));
        bdefine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdefineActionPerformed(evt);
            }
        });

        tblResposta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblResposta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_idresp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_descriresp, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bnovo_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(bsalvar_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(bcancel_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(bexcluir_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bdefine, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txt_idresp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_descriresp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnovo_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bexcluir_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcancel_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsalvar_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bdefine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_cad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idrespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idrespActionPerformed
     
    }//GEN-LAST:event_txt_idrespActionPerformed

    private void bcancel_respActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancel_respActionPerformed
     limpacampos_resp();
    }//GEN-LAST:event_bcancel_respActionPerformed

    private void bdefineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdefineActionPerformed
       
    }//GEN-LAST:event_bdefineActionPerformed

    private void bsalvar_respActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalvar_respActionPerformed
        resposta.setDescricao(txt_descriresp.getText());
        resposta.setId_pergunta(Integer.parseInt(txt_idpgt.getText()));
        try{
            txt_idresp.setText(String.valueOf(respostaDao.salvar(resposta)));
            JOptionPane.showMessageDialog(null, "Gravado com Sucesso");
        } catch (SQLException ex){
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        atualizaTabelaResposta();
        desativacampos();
    }//GEN-LAST:event_bsalvar_respActionPerformed

    private void bcancel_pgtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancel_pgtActionPerformed
    limpacampos_pgt();
    }//GEN-LAST:event_bcancel_pgtActionPerformed

    private void bsalvar_pgtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalvar_pgtActionPerformed
        pergunta = new Pergunta();
        pergunta.setDescricao(txt_descripgt.getText());
        pergunta.setComentario(txt_comentpgt.getText());
        try{
            txt_idpgt.setText(String.valueOf(perguntaDao.salvar(pergunta)));
            JOptionPane.showMessageDialog(null, "Gravado com Sucesso");
        } catch (SQLException ex){
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        atualizaTabelaResposta();
    }//GEN-LAST:event_bsalvar_pgtActionPerformed

    private void bnovo_pgtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnovo_pgtActionPerformed
        ativacampos_pgt();
        limpacampos_pgt();
        atualizaTabelaResposta();
    }//GEN-LAST:event_bnovo_pgtActionPerformed

    private void bnovo_respActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnovo_respActionPerformed
        ativacampos_resp();
        limpacampos_resp();
        atualizaTabelaResposta();
    }//GEN-LAST:event_bnovo_respActionPerformed
    
    public void desativacampos(){
        txt_idpgt.setEnabled(false);
        txt_descripgt.setEnabled(false);
        txt_comentpgt.setEnabled(false);
        txt_descriresp.setEnabled(false);
        txt_idresp.setEnabled(false);
        txt_respcert.setEnabled(false);
    }
    
    public void ativacampos_pgt(){
        txt_descripgt.setEnabled(true);
        txt_comentpgt.setEnabled(true);
        
    }
    public void ativacampos_resp(){
        txt_descriresp.setEnabled(true);
        txt_idresp.setEnabled(true);
    }
    public void limpacampos_pgt(){
        txt_descripgt.setText("");
        txt_comentpgt.setText("");
    }
    public void limpacampos_resp(){
        txt_descriresp.setText("");
        txt_idresp.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcancel_pgt;
    private javax.swing.JButton bcancel_resp;
    private javax.swing.JButton bdefine;
    private javax.swing.JButton bexcluir_pgt;
    private javax.swing.JButton bexcluir_resp;
    private javax.swing.JButton bnovo_pgt;
    private javax.swing.JButton bnovo_resp;
    private javax.swing.JButton bsalvar_pgt;
    private javax.swing.JButton bsalvar_resp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnl_cad;
    private javax.swing.JTable tblResposta;
    private javax.swing.JTextField txt_comentpgt;
    private javax.swing.JTextField txt_descripgt;
    private javax.swing.JTextField txt_descriresp;
    private javax.swing.JTextField txt_idpgt;
    private javax.swing.JTextField txt_idresp;
    private javax.swing.JTextField txt_respcert;
    // End of variables declaration//GEN-END:variables
}
