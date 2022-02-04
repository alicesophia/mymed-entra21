/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.CidadeDAO;
import dao.FarmaciaDAO;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Cidade;
import model.Farmacia;

/**
 *
 * @author Alice Sophia Koch
 * @author Allan Martins Da Silva
 * @author Mario Schwabe Filho
 *
 */
public class JFrameAlterarFarmacia extends javax.swing.JFrame {

    public Icon iconeAlerta = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/alerta.png")));
    public Icon iconeCerto = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/certo.png")));
    private int codigo = -1;

    /**
     * Creates new form JFrameAlterarFarmacia
     */
    public JFrameAlterarFarmacia(int codigoParaAlterar) {
        this();
        this.codigo = codigoParaAlterar;
        Farmacia farmacia = FarmaciaDAO.buscarFarmaciaPorId(codigo);
        JTextFieldNome.setText(farmacia.getNome());
        JTextFieldLogradouro.setText(farmacia.getLogradouro());
        JTextFieldTelefone.setText(farmacia.getTelefone());
        JTextFieldWebSite.setText(farmacia.getSite());
        selecionarCidade(farmacia.getCidade());
    }

    public JFrameAlterarFarmacia() {
        initComponents();
        popularCidade();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTextFieldNome = new javax.swing.JTextField();
        JTextFieldTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTextFieldWebSite = new javax.swing.JTextField();
        JComboBoxCidade = new javax.swing.JComboBox<>();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConcluir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTextFieldLogradouro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar farmácia");
        setResizable(false);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nova cidade");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Novo website");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/farmaciaAdicionar.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 28)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alterar Farmácia");

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonConcluir.setText("Concluir");
        jButtonConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConcluirActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Novo logradouro");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Novo nome");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Novo telefone");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTextFieldWebSite, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextFieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextFieldWebSite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextFieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonConcluir))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConcluirActionPerformed
        if (JComboBoxCidade.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Alguma cidade deve ser selecionado!!!", "Aviso de Alteração de Farmácia", JOptionPane.ERROR_MESSAGE, iconeAlerta);
            return;
        }
        if (JTextFieldNome.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Algum nome deve ser digitado!!!", "Aviso de Alteração de Farmácia", JOptionPane.ERROR_MESSAGE, iconeAlerta);
            return;
        }
        if (JTextFieldLogradouro.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Algum site deve ser digitado!!!", "Aviso de Alteração de Farmácia", JOptionPane.ERROR_MESSAGE, iconeAlerta);
        }
        if (JTextFieldTelefone.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Algum telefone deve ser digitado!!!", "Aviso de Alteração de Farmácia", JOptionPane.ERROR_MESSAGE, iconeAlerta);
        }
        if (codigo == -1) {
            Farmacia farmacia = new Farmacia();
            farmacia.setNome(JTextFieldNome.getText());
            farmacia.setCidade((Cidade) JComboBoxCidade.getSelectedItem());
            farmacia.setLogradouro(JTextFieldLogradouro.getText());
            farmacia.setSite(JTextFieldWebSite.getText());
            farmacia.setTelefone(JTextFieldTelefone.getText());
            farmacia.setId(FarmaciaDAO.inserir(farmacia));
            codigo = farmacia.getId();
            JOptionPane.showMessageDialog(null, "Farmácia foi inserida!!!", "Aviso de Alteração de Farmácia", JOptionPane.ERROR_MESSAGE, iconeCerto);
        } else {
            Farmacia farmacia = new Farmacia();
            farmacia.setId(codigo);
            farmacia.setNome(JTextFieldNome.getText());
            farmacia.setCidade((Cidade) JComboBoxCidade.getSelectedItem());
            farmacia.setLogradouro(JTextFieldLogradouro.getText());
            farmacia.setSite(JTextFieldWebSite.getText());
            farmacia.setTelefone(JTextFieldTelefone.getText());
            FarmaciaDAO.alterar(farmacia);
            JOptionPane.showMessageDialog(null, "Farmácia foi alterada!!!", "Aviso de Alteração de Farmácia", JOptionPane.ERROR_MESSAGE, iconeCerto);
            dispose();
        }
    }//GEN-LAST:event_jButtonConcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void popularCidade() {
        ArrayList<Cidade> cidades = (ArrayList) CidadeDAO.retornarCidadesSemLimite();
        for (Cidade cidade : cidades) {
            JComboBoxCidade.addItem(cidade);
        }
        JComboBoxCidade.setSelectedIndex(-1);
    }

    private void selecionarCidade(Cidade cidadeParaSelecionar) {
        int quantidadeRegistros = JComboBoxCidade.getItemCount();
        for (int i = 0; i < quantidadeRegistros; i++) {
            Cidade cidade = JComboBoxCidade.getItemAt(i);
            if (cidade.getNome().equals(cidadeParaSelecionar.getNome())) {
                JComboBoxCidade.setSelectedIndex(i);
                break;
            }
        }
    }

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
            java.util.logging.Logger.getLogger(JFrameAlterarFarmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAlterarFarmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAlterarFarmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAlterarFarmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAlterarFarmacia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Cidade> JComboBoxCidade;
    private javax.swing.JTextField JTextFieldLogradouro;
    private javax.swing.JTextField JTextFieldNome;
    private javax.swing.JTextField JTextFieldTelefone;
    private javax.swing.JTextField JTextFieldWebSite;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}