package View;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.JInternalFrame;
import java.net.MalformedURLException;
import javax.swing.JOptionPane;
import javax.swing.Timer;

@SuppressWarnings("serial")
public final class FormJoguinho extends javax.swing.JFrame {

    Timer tempo = new Timer(100, new Teste());

    public FormJoguinho(String usuario) throws UnknownHostException, IOException {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        txtLogado.setText(usuario.toUpperCase());
        obterDados();
        setIcon();
        btnEstatistica.setVisible(false); 
        separaEstatistica.setVisible(false);
        tempo.start();
        
    }

    private FormJoguinho() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnJoguinho = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnEstatistica = new javax.swing.JButton();
        separaEstatistica = new javax.swing.JToolBar.Separator();
        btnInfo = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jDesktopPaneFundo = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtLogado = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        txtEstacao = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        txtIP = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Joguinho vetor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnJoguinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Actions-games-config-board-icon.png"))); // NOI18N
        btnJoguinho.setToolTipText("Joguinho");
        btnJoguinho.setFocusable(false);
        btnJoguinho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnJoguinho.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnJoguinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJoguinhoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnJoguinho);
        jToolBar1.add(jSeparator3);

        btnEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Actions-games-highscores-icon.png"))); // NOI18N
        btnEstatistica.setFocusable(false);
        btnEstatistica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEstatistica.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnEstatistica);
        jToolBar1.add(separaEstatistica);

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Actions-games-config-custom-icon.png"))); // NOI18N
        btnInfo.setToolTipText("Informações");
        btnInfo.setFocusable(false);
        btnInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnInfo);
        jToolBar1.add(jSeparator5);

        jDesktopPaneFundo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPaneFundoLayout = new javax.swing.GroupLayout(jDesktopPaneFundo);
        jDesktopPaneFundo.setLayout(jDesktopPaneFundoLayout);
        jDesktopPaneFundoLayout.setHorizontalGroup(
            jDesktopPaneFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 894, Short.MAX_VALUE)
        );
        jDesktopPaneFundoLayout.setVerticalGroup(
            jDesktopPaneFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/if_Boss_132688.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setRequestFocusEnabled(false);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtLogado.setEditable(false);
        txtLogado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtLogado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/if_Display_16x16_132596.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);
        jButton5.setRequestFocusEnabled(false);

        txtEstacao.setEditable(false);
        txtEstacao.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtEstacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/if_Help_symbol_132598.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);
        jButton6.setFocusable(false);
        jButton6.setRequestFocusEnabled(false);

        txtIP.setEditable(false);
        txtIP.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtIP.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEstacao, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLogado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEstacao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIP))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneFundo)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jDesktopPaneFundo)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnJoguinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoguinhoActionPerformed
        AbrirInternal(new InternaJoguinoVetor(txtLogado.getText()));
    }//GEN-LAST:event_btnJoguinhoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair ?", "Atençao", JOptionPane.YES_NO_OPTION, 2);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(sair);
        }
    }//GEN-LAST:event_formWindowClosed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        AbrirInternal(new InternaInformacoes());
    }//GEN-LAST:event_btnInfoActionPerformed

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
            java.util.logging.Logger.getLogger(FormJoguinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormJoguinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormJoguinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormJoguinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormJoguinho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstatistica;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnJoguinho;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDesktopPane jDesktopPaneFundo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar.Separator separaEstatistica;
    private javax.swing.JTextField txtEstacao;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtLogado;
    // End of variables declaration//GEN-END:variables
public void AbrirInternal(JInternalFrame frame) {
        for (JInternalFrame internal : jDesktopPaneFundo.getAllFrames()) {
            if (internal.getClass().toString().equalsIgnoreCase(frame.getClass().toString())) {
                return;
            }
        }
        jDesktopPaneFundo.add(frame);
        frame.setLocation(
                jDesktopPaneFundo.getWidth() / 2 - frame.getWidth() / 2,
                jDesktopPaneFundo.getHeight() / 2 - frame.getHeight() / 2);
        frame.setVisible(true);

    }

    public void obterDados() throws UnknownHostException, MalformedURLException, IOException {
        InetAddress addr = InetAddress.getLocalHost();
        String hostname = addr.getHostName();
        txtEstacao.setText(hostname);

        String ipAddr = addr.getHostAddress();
        String ip = String.valueOf(ipAddr);
        txtIP.setText(ip);
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens/ICON.png")));
    }

    public class Teste implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            AbrirInternal(new InternaJoguinoVetor(txtLogado.getText()));
            tempo.stop();
        }
    }
}
