package View;

import Model.GerarVetor;
import Model.PesquisaVetor;
import Model.SalvarTXT;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class InternaJoguinoVetor extends javax.swing.JInternalFrame {

    PesquisaVetor pVetor = new PesquisaVetor();
    GerarVetor gVetor = new GerarVetor();
    SalvarTXT sSalvar = new SalvarTXT();
    Timer tTemporizador = new Timer(1000, new hora());
    Timer tTemporizadorInicio = new Timer(1000, new horaInicio());

    private int iSomaAcertos = 0, iSomaErros = 0, iPerdeu = 0, iChances = 0, iTamanho, iValores, iVetor[], iRetorna;

    public InternaJoguinoVetor(String UserLogao) {
        initComponents();
        tTemporizadorInicio.start();
        setPanelEnabled(jPanelBotoes, false);
        tTemporizador.stop();
        iSomaErros = 0;
        iSomaAcertos = 0;
        iPerdeu = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelInfo = new javax.swing.JPanel();
        lblTamanho = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        txtTamanhoVetor = new javax.swing.JTextField();
        txtValoresVetor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtHoraInicio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTempoDecorrido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtAcertos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtErro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtDescricao = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnInicia = new javax.swing.JButton();
        btnParar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtVetor = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtTentativas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtChances = new javax.swing.JTextField();
        jPanelBotoes = new javax.swing.JPanel();
        btnNmr69 = new javax.swing.JButton();
        btnNmr70 = new javax.swing.JButton();
        btnNmr91 = new javax.swing.JButton();
        btnNmr92 = new javax.swing.JButton();
        btnNmr93 = new javax.swing.JButton();
        btnNmr94 = new javax.swing.JButton();
        btnNmr95 = new javax.swing.JButton();
        btnNmr96 = new javax.swing.JButton();
        btnNmr97 = new javax.swing.JButton();
        btnNmr71 = new javax.swing.JButton();
        btnNmr98 = new javax.swing.JButton();
        btnNmr72 = new javax.swing.JButton();
        btnNmr99 = new javax.swing.JButton();
        btnNmr73 = new javax.swing.JButton();
        btnNmr100 = new javax.swing.JButton();
        btnNmr74 = new javax.swing.JButton();
        btnNmr75 = new javax.swing.JButton();
        btnNmr76 = new javax.swing.JButton();
        btnNmr77 = new javax.swing.JButton();
        btnNmr78 = new javax.swing.JButton();
        btnNmr79 = new javax.swing.JButton();
        btnNmr80 = new javax.swing.JButton();
        btnNmr101 = new javax.swing.JButton();
        btnNmr102 = new javax.swing.JButton();
        btnNmr103 = new javax.swing.JButton();
        btnNmr104 = new javax.swing.JButton();
        btnNmr105 = new javax.swing.JButton();
        btnNmr1 = new javax.swing.JButton();
        btnNmr2 = new javax.swing.JButton();
        btnNmr3 = new javax.swing.JButton();
        btnNmr4 = new javax.swing.JButton();
        btnNmr8 = new javax.swing.JButton();
        btnNmr5 = new javax.swing.JButton();
        btnNmr7 = new javax.swing.JButton();
        btnNmr6 = new javax.swing.JButton();
        btnNmr10 = new javax.swing.JButton();
        btnNmr9 = new javax.swing.JButton();
        btnNmr14 = new javax.swing.JButton();
        btnNmr11 = new javax.swing.JButton();
        btnNmr13 = new javax.swing.JButton();
        btnNmr12 = new javax.swing.JButton();
        btnNmr15 = new javax.swing.JButton();
        btnNmr16 = new javax.swing.JButton();
        btnNmr17 = new javax.swing.JButton();
        btnNmr18 = new javax.swing.JButton();
        btnNmr19 = new javax.swing.JButton();
        btnNmr20 = new javax.swing.JButton();
        btnNmr21 = new javax.swing.JButton();
        btnNmr22 = new javax.swing.JButton();
        btnNmr23 = new javax.swing.JButton();
        btnNmr24 = new javax.swing.JButton();
        btnNmr25 = new javax.swing.JButton();
        btnNmr26 = new javax.swing.JButton();
        btnNmr27 = new javax.swing.JButton();
        btnNmr28 = new javax.swing.JButton();
        btnNmr29 = new javax.swing.JButton();
        btnNmr30 = new javax.swing.JButton();
        btnNmr31 = new javax.swing.JButton();
        btnNmr32 = new javax.swing.JButton();
        btnNmr33 = new javax.swing.JButton();
        btnNmr34 = new javax.swing.JButton();
        btnNmr35 = new javax.swing.JButton();
        btnNmr36 = new javax.swing.JButton();
        btnNmr37 = new javax.swing.JButton();
        btnNmr38 = new javax.swing.JButton();
        btnNmr39 = new javax.swing.JButton();
        btnNmr40 = new javax.swing.JButton();
        btnNmr41 = new javax.swing.JButton();
        btnNmr42 = new javax.swing.JButton();
        btnNmr43 = new javax.swing.JButton();
        btnNmr44 = new javax.swing.JButton();
        btnNmr45 = new javax.swing.JButton();
        btnNmr46 = new javax.swing.JButton();
        btnNmr47 = new javax.swing.JButton();
        btnNmr48 = new javax.swing.JButton();
        btnNmr49 = new javax.swing.JButton();
        btnNmr50 = new javax.swing.JButton();
        btnNmr51 = new javax.swing.JButton();
        btnNmr52 = new javax.swing.JButton();
        btnNmr53 = new javax.swing.JButton();
        btnNmr54 = new javax.swing.JButton();
        btnNmr55 = new javax.swing.JButton();
        btnNmr56 = new javax.swing.JButton();
        btnNmr57 = new javax.swing.JButton();
        btnNmr58 = new javax.swing.JButton();
        btnNmr59 = new javax.swing.JButton();
        btnNmr60 = new javax.swing.JButton();
        btnNmr81 = new javax.swing.JButton();
        btnNmr82 = new javax.swing.JButton();
        btnNmr83 = new javax.swing.JButton();
        btnNmr84 = new javax.swing.JButton();
        btnNmr85 = new javax.swing.JButton();
        btnNmr86 = new javax.swing.JButton();
        btnNmr87 = new javax.swing.JButton();
        btnNmr61 = new javax.swing.JButton();
        btnNmr88 = new javax.swing.JButton();
        btnNmr62 = new javax.swing.JButton();
        btnNmr89 = new javax.swing.JButton();
        btnNmr63 = new javax.swing.JButton();
        btnNmr90 = new javax.swing.JButton();
        btnNmr64 = new javax.swing.JButton();
        btnNmr65 = new javax.swing.JButton();
        btnNmr66 = new javax.swing.JButton();
        btnNmr67 = new javax.swing.JButton();
        btnNmr68 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Ordenação de Vetor");
        setMinimumSize(new java.awt.Dimension(500, 500));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                Timer(evt);
            }
        });

        jPanelInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        lblTamanho.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblTamanho.setText("Tamanho do Vetor:");

        lblValor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblValor.setText("Valores do Vetor:");

        txtTamanhoVetor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTamanhoVetor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTamanhoVetorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTamanhoVetorKeyReleased(evt);
            }
        });

        txtValoresVetor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtValoresVetor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValoresVetorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValoresVetorKeyReleased(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtHoraInicio.setEditable(false);
        txtHoraInicio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtHoraInicio.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Inicio:");

        txtTempoDecorrido.setEditable(false);
        txtTempoDecorrido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTempoDecorrido.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Tempo:");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtAcertos.setEditable(false);
        txtAcertos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtAcertos.setForeground(new java.awt.Color(0, 153, 0));
        txtAcertos.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Acertos:");

        txtErro.setEditable(false);
        txtErro.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtErro.setForeground(new java.awt.Color(204, 0, 0));
        txtErro.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("Erros:");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtDescricao.setEditable(false);
        txtDescricao.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDescricao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescricao.setEnabled(false);

        javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(jPanelInfo);
        jPanelInfo.setLayout(jPanelInfoLayout);
        jPanelInfoLayout.setHorizontalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTamanho)
                    .addComponent(lblValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTamanhoVetor, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(txtValoresVetor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHoraInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(txtTempoDecorrido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAcertos)
                    .addComponent(txtErro, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricao)
                .addContainerGap())
        );
        jPanelInfoLayout.setVerticalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtAcertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtErro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTempoDecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTamanho)
                            .addComponent(txtTamanhoVetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValor)
                            .addComponent(txtValoresVetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1)
                    .addComponent(txtDescricao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnInicia.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnInicia.setText("Iniciar");
        btnInicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciaActionPerformed(evt);
            }
        });

        btnParar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnParar.setText("Finalizar");
        btnParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPararActionPerformed(evt);
            }
        });

        txtVetor.setEditable(false);
        txtVetor.setColumns(20);
        txtVetor.setLineWrap(true);
        txtVetor.setRows(5);
        jScrollPane3.setViewportView(txtVetor);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("Tentativas:");

        txtTentativas.setEditable(false);
        txtTentativas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Chances");

        txtChances.setEditable(false);
        txtChances.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jPanelBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNmr69.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr69.setText("69");
        btnNmr69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr69ActionPerformed(evt);
            }
        });

        btnNmr70.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr70.setText("70");
        btnNmr70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr70ActionPerformed(evt);
            }
        });

        btnNmr91.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr91.setText("91");
        btnNmr91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr91ActionPerformed(evt);
            }
        });

        btnNmr92.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr92.setText("92");
        btnNmr92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr92ActionPerformed(evt);
            }
        });

        btnNmr93.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr93.setText("93");
        btnNmr93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr93ActionPerformed(evt);
            }
        });

        btnNmr94.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr94.setText("94");
        btnNmr94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr94ActionPerformed(evt);
            }
        });

        btnNmr95.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr95.setText("95");
        btnNmr95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr95ActionPerformed(evt);
            }
        });

        btnNmr96.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr96.setText("96");
        btnNmr96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr96ActionPerformed(evt);
            }
        });

        btnNmr97.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr97.setText("97");
        btnNmr97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr97ActionPerformed(evt);
            }
        });

        btnNmr71.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr71.setText("71");
        btnNmr71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr71ActionPerformed(evt);
            }
        });

        btnNmr98.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr98.setText("98");
        btnNmr98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr98ActionPerformed(evt);
            }
        });

        btnNmr72.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr72.setText("72");
        btnNmr72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr72ActionPerformed(evt);
            }
        });

        btnNmr99.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr99.setText("99");
        btnNmr99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr99ActionPerformed(evt);
            }
        });

        btnNmr73.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr73.setText("73");
        btnNmr73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr73ActionPerformed(evt);
            }
        });

        btnNmr100.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr100.setText("100");
        btnNmr100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr100ActionPerformed(evt);
            }
        });

        btnNmr74.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr74.setText("74");
        btnNmr74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr74ActionPerformed(evt);
            }
        });

        btnNmr75.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr75.setText("75");
        btnNmr75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr75ActionPerformed(evt);
            }
        });

        btnNmr76.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr76.setText("76");
        btnNmr76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr76ActionPerformed(evt);
            }
        });

        btnNmr77.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr77.setText("77");
        btnNmr77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr77ActionPerformed(evt);
            }
        });

        btnNmr78.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr78.setText("78");
        btnNmr78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr78ActionPerformed(evt);
            }
        });

        btnNmr79.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr79.setText("79");
        btnNmr79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr79ActionPerformed(evt);
            }
        });

        btnNmr80.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr80.setText("80");
        btnNmr80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr80ActionPerformed(evt);
            }
        });

        btnNmr101.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr101.setText("101");
        btnNmr101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr101ActionPerformed(evt);
            }
        });

        btnNmr102.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr102.setText("102");
        btnNmr102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr102ActionPerformed(evt);
            }
        });

        btnNmr103.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr103.setText("103");
        btnNmr103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr103ActionPerformed(evt);
            }
        });

        btnNmr104.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr104.setText("104");
        btnNmr104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr104ActionPerformed(evt);
            }
        });

        btnNmr105.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr105.setText("105");
        btnNmr105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr105ActionPerformed(evt);
            }
        });

        btnNmr1.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr1.setText("1");
        btnNmr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr1ActionPerformed(evt);
            }
        });

        btnNmr2.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr2.setText("2");
        btnNmr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr2ActionPerformed(evt);
            }
        });

        btnNmr3.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr3.setText("3");
        btnNmr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr3ActionPerformed(evt);
            }
        });

        btnNmr4.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr4.setText("4");
        btnNmr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr4ActionPerformed(evt);
            }
        });

        btnNmr8.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr8.setText("8");
        btnNmr8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr8ActionPerformed(evt);
            }
        });

        btnNmr5.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr5.setText("5");
        btnNmr5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr5ActionPerformed(evt);
            }
        });

        btnNmr7.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr7.setText("7");
        btnNmr7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr7ActionPerformed(evt);
            }
        });

        btnNmr6.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr6.setText("6");
        btnNmr6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr6ActionPerformed(evt);
            }
        });

        btnNmr10.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr10.setText("10");
        btnNmr10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr10ActionPerformed(evt);
            }
        });

        btnNmr9.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr9.setText("9");
        btnNmr9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr9ActionPerformed(evt);
            }
        });

        btnNmr14.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr14.setText("14");
        btnNmr14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr14ActionPerformed(evt);
            }
        });

        btnNmr11.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr11.setText("11");
        btnNmr11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr11ActionPerformed(evt);
            }
        });

        btnNmr13.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr13.setText("13");
        btnNmr13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr13ActionPerformed(evt);
            }
        });

        btnNmr12.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr12.setText("12");
        btnNmr12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr12ActionPerformed(evt);
            }
        });

        btnNmr15.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr15.setText("15");
        btnNmr15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr15ActionPerformed(evt);
            }
        });

        btnNmr16.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr16.setText("16");
        btnNmr16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr16ActionPerformed(evt);
            }
        });

        btnNmr17.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr17.setText("17");
        btnNmr17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr17ActionPerformed(evt);
            }
        });

        btnNmr18.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr18.setText("18");
        btnNmr18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr18ActionPerformed(evt);
            }
        });

        btnNmr19.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr19.setText("19");
        btnNmr19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr19ActionPerformed(evt);
            }
        });

        btnNmr20.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr20.setText("20");
        btnNmr20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr20ActionPerformed(evt);
            }
        });

        btnNmr21.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr21.setText("21");
        btnNmr21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr21ActionPerformed(evt);
            }
        });

        btnNmr22.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr22.setText("22");
        btnNmr22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr22ActionPerformed(evt);
            }
        });

        btnNmr23.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr23.setText("23");
        btnNmr23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr23ActionPerformed(evt);
            }
        });

        btnNmr24.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr24.setText("24");
        btnNmr24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr24ActionPerformed(evt);
            }
        });

        btnNmr25.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr25.setText("25");
        btnNmr25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr25ActionPerformed(evt);
            }
        });

        btnNmr26.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr26.setText("26");
        btnNmr26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr26ActionPerformed(evt);
            }
        });

        btnNmr27.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr27.setText("27");
        btnNmr27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr27ActionPerformed(evt);
            }
        });

        btnNmr28.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr28.setText("28");
        btnNmr28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr28ActionPerformed(evt);
            }
        });

        btnNmr29.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr29.setText("29");
        btnNmr29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr29ActionPerformed(evt);
            }
        });

        btnNmr30.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr30.setText("30");
        btnNmr30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr30ActionPerformed(evt);
            }
        });

        btnNmr31.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr31.setText("31");
        btnNmr31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr31ActionPerformed(evt);
            }
        });

        btnNmr32.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr32.setText("32");
        btnNmr32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr32ActionPerformed(evt);
            }
        });

        btnNmr33.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr33.setText("33");
        btnNmr33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr33ActionPerformed(evt);
            }
        });

        btnNmr34.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr34.setText("34");
        btnNmr34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr34ActionPerformed(evt);
            }
        });

        btnNmr35.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr35.setText("35");
        btnNmr35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr35ActionPerformed(evt);
            }
        });

        btnNmr36.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr36.setText("36");
        btnNmr36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr36ActionPerformed(evt);
            }
        });

        btnNmr37.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr37.setText("37");
        btnNmr37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr37ActionPerformed(evt);
            }
        });

        btnNmr38.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr38.setText("38");
        btnNmr38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr38ActionPerformed(evt);
            }
        });

        btnNmr39.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr39.setText("39");
        btnNmr39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr39ActionPerformed(evt);
            }
        });

        btnNmr40.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr40.setText("40");
        btnNmr40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr40ActionPerformed(evt);
            }
        });

        btnNmr41.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr41.setText("41");
        btnNmr41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr41ActionPerformed(evt);
            }
        });

        btnNmr42.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr42.setText("42");
        btnNmr42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr42ActionPerformed(evt);
            }
        });

        btnNmr43.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr43.setText("43");
        btnNmr43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr43ActionPerformed(evt);
            }
        });

        btnNmr44.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr44.setText("44");
        btnNmr44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr44ActionPerformed(evt);
            }
        });

        btnNmr45.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr45.setText("45");
        btnNmr45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr45ActionPerformed(evt);
            }
        });

        btnNmr46.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr46.setText("46");
        btnNmr46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr46ActionPerformed(evt);
            }
        });

        btnNmr47.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr47.setText("47");
        btnNmr47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr47ActionPerformed(evt);
            }
        });

        btnNmr48.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr48.setText("48");
        btnNmr48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr48ActionPerformed(evt);
            }
        });

        btnNmr49.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr49.setText("49");
        btnNmr49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr49ActionPerformed(evt);
            }
        });

        btnNmr50.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr50.setText("50");
        btnNmr50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr50ActionPerformed(evt);
            }
        });

        btnNmr51.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr51.setText("51");
        btnNmr51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr51ActionPerformed(evt);
            }
        });

        btnNmr52.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr52.setText("52");
        btnNmr52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr52ActionPerformed(evt);
            }
        });

        btnNmr53.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr53.setText("53");
        btnNmr53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr53ActionPerformed(evt);
            }
        });

        btnNmr54.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr54.setText("54");
        btnNmr54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr54ActionPerformed(evt);
            }
        });

        btnNmr55.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr55.setText("55");
        btnNmr55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr55ActionPerformed(evt);
            }
        });

        btnNmr56.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr56.setText("56");
        btnNmr56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr56ActionPerformed(evt);
            }
        });

        btnNmr57.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr57.setText("57");
        btnNmr57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr57ActionPerformed(evt);
            }
        });

        btnNmr58.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr58.setText("58");
        btnNmr58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr58ActionPerformed(evt);
            }
        });

        btnNmr59.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr59.setText("59");
        btnNmr59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr59ActionPerformed(evt);
            }
        });

        btnNmr60.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr60.setText("60");
        btnNmr60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr60ActionPerformed(evt);
            }
        });

        btnNmr81.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr81.setText("81");
        btnNmr81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr81ActionPerformed(evt);
            }
        });

        btnNmr82.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr82.setText("82");
        btnNmr82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr82ActionPerformed(evt);
            }
        });

        btnNmr83.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr83.setText("83");
        btnNmr83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr83ActionPerformed(evt);
            }
        });

        btnNmr84.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr84.setText("84");
        btnNmr84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr84ActionPerformed(evt);
            }
        });

        btnNmr85.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr85.setText("85");
        btnNmr85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr85ActionPerformed(evt);
            }
        });

        btnNmr86.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr86.setText("86");
        btnNmr86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr86ActionPerformed(evt);
            }
        });

        btnNmr87.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr87.setText("87");
        btnNmr87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr87ActionPerformed(evt);
            }
        });

        btnNmr61.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr61.setText("61");
        btnNmr61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr61ActionPerformed(evt);
            }
        });

        btnNmr88.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr88.setText("88");
        btnNmr88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr88ActionPerformed(evt);
            }
        });

        btnNmr62.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr62.setText("62");
        btnNmr62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr62ActionPerformed(evt);
            }
        });

        btnNmr89.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr89.setText(" 89");
        btnNmr89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr89ActionPerformed(evt);
            }
        });

        btnNmr63.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr63.setText("63");
        btnNmr63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr63ActionPerformed(evt);
            }
        });

        btnNmr90.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr90.setText("90");
        btnNmr90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr90ActionPerformed(evt);
            }
        });

        btnNmr64.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr64.setText("64");
        btnNmr64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr64ActionPerformed(evt);
            }
        });

        btnNmr65.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr65.setText("65");
        btnNmr65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr65ActionPerformed(evt);
            }
        });

        btnNmr66.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr66.setText("66");
        btnNmr66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr66ActionPerformed(evt);
            }
        });

        btnNmr67.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr67.setText("67");
        btnNmr67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr67ActionPerformed(evt);
            }
        });

        btnNmr68.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnNmr68.setText("68");
        btnNmr68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNmr68ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBotoesLayout.createSequentialGroup()
                        .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                                .addComponent(btnNmr1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNmr4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                                .addComponent(btnNmr16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr17, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr18, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr19, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                                .addComponent(btnNmr5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                                .addComponent(btnNmr20, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr21, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr22, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                                .addComponent(btnNmr8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                                .addComponent(btnNmr23, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr24, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr25, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr26, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNmr27, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                                .addComponent(btnNmr13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr15, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                                .addComponent(btnNmr28, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr29, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr30, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelBotoesLayout.createSequentialGroup()
                        .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                                .addComponent(btnNmr91, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr92, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr93, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr94, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr95, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr96, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr97, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr98, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr99, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr100, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr101, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                                .addComponent(btnNmr76, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr77, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr78, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr79, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr80, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr81, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr82, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr83, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr84, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr85, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr86, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                                .addComponent(btnNmr61, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr62, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr63, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr64, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr65, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr66, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr67, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr68, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr69, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr70, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr71, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                                .addComponent(btnNmr46, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr47, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr48, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr49, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr50, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr51, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr52, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr53, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr54, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr55, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr56, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                                .addComponent(btnNmr31, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr32, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr33, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr34, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr35, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr36, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr37, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr38, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr39, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr40, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr41, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                                .addComponent(btnNmr42, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr43, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr44, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr45, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                                .addComponent(btnNmr57, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr58, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr59, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr60, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                                .addComponent(btnNmr72, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr73, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr74, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr75, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                                .addComponent(btnNmr87, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr88, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr89, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr90, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                                .addComponent(btnNmr102, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr103, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr104, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNmr105, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNmr1)
                    .addComponent(btnNmr2)
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr5)
                        .addComponent(btnNmr4)
                        .addComponent(btnNmr3))
                    .addComponent(btnNmr6)
                    .addComponent(btnNmr7)
                    .addComponent(btnNmr8)
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr14)
                        .addComponent(btnNmr13))
                    .addComponent(btnNmr15)
                    .addComponent(btnNmr9)
                    .addComponent(btnNmr10)
                    .addComponent(btnNmr11)
                    .addComponent(btnNmr12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr16)
                        .addComponent(btnNmr17)
                        .addComponent(btnNmr18)
                        .addComponent(btnNmr19))
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr21)
                        .addComponent(btnNmr20)
                        .addComponent(btnNmr22))
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr24)
                        .addComponent(btnNmr25)
                        .addComponent(btnNmr23)
                        .addComponent(btnNmr26))
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr28)
                        .addComponent(btnNmr29)
                        .addComponent(btnNmr30)
                        .addComponent(btnNmr27)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr31)
                        .addComponent(btnNmr32)
                        .addComponent(btnNmr33)
                        .addComponent(btnNmr34))
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr36)
                        .addComponent(btnNmr35)
                        .addComponent(btnNmr37))
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr39)
                        .addComponent(btnNmr40)
                        .addComponent(btnNmr38)
                        .addComponent(btnNmr41))
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr43)
                        .addComponent(btnNmr44)
                        .addComponent(btnNmr45)
                        .addComponent(btnNmr42)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr46)
                        .addComponent(btnNmr47)
                        .addComponent(btnNmr48)
                        .addComponent(btnNmr49))
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr51)
                        .addComponent(btnNmr50)
                        .addComponent(btnNmr52))
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr54)
                        .addComponent(btnNmr55)
                        .addComponent(btnNmr53)
                        .addComponent(btnNmr56))
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr58)
                        .addComponent(btnNmr59)
                        .addComponent(btnNmr60)
                        .addComponent(btnNmr57)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr61)
                        .addComponent(btnNmr62)
                        .addComponent(btnNmr63)
                        .addComponent(btnNmr64))
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr66)
                        .addComponent(btnNmr65)
                        .addComponent(btnNmr67))
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr69)
                        .addComponent(btnNmr70)
                        .addComponent(btnNmr68)
                        .addComponent(btnNmr71))
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr73)
                        .addComponent(btnNmr74)
                        .addComponent(btnNmr75)
                        .addComponent(btnNmr72)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr76)
                        .addComponent(btnNmr77)
                        .addComponent(btnNmr78)
                        .addComponent(btnNmr79))
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr81)
                        .addComponent(btnNmr80)
                        .addComponent(btnNmr82))
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr84)
                        .addComponent(btnNmr85)
                        .addComponent(btnNmr83)
                        .addComponent(btnNmr86))
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr88)
                        .addComponent(btnNmr89)
                        .addComponent(btnNmr90)
                        .addComponent(btnNmr87)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr91)
                        .addComponent(btnNmr92)
                        .addComponent(btnNmr93)
                        .addComponent(btnNmr94))
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr96)
                        .addComponent(btnNmr95)
                        .addComponent(btnNmr97))
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr99)
                        .addComponent(btnNmr100)
                        .addComponent(btnNmr98)
                        .addComponent(btnNmr101))
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNmr103)
                        .addComponent(btnNmr104)
                        .addComponent(btnNmr105)
                        .addComponent(btnNmr102)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtChances, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTentativas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnParar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInicia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtTentativas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnInicia)
                        .addComponent(btnParar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtChances, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPararActionPerformed
        try {
            txtTamanhoVetor.setEditable(true);
            txtValoresVetor.setEditable(true);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
            setPanelEnable(jPanelInfo, false);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
            btnInicia.setEnabled(true);
            txtVetor.setText("");
            txtAcertos.setText("");
            txtChances.setText("");
            txtDescricao.setText("");
            txtErro.setText("");
            txtHoraInicio.setText("");
            txtTamanhoVetor.setText("");
            txtTempoDecorrido.setText("");
            txtTentativas.setText("");
            txtValoresVetor.setText("");
            txtTamanhoVetor.requestFocus();
            txtTamanhoVetor.setEnabled(true);
            txtValoresVetor.setEnabled(true);
            lblTamanho.setEnabled(true);
            lblValor.setEnabled(true);
            tTemporizadorInicio.start();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Erro", 2);
        }
    }//GEN-LAST:event_btnPararActionPerformed

    private void btnIniciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciaActionPerformed

        try {
            String sTamanho = txtTamanhoVetor.getText();

            String sValores = txtValoresVetor.getText();

            if (txtTamanhoVetor.getText().equals("") || txtValoresVetor.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite um Tamanho e um Valor para poder Prosseguir!");
            } else {
                iTamanho = Integer.parseInt(sTamanho);
                iValores = Integer.parseInt(sValores);
                if (iTamanho > iValores) {
                    JOptionPane.showMessageDialog(this, "Os valores do Vetor não pode ser menor que o seu Tamanho!");
                } else {
                    txtTamanhoVetor.setEditable(false);
                    txtValoresVetor.setEditable(false);
                    setPanelEnabled(jPanelBotoes, true);
                    setPanelEnable(jPanelInfo, true);

                    iVetor = gVetor.GerarVetor(iTamanho, iValores);
                    gVetor.ImprimeVetor(iVetor);

                    tTemporizadorInicio.stop();
                    tTemporizador.start();

                    btnInicia.setEnabled(false);

                    int iContagem = Integer.parseInt(txtTamanhoVetor.getText());
                    iChances = iContagem * 3;
                    iPerdeu = iChances;

                    String sResult = Integer.toString(iChances);
                    txtChances.setText(sResult);
                    txtTentativas.setText(sResult);
                    BloqueiaLimite();
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Erro", 2);
        }
    }//GEN-LAST:event_btnIniciaActionPerformed

    private void Timer(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_Timer


    }//GEN-LAST:event_Timer

    private void btnNmr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr1ActionPerformed

        int btn1 = 1;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr1.setForeground(Color.GREEN);
            btnNmr1.setBackground(Color.GREEN);
            btnNmr1.setEnabled(false);

            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr1.setForeground(Color.RED);
            btnNmr1.setBackground(Color.RED);
            btnNmr1.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }


    }//GEN-LAST:event_btnNmr1ActionPerformed

    private void btnNmr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr2ActionPerformed
        int btn2 = 2;
        String btnV = String.valueOf(btn2);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn2);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr2.setForeground(Color.GREEN);
            btnNmr2.setBackground(Color.GREEN);
            btnNmr2.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr2.setForeground(Color.RED);
            btnNmr2.setBackground(Color.RED);
            btnNmr2.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr2ActionPerformed

    private void btnNmr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr3ActionPerformed
        int btn1 = 3;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr3.setForeground(Color.GREEN);
            btnNmr3.setBackground(Color.GREEN);
            btnNmr3.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr3.setForeground(Color.RED);
            btnNmr3.setBackground(Color.RED);
            btnNmr3.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr3ActionPerformed

    private void btnNmr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr4ActionPerformed
        int btn1 = 4;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr4.setForeground(Color.GREEN);
            btnNmr4.setBackground(Color.GREEN);
            btnNmr4.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr4.setForeground(Color.RED);
            btnNmr4.setBackground(Color.RED);
            btnNmr4.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr4ActionPerformed

    private void btnNmr5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr5ActionPerformed
        int btn1 = 5;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr5.setForeground(Color.GREEN);
            btnNmr5.setBackground(Color.GREEN);
            btnNmr5.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr5.setForeground(Color.RED);
            btnNmr5.setBackground(Color.RED);
            btnNmr5.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr5ActionPerformed

    private void btnNmr6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr6ActionPerformed
        int btn1 = 6;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr6.setForeground(Color.GREEN);
            btnNmr6.setBackground(Color.GREEN);
            btnNmr6.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr6.setForeground(Color.RED);
            btnNmr6.setBackground(Color.RED);
            btnNmr6.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr6ActionPerformed

    private void btnNmr7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr7ActionPerformed
        int btn1 = 7;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr7.setForeground(Color.GREEN);
            btnNmr7.setBackground(Color.GREEN);
            btnNmr7.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr7.setForeground(Color.RED);
            btnNmr7.setBackground(Color.RED);
            btnNmr7.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr7ActionPerformed

    private void btnNmr8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr8ActionPerformed
        int btn1 = 8;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr8.setForeground(Color.GREEN);
            btnNmr8.setBackground(Color.GREEN);
            btnNmr8.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr8.setForeground(Color.RED);
            btnNmr8.setBackground(Color.RED);
            btnNmr8.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr8ActionPerformed

    private void btnNmr9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr9ActionPerformed
        int btn1 = 9;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr9.setForeground(Color.GREEN);
            btnNmr9.setBackground(Color.GREEN);
            btnNmr9.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr9.setForeground(Color.RED);
            btnNmr9.setBackground(Color.RED);
            btnNmr9.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr9ActionPerformed

    private void btnNmr10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr10ActionPerformed
        int btn1 = 10;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr10.setForeground(Color.GREEN);
            btnNmr10.setBackground(Color.GREEN);
            btnNmr10.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr10.setForeground(Color.RED);
            btnNmr10.setBackground(Color.RED);
            btnNmr10.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr10ActionPerformed

    private void btnNmr11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr11ActionPerformed
        int btn1 = 11;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr11.setForeground(Color.GREEN);
            btnNmr11.setBackground(Color.GREEN);
            btnNmr11.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr11.setForeground(Color.RED);
            btnNmr11.setBackground(Color.RED);
            btnNmr11.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr11ActionPerformed

    private void btnNmr12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr12ActionPerformed
        int btn1 = 12;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr12.setForeground(Color.GREEN);
            btnNmr12.setBackground(Color.GREEN);
            btnNmr12.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr12.setForeground(Color.RED);
            btnNmr12.setBackground(Color.RED);
            btnNmr12.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr12ActionPerformed

    private void btnNmr13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr13ActionPerformed
        int btn1 = 13;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr13.setForeground(Color.GREEN);
            btnNmr13.setBackground(Color.GREEN);
            btnNmr13.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr13.setForeground(Color.RED);
            btnNmr13.setBackground(Color.RED);
            btnNmr13.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr13ActionPerformed

    private void btnNmr14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr14ActionPerformed
        int btn1 = 14;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr14.setForeground(Color.GREEN);
            btnNmr14.setBackground(Color.GREEN);
            btnNmr14.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr14.setForeground(Color.RED);
            btnNmr14.setBackground(Color.RED);
            btnNmr14.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr14ActionPerformed

    private void btnNmr15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr15ActionPerformed
        int btn1 = 15;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr15.setForeground(Color.GREEN);
            btnNmr15.setBackground(Color.GREEN);
            btnNmr15.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr15.setForeground(Color.RED);
            btnNmr15.setBackground(Color.RED);
            btnNmr15.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr15ActionPerformed

    private void btnNmr16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr16ActionPerformed
        int btn1 = 16;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr16.setForeground(Color.GREEN);
            btnNmr16.setBackground(Color.GREEN);
            btnNmr16.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr16.setForeground(Color.RED);
            btnNmr16.setBackground(Color.RED);
            btnNmr16.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr16ActionPerformed

    private void btnNmr17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr17ActionPerformed
        int btn1 = 17;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr17.setForeground(Color.GREEN);
            btnNmr17.setBackground(Color.GREEN);
            btnNmr17.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr17.setForeground(Color.RED);
            btnNmr17.setBackground(Color.RED);
            btnNmr17.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr17ActionPerformed

    private void btnNmr18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr18ActionPerformed
        int btn1 = 18;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr18.setForeground(Color.GREEN);
            btnNmr18.setBackground(Color.GREEN);
            btnNmr18.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr18.setForeground(Color.RED);
            btnNmr18.setBackground(Color.RED);
            btnNmr18.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr18ActionPerformed

    private void btnNmr19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr19ActionPerformed
        int btn1 = 19;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr19.setForeground(Color.GREEN);
            btnNmr19.setBackground(Color.GREEN);
            btnNmr19.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr19.setForeground(Color.RED);
            btnNmr19.setBackground(Color.RED);
            btnNmr19.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr19ActionPerformed

    private void btnNmr20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr20ActionPerformed
        int btn1 = 20;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr20.setForeground(Color.GREEN);
            btnNmr20.setBackground(Color.GREEN);
            btnNmr20.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr20.setForeground(Color.RED);
            btnNmr20.setBackground(Color.RED);
            btnNmr20.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr20ActionPerformed

    private void btnNmr21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr21ActionPerformed
        int btn1 = 21;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr21.setForeground(Color.GREEN);
            btnNmr21.setBackground(Color.GREEN);
            btnNmr21.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr21.setForeground(Color.RED);
            btnNmr21.setBackground(Color.RED);
            btnNmr21.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr21ActionPerformed

    private void btnNmr22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr22ActionPerformed
        int btn1 = 22;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr22.setForeground(Color.GREEN);
            btnNmr22.setBackground(Color.GREEN);
            btnNmr22.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr22.setForeground(Color.RED);
            btnNmr22.setBackground(Color.RED);
            btnNmr22.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr22ActionPerformed

    private void btnNmr23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr23ActionPerformed
        int btn1 = 23;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr23.setForeground(Color.GREEN);
            btnNmr23.setBackground(Color.GREEN);
            btnNmr23.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr23.setForeground(Color.RED);
            btnNmr23.setBackground(Color.RED);
            btnNmr23.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr23ActionPerformed

    private void btnNmr24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr24ActionPerformed
        int btn1 = 24;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr24.setForeground(Color.GREEN);
            btnNmr24.setBackground(Color.GREEN);
            btnNmr24.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr24.setForeground(Color.RED);
            btnNmr24.setBackground(Color.RED);
            btnNmr24.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr24ActionPerformed

    private void btnNmr25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr25ActionPerformed
        int btn1 = 25;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr25.setForeground(Color.GREEN);
            btnNmr25.setBackground(Color.GREEN);
            btnNmr25.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr25.setForeground(Color.RED);
            btnNmr25.setBackground(Color.RED);
            btnNmr25.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr25ActionPerformed

    private void btnNmr26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr26ActionPerformed
        int btn1 = 26;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr26.setForeground(Color.GREEN);
            btnNmr26.setBackground(Color.GREEN);
            btnNmr26.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr26.setForeground(Color.RED);
            btnNmr26.setBackground(Color.RED);
            btnNmr26.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr26ActionPerformed

    private void btnNmr27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr27ActionPerformed
        int btn1 = 27;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr27.setForeground(Color.GREEN);
            btnNmr27.setBackground(Color.GREEN);
            btnNmr27.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr27.setForeground(Color.RED);
            btnNmr27.setBackground(Color.RED);
            btnNmr27.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr27ActionPerformed

    private void btnNmr28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr28ActionPerformed
        int btn1 = 28;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr28.setForeground(Color.GREEN);
            btnNmr28.setBackground(Color.GREEN);
            btnNmr28.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr28.setForeground(Color.RED);
            btnNmr28.setBackground(Color.RED);
            btnNmr28.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr28ActionPerformed

    private void btnNmr29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr29ActionPerformed
        int btn1 = 29;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr29.setForeground(Color.GREEN);
            btnNmr29.setBackground(Color.GREEN);
            btnNmr29.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr29.setForeground(Color.RED);
            btnNmr29.setBackground(Color.RED);
            btnNmr29.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr29ActionPerformed

    private void btnNmr30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr30ActionPerformed
        int btn1 = 30;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr30.setForeground(Color.GREEN);
            btnNmr30.setBackground(Color.GREEN);
            btnNmr30.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr30.setForeground(Color.RED);
            btnNmr30.setBackground(Color.RED);
            btnNmr30.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr30ActionPerformed

    private void btnNmr31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr31ActionPerformed
        int btn1 = 31;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr31.setForeground(Color.GREEN);
            btnNmr31.setBackground(Color.GREEN);
            btnNmr31.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr31.setForeground(Color.RED);
            btnNmr31.setBackground(Color.RED);
            btnNmr31.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr31ActionPerformed

    private void btnNmr32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr32ActionPerformed
        int btn1 = 32;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr32.setForeground(Color.GREEN);
            btnNmr32.setBackground(Color.GREEN);
            btnNmr32.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr32.setForeground(Color.RED);
            btnNmr32.setBackground(Color.RED);
            btnNmr32.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr32ActionPerformed

    private void btnNmr33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr33ActionPerformed
        int btn1 = 33;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr33.setForeground(Color.GREEN);
            btnNmr33.setBackground(Color.GREEN);
            btnNmr33.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr33.setForeground(Color.RED);
            btnNmr33.setBackground(Color.RED);
            btnNmr33.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr33ActionPerformed

    private void btnNmr34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr34ActionPerformed
        int btn1 = 34;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr34.setForeground(Color.GREEN);
            btnNmr34.setBackground(Color.GREEN);
            btnNmr34.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr34.setForeground(Color.RED);
            btnNmr34.setBackground(Color.RED);
            btnNmr34.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr34ActionPerformed

    private void btnNmr35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr35ActionPerformed
        int btn1 = 35;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr35.setForeground(Color.GREEN);
            btnNmr35.setBackground(Color.GREEN);
            btnNmr35.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr35.setForeground(Color.RED);
            btnNmr35.setBackground(Color.RED);
            btnNmr35.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr35ActionPerformed

    private void btnNmr36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr36ActionPerformed
        int btn1 = 36;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr36.setForeground(Color.GREEN);
            btnNmr36.setBackground(Color.GREEN);
            btnNmr36.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr36.setForeground(Color.RED);
            btnNmr36.setBackground(Color.RED);
            btnNmr36.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr36ActionPerformed

    private void btnNmr37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr37ActionPerformed
        int btn1 = 37;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr37.setForeground(Color.GREEN);
            btnNmr37.setBackground(Color.GREEN);
            btnNmr37.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr37.setForeground(Color.RED);
            btnNmr37.setBackground(Color.RED);
            btnNmr37.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr37ActionPerformed

    private void btnNmr38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr38ActionPerformed
        int btn1 = 38;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr38.setForeground(Color.GREEN);
            btnNmr38.setBackground(Color.GREEN);
            btnNmr38.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr38.setForeground(Color.RED);
            btnNmr38.setBackground(Color.RED);
            btnNmr38.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr38ActionPerformed

    private void btnNmr39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr39ActionPerformed
        int btn1 = 39;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr39.setForeground(Color.GREEN);
            btnNmr39.setBackground(Color.GREEN);
            btnNmr39.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr39.setForeground(Color.RED);
            btnNmr39.setBackground(Color.RED);
            btnNmr39.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr39ActionPerformed

    private void btnNmr40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr40ActionPerformed
        int btn1 = 40;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr40.setForeground(Color.GREEN);
            btnNmr40.setBackground(Color.GREEN);
            btnNmr40.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr40.setForeground(Color.RED);
            btnNmr40.setBackground(Color.RED);
            btnNmr40.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr40ActionPerformed

    private void btnNmr41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr41ActionPerformed
        int btn1 = 41;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr41.setForeground(Color.GREEN);
            btnNmr41.setBackground(Color.GREEN);
            btnNmr41.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr41.setForeground(Color.RED);
            btnNmr41.setBackground(Color.RED);
            btnNmr41.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr41ActionPerformed

    private void btnNmr42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr42ActionPerformed
        int btn1 = 42;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr42.setForeground(Color.GREEN);
            btnNmr42.setBackground(Color.GREEN);
            btnNmr42.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr42.setForeground(Color.RED);
            btnNmr42.setBackground(Color.RED);
            btnNmr42.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr42ActionPerformed

    private void btnNmr43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr43ActionPerformed
        int btn1 = 43;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr43.setForeground(Color.GREEN);
            btnNmr43.setBackground(Color.GREEN);
            btnNmr43.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr43.setForeground(Color.RED);
            btnNmr43.setBackground(Color.RED);
            btnNmr43.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr43ActionPerformed

    private void btnNmr44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr44ActionPerformed
        int btn1 = 44;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr44.setForeground(Color.GREEN);
            btnNmr44.setBackground(Color.GREEN);
            btnNmr44.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr44.setForeground(Color.RED);
            btnNmr44.setBackground(Color.RED);
            btnNmr44.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr44ActionPerformed

    private void btnNmr45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr45ActionPerformed
        int btn1 = 45;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr45.setForeground(Color.GREEN);
            btnNmr45.setBackground(Color.GREEN);
            btnNmr45.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr45.setForeground(Color.RED);
            btnNmr45.setBackground(Color.RED);
            btnNmr45.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr45ActionPerformed

    private void btnNmr46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr46ActionPerformed
        int btn1 = 46;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr46.setForeground(Color.GREEN);
            btnNmr46.setBackground(Color.GREEN);
            btnNmr46.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr46.setForeground(Color.RED);
            btnNmr46.setBackground(Color.RED);
            btnNmr46.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr46ActionPerformed

    private void btnNmr47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr47ActionPerformed
        int btn1 = 47;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr47.setForeground(Color.GREEN);
            btnNmr47.setBackground(Color.GREEN);
            btnNmr47.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr47.setForeground(Color.RED);
            btnNmr47.setBackground(Color.RED);
            btnNmr47.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr47ActionPerformed

    private void btnNmr48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr48ActionPerformed
        int btn1 = 48;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr48.setForeground(Color.GREEN);
            btnNmr48.setBackground(Color.GREEN);
            btnNmr48.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr48.setForeground(Color.RED);
            btnNmr48.setBackground(Color.RED);
            btnNmr48.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr48ActionPerformed

    private void btnNmr49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr49ActionPerformed
        int btn1 = 49;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr49.setForeground(Color.GREEN);
            btnNmr49.setBackground(Color.GREEN);
            btnNmr49.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr49.setForeground(Color.RED);
            btnNmr49.setBackground(Color.RED);
            btnNmr49.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr49ActionPerformed

    private void btnNmr50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr50ActionPerformed
        int btn1 = 50;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr50.setForeground(Color.GREEN);
            btnNmr50.setBackground(Color.GREEN);
            btnNmr50.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr50.setForeground(Color.RED);
            btnNmr50.setBackground(Color.RED);
            btnNmr50.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr50ActionPerformed

    private void btnNmr51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr51ActionPerformed
        int btn1 = 51;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr51.setForeground(Color.GREEN);
            btnNmr51.setBackground(Color.GREEN);
            btnNmr51.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr51.setForeground(Color.RED);
            btnNmr51.setBackground(Color.RED);
            btnNmr51.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr51ActionPerformed

    private void btnNmr52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr52ActionPerformed
        int btn1 = 52;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr52.setForeground(Color.GREEN);
            btnNmr52.setBackground(Color.GREEN);
            btnNmr52.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr52.setForeground(Color.RED);
            btnNmr52.setBackground(Color.RED);
            btnNmr52.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr52ActionPerformed

    private void btnNmr53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr53ActionPerformed
        int btn1 = 53;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr53.setForeground(Color.GREEN);
            btnNmr53.setBackground(Color.GREEN);
            btnNmr53.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr53.setForeground(Color.RED);
            btnNmr53.setBackground(Color.RED);
            btnNmr53.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr53ActionPerformed

    private void btnNmr54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr54ActionPerformed
        int btn1 = 54;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr54.setForeground(Color.GREEN);
            btnNmr54.setBackground(Color.GREEN);
            btnNmr54.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr54.setForeground(Color.RED);
            btnNmr54.setBackground(Color.RED);
            btnNmr54.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr54ActionPerformed

    private void btnNmr55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr55ActionPerformed
        int btn1 = 55;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr55.setForeground(Color.GREEN);
            btnNmr55.setBackground(Color.GREEN);
            btnNmr55.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr55.setForeground(Color.RED);
            btnNmr55.setBackground(Color.RED);
            btnNmr55.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr55ActionPerformed

    private void btnNmr56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr56ActionPerformed
        int btn1 = 56;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr56.setForeground(Color.GREEN);
            btnNmr56.setBackground(Color.GREEN);
            btnNmr56.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr56.setForeground(Color.RED);
            btnNmr56.setBackground(Color.RED);
            btnNmr56.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr56ActionPerformed

    private void btnNmr57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr57ActionPerformed
        int btn1 = 57;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr57.setForeground(Color.GREEN);
            btnNmr57.setBackground(Color.GREEN);
            btnNmr57.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr57.setForeground(Color.RED);
            btnNmr57.setBackground(Color.RED);
            btnNmr57.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr57ActionPerformed

    private void btnNmr58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr58ActionPerformed
        int btn1 = 58;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr58.setForeground(Color.GREEN);
            btnNmr58.setBackground(Color.GREEN);
            btnNmr58.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr58.setForeground(Color.RED);
            btnNmr58.setBackground(Color.RED);
            btnNmr58.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr58ActionPerformed

    private void btnNmr59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr59ActionPerformed
        int btn1 = 59;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr59.setForeground(Color.GREEN);
            btnNmr59.setBackground(Color.GREEN);
            btnNmr59.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr59.setForeground(Color.RED);
            btnNmr59.setBackground(Color.RED);
            btnNmr59.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr59ActionPerformed

    private void btnNmr60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr60ActionPerformed
        int btn1 = 60;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr60.setForeground(Color.GREEN);
            btnNmr60.setBackground(Color.GREEN);
            btnNmr60.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr60.setForeground(Color.RED);
            btnNmr60.setBackground(Color.RED);
            btnNmr60.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr60ActionPerformed

    private void btnNmr61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr61ActionPerformed
        int btn1 = 61;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr61.setForeground(Color.GREEN);
            btnNmr61.setBackground(Color.GREEN);
            btnNmr61.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr61.setForeground(Color.RED);
            btnNmr61.setBackground(Color.RED);
            btnNmr61.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr61ActionPerformed

    private void btnNmr62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr62ActionPerformed
        int btn1 = 62;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr62.setForeground(Color.GREEN);
            btnNmr62.setBackground(Color.GREEN);
            btnNmr62.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr62.setForeground(Color.RED);
            btnNmr62.setBackground(Color.RED);
            btnNmr62.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr62ActionPerformed

    private void btnNmr63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr63ActionPerformed
        int btn1 = 63;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr63.setForeground(Color.GREEN);
            btnNmr63.setBackground(Color.GREEN);
            btnNmr63.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr63.setForeground(Color.RED);
            btnNmr63.setBackground(Color.RED);
            btnNmr63.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr63ActionPerformed

    private void btnNmr64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr64ActionPerformed
        int btn1 = 64;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr64.setForeground(Color.GREEN);
            btnNmr64.setBackground(Color.GREEN);
            btnNmr64.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr64.setForeground(Color.RED);
            btnNmr64.setBackground(Color.RED);
            btnNmr64.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr64ActionPerformed

    private void btnNmr65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr65ActionPerformed
        int btn1 = 65;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr65.setForeground(Color.GREEN);
            btnNmr65.setBackground(Color.GREEN);
            btnNmr65.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr65.setForeground(Color.RED);
            btnNmr65.setBackground(Color.RED);
            btnNmr65.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr65ActionPerformed

    private void btnNmr66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr66ActionPerformed
        int btn1 = 66;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr66.setForeground(Color.GREEN);
            btnNmr66.setBackground(Color.GREEN);
            btnNmr66.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr66.setForeground(Color.RED);
            btnNmr66.setBackground(Color.RED);
            btnNmr66.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr66ActionPerformed

    private void btnNmr67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr67ActionPerformed
        int btn1 = 67;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr67.setForeground(Color.GREEN);
            btnNmr67.setBackground(Color.GREEN);
            btnNmr67.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr67.setForeground(Color.RED);
            btnNmr67.setBackground(Color.RED);
            btnNmr67.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr67ActionPerformed

    private void btnNmr68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr68ActionPerformed
        int btn1 = 68;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr68.setForeground(Color.GREEN);
            btnNmr68.setBackground(Color.GREEN);
            btnNmr68.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr68.setForeground(Color.RED);
            btnNmr68.setBackground(Color.RED);
            btnNmr68.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr68ActionPerformed

    private void btnNmr69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr69ActionPerformed
        int btn1 = 69;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr69.setForeground(Color.GREEN);
            btnNmr69.setBackground(Color.GREEN);
            btnNmr69.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr69.setForeground(Color.RED);
            btnNmr69.setBackground(Color.RED);
            btnNmr69.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr69ActionPerformed

    private void btnNmr70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr70ActionPerformed
        int btn1 = 70;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr70.setForeground(Color.GREEN);
            btnNmr70.setBackground(Color.GREEN);
            btnNmr70.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr70.setForeground(Color.RED);
            btnNmr70.setBackground(Color.RED);
            btnNmr70.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr70ActionPerformed

    private void btnNmr71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr71ActionPerformed
        int btn1 = 71;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr71.setForeground(Color.GREEN);
            btnNmr71.setBackground(Color.GREEN);
            btnNmr71.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr71.setForeground(Color.RED);
            btnNmr71.setBackground(Color.RED);
            btnNmr71.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr71ActionPerformed

    private void btnNmr72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr72ActionPerformed
        int btn1 = 72;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr72.setForeground(Color.GREEN);
            btnNmr72.setBackground(Color.GREEN);
            btnNmr72.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr72.setForeground(Color.RED);
            btnNmr72.setBackground(Color.RED);
            btnNmr72.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr72ActionPerformed

    private void btnNmr73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr73ActionPerformed
        int btn1 = 73;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr73.setForeground(Color.GREEN);
            btnNmr73.setBackground(Color.GREEN);
            btnNmr73.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr73.setForeground(Color.RED);
            btnNmr73.setBackground(Color.RED);
            btnNmr73.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr73ActionPerformed

    private void btnNmr74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr74ActionPerformed
        int btn1 = 74;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr74.setForeground(Color.GREEN);
            btnNmr74.setBackground(Color.GREEN);
            btnNmr74.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr74.setForeground(Color.RED);
            btnNmr74.setBackground(Color.RED);
            btnNmr74.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr74ActionPerformed

    private void btnNmr75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr75ActionPerformed
        int btn1 = 75;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr75.setForeground(Color.GREEN);
            btnNmr75.setBackground(Color.GREEN);
            btnNmr75.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr75.setForeground(Color.RED);
            btnNmr75.setBackground(Color.RED);
            btnNmr75.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr75ActionPerformed

    private void btnNmr76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr76ActionPerformed
        int btn1 = 76;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr76.setForeground(Color.GREEN);
            btnNmr76.setBackground(Color.GREEN);
            btnNmr76.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr76.setForeground(Color.RED);
            btnNmr76.setBackground(Color.RED);
            btnNmr76.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr76ActionPerformed

    private void btnNmr77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr77ActionPerformed
        int btn1 = 77;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr77.setForeground(Color.GREEN);
            btnNmr77.setBackground(Color.GREEN);
            btnNmr77.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr77.setForeground(Color.RED);
            btnNmr77.setBackground(Color.RED);
            btnNmr77.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr77ActionPerformed

    private void btnNmr78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr78ActionPerformed
        int btn1 = 78;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr78.setForeground(Color.GREEN);
            btnNmr78.setBackground(Color.GREEN);
            btnNmr78.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr78.setForeground(Color.RED);
            btnNmr78.setBackground(Color.RED);
            btnNmr78.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr78ActionPerformed

    private void btnNmr79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr79ActionPerformed
        int btn1 = 79;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr79.setForeground(Color.GREEN);
            btnNmr79.setBackground(Color.GREEN);
            btnNmr79.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr79.setForeground(Color.RED);
            btnNmr79.setBackground(Color.RED);
            btnNmr79.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr79ActionPerformed

    private void btnNmr80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr80ActionPerformed
        int btn1 = 80;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr80.setForeground(Color.GREEN);
            btnNmr80.setBackground(Color.GREEN);
            btnNmr80.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr80.setForeground(Color.RED);
            btnNmr80.setBackground(Color.RED);
            btnNmr80.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr80ActionPerformed

    private void btnNmr81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr81ActionPerformed
        int btn1 = 81;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr81.setForeground(Color.GREEN);
            btnNmr81.setBackground(Color.GREEN);
            btnNmr81.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr81.setForeground(Color.RED);
            btnNmr81.setBackground(Color.RED);
            btnNmr81.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr81ActionPerformed

    private void btnNmr82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr82ActionPerformed
        int btn1 = 82;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr82.setForeground(Color.GREEN);
            btnNmr82.setBackground(Color.GREEN);
            btnNmr82.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr82.setForeground(Color.RED);
            btnNmr82.setBackground(Color.RED);
            btnNmr82.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr82ActionPerformed

    private void btnNmr83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr83ActionPerformed
        int btn1 = 83;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr83.setForeground(Color.GREEN);
            btnNmr83.setBackground(Color.GREEN);
            btnNmr83.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr83.setForeground(Color.RED);
            btnNmr83.setBackground(Color.RED);
            btnNmr83.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr83ActionPerformed

    private void btnNmr84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr84ActionPerformed
        int btn1 = 84;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr84.setForeground(Color.GREEN);
            btnNmr84.setBackground(Color.GREEN);
            btnNmr84.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr84.setForeground(Color.RED);
            btnNmr84.setBackground(Color.RED);
            btnNmr84.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr84ActionPerformed

    private void btnNmr85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr85ActionPerformed
        int btn1 = 85;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr85.setForeground(Color.GREEN);
            btnNmr85.setBackground(Color.GREEN);
            btnNmr85.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr85.setForeground(Color.RED);
            btnNmr85.setBackground(Color.RED);
            btnNmr85.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr85ActionPerformed

    private void btnNmr86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr86ActionPerformed
        int btn1 = 86;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr86.setForeground(Color.GREEN);
            btnNmr86.setBackground(Color.GREEN);
            btnNmr86.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr86.setForeground(Color.RED);
            btnNmr86.setBackground(Color.RED);
            btnNmr86.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr86ActionPerformed

    private void btnNmr87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr87ActionPerformed
        int btn1 = 87;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr87.setForeground(Color.GREEN);
            btnNmr87.setBackground(Color.GREEN);
            btnNmr87.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr87.setForeground(Color.RED);
            btnNmr87.setBackground(Color.RED);
            btnNmr87.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr87ActionPerformed

    private void btnNmr88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr88ActionPerformed
        int btn1 = 88;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr88.setForeground(Color.GREEN);
            btnNmr88.setBackground(Color.GREEN);
            btnNmr88.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr88.setForeground(Color.RED);
            btnNmr88.setBackground(Color.RED);
            btnNmr88.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr88ActionPerformed

    private void btnNmr89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr89ActionPerformed
        int btn1 = 89;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr89.setForeground(Color.GREEN);
            btnNmr89.setBackground(Color.GREEN);
            btnNmr89.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr89.setForeground(Color.RED);
            btnNmr89.setBackground(Color.RED);
            btnNmr89.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr89ActionPerformed

    private void btnNmr90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr90ActionPerformed
        int btn1 = 90;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr90.setForeground(Color.GREEN);
            btnNmr90.setBackground(Color.GREEN);
            btnNmr90.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr90.setForeground(Color.RED);
            btnNmr90.setBackground(Color.RED);
            btnNmr90.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr90ActionPerformed

    private void btnNmr91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr91ActionPerformed
        int btn1 = 91;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr91.setForeground(Color.GREEN);
            btnNmr91.setBackground(Color.GREEN);
            btnNmr91.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr91.setForeground(Color.RED);
            btnNmr91.setBackground(Color.RED);
            btnNmr91.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr91ActionPerformed

    private void btnNmr92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr92ActionPerformed
        int btn1 = 92;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr92.setForeground(Color.GREEN);
            btnNmr92.setBackground(Color.GREEN);
            btnNmr92.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr92.setForeground(Color.RED);
            btnNmr92.setBackground(Color.RED);
            btnNmr92.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr92ActionPerformed

    private void btnNmr93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr93ActionPerformed
        int btn1 = 93;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr93.setForeground(Color.GREEN);
            btnNmr93.setBackground(Color.GREEN);
            btnNmr93.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr93.setForeground(Color.RED);
            btnNmr93.setBackground(Color.RED);
            btnNmr93.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr93ActionPerformed

    private void btnNmr94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr94ActionPerformed
        int btn1 = 94;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr94.setForeground(Color.GREEN);
            btnNmr94.setBackground(Color.GREEN);
            btnNmr94.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr94.setForeground(Color.RED);
            btnNmr94.setBackground(Color.RED);
            btnNmr94.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr94ActionPerformed

    private void btnNmr95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr95ActionPerformed
        int btn1 = 95;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr95.setForeground(Color.GREEN);
            btnNmr95.setBackground(Color.GREEN);
            btnNmr95.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr95.setForeground(Color.RED);
            btnNmr95.setBackground(Color.RED);
            btnNmr95.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr95ActionPerformed

    private void btnNmr96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr96ActionPerformed
        int btn1 = 96;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr96.setForeground(Color.GREEN);
            btnNmr96.setBackground(Color.GREEN);
            btnNmr96.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr96.setForeground(Color.RED);
            btnNmr96.setBackground(Color.RED);
            btnNmr96.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr96ActionPerformed

    private void btnNmr97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr97ActionPerformed
        int btn1 = 97;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr97.setForeground(Color.GREEN);
            btnNmr97.setBackground(Color.GREEN);
            btnNmr97.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr97.setForeground(Color.RED);
            btnNmr97.setBackground(Color.RED);
            btnNmr97.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr97ActionPerformed

    private void btnNmr98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr98ActionPerformed
        int btn1 = 98;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr98.setForeground(Color.GREEN);
            btnNmr98.setBackground(Color.GREEN);
            btnNmr98.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr98.setForeground(Color.RED);
            btnNmr98.setBackground(Color.RED);
            btnNmr98.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr98ActionPerformed

    private void btnNmr99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr99ActionPerformed
        int btn1 = 99;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr99.setForeground(Color.GREEN);
            btnNmr99.setBackground(Color.GREEN);
            btnNmr99.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr99.setForeground(Color.RED);
            btnNmr99.setBackground(Color.RED);
            btnNmr99.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr99ActionPerformed

    private void btnNmr100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr100ActionPerformed
        int btn1 = 100;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr100.setForeground(Color.GREEN);
            btnNmr100.setBackground(Color.GREEN);
            btnNmr100.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr100.setForeground(Color.RED);
            btnNmr100.setBackground(Color.RED);
            btnNmr100.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr100ActionPerformed

    private void btnNmr101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr101ActionPerformed
        int btn1 = 101;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr101.setForeground(Color.GREEN);
            btnNmr101.setBackground(Color.GREEN);
            btnNmr101.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr101.setForeground(Color.RED);
            btnNmr101.setBackground(Color.RED);
            btnNmr101.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr101ActionPerformed

    private void btnNmr102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr102ActionPerformed
        int btn1 = 102;
        String btnV = String.valueOf(btn1);
        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);
        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr102.setForeground(Color.GREEN);
            btnNmr102.setBackground(Color.GREEN);
            btnNmr102.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr102.setForeground(Color.RED);
            btnNmr102.setBackground(Color.RED);
            btnNmr102.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);
        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr102ActionPerformed

    private void btnNmr103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr103ActionPerformed
        int btn1 = 103;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr103.setForeground(Color.GREEN);
            btnNmr103.setBackground(Color.GREEN);
            btnNmr103.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr103.setForeground(Color.RED);
            btnNmr103.setBackground(Color.RED);
            btnNmr103.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr103ActionPerformed

    private void btnNmr104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr104ActionPerformed
        int btn1 = 104;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr104.setForeground(Color.GREEN);
            btnNmr104.setBackground(Color.GREEN);
            btnNmr104.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr104.setForeground(Color.RED);
            btnNmr104.setBackground(Color.RED);
            btnNmr104.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr104ActionPerformed

    private void btnNmr105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNmr105ActionPerformed
        int btn1 = 105;
        String btnV = String.valueOf(btn1);

        iRetorna = pVetor.PesquisaVetor(iVetor, btn1);

        if (iRetorna >= 0) {
            iSomaAcertos++;
            iPerdeu--;
            txtVetor.setText(txtVetor.getText() + btnV + " | ");
            btnNmr105.setForeground(Color.GREEN);
            btnNmr105.setBackground(Color.GREEN);
            btnNmr105.setEnabled(false);
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);

        } else {
            iSomaErros++;
            iPerdeu--;
            btnNmr105.setForeground(Color.RED);
            btnNmr105.setBackground(Color.RED);
            btnNmr105.setEnabled(false);
            txtDescricao.setText(btnV + " Não faz parte do vetor");
        }
        String sSomaAcertos = Integer.toString(iSomaAcertos);
        String sSomaErros = Integer.toString(iSomaErros);
        txtAcertos.setText(sSomaAcertos);
        txtErro.setText(sSomaErros);
        String sPerdeu = Integer.toString(iPerdeu);
        txtTentativas.setText(sPerdeu);

        String sAcerto = txtAcertos.getText();
        int iAcerto = Integer.parseInt(sAcerto);
        if (iTamanho == iAcerto) {
            JOptionPane.showMessageDialog(this, "Você Ganhou!");
            txtDescricao.setText("Vetor: " + btnV + " Posição: " + iRetorna);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        } else if (iPerdeu == 0) {
            String sVetorPerdeu = Arrays.toString(iVetor);
            String sValorMont = txtVetor.getText();
            txtVetor.setText(sValorMont);

            JOptionPane.showMessageDialog(this, "Você perdeu!");
            JOptionPane.showMessageDialog(this, "O Vetor gerado era - - > " + sVetorPerdeu);
            setPanelEnabled(jPanelBotoes, false);
            tTemporizador.stop();
            iSomaErros = 0;
            iSomaAcertos = 0;
            iPerdeu = 0;
        }
    }//GEN-LAST:event_btnNmr105ActionPerformed

    private void txtTamanhoVetorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTamanhoVetorKeyPressed

    }//GEN-LAST:event_txtTamanhoVetorKeyPressed

    private void txtValoresVetorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValoresVetorKeyPressed

    }//GEN-LAST:event_txtValoresVetorKeyPressed

    private void txtTamanhoVetorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTamanhoVetorKeyReleased
        try {

            String sTratamento = txtTamanhoVetor.getText();
            int iTratamento = Integer.parseInt(sTratamento);
            int iValor = 105;
            String sValor = String.valueOf(iValor);

            if (iTratamento > 105) {
                JOptionPane.showMessageDialog(null, "O limite maximo do Vetor é de 105 Posições");
                txtTamanhoVetor.setText(sValor);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_txtTamanhoVetorKeyReleased

    private void txtValoresVetorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValoresVetorKeyReleased
        try {
            String sTratamento = txtValoresVetor.getText();
            int iTratamento = Integer.parseInt(sTratamento);
            int iValor = 105;
            String sValor = String.valueOf(iValor);
            if (iTratamento > 105) {
                JOptionPane.showMessageDialog(null, "O Valor maximo do Vetor é de 105");
                txtValoresVetor.setText(sValor);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_txtValoresVetorKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicia;
    private javax.swing.JButton btnNmr1;
    private javax.swing.JButton btnNmr10;
    private javax.swing.JButton btnNmr100;
    private javax.swing.JButton btnNmr101;
    private javax.swing.JButton btnNmr102;
    private javax.swing.JButton btnNmr103;
    private javax.swing.JButton btnNmr104;
    private javax.swing.JButton btnNmr105;
    private javax.swing.JButton btnNmr11;
    private javax.swing.JButton btnNmr12;
    private javax.swing.JButton btnNmr13;
    private javax.swing.JButton btnNmr14;
    private javax.swing.JButton btnNmr15;
    private javax.swing.JButton btnNmr16;
    private javax.swing.JButton btnNmr17;
    private javax.swing.JButton btnNmr18;
    private javax.swing.JButton btnNmr19;
    private javax.swing.JButton btnNmr2;
    private javax.swing.JButton btnNmr20;
    private javax.swing.JButton btnNmr21;
    private javax.swing.JButton btnNmr22;
    private javax.swing.JButton btnNmr23;
    private javax.swing.JButton btnNmr24;
    private javax.swing.JButton btnNmr25;
    private javax.swing.JButton btnNmr26;
    private javax.swing.JButton btnNmr27;
    private javax.swing.JButton btnNmr28;
    private javax.swing.JButton btnNmr29;
    private javax.swing.JButton btnNmr3;
    private javax.swing.JButton btnNmr30;
    private javax.swing.JButton btnNmr31;
    private javax.swing.JButton btnNmr32;
    private javax.swing.JButton btnNmr33;
    private javax.swing.JButton btnNmr34;
    private javax.swing.JButton btnNmr35;
    private javax.swing.JButton btnNmr36;
    private javax.swing.JButton btnNmr37;
    private javax.swing.JButton btnNmr38;
    private javax.swing.JButton btnNmr39;
    private javax.swing.JButton btnNmr4;
    private javax.swing.JButton btnNmr40;
    private javax.swing.JButton btnNmr41;
    private javax.swing.JButton btnNmr42;
    private javax.swing.JButton btnNmr43;
    private javax.swing.JButton btnNmr44;
    private javax.swing.JButton btnNmr45;
    private javax.swing.JButton btnNmr46;
    private javax.swing.JButton btnNmr47;
    private javax.swing.JButton btnNmr48;
    private javax.swing.JButton btnNmr49;
    private javax.swing.JButton btnNmr5;
    private javax.swing.JButton btnNmr50;
    private javax.swing.JButton btnNmr51;
    private javax.swing.JButton btnNmr52;
    private javax.swing.JButton btnNmr53;
    private javax.swing.JButton btnNmr54;
    private javax.swing.JButton btnNmr55;
    private javax.swing.JButton btnNmr56;
    private javax.swing.JButton btnNmr57;
    private javax.swing.JButton btnNmr58;
    private javax.swing.JButton btnNmr59;
    private javax.swing.JButton btnNmr6;
    private javax.swing.JButton btnNmr60;
    private javax.swing.JButton btnNmr61;
    private javax.swing.JButton btnNmr62;
    private javax.swing.JButton btnNmr63;
    private javax.swing.JButton btnNmr64;
    private javax.swing.JButton btnNmr65;
    private javax.swing.JButton btnNmr66;
    private javax.swing.JButton btnNmr67;
    private javax.swing.JButton btnNmr68;
    private javax.swing.JButton btnNmr69;
    private javax.swing.JButton btnNmr7;
    private javax.swing.JButton btnNmr70;
    private javax.swing.JButton btnNmr71;
    private javax.swing.JButton btnNmr72;
    private javax.swing.JButton btnNmr73;
    private javax.swing.JButton btnNmr74;
    private javax.swing.JButton btnNmr75;
    private javax.swing.JButton btnNmr76;
    private javax.swing.JButton btnNmr77;
    private javax.swing.JButton btnNmr78;
    private javax.swing.JButton btnNmr79;
    private javax.swing.JButton btnNmr8;
    private javax.swing.JButton btnNmr80;
    private javax.swing.JButton btnNmr81;
    private javax.swing.JButton btnNmr82;
    private javax.swing.JButton btnNmr83;
    private javax.swing.JButton btnNmr84;
    private javax.swing.JButton btnNmr85;
    private javax.swing.JButton btnNmr86;
    private javax.swing.JButton btnNmr87;
    private javax.swing.JButton btnNmr88;
    private javax.swing.JButton btnNmr89;
    private javax.swing.JButton btnNmr9;
    private javax.swing.JButton btnNmr90;
    private javax.swing.JButton btnNmr91;
    private javax.swing.JButton btnNmr92;
    private javax.swing.JButton btnNmr93;
    private javax.swing.JButton btnNmr94;
    private javax.swing.JButton btnNmr95;
    private javax.swing.JButton btnNmr96;
    private javax.swing.JButton btnNmr97;
    private javax.swing.JButton btnNmr98;
    private javax.swing.JButton btnNmr99;
    private javax.swing.JButton btnParar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelInfo;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblTamanho;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtAcertos;
    private javax.swing.JTextField txtChances;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtErro;
    private javax.swing.JTextField txtHoraInicio;
    private javax.swing.JTextField txtTamanhoVetor;
    private javax.swing.JTextField txtTempoDecorrido;
    private javax.swing.JTextField txtTentativas;
    private javax.swing.JTextField txtValoresVetor;
    public javax.swing.JTextArea txtVetor;
    // End of variables declaration//GEN-END:variables

    public class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            txtTempoDecorrido.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }
    }

    public class horaInicio implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            txtHoraInicio.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }
    }

    void setPanelEnabled(JPanel panel, Boolean isEnabled) {
        panel.setEnabled(isEnabled);

        Component[] components = panel.getComponents();

        for (int i = 0; i < components.length; i++) {
            if (components[i].getClass().getName() == "javax.swing.JPanel") {
                setPanelEnabled((JPanel) components[i], isEnabled);
            }

            components[i].setEnabled(isEnabled);
            components[i].setBackground(Color.GRAY);
            components[i].setForeground(Color.BLACK);
        }
    }

    void setPanelEnable(JPanel panel, Boolean isEnabled) {
        panel.setEnabled(isEnabled);

        Component[] components = panel.getComponents();

        for (int i = 0; i < components.length; i++) {
            if (components[i].getClass().getName() == "javax.swing.JPanel") {
                setPanelEnabled((JPanel) components[i], isEnabled);
            }
            components[i].setEnabled(isEnabled);
        }
    }

    public void BloqueiaLimite() {

        int iBloqueia = Integer.parseInt(txtValoresVetor.getText());

        if (iBloqueia == 1) {
            btnNmr2.setEnabled(false);
            btnNmr3.setEnabled(false);
            btnNmr4.setEnabled(false);
            btnNmr5.setEnabled(false);
            btnNmr6.setEnabled(false);
            btnNmr7.setEnabled(false);
            btnNmr8.setEnabled(false);
            btnNmr9.setEnabled(false);
            btnNmr10.setEnabled(false);
            btnNmr11.setEnabled(false);
            btnNmr12.setEnabled(false);
            btnNmr13.setEnabled(false);
            btnNmr14.setEnabled(false);
            btnNmr15.setEnabled(false);
            btnNmr16.setEnabled(false);
            btnNmr17.setEnabled(false);
            btnNmr18.setEnabled(false);
            btnNmr19.setEnabled(false);
            btnNmr20.setEnabled(false);
            btnNmr21.setEnabled(false);
            btnNmr22.setEnabled(false);
            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 2) {
            btnNmr3.setEnabled(false);
            btnNmr4.setEnabled(false);
            btnNmr5.setEnabled(false);
            btnNmr6.setEnabled(false);
            btnNmr7.setEnabled(false);
            btnNmr8.setEnabled(false);
            btnNmr9.setEnabled(false);
            btnNmr10.setEnabled(false);
            btnNmr11.setEnabled(false);
            btnNmr12.setEnabled(false);
            btnNmr13.setEnabled(false);
            btnNmr14.setEnabled(false);
            btnNmr15.setEnabled(false);
            btnNmr16.setEnabled(false);
            btnNmr17.setEnabled(false);
            btnNmr18.setEnabled(false);
            btnNmr19.setEnabled(false);
            btnNmr20.setEnabled(false);
            btnNmr21.setEnabled(false);
            btnNmr22.setEnabled(false);
            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 3) {
            btnNmr4.setEnabled(false);
            btnNmr5.setEnabled(false);
            btnNmr6.setEnabled(false);
            btnNmr7.setEnabled(false);
            btnNmr8.setEnabled(false);
            btnNmr9.setEnabled(false);
            btnNmr10.setEnabled(false);
            btnNmr11.setEnabled(false);
            btnNmr12.setEnabled(false);
            btnNmr13.setEnabled(false);
            btnNmr14.setEnabled(false);
            btnNmr15.setEnabled(false);
            btnNmr16.setEnabled(false);
            btnNmr17.setEnabled(false);
            btnNmr18.setEnabled(false);
            btnNmr19.setEnabled(false);
            btnNmr20.setEnabled(false);
            btnNmr21.setEnabled(false);
            btnNmr22.setEnabled(false);
            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 4) {
            btnNmr5.setEnabled(false);
            btnNmr6.setEnabled(false);
            btnNmr7.setEnabled(false);
            btnNmr8.setEnabled(false);
            btnNmr9.setEnabled(false);
            btnNmr10.setEnabled(false);
            btnNmr11.setEnabled(false);
            btnNmr12.setEnabled(false);
            btnNmr13.setEnabled(false);
            btnNmr14.setEnabled(false);
            btnNmr15.setEnabled(false);
            btnNmr16.setEnabled(false);
            btnNmr17.setEnabled(false);
            btnNmr18.setEnabled(false);
            btnNmr19.setEnabled(false);
            btnNmr20.setEnabled(false);
            btnNmr21.setEnabled(false);
            btnNmr22.setEnabled(false);
            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 5) {
            btnNmr6.setEnabled(false);
            btnNmr7.setEnabled(false);
            btnNmr8.setEnabled(false);
            btnNmr9.setEnabled(false);
            btnNmr10.setEnabled(false);
            btnNmr11.setEnabled(false);
            btnNmr12.setEnabled(false);
            btnNmr13.setEnabled(false);
            btnNmr14.setEnabled(false);
            btnNmr15.setEnabled(false);
            btnNmr16.setEnabled(false);
            btnNmr17.setEnabled(false);
            btnNmr18.setEnabled(false);
            btnNmr19.setEnabled(false);
            btnNmr20.setEnabled(false);
            btnNmr21.setEnabled(false);
            btnNmr22.setEnabled(false);
            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 6) {
            btnNmr7.setEnabled(false);
            btnNmr8.setEnabled(false);
            btnNmr9.setEnabled(false);
            btnNmr10.setEnabled(false);
            btnNmr11.setEnabled(false);
            btnNmr12.setEnabled(false);
            btnNmr13.setEnabled(false);
            btnNmr14.setEnabled(false);
            btnNmr15.setEnabled(false);
            btnNmr16.setEnabled(false);
            btnNmr17.setEnabled(false);
            btnNmr18.setEnabled(false);
            btnNmr19.setEnabled(false);
            btnNmr20.setEnabled(false);
            btnNmr21.setEnabled(false);
            btnNmr22.setEnabled(false);
            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 7) {

            btnNmr8.setEnabled(false);
            btnNmr9.setEnabled(false);
            btnNmr10.setEnabled(false);
            btnNmr11.setEnabled(false);
            btnNmr12.setEnabled(false);
            btnNmr13.setEnabled(false);
            btnNmr14.setEnabled(false);
            btnNmr15.setEnabled(false);
            btnNmr16.setEnabled(false);
            btnNmr17.setEnabled(false);
            btnNmr18.setEnabled(false);
            btnNmr19.setEnabled(false);
            btnNmr20.setEnabled(false);
            btnNmr21.setEnabled(false);
            btnNmr22.setEnabled(false);
            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 8) {

            btnNmr9.setEnabled(false);
            btnNmr10.setEnabled(false);
            btnNmr11.setEnabled(false);
            btnNmr12.setEnabled(false);
            btnNmr13.setEnabled(false);
            btnNmr14.setEnabled(false);
            btnNmr15.setEnabled(false);
            btnNmr16.setEnabled(false);
            btnNmr17.setEnabled(false);
            btnNmr18.setEnabled(false);
            btnNmr19.setEnabled(false);
            btnNmr20.setEnabled(false);
            btnNmr21.setEnabled(false);
            btnNmr22.setEnabled(false);
            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 9) {

            btnNmr10.setEnabled(false);
            btnNmr11.setEnabled(false);
            btnNmr12.setEnabled(false);
            btnNmr13.setEnabled(false);
            btnNmr14.setEnabled(false);
            btnNmr15.setEnabled(false);
            btnNmr16.setEnabled(false);
            btnNmr17.setEnabled(false);
            btnNmr18.setEnabled(false);
            btnNmr19.setEnabled(false);
            btnNmr20.setEnabled(false);
            btnNmr21.setEnabled(false);
            btnNmr22.setEnabled(false);
            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 10) {

            btnNmr11.setEnabled(false);
            btnNmr12.setEnabled(false);
            btnNmr13.setEnabled(false);
            btnNmr14.setEnabled(false);
            btnNmr15.setEnabled(false);
            btnNmr16.setEnabled(false);
            btnNmr17.setEnabled(false);
            btnNmr18.setEnabled(false);
            btnNmr19.setEnabled(false);
            btnNmr20.setEnabled(false);
            btnNmr21.setEnabled(false);
            btnNmr22.setEnabled(false);
            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 11) {

            btnNmr12.setEnabled(false);
            btnNmr13.setEnabled(false);
            btnNmr14.setEnabled(false);
            btnNmr15.setEnabled(false);
            btnNmr16.setEnabled(false);
            btnNmr17.setEnabled(false);
            btnNmr18.setEnabled(false);
            btnNmr19.setEnabled(false);
            btnNmr20.setEnabled(false);
            btnNmr21.setEnabled(false);
            btnNmr22.setEnabled(false);
            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 12) {

            btnNmr13.setEnabled(false);
            btnNmr14.setEnabled(false);
            btnNmr15.setEnabled(false);
            btnNmr16.setEnabled(false);
            btnNmr17.setEnabled(false);
            btnNmr18.setEnabled(false);
            btnNmr19.setEnabled(false);
            btnNmr20.setEnabled(false);
            btnNmr21.setEnabled(false);
            btnNmr22.setEnabled(false);
            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 13) {

            btnNmr14.setEnabled(false);
            btnNmr15.setEnabled(false);
            btnNmr16.setEnabled(false);
            btnNmr17.setEnabled(false);
            btnNmr18.setEnabled(false);
            btnNmr19.setEnabled(false);
            btnNmr20.setEnabled(false);
            btnNmr21.setEnabled(false);
            btnNmr22.setEnabled(false);
            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 14) {

            btnNmr15.setEnabled(false);
            btnNmr16.setEnabled(false);
            btnNmr17.setEnabled(false);
            btnNmr18.setEnabled(false);
            btnNmr19.setEnabled(false);
            btnNmr20.setEnabled(false);
            btnNmr21.setEnabled(false);
            btnNmr22.setEnabled(false);
            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 15) {

            btnNmr16.setEnabled(false);
            btnNmr17.setEnabled(false);
            btnNmr18.setEnabled(false);
            btnNmr19.setEnabled(false);
            btnNmr20.setEnabled(false);
            btnNmr21.setEnabled(false);
            btnNmr22.setEnabled(false);
            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 16) {

            btnNmr17.setEnabled(false);
            btnNmr18.setEnabled(false);
            btnNmr19.setEnabled(false);
            btnNmr20.setEnabled(false);
            btnNmr21.setEnabled(false);
            btnNmr22.setEnabled(false);
            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 17) {

            btnNmr18.setEnabled(false);
            btnNmr19.setEnabled(false);
            btnNmr20.setEnabled(false);
            btnNmr21.setEnabled(false);
            btnNmr22.setEnabled(false);
            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 18) {

            btnNmr19.setEnabled(false);
            btnNmr20.setEnabled(false);
            btnNmr21.setEnabled(false);
            btnNmr22.setEnabled(false);
            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 19) {

            btnNmr20.setEnabled(false);
            btnNmr21.setEnabled(false);
            btnNmr22.setEnabled(false);
            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 20) {

            btnNmr21.setEnabled(false);
            btnNmr22.setEnabled(false);
            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 21) {

            btnNmr22.setEnabled(false);
            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 22) {

            btnNmr23.setEnabled(false);
            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 23) {

            btnNmr24.setEnabled(false);
            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 24) {

            btnNmr25.setEnabled(false);
            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 25) {

            btnNmr26.setEnabled(false);
            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 26) {

            btnNmr27.setEnabled(false);
            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 27) {

            btnNmr28.setEnabled(false);
            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 28) {

            btnNmr29.setEnabled(false);
            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        }
        if (iBloqueia == 29) {

            btnNmr30.setEnabled(false);
            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 30) {

            btnNmr31.setEnabled(false);
            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 31) {

            btnNmr32.setEnabled(false);
            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 32) {

            btnNmr33.setEnabled(false);
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 33) {
            btnNmr34.setEnabled(false);
            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 34) {

            btnNmr35.setEnabled(false);
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 35) {
            btnNmr36.setEnabled(false);
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 36) {
            btnNmr37.setEnabled(false);
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 37) {
            btnNmr38.setEnabled(false);
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 38) {
            btnNmr39.setEnabled(false);
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 39) {
            btnNmr40.setEnabled(false);
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 40) {
            btnNmr41.setEnabled(false);
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 41) {
            btnNmr42.setEnabled(false);
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 42) {
            btnNmr43.setEnabled(false);
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 43) {
            btnNmr44.setEnabled(false);
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 44) {
            btnNmr45.setEnabled(false);
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 45) {
            btnNmr46.setEnabled(false);
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 46) {
            btnNmr47.setEnabled(false);
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 47) {
            btnNmr48.setEnabled(false);
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 48) {
            btnNmr49.setEnabled(false);
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 49) {
            btnNmr50.setEnabled(false);
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 50) {
            btnNmr51.setEnabled(false);
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 51) {
            btnNmr52.setEnabled(false);
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 52) {
            btnNmr53.setEnabled(false);
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 53) {
            btnNmr54.setEnabled(false);
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 54) {
            btnNmr55.setEnabled(false);
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 55) {
            btnNmr56.setEnabled(false);
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 56) {
            btnNmr57.setEnabled(false);
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 57) {
            btnNmr58.setEnabled(false);
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 58) {
            btnNmr59.setEnabled(false);
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 59) {
            btnNmr60.setEnabled(false);
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 60) {
            btnNmr61.setEnabled(false);
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 61) {
            btnNmr62.setEnabled(false);
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 62) {
            btnNmr63.setEnabled(false);
            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 63) {

            btnNmr64.setEnabled(false);
            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 64) {

            btnNmr65.setEnabled(false);
            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 65) {

            btnNmr66.setEnabled(false);
            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 66) {

            btnNmr67.setEnabled(false);
            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 67) {

            btnNmr68.setEnabled(false);
            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 68) {

            btnNmr69.setEnabled(false);
            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 69) {

            btnNmr70.setEnabled(false);
            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 70) {

            btnNmr71.setEnabled(false);
            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 71) {

            btnNmr72.setEnabled(false);
            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 72) {

            btnNmr73.setEnabled(false);
            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 73) {

            btnNmr74.setEnabled(false);
            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 74) {

            btnNmr75.setEnabled(false);
            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 75) {

            btnNmr76.setEnabled(false);
            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 76) {

            btnNmr77.setEnabled(false);
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 77) {
            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 78) {

            btnNmr78.setEnabled(false);
            btnNmr79.setEnabled(false);
            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 79) {

            btnNmr80.setEnabled(false);
            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 80) {

            btnNmr81.setEnabled(false);
            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 81) {

            btnNmr82.setEnabled(false);
            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 82) {

            btnNmr83.setEnabled(false);
            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 83) {

            btnNmr84.setEnabled(false);
            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 84) {

            btnNmr85.setEnabled(false);
            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 85) {

            btnNmr86.setEnabled(false);
            btnNmr87.setEnabled(false);
            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 87) {

            btnNmr88.setEnabled(false);
            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 88) {

            btnNmr89.setEnabled(false);
            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 89) {

            btnNmr90.setEnabled(false);
            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 90) {

            btnNmr91.setEnabled(false);
            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 91) {

            btnNmr92.setEnabled(false);
            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 92) {

            btnNmr93.setEnabled(false);
            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 93) {

            btnNmr94.setEnabled(false);
            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 94) {

            btnNmr95.setEnabled(false);
            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 95) {

            btnNmr96.setEnabled(false);
            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 96) {

            btnNmr97.setEnabled(false);
            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 97) {

            btnNmr98.setEnabled(false);
            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 98) {

            btnNmr99.setEnabled(false);
            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 99) {

            btnNmr100.setEnabled(false);
            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 100) {

            btnNmr101.setEnabled(false);
            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 101) {

            btnNmr102.setEnabled(false);
            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 102) {

            btnNmr103.setEnabled(false);
            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 103) {

            btnNmr104.setEnabled(false);
            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 104) {

            btnNmr105.setEnabled(false);

        } else if (iBloqueia == 105) {

            btnNmr105.setEnabled(true);

        }
    }
}
