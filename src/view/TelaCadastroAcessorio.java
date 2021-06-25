/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import javax.swing.JSpinner;
import model.Acessorios;
import controller.AcessoriosController;
import dao.ExceptionDAO;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class TelaCadastroAcessorio extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroAcessorio
     */
    private TelaPrincipal telaPrincipal;
    public TelaCadastroAcessorio() {
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

        jLabelTitulo = new javax.swing.JLabel();
        jPanelCadastroAcessório = new javax.swing.JPanel();
        jLabelAcessorioDescricao = new javax.swing.JLabel();
        jTextFieldDescricaoAcessorio = new javax.swing.JTextField();
        jLabelAcessorioDescricao1 = new javax.swing.JLabel();
        jTextFieldValorAcessorio1 = new javax.swing.JTextField();
        jButtonCadastroAcessorioEnviar1 = new javax.swing.JButton();
        CadastroAcessorioLimpar = new javax.swing.JButton();
        jButtonCadastroAcessorioLimpar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Toca a Boca -> Cadastro de Acessório");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fecharTelaCadastroAcessorio(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Juventus Fans Bold", 0, 36)); // NOI18N
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/toca a bola logo.png"))); // NOI18N
        jLabelTitulo.setText("Cadastro de Acessório");
        jLabelTitulo.setToolTipText("");

        jPanelCadastroAcessório.setBackground(new java.awt.Color(102, 102, 102));
        jPanelCadastroAcessório.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelAcessorioDescricao.setFont(new java.awt.Font("Juventus Fans Bold", 0, 24)); // NOI18N
        jLabelAcessorioDescricao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAcessorioDescricao.setText("Descriçao:");

        jTextFieldDescricaoAcessorio.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jTextFieldDescricaoAcessorio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDescricaoAcessorio.setToolTipText("Infome a descrição do produto");
        jTextFieldDescricaoAcessorio.setActionCommand("<Não Definido>");
        jTextFieldDescricaoAcessorio.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldDescricaoAcessorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricaoAcessorioActionPerformed(evt);
            }
        });

        jLabelAcessorioDescricao1.setFont(new java.awt.Font("Juventus Fans Bold", 0, 24)); // NOI18N
        jLabelAcessorioDescricao1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAcessorioDescricao1.setText("Preço: ");

        jTextFieldValorAcessorio1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jTextFieldValorAcessorio1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldValorAcessorio1.setToolTipText("Infome o preço do produto");
        jTextFieldValorAcessorio1.setActionCommand("<Não Definido>");
        jTextFieldValorAcessorio1.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldValorAcessorio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorAcessorio1ActionPerformed(evt);
            }
        });

        jButtonCadastroAcessorioEnviar1.setFont(new java.awt.Font("Juventus Fans Bold", 0, 36)); // NOI18N
        jButtonCadastroAcessorioEnviar1.setText("Enviar");
        jButtonCadastroAcessorioEnviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroAcessorioEnviar1ActionPerformed(evt);
            }
        });

        CadastroAcessorioLimpar.setFont(new java.awt.Font("Juventus Fans Bold", 0, 36)); // NOI18N
        CadastroAcessorioLimpar.setText("Limpar");
        CadastroAcessorioLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroAcessorioLimparActionPerformed(evt);
            }
        });

        jButtonCadastroAcessorioLimpar1.setFont(new java.awt.Font("Juventus Fans Bold", 0, 36)); // NOI18N
        jButtonCadastroAcessorioLimpar1.setText("Voltar");
        jButtonCadastroAcessorioLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroAcessorioCancelar(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastroAcessórioLayout = new javax.swing.GroupLayout(jPanelCadastroAcessório);
        jPanelCadastroAcessório.setLayout(jPanelCadastroAcessórioLayout);
        jPanelCadastroAcessórioLayout.setHorizontalGroup(
            jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroAcessórioLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAcessorioDescricao)
                    .addComponent(jLabelAcessorioDescricao1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldDescricaoAcessorio)
                    .addGroup(jPanelCadastroAcessórioLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldValorAcessorio1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCadastroAcessorioEnviar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(68, 68, 68)
                        .addComponent(CadastroAcessorioLimpar)
                        .addGap(68, 68, 68)
                        .addComponent(jButtonCadastroAcessorioLimpar1)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanelCadastroAcessórioLayout.setVerticalGroup(
            jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroAcessórioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescricaoAcessorio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAcessorioDescricao))
                .addGap(24, 24, 24)
                .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAcessorioDescricao1)
                    .addComponent(jTextFieldValorAcessorio1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastroAcessorioLimpar)
                    .addComponent(jButtonCadastroAcessorioEnviar1)
                    .addComponent(jButtonCadastroAcessorioLimpar1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelCadastroAcessório, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelCadastroAcessório, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDescricaoAcessorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoAcessorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoAcessorioActionPerformed

    private void jTextFieldValorAcessorio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorAcessorio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorAcessorio1ActionPerformed

    private void jButtonCadastroAcessorioEnviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroAcessorioEnviar1ActionPerformed
        
        String descricao = jTextFieldDescricaoAcessorio.getText();
        Double valor = Double.parseDouble(jTextFieldValorAcessorio1.getText());
       
        boolean sucesso;
        
        try {
            AcessoriosController acessoriosController = new AcessoriosController();
            sucesso = acessoriosController.cadastrarAcessorios(descricao, valor);
            
                if(sucesso == true){
                    JOptionPane.showMessageDialog(null, "O cadastro foi realizado com sucesso!");
                    this.CadastroAcessorioLimparActionPerformed(evt);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente!");
                }
        } catch (HeadlessException ex){
            JOptionPane.showMessageDialog(null, "Erro:" + ex);
        } catch (ExceptionDAO ex) {
            Logger.getLogger(TelaCadastroAcessorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonCadastroAcessorioEnviar1ActionPerformed

    private void CadastroAcessorioLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroAcessorioLimparActionPerformed
        jTextFieldDescricaoAcessorio.setText("");
        jTextFieldValorAcessorio1.setText("");
        
        
    }//GEN-LAST:event_CadastroAcessorioLimparActionPerformed

    private void jButtonCadastroAcessorioCancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroAcessorioCancelar
        jTextFieldDescricaoAcessorio.setText("");
        jTextFieldValorAcessorio1.setText("");
        
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButtonCadastroAcessorioCancelar

    private void fecharTelaCadastroAcessorio(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharTelaCadastroAcessorio
        this.dispose();
    }//GEN-LAST:event_fecharTelaCadastroAcessorio

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
            java.util.logging.Logger.getLogger(TelaCadastroAcessorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAcessorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAcessorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAcessorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAcessorio().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastroAcessorioLimpar;
    private javax.swing.JButton jButtonCadastroAcessorioEnviar1;
    private javax.swing.JButton jButtonCadastroAcessorioLimpar1;
    private javax.swing.JLabel jLabelAcessorioDescricao;
    private javax.swing.JLabel jLabelAcessorioDescricao1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelCadastroAcessório;
    private javax.swing.JTextField jTextFieldDescricaoAcessorio;
    private javax.swing.JTextField jTextFieldValorAcessorio1;
    // End of variables declaration//GEN-END:variables
}