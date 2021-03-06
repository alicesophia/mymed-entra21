/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.JFrame;
import model.AdministradorUser;

/**
 *
 * @author Alice Sophia Koch
 */
public class JFramePrincipalADM extends javax.swing.JFrame {

    public static AdministradorUser admin;

    /**
     * Creates new form JFramePrincipalADM
     */
    public JFramePrincipalADM() {
        initComponents();
        if (admin == null) {
            jLabelAdmin.setVisible(false);
        } else {
            jLabelAdmin.setVisible(true);
            jLabelAdmin.setText(admin.getNome());
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

        JButtonPaises = new javax.swing.JButton();
        JLabelPaises = new javax.swing.JLabel();
        JLabelFarmacias = new javax.swing.JLabel();
        JLabelUsuarios = new javax.swing.JLabel();
        JButtonFarmacias = new javax.swing.JButton();
        JButtonUsuarios = new javax.swing.JButton();
        JButtonCidades = new javax.swing.JButton();
        JButtonMedicamentos = new javax.swing.JButton();
        JButtonAdministradores = new javax.swing.JButton();
        JLabelCidades = new javax.swing.JLabel();
        JLabelMedicamentos = new javax.swing.JLabel();
        JLabelAdministradores = new javax.swing.JLabel();
        JLabelRelacionar = new javax.swing.JLabel();
        JButtonRelacionar = new javax.swing.JButton();
        jLabelAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");
        setBackground(new java.awt.Color(122, 187, 255));
        setForeground(new java.awt.Color(122, 187, 255));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        JButtonPaises.setBackground(new java.awt.Color(122, 187, 255));
        JButtonPaises.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JButtonPaises.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pais.png"))); // NOI18N
        JButtonPaises.setText("Gerenciar");
        JButtonPaises.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonPaisesMouseReleased(evt);
            }
        });
        JButtonPaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonPaisesActionPerformed(evt);
            }
        });

        JLabelPaises.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        JLabelPaises.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelPaises.setText("Pa??ses");

        JLabelFarmacias.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        JLabelFarmacias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelFarmacias.setText("Farm??cias");

        JLabelUsuarios.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        JLabelUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelUsuarios.setText("Usu??rios");

        JButtonFarmacias.setBackground(new java.awt.Color(122, 187, 255));
        JButtonFarmacias.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JButtonFarmacias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/farm??cia.png"))); // NOI18N
        JButtonFarmacias.setText("Gerenciar");
        JButtonFarmacias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonFarmaciasMouseReleased(evt);
            }
        });

        JButtonUsuarios.setBackground(new java.awt.Color(122, 187, 255));
        JButtonUsuarios.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JButtonUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/usuario2.png"))); // NOI18N
        JButtonUsuarios.setText("Gerenciar");
        JButtonUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonUsuariosMouseReleased(evt);
            }
        });

        JButtonCidades.setBackground(new java.awt.Color(122, 187, 255));
        JButtonCidades.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JButtonCidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cidade.png"))); // NOI18N
        JButtonCidades.setText("Gerenciar");
        JButtonCidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonCidadesMouseReleased(evt);
            }
        });
        JButtonCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCidadesActionPerformed(evt);
            }
        });

        JButtonMedicamentos.setBackground(new java.awt.Color(122, 187, 255));
        JButtonMedicamentos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JButtonMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/medicamento.png"))); // NOI18N
        JButtonMedicamentos.setText("Gerenciar");
        JButtonMedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonMedicamentosMouseReleased(evt);
            }
        });
        JButtonMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonMedicamentosActionPerformed(evt);
            }
        });

        JButtonAdministradores.setBackground(new java.awt.Color(122, 187, 255));
        JButtonAdministradores.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JButtonAdministradores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/admin.png"))); // NOI18N
        JButtonAdministradores.setText("Gerenciar");
        JButtonAdministradores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonAdministradoresMouseReleased(evt);
            }
        });

        JLabelCidades.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        JLabelCidades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelCidades.setText("Cidades");

        JLabelMedicamentos.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        JLabelMedicamentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelMedicamentos.setText("Medicamentos");

        JLabelAdministradores.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        JLabelAdministradores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelAdministradores.setText("Administradores");

        JLabelRelacionar.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        JLabelRelacionar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelRelacionar.setText("Relacionar Medicamentos");

        JButtonRelacionar.setBackground(new java.awt.Color(122, 187, 255));
        JButtonRelacionar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JButtonRelacionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/medicamento.png"))); // NOI18N
        JButtonRelacionar.setText("Gerenciar");
        JButtonRelacionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonRelacionarActionPerformed(evt);
            }
        });

        jLabelAdmin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelAdmin.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAdmin)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JButtonCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(JButtonMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(JButtonAdministradores, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JLabelCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(JLabelMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(JLabelAdministradores, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(JLabelRelacionar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JButtonRelacionar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JLabelPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(JLabelFarmacias, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(JLabelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JButtonPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(JButtonFarmacias, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(JButtonUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JLabelPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelFarmacias, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JButtonPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonFarmacias, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelAdministradores, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JButtonCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonAdministradores, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(JLabelRelacionar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JButtonRelacionar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabelAdmin)
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonPaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonPaisesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonPaisesActionPerformed

    private void JButtonMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonMedicamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonMedicamentosActionPerformed

    private void JButtonPaisesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonPaisesMouseReleased
        JFrameGerenciamentoPaises frame = new JFrameGerenciamentoPaises();
        frame.setVisible(true);
    }//GEN-LAST:event_JButtonPaisesMouseReleased

    private void JButtonCidadesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonCidadesMouseReleased
        JFrameGerenciamentoCidades frame = new JFrameGerenciamentoCidades();
        frame.setVisible(true);
    }//GEN-LAST:event_JButtonCidadesMouseReleased

    private void JButtonMedicamentosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonMedicamentosMouseReleased
        JFrameGerenciamentoMedicamentos frame = new JFrameGerenciamentoMedicamentos();
        frame.setVisible(true);
    }//GEN-LAST:event_JButtonMedicamentosMouseReleased

    private void JButtonUsuariosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonUsuariosMouseReleased
        JFrameGerenciamentoUsuarios frame = new JFrameGerenciamentoUsuarios();
        frame.setVisible(true);
    }//GEN-LAST:event_JButtonUsuariosMouseReleased

    private void JButtonCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonCidadesActionPerformed

    private void JButtonFarmaciasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonFarmaciasMouseReleased
        JFrameGerenciamentoFarmacias frame = new JFrameGerenciamentoFarmacias();
        frame.setVisible(true);
    }//GEN-LAST:event_JButtonFarmaciasMouseReleased

    private void JButtonAdministradoresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonAdministradoresMouseReleased
        JFrameGerenciamentoAdministradores frame = new JFrameGerenciamentoAdministradores();
        frame.setVisible(true);
    }//GEN-LAST:event_JButtonAdministradoresMouseReleased

    private void JButtonRelacionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonRelacionarActionPerformed
        JFrameGerenciamentoMedicamentosInternacionais frame = new JFrameGerenciamentoMedicamentosInternacionais();
        frame.setVisible(true);
    }//GEN-LAST:event_JButtonRelacionarActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePrincipalADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipalADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipalADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipalADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipalADM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAdministradores;
    private javax.swing.JButton JButtonCidades;
    private javax.swing.JButton JButtonFarmacias;
    private javax.swing.JButton JButtonMedicamentos;
    private javax.swing.JButton JButtonPaises;
    private javax.swing.JButton JButtonRelacionar;
    private javax.swing.JButton JButtonUsuarios;
    private javax.swing.JLabel JLabelAdministradores;
    private javax.swing.JLabel JLabelCidades;
    private javax.swing.JLabel JLabelFarmacias;
    private javax.swing.JLabel JLabelMedicamentos;
    private javax.swing.JLabel JLabelPaises;
    private javax.swing.JLabel JLabelRelacionar;
    private javax.swing.JLabel JLabelUsuarios;
    private javax.swing.JLabel jLabelAdmin;
    // End of variables declaration//GEN-END:variables
}
