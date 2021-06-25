/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AcessoriosController;
import controller.BolaController;
import controller.CamisetaController;
import controller.ChuteiraController;
import controller.VendaController;
import dao.Conexao;
import dao.ExceptionDAO;
import dao.VendaDAO;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class TelaRealizarVenda extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroAcessorio
     */
    private TelaPrincipal telaPrincipal;  
    private Conexao con;
    private String query;
    private PreparedStatement ps;
    
    public TelaRealizarVenda() {
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
        jLabelAcessorioBolaPreco = new javax.swing.JLabel();
        jLabelChuteiraCor = new javax.swing.JLabel();
        JTFCpfCliente = new javax.swing.JTextField();
        jLabelValorTotal = new javax.swing.JLabel();
        jLabelChuteiraMarca = new javax.swing.JLabel();
        jLabelAcessorioBolaPreco1 = new javax.swing.JLabel();
        JTFIdFuncionario = new javax.swing.JTextField();
        JTFEtiquetaAcessorio2 = new javax.swing.JTextField();
        JTFEtiquetaBola1 = new javax.swing.JTextField();
        JTFEtiquetaCamiseta1 = new javax.swing.JTextField();
        JTFEtiquetaChuteira2 = new javax.swing.JTextField();
        jLabelChuteiraTamanho1 = new javax.swing.JLabel();
        BotaoVender = new javax.swing.JButton();
        ValorTotalTextoAqui1 = new javax.swing.JTextField();
        BotaoCancelar = new javax.swing.JButton();
        JTFDescricaoBola = new javax.swing.JTextField();
        jLabelChuteiraModelo1 = new javax.swing.JLabel();
        jLabelChuteiraModelo2 = new javax.swing.JLabel();
        JTFDescricaoAcessorio = new javax.swing.JTextField();
        jLabelChuteiraModelo3 = new javax.swing.JLabel();
        JTFDescricaoChuteira = new javax.swing.JTextField();
        jLabelChuteiraModelo4 = new javax.swing.JLabel();
        JTFDescricaoCamiseta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Toca a Boca -> Cadastro de Chuteiras");
        setResizable(false);

        jLabelCadastroChuteiras.setFont(new java.awt.Font("Juventus Fans Bold", 0, 36)); // NOI18N
        jLabelCadastroChuteiras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/toca a bola logo.png"))); // NOI18N
        jLabelCadastroChuteiras.setText("Realizar Venda");
        jLabelCadastroChuteiras.setToolTipText("");

        jPanelCadastroAcessório.setBackground(new java.awt.Color(102, 102, 102));
        jPanelCadastroAcessório.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelChuteiraModelo.setFont(new java.awt.Font("Juventus Fans Bold", 0, 24)); // NOI18N
        jLabelChuteiraModelo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelChuteiraModelo.setText("Descrição da Bola:");

        jLabelAcessorioBolaPreco.setFont(new java.awt.Font("Juventus Fans Bold", 0, 24)); // NOI18N
        jLabelAcessorioBolaPreco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAcessorioBolaPreco.setText("Cpf do Cliente:");

        jLabelChuteiraCor.setFont(new java.awt.Font("Juventus Fans Bold", 0, 24)); // NOI18N
        jLabelChuteiraCor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelChuteiraCor.setText("Etiqueta da Bola:");

        JTFCpfCliente.setFont(new java.awt.Font("Work Sans SemiBold", 0, 24)); // NOI18N
        JTFCpfCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFCpfCliente.setToolTipText("Infome o cpf do cliente");
        JTFCpfCliente.setActionCommand("<Não Definido>");
        JTFCpfCliente.setBorder(new javax.swing.border.MatteBorder(null));
        JTFCpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCpfClienteActionPerformed(evt);
            }
        });

        jLabelValorTotal.setFont(new java.awt.Font("Juventus Fans Bold", 0, 48)); // NOI18N
        jLabelValorTotal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValorTotal.setText("Valor Total:");

        jLabelChuteiraMarca.setFont(new java.awt.Font("Juventus Fans Bold", 0, 24)); // NOI18N
        jLabelChuteiraMarca.setForeground(new java.awt.Color(255, 255, 255));
        jLabelChuteiraMarca.setText("Etiqueta da Camiseta:");

        jLabelAcessorioBolaPreco1.setFont(new java.awt.Font("Juventus Fans Bold", 0, 24)); // NOI18N
        jLabelAcessorioBolaPreco1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAcessorioBolaPreco1.setText("ID do Funcionário:");

        JTFIdFuncionario.setFont(new java.awt.Font("Work Sans SemiBold", 0, 24)); // NOI18N
        JTFIdFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFIdFuncionario.setToolTipText("Infome o ID do Funcionário");
        JTFIdFuncionario.setActionCommand("<Não Definido>");
        JTFIdFuncionario.setBorder(new javax.swing.border.MatteBorder(null));
        JTFIdFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFIdFuncionarioActionPerformed(evt);
            }
        });

        JTFEtiquetaAcessorio2.setFont(new java.awt.Font("Work Sans SemiBold", 0, 24)); // NOI18N
        JTFEtiquetaAcessorio2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFEtiquetaAcessorio2.setToolTipText("Infome a etiqueta do acessório:");
        JTFEtiquetaAcessorio2.setActionCommand("<Não Definido>");
        JTFEtiquetaAcessorio2.setBorder(new javax.swing.border.MatteBorder(null));
        JTFEtiquetaAcessorio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFEtiquetaAcessorio2ActionPerformed(evt);
            }
        });

        JTFEtiquetaBola1.setFont(new java.awt.Font("Work Sans SemiBold", 0, 24)); // NOI18N
        JTFEtiquetaBola1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFEtiquetaBola1.setToolTipText("Infome a etiqueta da bola");
        JTFEtiquetaBola1.setActionCommand("<Não Definido>");
        JTFEtiquetaBola1.setBorder(new javax.swing.border.MatteBorder(null));
        JTFEtiquetaBola1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFEtiquetaBola1ActionPerformed(evt);
            }
        });

        JTFEtiquetaCamiseta1.setFont(new java.awt.Font("Work Sans SemiBold", 0, 24)); // NOI18N
        JTFEtiquetaCamiseta1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFEtiquetaCamiseta1.setToolTipText("Infome a etiqueta da camiseta");
        JTFEtiquetaCamiseta1.setActionCommand("<Não Definido>");
        JTFEtiquetaCamiseta1.setBorder(new javax.swing.border.MatteBorder(null));
        JTFEtiquetaCamiseta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFEtiquetaCamiseta1ActionPerformed(evt);
            }
        });

        JTFEtiquetaChuteira2.setFont(new java.awt.Font("Work Sans SemiBold", 0, 24)); // NOI18N
        JTFEtiquetaChuteira2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFEtiquetaChuteira2.setToolTipText("Infome a etiqueta da chuteira");
        JTFEtiquetaChuteira2.setActionCommand("<Não Definido>");
        JTFEtiquetaChuteira2.setBorder(new javax.swing.border.MatteBorder(null));
        JTFEtiquetaChuteira2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFEtiquetaChuteira2ActionPerformed(evt);
            }
        });

        jLabelChuteiraTamanho1.setFont(new java.awt.Font("Juventus Fans Bold", 0, 24)); // NOI18N
        jLabelChuteiraTamanho1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelChuteiraTamanho1.setText("Etiqueta da Chuteira:");

        BotaoVender.setFont(new java.awt.Font("Juventus Fans Bold", 0, 48)); // NOI18N
        BotaoVender.setText("Vender");
        BotaoVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVenderActionPerformed(evt);
            }
        });

        ValorTotalTextoAqui1.setFont(new java.awt.Font("Work Sans SemiBold", 0, 36)); // NOI18N
        ValorTotalTextoAqui1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ValorTotalTextoAqui1.setToolTipText("Infome o valor total da compra!");
        ValorTotalTextoAqui1.setActionCommand("<Não Definido>");
        ValorTotalTextoAqui1.setBorder(new javax.swing.border.MatteBorder(null));
        ValorTotalTextoAqui1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorTotalTextoAqui1ActionPerformed(evt);
            }
        });

        BotaoCancelar.setFont(new java.awt.Font("Juventus Fans Bold", 0, 36)); // NOI18N
        BotaoCancelar.setText("Cancelar");
        BotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarActionPerformed(evt);
            }
        });

        JTFDescricaoBola.setFont(new java.awt.Font("Work Sans SemiBold", 0, 12)); // NOI18N
        JTFDescricaoBola.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFDescricaoBola.setToolTipText("Infome a descrição do produto sendo vendido");
        JTFDescricaoBola.setActionCommand("<Não Definido>");
        JTFDescricaoBola.setBorder(new javax.swing.border.MatteBorder(null));
        JTFDescricaoBola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDescricaoBolaActionPerformed(evt);
            }
        });

        jLabelChuteiraModelo1.setFont(new java.awt.Font("Juventus Fans Bold", 0, 24)); // NOI18N
        jLabelChuteiraModelo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelChuteiraModelo1.setText("Etiqueta do Acessorio:");

        jLabelChuteiraModelo2.setFont(new java.awt.Font("Juventus Fans Bold", 0, 24)); // NOI18N
        jLabelChuteiraModelo2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelChuteiraModelo2.setText("Descrição do Acessório:");

        JTFDescricaoAcessorio.setFont(new java.awt.Font("Work Sans SemiBold", 0, 12)); // NOI18N
        JTFDescricaoAcessorio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFDescricaoAcessorio.setToolTipText("Infome a descrição do produto sendo vendido");
        JTFDescricaoAcessorio.setActionCommand("<Não Definido>");
        JTFDescricaoAcessorio.setBorder(new javax.swing.border.MatteBorder(null));
        JTFDescricaoAcessorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDescricaoAcessorioActionPerformed(evt);
            }
        });

        jLabelChuteiraModelo3.setFont(new java.awt.Font("Juventus Fans Bold", 0, 24)); // NOI18N
        jLabelChuteiraModelo3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelChuteiraModelo3.setText("Descrição da Chuteira:");

        JTFDescricaoChuteira.setFont(new java.awt.Font("Work Sans SemiBold", 0, 12)); // NOI18N
        JTFDescricaoChuteira.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFDescricaoChuteira.setToolTipText("Infome a descrição do produto sendo vendido");
        JTFDescricaoChuteira.setActionCommand("<Não Definido>");
        JTFDescricaoChuteira.setBorder(new javax.swing.border.MatteBorder(null));
        JTFDescricaoChuteira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDescricaoChuteiraActionPerformed(evt);
            }
        });

        jLabelChuteiraModelo4.setFont(new java.awt.Font("Juventus Fans Bold", 0, 24)); // NOI18N
        jLabelChuteiraModelo4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelChuteiraModelo4.setText("Descrição da Camiseta:");

        JTFDescricaoCamiseta.setFont(new java.awt.Font("Work Sans SemiBold", 0, 12)); // NOI18N
        JTFDescricaoCamiseta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFDescricaoCamiseta.setToolTipText("Infome a descrição do produto sendo vendido");
        JTFDescricaoCamiseta.setActionCommand("<Não Definido>");
        JTFDescricaoCamiseta.setBorder(new javax.swing.border.MatteBorder(null));
        JTFDescricaoCamiseta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDescricaoCamisetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastroAcessórioLayout = new javax.swing.GroupLayout(jPanelCadastroAcessório);
        jPanelCadastroAcessório.setLayout(jPanelCadastroAcessórioLayout);
        jPanelCadastroAcessórioLayout.setHorizontalGroup(
            jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroAcessórioLayout.createSequentialGroup()
                .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroAcessórioLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelAcessorioBolaPreco1)
                            .addComponent(jLabelChuteiraCor)
                            .addComponent(jLabelChuteiraMarca)
                            .addComponent(jLabelChuteiraTamanho1)
                            .addComponent(jLabelAcessorioBolaPreco)
                            .addComponent(jLabelChuteiraModelo1))
                        .addGap(27, 27, 27)
                        .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadastroAcessórioLayout.createSequentialGroup()
                                .addComponent(JTFEtiquetaAcessorio2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(jLabelChuteiraModelo2))
                            .addGroup(jPanelCadastroAcessórioLayout.createSequentialGroup()
                                .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JTFIdFuncionario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFEtiquetaChuteira2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFEtiquetaCamiseta1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFEtiquetaBola1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelChuteiraModelo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelChuteiraModelo3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelChuteiraModelo4, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(JTFCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCadastroAcessórioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(JTFDescricaoChuteira, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelCadastroAcessórioLayout.createSequentialGroup()
                            .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(JTFDescricaoBola, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTFDescricaoAcessorio, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTFDescricaoCamiseta, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(320, 320, 320)))
                    .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BotaoVender, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelCadastroAcessórioLayout.createSequentialGroup()
                            .addComponent(jLabelValorTotal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ValorTotalTextoAqui1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanelCadastroAcessórioLayout.setVerticalGroup(
            jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroAcessórioLayout.createSequentialGroup()
                .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroAcessórioLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadastroAcessórioLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFDescricaoAcessorio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTFEtiquetaAcessorio2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroAcessórioLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelChuteiraModelo1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelChuteiraModelo2, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelChuteiraCor)
                            .addComponent(JTFEtiquetaBola1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelChuteiraModelo)
                            .addComponent(JTFDescricaoBola, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelChuteiraMarca)
                            .addComponent(JTFEtiquetaCamiseta1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelChuteiraModelo4)
                            .addComponent(JTFDescricaoCamiseta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFEtiquetaChuteira2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelChuteiraTamanho1)
                            .addComponent(jLabelChuteiraModelo3)
                            .addComponent(JTFDescricaoChuteira, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAcessorioBolaPreco1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelAcessorioBolaPreco)
                            .addComponent(JTFCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                    .addGroup(jPanelCadastroAcessórioLayout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addGroup(jPanelCadastroAcessórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ValorTotalTextoAqui1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelValorTotal))
                        .addGap(18, 18, 18)
                        .addComponent(BotaoVender, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCadastroAcessório, javax.swing.GroupLayout.DEFAULT_SIZE, 1148, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jLabelCadastroChuteiras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCadastroChuteiras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCadastroAcessório, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTFCpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCpfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFCpfClienteActionPerformed

    private void JTFIdFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFIdFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFIdFuncionarioActionPerformed

    private void JTFEtiquetaAcessorio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFEtiquetaAcessorio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFEtiquetaAcessorio2ActionPerformed

    private void JTFEtiquetaBola1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFEtiquetaBola1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFEtiquetaBola1ActionPerformed

    private void JTFEtiquetaCamiseta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFEtiquetaCamiseta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFEtiquetaCamiseta1ActionPerformed

    private void JTFEtiquetaChuteira2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFEtiquetaChuteira2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFEtiquetaChuteira2ActionPerformed

    private void ValorTotalTextoAqui1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorTotalTextoAqui1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorTotalTextoAqui1ActionPerformed

    private void BotaoVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVenderActionPerformed
        
        String etiquetaAcessorio = (JTFEtiquetaAcessorio2.getText());
        String etiquetaBola = (JTFEtiquetaBola1.getText());
        String etiquetaCamiseta = (JTFEtiquetaCamiseta1.getText());
        String etiquetaChuteira = (JTFEtiquetaChuteira2.getText());
        String idFuncionario = (JTFIdFuncionario.getText());
        String cpfCliente = (JTFCpfCliente.getText());
        String descricaoAcessorio = (JTFDescricaoAcessorio.getText());
        String descricaoBola = (JTFDescricaoBola.getText());
        String descricaoCamiseta = (JTFDescricaoCamiseta.getText());
        String descricaoChuteira = (JTFDescricaoChuteira.getText());
        Double valor = Double.parseDouble(ValorTotalTextoAqui1.getText());
        
        Boolean sucesso;
        Boolean sucesso2;
        Boolean sucesso3;
        Boolean sucesso4;
        Boolean sucesso5;
        
        AcessoriosController acessorioController = new AcessoriosController();
        BolaController bolaController = new BolaController();
        CamisetaController camisetaController = new CamisetaController();
        ChuteiraController chuteiraController = new ChuteiraController();
        VendaController vendaController = new VendaController();

        
        try {
            sucesso = acessorioController.venderAcessorio(etiquetaAcessorio);
            sucesso2 = bolaController.venderBola(etiquetaBola);
            sucesso3 = camisetaController.venderCamiseta(etiquetaCamiseta);
            sucesso4 = chuteiraController.venderChuteira(etiquetaChuteira);
            sucesso5 = vendaController.cadastrarVendas(JTFIdFuncionario.getText(), JTFCpfCliente.getText(), JTFDescricaoAcessorio.getText(), JTFDescricaoBola.getText(), JTFDescricaoCamiseta.getText(), JTFDescricaoChuteira.getText(), valor);
            
             if (sucesso5 == true) { 
                if (sucesso || sucesso2 || sucesso3 || sucesso4) {
                    JOptionPane.showMessageDialog(null, "Venda realizada com sucesso");
                    JTFEtiquetaAcessorio2.setText("");
                    JTFEtiquetaBola1.setText("");
                    JTFEtiquetaCamiseta1.setText("");
                    JTFEtiquetaChuteira2.setText("");
                    JTFIdFuncionario.setText("");
                    JTFCpfCliente.setText("");
                    JTFDescricaoAcessorio.setText("");
                    JTFDescricaoBola.setText("");
                    JTFDescricaoCamiseta.setText("");
                    JTFDescricaoChuteira.setText("");
                    ValorTotalTextoAqui1.setText("");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Venda algo");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Sucesso5 bugado");
            }
        } catch (ExceptionDAO ex) {
            Logger.getLogger(TelaRealizarVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoVenderActionPerformed

    private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoCancelarActionPerformed

    private void JTFDescricaoBolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDescricaoBolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDescricaoBolaActionPerformed

    private void JTFDescricaoAcessorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDescricaoAcessorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDescricaoAcessorioActionPerformed

    private void JTFDescricaoChuteiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDescricaoChuteiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDescricaoChuteiraActionPerformed

    private void JTFDescricaoCamisetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDescricaoCamisetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDescricaoCamisetaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRealizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRealizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRealizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRealizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new TelaRealizarVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoVender;
    private javax.swing.JTextField JTFCpfCliente;
    private javax.swing.JTextField JTFDescricaoAcessorio;
    private javax.swing.JTextField JTFDescricaoBola;
    private javax.swing.JTextField JTFDescricaoCamiseta;
    private javax.swing.JTextField JTFDescricaoChuteira;
    private javax.swing.JTextField JTFEtiquetaAcessorio2;
    private javax.swing.JTextField JTFEtiquetaBola1;
    private javax.swing.JTextField JTFEtiquetaCamiseta1;
    private javax.swing.JTextField JTFEtiquetaChuteira2;
    private javax.swing.JTextField JTFIdFuncionario;
    private javax.swing.JTextField ValorTotalTextoAqui1;
    private javax.swing.JLabel jLabelAcessorioBolaPreco;
    private javax.swing.JLabel jLabelAcessorioBolaPreco1;
    private javax.swing.JLabel jLabelCadastroChuteiras;
    private javax.swing.JLabel jLabelChuteiraCor;
    private javax.swing.JLabel jLabelChuteiraMarca;
    private javax.swing.JLabel jLabelChuteiraModelo;
    private javax.swing.JLabel jLabelChuteiraModelo1;
    private javax.swing.JLabel jLabelChuteiraModelo2;
    private javax.swing.JLabel jLabelChuteiraModelo3;
    private javax.swing.JLabel jLabelChuteiraModelo4;
    private javax.swing.JLabel jLabelChuteiraTamanho1;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JPanel jPanelCadastroAcessório;
    // End of variables declaration//GEN-END:variables
}
