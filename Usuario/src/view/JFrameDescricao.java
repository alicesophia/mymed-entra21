/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.FavoritosDAOUser;
import dao.MedicamentoDAOUser;
import model.FavoritoUser;
import model.MedicamentoUser;
import model.UsuarioUser;

/**
 *
 * @author 97897
 */
public class JFrameDescricao extends javax.swing.JFrame {
    public static int idDoRemedio = 0;
    public static UsuarioUser usuario;
    private int codigo = -1;

    public JFrameDescricao(int codigoParaDescricao) {
        this();
        this.codigo = codigoParaDescricao;
        MedicamentoUser medicamento = MedicamentoDAOUser.buscarMedicamentoPorId(codigo);
        JTextFieldNome.setText(medicamento.getNome());
        JTextAreaContraindicacoes.setText(medicamento.getContraIndicacoes());
        JTextAreaPraQServe.setText(medicamento.getParaQServe());
        JTextAreaArmazenamento.setText(medicamento.getArmazenamento());
        JTextFieldPreco.setText(String.valueOf(medicamento.getPreco()));
        jLabelId.setText(String.valueOf(medicamento.getId()));
    }

    /**
     * Creates new form JFrameDescricao
     */
    public JFrameDescricao() {
        initComponents();
        if (usuario == null) {
            jLabelId.setVisible(false);
        } else {
            jLabelId.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        JTextAreaPraQServe = new javax.swing.JTextArea();
        JButtonOndeEncontrar = new javax.swing.JButton();
        JTextFieldNome = new javax.swing.JTextField();
        JLabelContraindicacoes = new javax.swing.JLabel();
        JButtonVoltar = new javax.swing.JButton();
        JLabelPraQServe = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JLabelArmazenamento = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        JTextAreaArmazenamento = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        JTextFieldPreco = new javax.swing.JTextField();
        JLabelNome = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        JTextAreaContraindicacoes = new javax.swing.JTextArea();
        jLabelId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Descri????o do medicamento");
        setResizable(false);

        JTextAreaPraQServe.setEditable(false);
        JTextAreaPraQServe.setColumns(20);
        JTextAreaPraQServe.setLineWrap(true);
        JTextAreaPraQServe.setRows(5);
        jScrollPane2.setViewportView(JTextAreaPraQServe);

        JButtonOndeEncontrar.setBackground(new java.awt.Color(122, 187, 255));
        JButtonOndeEncontrar.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        JButtonOndeEncontrar.setText("Onde encontrar?");
        JButtonOndeEncontrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonOndeEncontrarActionPerformed(evt);
            }
        });

        JTextFieldNome.setEditable(false);

        JLabelContraindicacoes.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        JLabelContraindicacoes.setText("Contraindica????es");

        JButtonVoltar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        JButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Voltar64x64.png"))); // NOI18N
        JButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonVoltarActionPerformed(evt);
            }
        });

        JLabelPraQServe.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        JLabelPraQServe.setText("Para que serve");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/medico2.png"))); // NOI18N

        JLabelArmazenamento.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        JLabelArmazenamento.setText("Armazenamento");

        JTextAreaArmazenamento.setEditable(false);
        JTextAreaArmazenamento.setColumns(20);
        JTextAreaArmazenamento.setLineWrap(true);
        JTextAreaArmazenamento.setRows(5);
        jScrollPane8.setViewportView(JTextAreaArmazenamento);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pre??o");

        JTextFieldPreco.setEditable(false);

        JLabelNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        JLabelNome.setText("Nome comercial");

        JTextAreaContraindicacoes.setEditable(false);
        JTextAreaContraindicacoes.setColumns(20);
        JTextAreaContraindicacoes.setLineWrap(true);
        JTextAreaContraindicacoes.setRows(5);
        jScrollPane6.setViewportView(JTextAreaContraindicacoes);

        jLabelId.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLabelPraQServe)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JLabelArmazenamento)
                                        .addGap(0, 159, Short.MAX_VALUE))
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JLabelNome)
                                    .addComponent(JTextFieldNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLabelContraindicacoes)
                                    .addComponent(jScrollPane6))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(118, 118, 118))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(83, 83, 83))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JButtonOndeEncontrar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabelId)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabelId)
                        .addGap(46, 46, 46)
                        .addComponent(JLabelContraindicacoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLabelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JLabelPraQServe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JLabelArmazenamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JButtonOndeEncontrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        JTextFieldPreco.setEditable(false);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonOndeEncontrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonOndeEncontrarActionPerformed
        //dispose();
        JFrameProcurarCidade cidade = new JFrameProcurarCidade();
        cidade.setVisible(true);
    }//GEN-LAST:event_JButtonOndeEncontrarActionPerformed

    private void JButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_JButtonVoltarActionPerformed
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
            java.util.logging.Logger.getLogger(JFrameDescricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameDescricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameDescricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameDescricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameDescricao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonOndeEncontrar;
    private javax.swing.JButton JButtonVoltar;
    private javax.swing.JLabel JLabelArmazenamento;
    private javax.swing.JLabel JLabelContraindicacoes;
    private javax.swing.JLabel JLabelNome;
    private javax.swing.JLabel JLabelPraQServe;
    private javax.swing.JTextArea JTextAreaArmazenamento;
    private javax.swing.JTextArea JTextAreaContraindicacoes;
    private javax.swing.JTextArea JTextAreaPraQServe;
    private javax.swing.JTextField JTextFieldNome;
    private javax.swing.JTextField JTextFieldPreco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    // End of variables declaration//GEN-END:variables
}
