/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.CidadeDAO;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Cidade;

/**
 *
 * @author Alice Sophia Koch
 */
public class JFrameGerenciamentoCidades extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public JFrameGerenciamentoCidades() {
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

        Tabela = new javax.swing.JScrollPane();
        TabelaCidades = new javax.swing.JTable();
        JButtonExcluir = new javax.swing.JButton();
        JButtonEditar = new javax.swing.JButton();
        JButtonAdicionar = new javax.swing.JButton();
        JButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de cidades");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        TabelaCidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome cidade", "Nome país"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaCidades.setToolTipText("");
        TabelaCidades.getTableHeader().setReorderingAllowed(false);
        Tabela.setViewportView(TabelaCidades);
        if (TabelaCidades.getColumnModel().getColumnCount() > 0) {
            TabelaCidades.getColumnModel().getColumn(0).setMinWidth(75);
            TabelaCidades.getColumnModel().getColumn(0).setPreferredWidth(75);
            TabelaCidades.getColumnModel().getColumn(0).setMaxWidth(75);
            TabelaCidades.getColumnModel().getColumn(1).setResizable(false);
            TabelaCidades.getColumnModel().getColumn(2).setResizable(false);
        }
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(DefaultTableCellRenderer.LEFT);
        TabelaCidades.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);

        JButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir.png"))); // NOI18N
        JButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonExcluirActionPerformed(evt);
            }
        });

        JButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/editar.png"))); // NOI18N
        JButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonEditarActionPerformed(evt);
            }
        });

        JButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/adicionar.png"))); // NOI18N
        JButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAdicionarActionPerformed(evt);
            }
        });

        JButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/voltar.png"))); // NOI18N
        JButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(JButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addComponent(Tabela, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonExcluirActionPerformed
        if (TabelaCidades.getSelectedRow() > -1) {
            int linhaSelecionada = TabelaCidades.getSelectedRow();
            int codigoParaExcluir = Integer.parseInt(TabelaCidades.getValueAt(linhaSelecionada, 0).toString());
            DefaultTableModel dtm = (DefaultTableModel) TabelaCidades.getModel();
            CidadeDAO.excluir(codigoParaExcluir);
            dtm.removeRow(linhaSelecionada);
        } else {
            Icon icone = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/alerta.png")));
            JOptionPane.showMessageDialog(null, "Não foi selecionado nenhum item da tabela!", "Aviso", JOptionPane.ERROR_MESSAGE, icone);
        }
    }//GEN-LAST:event_JButtonExcluirActionPerformed

    private void JButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonEditarActionPerformed
        if (TabelaCidades.getSelectedRow() > -1) {
            int linhaSelecionada = TabelaCidades.getSelectedRow();
            int codigoParaAlterar = Integer.parseInt(TabelaCidades.getValueAt(linhaSelecionada, 0).toString());
            JFrameAlterarCidade alterar = new JFrameAlterarCidade(codigoParaAlterar);
            alterar.setVisible(true);
        } else {
            Icon icone = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/alerta.png")));
            JOptionPane.showMessageDialog(null, "Não foi selecionado nenhum item da tabela!", "Aviso", JOptionPane.ERROR_MESSAGE, icone);
        }
    }//GEN-LAST:event_JButtonEditarActionPerformed

    private void JButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAdicionarActionPerformed
        JFrameCadastroCidade frame = new JFrameCadastroCidade();
        frame.setVisible(true);
    }//GEN-LAST:event_JButtonAdicionarActionPerformed

    private void JButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_JButtonVoltarActionPerformed

    private int u = 0;
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarDados();
    }//GEN-LAST:event_formWindowActivated

    private void listarDados() {
        ArrayList<Cidade> cidades = (ArrayList<Cidade>) CidadeDAO.retornarCidades();
        DefaultTableModel dtm = (DefaultTableModel) TabelaCidades.getModel();
        dtm.setRowCount(0);
        for (int i = 0; i < cidades.size(); i++) {
            Cidade cidade = cidades.get(i);
            dtm.addRow(new Object[]{
                cidade.getId(),
                cidade.getNome(),
                cidade.getPais().getNome()
            });
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
            java.util.logging.Logger.getLogger(JFrameGerenciamentoCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGerenciamentoCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGerenciamentoCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGerenciamentoCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameGerenciamentoCidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAdicionar;
    private javax.swing.JButton JButtonEditar;
    private javax.swing.JButton JButtonExcluir;
    private javax.swing.JButton JButtonVoltar;
    private javax.swing.JScrollPane Tabela;
    private javax.swing.JTable TabelaCidades;
    // End of variables declaration//GEN-END:variables
}
