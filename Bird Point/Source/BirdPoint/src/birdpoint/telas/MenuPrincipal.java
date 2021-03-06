/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birdpoint.telas;

import birdpoint.usuario.Usuario;
import birdpoint.usuario.UsuarioDAO;

/**
 *
 * @author Adriano Lima
 */
public class MenuPrincipal extends javax.swing.JFrame {

    Usuario usuario = new Usuario();

    public MenuPrincipal(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        jlUsuario.setText(usuario.getLoginUsuario());
        jlPermissao.setText(usuario.getTipoDeAcessoUsuario());
        if (!usuario.getTipoDeAcessoUsuario().equalsIgnoreCase("administrador")) {
            permissao();
        }

    }

    public void permissao() {
        if (!usuario.getTipoDeAcessoUsuario().equalsIgnoreCase("administrador")) {
            subUsuario.setVisible(false);
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

        btLogout = new javax.swing.JButton();
        jlUsuario = new javax.swing.JLabel();
        jlNome2 = new javax.swing.JLabel();
        jlNome3 = new javax.swing.JLabel();
        jlPermissao = new javax.swing.JLabel();
        jlHome = new javax.swing.JLabel();
        jMenu = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        subUsuario = new javax.swing.JMenuItem();
        menuBiometria = new javax.swing.JMenu();
        subRegistrarPonto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 559));
        setUndecorated(true);
        getContentPane().setLayout(null);

        btLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/logout.png"))); // NOI18N
        btLogout.setText("Sair");
        btLogout.setToolTipText("Sair");
        btLogout.setContentAreaFilled(false);
        btLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btLogout);
        btLogout.setBounds(800, 360, 80, 69);

        jlUsuario.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jlUsuario.setText("???");
        getContentPane().add(jlUsuario);
        jlUsuario.setBounds(720, 10, 160, 30);

        jlNome2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNome2.setText("Permissão.:");
        getContentPane().add(jlNome2);
        jlNome2.setBounds(630, 30, 90, 30);

        jlNome3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNome3.setText("Usuário.:");
        getContentPane().add(jlNome3);
        jlNome3.setBounds(650, 10, 70, 30);

        jlPermissao.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jlPermissao.setText("???");
        getContentPane().add(jlPermissao);
        jlPermissao.setBounds(720, 30, 160, 30);

        jlHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/home.png"))); // NOI18N
        getContentPane().add(jlHome);
        jlHome.setBounds(0, 0, 900, 450);

        jMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu.setForeground(new java.awt.Color(51, 204, 0));
        jMenu.setBorderPainted(false);
        jMenu.setMaximumSize(new java.awt.Dimension(900, 200));
        jMenu.setMinimumSize(new java.awt.Dimension(900, 200));

        menuCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/adicionar80.png"))); // NOI18N
        menuCadastros.setText("Cadastro");
        menuCadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuCadastros.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        menuCadastros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuCadastros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/adicionar10.png"))); // NOI18N
        jMenuItem4.setText("Aluno");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuCadastros.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/adicionar10.png"))); // NOI18N
        jMenuItem5.setText("Professor");
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuCadastros.add(jMenuItem5);

        subUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/adicionar10.png"))); // NOI18N
        subUsuario.setText("Usuário");
        subUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subUsuarioActionPerformed(evt);
            }
        });
        menuCadastros.add(subUsuario);

        jMenu.add(menuCadastros);

        menuBiometria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/BotaoBiometria.png"))); // NOI18N
        menuBiometria.setText("Biometria");
        menuBiometria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBiometria.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        menuBiometria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuBiometria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuBiometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBiometriaActionPerformed(evt);
            }
        });

        subRegistrarPonto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/adicionar10.png"))); // NOI18N
        subRegistrarPonto.setText("Capturar Biometria");
        subRegistrarPonto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subRegistrarPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subRegistrarPontoActionPerformed(evt);
            }
        });
        menuBiometria.add(subRegistrarPonto);

        jMenu.add(menuBiometria);

        setJMenuBar(jMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoutActionPerformed
        TelaAutenticacao telaAutenticar = new TelaAutenticacao();
        telaAutenticar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btLogoutActionPerformed

    private void subUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subUsuarioActionPerformed
        CadastroUsuario cadUsuario = new CadastroUsuario(null, rootPaneCheckingEnabled);
        cadUsuario.setVisible(true);
    }//GEN-LAST:event_subUsuarioActionPerformed

    private void menuBiometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBiometriaActionPerformed

    }//GEN-LAST:event_menuBiometriaActionPerformed

    private void subRegistrarPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subRegistrarPontoActionPerformed
        CadastroPontoAluno cadPonto = new CadastroPontoAluno();
        cadPonto.setVisible(true);
    }//GEN-LAST:event_subRegistrarPontoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        CadastroAluno cadAluno = new CadastroAluno(this, rootPaneCheckingEnabled);
        cadAluno.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        CadastroProfessor cadProfessor = new CadastroProfessor(this, rootPaneCheckingEnabled);
        cadProfessor.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogout;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JLabel jlHome;
    private javax.swing.JLabel jlNome2;
    private javax.swing.JLabel jlNome3;
    private javax.swing.JLabel jlPermissao;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JMenu menuBiometria;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenuItem subRegistrarPonto;
    private javax.swing.JMenuItem subUsuario;
    // End of variables declaration//GEN-END:variables
}
