/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.PaisDAOUser;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.MedicamentoUser;
import model.PaisUser;
import model.UsuarioUser;

/**
 *
 * @author 98925
 */
public class JFrameTelaDeInicio extends javax.swing.JFrame {

    public static String nomeDoRemedio = "";
    public static UsuarioUser usuario;
    private List<MedicamentoUser> medicamento = new ArrayList<MedicamentoUser>();
    private List<MedicamentoUser> buscarMedicamentos = new ArrayList<MedicamentoUser>();

    /**
     * Creates new form JFrameBuscarMedicamentoDesligado
     */
    public JFrameTelaDeInicio() {
        initComponents();
        if (usuario == null) {
            jButtonLogin.setVisible(true);
            jButtonLogout.setVisible(false);
            jLabelBemVindo.setVisible(false);
            jLabelLogado.setVisible(false);
        } else {
            jButtonLogout.setVisible(true);
            jButtonLogin.setVisible(false);
            jLabelBemVindo.setVisible(true);
            jLabelLogado.setVisible(true);
            jLabelBemVindo.setText(usuario.getNome());

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

        jComboBoxPaisOrigem = new javax.swing.JComboBox<>();
        jComboBoxPaisDestino = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonBuscarMedicamento = new javax.swing.JButton();
        jButtonLogin = new javax.swing.JButton();
        jButtonAdministradores = new javax.swing.JButton();
        jButtonLogout = new javax.swing.JButton();
        jLabelBemVindo = new javax.swing.JLabel();
        jLabelLogado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyMed versão 1.2");
        setResizable(false);

        popularComboBoxPaisOrigem();

        popularComboBoxDestino();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("País de origem");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("País de destino");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Digite o nome comercial do medicamento");

        jTextFieldPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisaKeyPressed(evt);
            }
        });

        jButtonBuscarMedicamento.setBackground(new java.awt.Color(122, 187, 255));
        jButtonBuscarMedicamento.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonBuscarMedicamento.setText("Buscar medicamento equivalente");
        jButtonBuscarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarMedicamentoActionPerformed(evt);
            }
        });

        jButtonLogin.setBackground(new java.awt.Color(122, 187, 255));
        jButtonLogin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jButtonAdministradores.setBackground(new java.awt.Color(122, 187, 255));
        jButtonAdministradores.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonAdministradores.setText("Administradores");
        jButtonAdministradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdministradoresActionPerformed(evt);
            }
        });

        jButtonLogout.setBackground(new java.awt.Color(122, 187, 255));
        jButtonLogout.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonLogout.setText("Logout");
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        jLabelBemVindo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelBemVindo.setText("   ");

        jLabelLogado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelLogado.setText("Logado como:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPaisOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jComboBoxPaisDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(135, 135, 135))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonAdministradores)
                        .addGap(50, 50, 50))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBuscarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(225, 225, 225))
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabelLogado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBemVindo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBemVindo)
                    .addComponent(jLabelLogado))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPaisDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPaisOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonBuscarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdministradores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jButtonLogin.setBounds(10, 10, 10, 10);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        //dispose();
        JFrameLogin login = new JFrameLogin();
        login.setVisible(true);
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonBuscarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarMedicamentoActionPerformed
        if (jTextFieldPesquisa.getText().trim().equals("")) {
            Icon icone = new ImageIcon(getToolkit().createImage(getClass().getResource("/Icones/alerta.png")));
            JOptionPane.showMessageDialog(null, "Não foi digitado nenhum medicamento!!!", "Aviso", JOptionPane.ERROR_MESSAGE, icone);
            return;
        }
        if (jComboBoxPaisOrigem.getSelectedIndex() == -1) {
            Icon icone = new ImageIcon(getToolkit().createImage(getClass().getResource("/Icones/alerta.png")));
            JOptionPane.showMessageDialog(null, "Não foi selecionado nenhum país de origem!!!", "Aviso", JOptionPane.ERROR_MESSAGE, icone);
            return;
        }
        if (jComboBoxPaisDestino.getSelectedIndex() == -1) {
            Icon icone = new ImageIcon(getToolkit().createImage(getClass().getResource("/Icones/alerta.png")));
            JOptionPane.showMessageDialog(null, "Não foi selecionado nenhum país de destino!!!", "Aviso", JOptionPane.ERROR_MESSAGE, icone);
            return;
        } else {
            //dispose();
            String texto = jTextFieldPesquisa.getText();
            nomeDoRemedio = texto;
            PaisUser paisOrigem = (PaisUser) jComboBoxPaisOrigem.getSelectedItem();
            PaisUser paisDestino = (PaisUser) jComboBoxPaisDestino.getSelectedItem();
            JFrameTelaResultados resultados = new JFrameTelaResultados(paisOrigem, paisDestino, texto);
            resultados.setVisible(true);
        }
    }//GEN-LAST:event_jButtonBuscarMedicamentoActionPerformed

    private void jButtonAdministradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdministradoresActionPerformed
        //dispose();
        JFrameAdministradores admin = new JFrameAdministradores();
        admin.setVisible(true);
    }//GEN-LAST:event_jButtonAdministradoresActionPerformed

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        usuario = null;
        if (usuario == null) {
            jButtonLogin.setVisible(true);
            jButtonLogout.setVisible(false);
            jLabelBemVindo.setVisible(false);
            jLabelLogado.setVisible(false);
        } else {
            jButtonLogout.setVisible(true);
            jButtonLogin.setVisible(false);
            jLabelBemVindo.setVisible(true);
            jLabelLogado.setVisible(true);
            jLabelBemVindo.setText(usuario.getNome());
        }
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jTextFieldPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jTextFieldPesquisa.getText().trim().equals("")) {
                Icon icone = new ImageIcon(getToolkit().createImage(getClass().getResource("/Icones/alerta.png")));
                JOptionPane.showMessageDialog(null, "Não foi digitado nenhum medicamento!!!", "Aviso", JOptionPane.ERROR_MESSAGE, icone);
                return;
            }
            if (jComboBoxPaisOrigem.getSelectedIndex() == -1) {
                Icon icone = new ImageIcon(getToolkit().createImage(getClass().getResource("/Icones/alerta.png")));
                JOptionPane.showMessageDialog(null, "Não foi selecionado nenhum país de origem!!!", "Aviso", JOptionPane.ERROR_MESSAGE, icone);
                return;
            }
            if (jComboBoxPaisDestino.getSelectedIndex() == -1) {
                Icon icone = new ImageIcon(getToolkit().createImage(getClass().getResource("/Icones/alerta.png")));
                JOptionPane.showMessageDialog(null, "Não foi selecionado nenhum país de destino!!!", "Aviso", JOptionPane.ERROR_MESSAGE, icone);
                return;
            } else {
                //dispose();
                String texto = jTextFieldPesquisa.getText();
                nomeDoRemedio = texto;
                PaisUser paisOrigem = (PaisUser) jComboBoxPaisOrigem.getSelectedItem();
                PaisUser paisDestino = (PaisUser) jComboBoxPaisDestino.getSelectedItem();
                JFrameTelaResultados resultados = new JFrameTelaResultados(paisOrigem, paisDestino, texto);
                resultados.setVisible(true);
            }
        }
    }//GEN-LAST:event_jTextFieldPesquisaKeyPressed

    private void popularComboBoxPaisOrigem() {
        ArrayList<PaisUser> paises = (ArrayList) PaisDAOUser.retornarPais();
        for (PaisUser pais : paises) {
            jComboBoxPaisOrigem.addItem(pais);
        }
        jComboBoxPaisOrigem.setSelectedIndex(-1);
    }

    private void popularComboBoxDestino() {
        ArrayList<PaisUser> paises = (ArrayList) PaisDAOUser.retornarPais();
        for (PaisUser pais : paises) {
            jComboBoxPaisDestino.addItem(pais);
        }
        jComboBoxPaisDestino.setSelectedIndex(-1);
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
            java.util.logging.Logger.getLogger(JFrameTelaDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTelaDeInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdministradores;
    private javax.swing.JButton jButtonBuscarMedicamento;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JComboBox<PaisUser> jComboBoxPaisDestino;
    private javax.swing.JComboBox<PaisUser> jComboBoxPaisOrigem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBemVindo;
    private javax.swing.JLabel jLabelLogado;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}