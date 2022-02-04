/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.PaisDAO;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Pais;

/**
 *
 * @author Alice Sophia Koch
 */
public class JFrameGerenciamentoPaises extends javax.swing.JFrame {

    /**
     * Creates new form JFramePaises
     */
    public JFrameGerenciamentoPaises() {
        initComponents();
        /*JFrameGerenciamentoPaises jframe = new JFrameGerenciamentoPaises();
        Color minhaCor = new Color(184, 242, 215);
        getContentPane().setBackground(minhaCor);
        jframe.getContentPane().setBackground(minhaCor);*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JButtonEditar = new javax.swing.JButton();
        JButtonExcluir = new javax.swing.JButton();
        JButtonAdicionar = new javax.swing.JButton();
        JButtonVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaPaises = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de países");
        setLocationByPlatform(true);
        setName("JFrame1"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        JButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/editar.png"))); // NOI18N
        JButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonEditarActionPerformed(evt);
            }
        });

        JButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir.png"))); // NOI18N
        JButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonExcluirActionPerformed(evt);
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

        TabelaPaises.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sigla"
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
        jScrollPane1.setViewportView(TabelaPaises);
        if (TabelaPaises.getColumnModel().getColumnCount() > 0) {
            TabelaPaises.getColumnModel().getColumn(0).setMinWidth(75);
            TabelaPaises.getColumnModel().getColumn(0).setPreferredWidth(75);
            TabelaPaises.getColumnModel().getColumn(0).setMaxWidth(75);
            TabelaPaises.getColumnModel().getColumn(2).setMinWidth(150);
            TabelaPaises.getColumnModel().getColumn(2).setPreferredWidth(150);
            TabelaPaises.getColumnModel().getColumn(2).setMaxWidth(150);
        }
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(DefaultTableCellRenderer.LEFT);
        TabelaPaises.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
        listarDados();

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
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAdicionarActionPerformed
        JFrameCadastroPais pais = new JFrameCadastroPais();
        pais.setVisible(true);
    }//GEN-LAST:event_JButtonAdicionarActionPerformed

    private void JButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_JButtonVoltarActionPerformed

    private void JButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonEditarActionPerformed
        if (TabelaPaises.getSelectedRow() > -1) {
            int linhaSelecionada = TabelaPaises.getSelectedRow();
            int codigoParaAlterar = Integer.parseInt(TabelaPaises.getValueAt(linhaSelecionada, 0).toString());
            JFrameAlterarPais alterar = new JFrameAlterarPais(codigoParaAlterar);
            alterar.setVisible(true);
        } else {
            Icon icone = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/alerta.png")));
            JOptionPane.showMessageDialog(null, "Não foi selecionado nenhum item na tabela", "Aviso", JOptionPane.ERROR_MESSAGE, icone);
        }
    }//GEN-LAST:event_JButtonEditarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarDados();
    }//GEN-LAST:event_formWindowActivated

    private void JButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonExcluirActionPerformed
        if (TabelaPaises.getSelectedRow() > -1) {
            int linhaSelecionada = TabelaPaises.getSelectedRow();
            int codigoParaExcluir = Integer.parseInt(TabelaPaises.getValueAt(linhaSelecionada, 0).toString());
            DefaultTableModel dtm = (DefaultTableModel) TabelaPaises.getModel();
            PaisDAO.excluir(codigoParaExcluir);
            dtm.removeRow(linhaSelecionada);
        } else {
            Icon icone = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/alerta.png")));
            JOptionPane.showMessageDialog(null, "Não foi selecionado nenhum item da tabela", "Aviso", JOptionPane.ERROR_MESSAGE, icone);
        }
    }//GEN-LAST:event_JButtonExcluirActionPerformed

    private void listarDados() {
        ArrayList<Pais> paises = (ArrayList<Pais>) PaisDAO.retornarPaisSemLimites();
        DefaultTableModel dtm = (DefaultTableModel) TabelaPaises.getModel();
        dtm.setRowCount(0);
        for (int i = 0; i < paises.size(); i++) {
            Pais pais = paises.get(i);
            dtm.addRow(new Object[]{
                pais.getId(),
                pais.getNome(),
                pais.getSigla()
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
            java.util.logging.Logger.getLogger(JFrameGerenciamentoPaises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGerenciamentoPaises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGerenciamentoPaises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGerenciamentoPaises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameGerenciamentoPaises().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAdicionar;
    private javax.swing.JButton JButtonEditar;
    private javax.swing.JButton JButtonExcluir;
    private javax.swing.JButton JButtonVoltar;
    private javax.swing.JTable TabelaPaises;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}