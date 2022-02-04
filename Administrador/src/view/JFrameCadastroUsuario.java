package view;

import dao.UsuarioDAO;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author Alice Sophia Koch
 */
public class JFrameCadastroUsuario extends javax.swing.JFrame {

    public Icon iconeAlerta = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/alerta.png")));
    public Icon iconeCerto = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/certo.png")));

    public JFrameCadastroUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabelIcone = new javax.swing.JLabel();
        JButtonCancelar = new javax.swing.JButton();
        JButtonConcluir = new javax.swing.JButton();
        JLabelCadastro = new javax.swing.JLabel();
        JLabelNome = new javax.swing.JLabel();
        JTextFieldNome = new javax.swing.JTextField();
        JLabelEmail = new javax.swing.JLabel();
        JTextFieldEmail = new javax.swing.JTextField();
        JLabelUsuario = new javax.swing.JLabel();
        JTextFieldUsuario = new javax.swing.JTextField();
        JLabelSenha = new javax.swing.JLabel();
        JPasswordSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de usuários");
        setResizable(false);

        JLabelIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/usuarioCadastro.png"))); // NOI18N
        JLabelIcone.setToolTipText("");

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
        JLabelCadastro.setText("Cadastrar Usuário");

        JLabelNome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JLabelNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelNome.setText("Nome");

        JLabelEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JLabelEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelEmail.setText("E-mail");

        JTextFieldEmail.setToolTipText("");

        JLabelUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JLabelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelUsuario.setText("Usuário");

        JLabelSenha.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JLabelSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelSenha.setText("Senha");

        JPasswordSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JPasswordSenhaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabelCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLabelIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLabelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JPasswordSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JButtonConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(JLabelCadastro)
                .addGap(47, 47, 47)
                .addComponent(JLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JLabelIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPasswordSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonCancelar)
                    .addComponent(JButtonConcluir))
                .addGap(43, 43, 43))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void JButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_JButtonCancelarActionPerformed
    private void JButtonConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonConcluirActionPerformed
        if (JTextFieldNome.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Algum nome deve ser informado!!!", "Aviso de cadastro de usuário", JOptionPane.ERROR_MESSAGE, iconeAlerta);
            return;
        }
        if (JTextFieldUsuario.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Algum nome de usuário deve ser informado!!!", "Aviso de cadastro de usuário", JOptionPane.ERROR_MESSAGE, iconeAlerta);
            return;
        }
        if (new String(JPasswordSenha.getPassword()).trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Alguma senha deve ser informada!!!", "Aviso de cadastro de usuário", JOptionPane.ERROR_MESSAGE, iconeAlerta);
            return;
        }
        if (JTextFieldEmail.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Algum email deve ser informado!!!", "Aviso de cadastro de usuário", JOptionPane.ERROR_MESSAGE, iconeAlerta);
            return;
        } else {
            Usuario user = new Usuario();
            user.setNome(JTextFieldNome.getText());
            user.setUsuario(JTextFieldUsuario.getText());
            user.setSenha(new String(JPasswordSenha.getPassword()));
            user.setEmail(JTextFieldEmail.getText());
            user.setId(UsuarioDAO.inserir(user));
            JOptionPane.showMessageDialog(null, "Usuário foi cadastrado com sucesso!!!", "Aviso de cadastro de usuário", JOptionPane.ERROR_MESSAGE, iconeCerto);
            dispose();
        }
    }//GEN-LAST:event_JButtonConcluirActionPerformed

    private void JPasswordSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JPasswordSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (JTextFieldNome.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Algum nome deve ser digitado!!!", "Aviso de cadastro de usuário", JOptionPane.ERROR_MESSAGE, iconeAlerta);
                return;
            }
            if (JTextFieldUsuario.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Deve ser digitado um nome de usuário!!!", "Aviso de cadastro de usuário", JOptionPane.ERROR_MESSAGE, iconeAlerta);
                return;
            }
            if (new String(JPasswordSenha.getPassword()).trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Deve ser digitada alguma senha!!!", "Aviso de cadastro de usuário", JOptionPane.ERROR_MESSAGE, iconeAlerta);
                return;
            }
            if (JTextFieldEmail.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Deve ser digitada algum email!!!", "Aviso de cadastro de usuário", JOptionPane.ERROR_MESSAGE, iconeAlerta);
                return;
            } else {
                Usuario user = new Usuario();
                user.setNome(JTextFieldNome.getText());
                user.setUsuario(JTextFieldUsuario.getText());
                user.setSenha(new String(JPasswordSenha.getPassword()));
                user.setEmail(JTextFieldEmail.getText());
                user.setId(UsuarioDAO.inserir(user));
                JOptionPane.showMessageDialog(null, "Usuário foi cadastrado com sucesso!!!", "Aviso de cadastro de usuário", JOptionPane.ERROR_MESSAGE, iconeCerto);
                dispose();
            }
        }
    }//GEN-LAST:event_JPasswordSenhaKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCadastroUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonCancelar;
    private javax.swing.JButton JButtonConcluir;
    private javax.swing.JLabel JLabelCadastro;
    private javax.swing.JLabel JLabelEmail;
    private javax.swing.JLabel JLabelIcone;
    private javax.swing.JLabel JLabelNome;
    private javax.swing.JLabel JLabelSenha;
    private javax.swing.JLabel JLabelUsuario;
    private javax.swing.JPasswordField JPasswordSenha;
    private javax.swing.JTextField JTextFieldEmail;
    private javax.swing.JTextField JTextFieldNome;
    private javax.swing.JTextField JTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
