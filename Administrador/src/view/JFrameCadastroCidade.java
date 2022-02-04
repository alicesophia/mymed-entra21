/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.CidadeDAO;
import dao.PaisDAO;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Cidade;
import model.Pais;

/**
 *
 * @author Alice Sophia Koch
 * @author Allan Martins Da Silva
 * @author Mario Schwabe Filho
 *
 */
public class JFrameCadastroCidade extends javax.swing.JFrame {

    public Icon iconeAlerta = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/alerta.png")));
    public Icon iconeCerto = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/certo.png")));

    /**
     * Creates new form JFrameAdicionarCidade
     */
    public JFrameCadastroCidade() {
        initComponents();
    }

    public void popularPaises() {
        ArrayList<Pais> paises = (ArrayList) PaisDAO.retornarPaisSemLimites();
        for (Pais pais : paises) {
            JComboBoxPais.addItem(pais);
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

        choice1 = new java.awt.Choice();
        JLabelCidade = new javax.swing.JLabel();
        JLabelIcone = new javax.swing.JLabel();
        JLabelNome = new javax.swing.JLabel();
        JTextFieldNome = new javax.swing.JTextField();
        JLabelPais = new javax.swing.JLabel();
        JComboBoxPais = new javax.swing.JComboBox<>();
        JButonCancelar = new javax.swing.JButton();
        JButtonConcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de cidade");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        JLabelCidade.setFont(new java.awt.Font("Times New Roman", 3, 28)); // NOI18N
        JLabelCidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelCidade.setText("Cadastrar Cidade");

        JLabelIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cidadeAdicionar.png"))); // NOI18N

        JLabelNome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JLabelNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelNome.setText("Nome");

        JLabelPais.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JLabelPais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelPais.setText("País");

        JComboBoxPais.setToolTipText("");

        JButonCancelar.setText("Cancelar");
        JButonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButonCancelarActionPerformed(evt);
            }
        });

        JButtonConcluir.setText("Concluir");
        JButtonConcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonConcluirMouseReleased(evt);
            }
        });
        JButtonConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonConcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(JLabelIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelPais, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JComboBoxPais, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JButtonConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JButonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(JLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLabelIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLabelPais, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JComboBoxPais, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButonCancelar)
                    .addComponent(JButtonConcluir))
                .addGap(25, 25, 25))
        );

        JComboBoxPais.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonConcluirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonConcluirMouseReleased
        if (JComboBoxPais.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Deve ser selecionado algum país!!!", "Aviso", JOptionPane.ERROR_MESSAGE, iconeAlerta);
            return;
        }
        if (JTextFieldNome.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Deve ser digitado algo em nome!!!", "Aviso", JOptionPane.ERROR_MESSAGE, iconeAlerta);
            return;
        } else {
            Cidade cidade = new Cidade();
            cidade.setPais((Pais) JComboBoxPais.getSelectedItem());
            cidade.setNome(JTextFieldNome.getText());
            cidade.setId(CidadeDAO.inserir(cidade));
            JOptionPane.showMessageDialog(null, "Cidade foi cadastrada com sucesso!!!", "Aviso", JOptionPane.ERROR_MESSAGE, iconeCerto);
            dispose();
        }
    }//GEN-LAST:event_JButtonConcluirMouseReleased

    private void JButonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_JButonCancelarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        popularPaises();
    }//GEN-LAST:event_formWindowActivated

    private void JButtonConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonConcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonConcluirActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCadastroCidade().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButonCancelar;
    private javax.swing.JButton JButtonConcluir;
    private javax.swing.JComboBox<Pais> JComboBoxPais;
    private javax.swing.JLabel JLabelCidade;
    private javax.swing.JLabel JLabelIcone;
    private javax.swing.JLabel JLabelNome;
    private javax.swing.JLabel JLabelPais;
    private javax.swing.JTextField JTextFieldNome;
    private java.awt.Choice choice1;
    // End of variables declaration//GEN-END:variables
}
