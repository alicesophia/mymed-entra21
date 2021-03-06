/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.PaisDAO;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Pais;

/**
 *
 * @author Alice Sophia Koch
 * @author Allan Martins Da Silva
 * @author Mario Schwabe Filho
 *
 */
public class JFrameCadastroPais extends javax.swing.JFrame {

    public Icon iconeAlerta = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/alerta.png")));
    public Icon iconeCerto = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/certo.png")));

    /**
     * Creates new form JFrameAdicionarPais
     */
    public JFrameCadastroPais() {
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

        JLabelIcone = new javax.swing.JLabel();
        JButtonCancelar = new javax.swing.JButton();
        JButtonConcluir = new javax.swing.JButton();
        JLabelCadastro = new javax.swing.JLabel();
        JLabelNome = new javax.swing.JLabel();
        JTextFieldNome = new javax.swing.JTextField();
        JLabelSigla = new javax.swing.JLabel();
        JTextFieldSigla = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar país");
        setResizable(false);

        JLabelIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/paísAdicionar.png"))); // NOI18N

        JButtonCancelar.setText("Cancelar");
        JButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCancelarActionPerformed(evt);
            }
        });

        JButtonConcluir.setText("Concluir");
        JButtonConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonConcluirActionPerformed(evt);
            }
        });

        JLabelCadastro.setFont(new java.awt.Font("Times New Roman", 3, 28)); // NOI18N
        JLabelCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelCadastro.setText("Cadastrar País");

        JLabelNome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JLabelNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelNome.setText("Nome");

        JLabelSigla.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JLabelSigla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelSigla.setText("Sigla");

        JTextFieldSigla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextFieldSiglaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLabelIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabelSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextFieldSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(159, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLabelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JButtonConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(JLabelCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelIcone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLabelSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextFieldSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonCancelar)
                    .addComponent(JButtonConcluir))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_JButtonCancelarActionPerformed

    private void JTextFieldSiglaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldSiglaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (JTextFieldNome.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Deve ser digitado algum nome", "Aviso de cadastro de país!!!", JOptionPane.ERROR_MESSAGE, iconeAlerta);
                return;
            }
            if (JTextFieldSigla.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Deve ser digitado alguma sigla", "Aviso de cadastro de país!!!", JOptionPane.ERROR_MESSAGE, iconeAlerta);
                return;
            } else {
                Pais pais = new Pais();
                pais.setNome(JTextFieldNome.getText());
                pais.setSigla(JTextFieldSigla.getText());
                pais.setId(PaisDAO.inserir(pais));
                JOptionPane.showMessageDialog(null, "País foi cadastrado com sucesso!!!", "Aviso de cadastro de país!!!", JOptionPane.ERROR_MESSAGE, iconeCerto);
                dispose();
            }
        }
    }//GEN-LAST:event_JTextFieldSiglaKeyPressed

    private void JButtonConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonConcluirActionPerformed
        if (JTextFieldNome.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Deve ser digitado algum nome!!!", "Aviso de cadastro de país!!!", JOptionPane.ERROR_MESSAGE, iconeAlerta);
            return;
        }
        if (JTextFieldSigla.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Deve ser digitado alguma sigla!!!", "Aviso de cadastro de país!!!", JOptionPane.ERROR_MESSAGE, iconeAlerta);
            return;
        } else {
            Pais pais = new Pais();
            pais.setNome(JTextFieldNome.getText());
            pais.setSigla(JTextFieldSigla.getText());
            pais.setId(PaisDAO.inserir(pais));
            JOptionPane.showMessageDialog(null, "País foi cadastrado com sucesso!!!", "Aviso de cadastro de país!!!", JOptionPane.ERROR_MESSAGE, iconeCerto);
            dispose();
        }
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
            java.util.logging.Logger.getLogger(JFrameCadastroPais.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroPais.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroPais.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroPais.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCadastroPais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonCancelar;
    private javax.swing.JButton JButtonConcluir;
    private javax.swing.JLabel JLabelCadastro;
    private javax.swing.JLabel JLabelIcone;
    private javax.swing.JLabel JLabelNome;
    private javax.swing.JLabel JLabelSigla;
    private javax.swing.JTextField JTextFieldNome;
    private javax.swing.JTextField JTextFieldSigla;
    // End of variables declaration//GEN-END:variables
}
