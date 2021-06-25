/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ChuteiraController;
import dao.ExceptionDAO;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class TelaCadastroChuteiras extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroAcessorio
     */
    private TelaPrincipal telaPrincipal; 
    
    public TelaCadastroChuteiras() {
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

        jLabelCadastroChuteiras = new javax.swing.JLabel();
        jPanelCadastroAcessório = new javax.swing.JPanel();
        jLabelChuteiraModelo = new javax.swing.JLabel();
        JTFChuteiraModelo = new javax.swing.JTextField();
        jLabelAcessorioBolaPreco = new javax.swing.JLabel();
        jTextFieldChuteiraCor = new javax.swing.JTextField();
        ChuteiraCadastroEnviar = new javax.swing.JButton();
        ChuteiraCadastroLimpar = new javax.swing.JButton();
        jButtonCadastroChuteirasVoltar = new javax.swing.JButton();
        jLabelChuteiraCor = new javax.swing.JLabel();
        jTextFieldValorChuteira = new javax.swing.JTextField();
        jLabelChuteiraTamanho = new javax.swing.JLabel();
        jTextFieldChuteiraMarca = new javax.swing.JTextField();
        jLabelChuteiraMarca = new javax.swing.JLabel();
        jTextFieldChuteiraTamanho = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Toca a Boca -> Cadastro de Chuteiras");
        setResizable(false);

        jLabelCadastroChuteiras.setFont(new java.awt.Font("Juventus Fans Bold", 0, 36)); // NOI18N
        jLabelCadastroChuteiras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/toca a bola logo.png"))); // NOI18N
        jLabelCadastroChuteiras.setText("Cadastro de Chuteiras");
        jLabelCadastroChuteiras.setToolTipText("");

        jPanelCadastroAcessório.setBackground(new java.awt.Color(102, 102, 102));
        jPanelCadastroAcessório.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelChuteiraModelo.setFont(new java.awt.Font("Juventus Fans Bold", 0, 24)); // NOI18N
        jLabelChuteiraModelo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelChuteiraModelo.setText("Modelo:");

        JTFChuteiraModelo.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        JTFChuteiraModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFChuteiraModelo.setToolTipText("Infome o modelo da chuteira");
        JTFChuteiraModelo.setActionCommand("<Não Definido>");
        JTFChuteiraModelo.setBorder(new javax.swing.border.MatteBorder(null));
        JTFChuteiraModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFChuteiraModeloActionPerformed(evt);
            }
        });

        jLabelAcessorioBolaPreco.setFont(new java.awt.Font("Juventus Fans Bold", 0, 24)); // NOI18N
        jLabelAcessorioBolaPreco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAcessorioBolaPreco.setText("Preço: ");

        jTextFieldChuteiraCor.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jTextFieldChuteiraCor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldChuteiraCor.setToolTipText("Infome a cor da chuteira");
        jTextFieldChuteiraCor.setActionCommand("<Não Definido>");
        jTextFieldChuteiraCor.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldChuteiraCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChuteiraCorActionPerformed(evt);
            }
        });

        ChuteiraCadastroEnviar.setFont(new java.awt.Font("Juventus Fans Bold", 0, 36)); // NOI18N
        ChuteiraCadastroEnviar.setText("Enviar");
        ChuteiraCadastroEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuteiraCadastroEnviar(evt);
            }
        });

        ChuteiraCadastroLimpar.setFont(new java.awt.Font("Juventus Fans Bold", 0, 36)); // NOI18N
        ChuteiraCadastroLimpar.setText("Limpar");
        ChuteiraCadastroLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuteiraCadastroLimpar(evt);
            }
        });

        jButtonCadastroChuteirasVoltar.setFont(new java.awt.Font("Juventus Fans Bold", 0, 36)); // NOI18N
        jButtonCadastroChuteirasVoltar.setText("Voltar");
        jButtonCadastroChuteirasVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroChuteirasVoltarActionPerformed(evt);
            }
        });

        jLabelChuteiraCor.setFont(new java.awt.Font("Juventus Fans Bold", 0, 24)); // NOI18N
        jLabelChuteiraCor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelChuteiraCor.setText("Cor:");

        jTextFieldValorChuteira.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jTextFieldValorChuteira.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldValorChuteira.setToolTipText("Infome o preço do produto");
        jTextFieldValorChuteira.setActionCommand("<Não Definido>");
        jTextFieldValorChuteira.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldValorChuteira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorChuteiraActionPerformed(evt);
            }
        });

        jLabelChuteiraTamanho.setFont(new java.awt.Font("Juventus Fans Bold", 0, 24)); // NOI18N
        jLabelChuteiraTamanho.setForeground(new java.awt.Color(255, 255, 255));
        jLabelChuteiraTamanho.setText("Tamanho:");

        jTextFieldChuteiraMarca.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jTextFieldChuteiraMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldChuteiraMarca.setToolTipText("Infome a marca da chuteira");
        jTextFieldChuteiraMarca.setActionCommand("<Não Definido>");
        jTextFieldChuteiraMarca.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldChuteiraMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChuteiraMarcaActionPerformed(evt);
            }
        });

        jLabelChuteiraMarca.setFont(new java.awt.Font("Juventus Fans Bold", 0, 24)); // NOI18N
        jLabelChuteiraMarca.setForeground(new java.awt.Color(255, 255, 255));
        jLabelChuteiraMarca.setText("Marca:");

        jTextFieldChuteiraTamanho.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jTextFieldChuteiraTamanho.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldChuteiraTamanho.setToolTipText("Infome o tamanho da chuteira");
        jTextFieldChuteiraTamanho.setActionCommand("<Não Definido>");
        jTextFieldChuteiraTamanho.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldChuteiraTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChuteiraTamanhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastroAcessórioLayout = new javax.swing.GroupLayout(jPanelCadastroAcessório);
        jPanelCadastroAcessório.setLayout(jPanelCadastroAcessórioLayout);
        jPanelCadastroAcessórioLayout.setHorizontalGroup(
            jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroAcessórioLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(ChuteiraCadastroEnviar)
                .addGap(68, 68, 68)
                .addComponent(ChuteiraCadastroLimpar)
                .addGap(67, 67, 67)
                .addComponent(jButtonCadastroChuteirasVoltar)
                .addGap(24, 211, Short.MAX_VALUE))
            .addGroup(jPanelCadastroAcessórioLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAcessorioBolaPreco)
                    .addComponent(jLabelChuteiraCor)
                    .addComponent(jLabelChuteiraModelo)
                    .addComponent(jLabelChuteiraTamanho)
                    .addComponent(jLabelChuteiraMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFChuteiraModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldValorChuteira, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldChuteiraMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addComponent(jTextFieldChuteiraTamanho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                    .addComponent(jTextFieldChuteiraCor, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelCadastroAcessórioLayout.setVerticalGroup(
            jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroAcessórioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFChuteiraModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelChuteiraModelo))
                .addGap(24, 24, 24)
                .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelChuteiraCor)
                    .addComponent(jTextFieldChuteiraCor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldChuteiraMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelChuteiraMarca))
                .addGap(22, 22, 22)
                .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldChuteiraTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelChuteiraTamanho))
                .addGap(22, 22, 22)
                .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValorChuteira, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAcessorioBolaPreco))
                .addGap(24, 24, 24)
                .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChuteiraCadastroEnviar)
                    .addComponent(ChuteiraCadastroLimpar)
                    .addComponent(jButtonCadastroChuteirasVoltar))
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
                .addGap(108, 108, 108)
                .addComponent(jLabelCadastroChuteiras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCadastroChuteiras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelCadastroAcessório, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTFChuteiraModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFChuteiraModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFChuteiraModeloActionPerformed

    private void jTextFieldChuteiraCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChuteiraCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChuteiraCorActionPerformed

    private void ChuteiraCadastroEnviar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuteiraCadastroEnviar
        String modelo = JTFChuteiraModelo.getText();
        String cor = jTextFieldChuteiraCor.getText();
        String marca = jTextFieldChuteiraMarca.getText();
        Integer tamanho = Integer.parseInt(jTextFieldChuteiraTamanho.getText());
        Double valor = Double.parseDouble(jTextFieldValorChuteira.getText());
       
        boolean sucesso;
        
        try {
            ChuteiraController chuteiraController = new ChuteiraController();
            sucesso = chuteiraController.cadastrarChuteira(JTFChuteiraModelo.getText(), jTextFieldChuteiraCor.getText(), jTextFieldChuteiraMarca.getText(), tamanho, valor);
            
                if(sucesso == true){
                    JOptionPane.showMessageDialog(null, "O cadastro foi realizado com sucesso!");
                    this.ChuteiraCadastroLimpar(evt);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente!");
                }
        } catch (HeadlessException ex){
            JOptionPane.showMessageDialog(null, "Erro:" + ex);
        } catch (ExceptionDAO ex) {
            Logger.getLogger(TelaCadastroChuteiras.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ChuteiraCadastroEnviar

    private void ChuteiraCadastroLimpar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuteiraCadastroLimpar
        JTFChuteiraModelo.setText("");
        jTextFieldChuteiraCor.setText("");
        jTextFieldChuteiraMarca.setText("");
        jTextFieldChuteiraTamanho.setText("");
        jTextFieldValorChuteira.setText("");
    }//GEN-LAST:event_ChuteiraCadastroLimpar

    private void jButtonCadastroChuteirasVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroChuteirasVoltarActionPerformed
        /*  jTextFieldDescricaoAcessorio.setText("");
        jTextFieldValorAcessorio1.setText(""); */
        
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        
        this.dispose();        
    }//GEN-LAST:event_jButtonCadastroChuteirasVoltarActionPerformed

    private void jTextFieldValorChuteiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorChuteiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorChuteiraActionPerformed

    private void jTextFieldChuteiraMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChuteiraMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChuteiraMarcaActionPerformed

    private void jTextFieldChuteiraTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChuteiraTamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChuteiraTamanhoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroChuteiras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroChuteiras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroChuteiras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroChuteiras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaCadastroChuteiras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChuteiraCadastroEnviar;
    private javax.swing.JButton ChuteiraCadastroLimpar;
    private javax.swing.JTextField JTFChuteiraModelo;
    private javax.swing.JButton jButtonCadastroChuteirasVoltar;
    private javax.swing.JLabel jLabelAcessorioBolaPreco;
    private javax.swing.JLabel jLabelCadastroChuteiras;
    private javax.swing.JLabel jLabelChuteiraCor;
    private javax.swing.JLabel jLabelChuteiraMarca;
    private javax.swing.JLabel jLabelChuteiraModelo;
    private javax.swing.JLabel jLabelChuteiraTamanho;
    private javax.swing.JPanel jPanelCadastroAcessório;
    private javax.swing.JTextField jTextFieldChuteiraCor;
    private javax.swing.JTextField jTextFieldChuteiraMarca;
    private javax.swing.JTextField jTextFieldChuteiraTamanho;
    private javax.swing.JTextField jTextFieldValorChuteira;
    // End of variables declaration//GEN-END:variables
}