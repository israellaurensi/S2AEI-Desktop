
package View;

import Controller.AvaliadorController;
import Model.Avaliador;

import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author israellaurensi
 */
public class AvaliadorView extends javax.swing.JFrame {

    AvaliadorController avaController;
    
    public AvaliadorView() {
        initComponents();
        
        avaController = new AvaliadorController();
        tabelaAvaliadores = avaController.updateTable(tabelaAvaliadores);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        avaliadorMenuPanel = new javax.swing.JPanel();
        bttnAddAvaliador = new javax.swing.JButton();
        bttnEditAvaliador = new javax.swing.JButton();
        bttnDeleteAvaliador = new javax.swing.JButton();
        bttnVoltarAvaliador = new javax.swing.JButton();
        avaliadorContentPanel = new javax.swing.JPanel();
        avaliadorIndex = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAvaliadores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        avaliadorAdd = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        avaliadorName = new javax.swing.JTextField();
        avaliadorEmail = new javax.swing.JTextField();
        avaliadorPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        avaliadorArea = new javax.swing.JTextField();
        bttnConfirmAddAvaliador = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        comboFormacaoAvaliador = new javax.swing.JComboBox();
        avaliadorEdit = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        avaliadorNomeEdit = new javax.swing.JTextField();
        avaliadorEmailEdit = new javax.swing.JTextField();
        avaliadorSenhaEdit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        avaliadorAreaEdit = new javax.swing.JTextField();
        bttnConfirmEditAvaliador = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        avaliadorComboFormacaoEdit = new javax.swing.JComboBox();
        avaliadorStatusEdit = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        avaliadorMenuPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bttnAddAvaliador.setText("Novo Avaliador");
        bttnAddAvaliador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAddAvaliadorActionPerformed(evt);
            }
        });

        bttnEditAvaliador.setText("Editar Selecionado");
        bttnEditAvaliador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnEditAvaliadorActionPerformed(evt);
            }
        });

        bttnDeleteAvaliador.setText("Excluir Selecionado");
        bttnDeleteAvaliador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnDeleteAvaliadorActionPerformed(evt);
            }
        });

        bttnVoltarAvaliador.setText("Voltar");
        bttnVoltarAvaliador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnVoltarAvaliadorActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout avaliadorMenuPanelLayout = new org.jdesktop.layout.GroupLayout(avaliadorMenuPanel);
        avaliadorMenuPanel.setLayout(avaliadorMenuPanelLayout);
        avaliadorMenuPanelLayout.setHorizontalGroup(
            avaliadorMenuPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(avaliadorMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(bttnAddAvaliador, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 163, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(bttnEditAvaliador, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 153, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(bttnDeleteAvaliador, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 137, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(bttnVoltarAvaliador, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        avaliadorMenuPanelLayout.linkSize(new java.awt.Component[] {bttnAddAvaliador, bttnDeleteAvaliador, bttnEditAvaliador}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        avaliadorMenuPanelLayout.setVerticalGroup(
            avaliadorMenuPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(avaliadorMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(avaliadorMenuPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(bttnAddAvaliador, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(bttnEditAvaliador)
                    .add(bttnDeleteAvaliador)
                    .add(bttnVoltarAvaliador, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        avaliadorMenuPanelLayout.linkSize(new java.awt.Component[] {bttnAddAvaliador, bttnDeleteAvaliador, bttnEditAvaliador}, org.jdesktop.layout.GroupLayout.VERTICAL);

        avaliadorContentPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        avaliadorContentPanel.setLayout(new java.awt.CardLayout());

        tabelaAvaliadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Email", "Status", "Área", "Formação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaAvaliadores);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Lista de Avaliadores");

        org.jdesktop.layout.GroupLayout avaliadorIndexLayout = new org.jdesktop.layout.GroupLayout(avaliadorIndex);
        avaliadorIndex.setLayout(avaliadorIndexLayout);
        avaliadorIndexLayout.setHorizontalGroup(
            avaliadorIndexLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(avaliadorIndexLayout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, avaliadorIndexLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel1)
                .add(211, 211, 211))
        );
        avaliadorIndexLayout.setVerticalGroup(
            avaliadorIndexLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, avaliadorIndexLayout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );

        avaliadorContentPanel.add(avaliadorIndex, "avaliadorIndex");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Adicionar novo Avaliador");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Senha:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("Área:");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("Formação:");

        bttnConfirmAddAvaliador.setText("Adicionar");
        bttnConfirmAddAvaliador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnConfirmAddAvaliadorActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("Todos os campos são obrigatórios");

        comboFormacaoAvaliador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Graduação", "Pós-Graduação", "Mestrado", "Doutorado" }));

        org.jdesktop.layout.GroupLayout avaliadorAddLayout = new org.jdesktop.layout.GroupLayout(avaliadorAdd);
        avaliadorAdd.setLayout(avaliadorAddLayout);
        avaliadorAddLayout.setHorizontalGroup(
            avaliadorAddLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, avaliadorAddLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel2)
                .add(159, 159, 159))
            .add(avaliadorAddLayout.createSequentialGroup()
                .add(24, 24, 24)
                .add(avaliadorAddLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(avaliadorAddLayout.createSequentialGroup()
                        .add(avaliadorAddLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(avaliadorAddLayout.createSequentialGroup()
                                .add(jLabel7)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(comboFormacaoAvaliador, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 183, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(avaliadorAddLayout.createSequentialGroup()
                                .add(jLabel5)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(avaliadorPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(avaliadorAddLayout.createSequentialGroup()
                                .add(jLabel4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(avaliadorEmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 250, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(avaliadorAddLayout.createSequentialGroup()
                                .add(jLabel6)
                                .add(18, 18, 18)
                                .add(avaliadorArea, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 189, Short.MAX_VALUE)
                        .add(avaliadorAddLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, bttnConfirmAddAvaliador, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 88, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(avaliadorAddLayout.createSequentialGroup()
                        .add(jLabel3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(avaliadorName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel15)))
                .addContainerGap())
        );
        avaliadorAddLayout.setVerticalGroup(
            avaliadorAddLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, avaliadorAddLayout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(avaliadorAddLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(avaliadorAddLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(avaliadorName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabel3))
                    .add(jLabel15))
                .add(18, 18, 18)
                .add(avaliadorAddLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(avaliadorEmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(avaliadorAddLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(avaliadorPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(avaliadorAddLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(avaliadorArea, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(avaliadorAddLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(bttnConfirmAddAvaliador, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(comboFormacaoAvaliador, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(15, 15, 15))
        );

        avaliadorContentPanel.add(avaliadorAdd, "avaliadorAdd");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel8.setText("Editar dados do Avaliador");

        avaliadorEmailEdit.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setText("Nome:");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setText("Email:");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel11.setText("Senha:");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel12.setText("Área:");

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel13.setText("Formação:");

        bttnConfirmEditAvaliador.setText("Confirmar");
        bttnConfirmEditAvaliador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnConfirmEditAvaliadorActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel14.setText("Status:");

        avaliadorComboFormacaoEdit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Graduação", "Pós-Graduação", "Mestrado", "Doutorado" }));

        avaliadorStatusEdit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Inativo" }));

        org.jdesktop.layout.GroupLayout avaliadorEditLayout = new org.jdesktop.layout.GroupLayout(avaliadorEdit);
        avaliadorEdit.setLayout(avaliadorEditLayout);
        avaliadorEditLayout.setHorizontalGroup(
            avaliadorEditLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(avaliadorEditLayout.createSequentialGroup()
                .add(24, 24, 24)
                .add(avaliadorEditLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(avaliadorEditLayout.createSequentialGroup()
                        .add(jLabel13)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(avaliadorComboFormacaoEdit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 183, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(bttnConfirmEditAvaliador, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 131, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(avaliadorEditLayout.createSequentialGroup()
                        .add(jLabel12)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(avaliadorAreaEdit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 88, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(avaliadorEditLayout.createSequentialGroup()
                        .add(avaliadorEditLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(avaliadorEditLayout.createSequentialGroup()
                                .add(jLabel11)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(avaliadorSenhaEdit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(avaliadorEditLayout.createSequentialGroup()
                                .add(jLabel10)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(avaliadorEmailEdit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 250, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(avaliadorEditLayout.createSequentialGroup()
                                .add(jLabel9)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(avaliadorNomeEdit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(104, 104, 104)
                                .add(jLabel14)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(avaliadorStatusEdit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 123, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(0, 72, Short.MAX_VALUE)))
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, avaliadorEditLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel8)
                .add(148, 148, 148))
        );
        avaliadorEditLayout.setVerticalGroup(
            avaliadorEditLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, avaliadorEditLayout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel8)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(avaliadorEditLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(avaliadorNomeEdit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel9)
                    .add(jLabel14)
                    .add(avaliadorStatusEdit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(avaliadorEditLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel10)
                    .add(avaliadorEmailEdit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(avaliadorEditLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel11)
                    .add(avaliadorSenhaEdit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(avaliadorEditLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(avaliadorAreaEdit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel12)
                    .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 9, Short.MAX_VALUE)
                .add(avaliadorEditLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel13)
                    .add(bttnConfirmEditAvaliador, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(avaliadorComboFormacaoEdit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(12, 12, 12))
        );

        avaliadorContentPanel.add(avaliadorEdit, "avaliadorEdit");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, avaliadorContentPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, avaliadorMenuPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(avaliadorContentPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(avaliadorMenuPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnAddAvaliadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAddAvaliadorActionPerformed
        CardLayout content = (CardLayout) (avaliadorContentPanel.getLayout());
        content.show(avaliadorContentPanel, "avaliadorAdd");
    }//GEN-LAST:event_bttnAddAvaliadorActionPerformed

    private void bttnEditAvaliadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnEditAvaliadorActionPerformed

        int rowIndex = tabelaAvaliadores.getSelectedRow();

        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(null,"Escolha um Avaliador da tabela para editar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {

            CardLayout content = (CardLayout) (avaliadorContentPanel.getLayout());
            content.show(avaliadorContentPanel, "avaliadorEdit");

            String emailAvaliadorSelecionado = (String) tabelaAvaliadores.getModel().getValueAt(rowIndex, 1);
            Avaliador a;
            avaController = new AvaliadorController();

            a = avaController.getAvaliadorByEmail(emailAvaliadorSelecionado);

            avaliadorNomeEdit.setText(a.getNome());
            avaliadorEmailEdit.setText(a.getEmail());
            avaliadorSenhaEdit.setText(a.getSenha());
            avaliadorStatusEdit.setSelectedItem(a.getStatus());
            avaliadorAreaEdit.setText(a.getArea());
            avaliadorComboFormacaoEdit.setSelectedItem(a.getFormacao());
        }
    }//GEN-LAST:event_bttnEditAvaliadorActionPerformed

    private void bttnDeleteAvaliadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnDeleteAvaliadorActionPerformed
        CardLayout content = (CardLayout) (avaliadorContentPanel.getLayout());
        content.show(avaliadorContentPanel, "avaliadorDelete");

        int rowIndex = tabelaAvaliadores.getSelectedRow();

        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(null,"Escolha um Avaliador da tabela para excluir.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {

            String message = "";
            String emailAvaliadorSelec = (String) tabelaAvaliadores.getModel().getValueAt(rowIndex, 1);
            String nomeAvaliadorSelec = (String) tabelaAvaliadores.getModel().getValueAt(rowIndex, 0);
            String areaAvaliadorSelec = (String) tabelaAvaliadores.getModel().getValueAt(rowIndex, 3);
            String graduacaoAvaliadorSelec = (String) tabelaAvaliadores.getModel().getValueAt(rowIndex, 4);
            
            String temp = "Deseja excluir o seguinte Avaliador:\n";
            temp += "\n\t\tNome: " + nomeAvaliadorSelec;
            temp += "\n\t\tEmail: " + emailAvaliadorSelec;
            temp += "\n\t\tÁrea: " + areaAvaliadorSelec;
            temp += "\n\t\tGraduação: " + graduacaoAvaliadorSelec;
            temp += "\n\nA exclusão do Avaliador o tornará 'Inativo', incapacitando-o de avaliar projetos";

            int escolha = JOptionPane.showConfirmDialog(null, temp, "Confirmar exclusão?", JOptionPane.OK_CANCEL_OPTION, 0, null);
            
            if (escolha == JOptionPane.OK_OPTION) {
                avaController = new AvaliadorController();
                message = avaController.delAvaliador(emailAvaliadorSelec);

                JOptionPane.showMessageDialog(null, message);

                // atualizar tabela
                avaController = new AvaliadorController();
                tabelaAvaliadores = avaController.updateTable(tabelaAvaliadores);
            }
        }
    }//GEN-LAST:event_bttnDeleteAvaliadorActionPerformed

    private void bttnVoltarAvaliadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnVoltarAvaliadorActionPerformed
        dispose();
        new Index().setVisible(true);
    }//GEN-LAST:event_bttnVoltarAvaliadorActionPerformed

    private void bttnConfirmAddAvaliadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnConfirmAddAvaliadorActionPerformed

        boolean check = false;

        avaController = new AvaliadorController();
        check = avaController.addAvaliador(avaliadorName.getText(), avaliadorEmail.getText(), avaliadorPassword.getText(),
            avaliadorArea.getText(), (String) comboFormacaoAvaliador.getSelectedItem());

        if (check) {
            JOptionPane.showMessageDialog(null, "Avaliador adicionado com sucesso!");

            CardLayout content = (CardLayout) (avaliadorContentPanel.getLayout());
            content.show(avaliadorContentPanel, "avaliadorIndex");

            // atualizar tabela
            avaController = new AvaliadorController();
            tabelaAvaliadores = avaController.updateTable(tabelaAvaliadores);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível completar a ação. Verifique se todos "
                + "os campos estão preenchidos (obrigatório).", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bttnConfirmAddAvaliadorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout content = (CardLayout) (avaliadorContentPanel.getLayout());
        content.show(avaliadorContentPanel, "avaliadorIndex");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bttnConfirmEditAvaliadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnConfirmEditAvaliadorActionPerformed

        boolean check = false;

        avaController = new AvaliadorController();
        check = avaController.updateAvaliador(avaliadorNomeEdit.getText(), avaliadorEmailEdit.getText(), avaliadorSenhaEdit.getText(),
            avaliadorAreaEdit.getText(), (String) avaliadorComboFormacaoEdit.getSelectedItem(), (String) avaliadorStatusEdit.getSelectedItem());

        if (check) {
            JOptionPane.showMessageDialog(null, "Avaliador editado com sucesso!");

            CardLayout content = (CardLayout) (avaliadorContentPanel.getLayout());
            content.show(avaliadorContentPanel, "avaliadorIndex");

            // atualizar tabela
            avaController = new AvaliadorController();
            tabelaAvaliadores = avaController.updateTable(tabelaAvaliadores);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível completar a ação. Erro ao editar Avaliador.");
        }

    }//GEN-LAST:event_bttnConfirmEditAvaliadorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CardLayout content = (CardLayout) (avaliadorContentPanel.getLayout());
        content.show(avaliadorContentPanel, "avaliadorIndex");

        // atualizar tabela
        avaController = new AvaliadorController();
        tabelaAvaliadores = avaController.updateTable(tabelaAvaliadores);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AvaliadorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvaliadorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvaliadorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvaliadorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AvaliadorView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel avaliadorAdd;
    private javax.swing.JTextField avaliadorArea;
    private javax.swing.JTextField avaliadorAreaEdit;
    private javax.swing.JComboBox avaliadorComboFormacaoEdit;
    private javax.swing.JPanel avaliadorContentPanel;
    private javax.swing.JPanel avaliadorEdit;
    private javax.swing.JTextField avaliadorEmail;
    private javax.swing.JTextField avaliadorEmailEdit;
    private javax.swing.JPanel avaliadorIndex;
    private javax.swing.JPanel avaliadorMenuPanel;
    private javax.swing.JTextField avaliadorName;
    private javax.swing.JTextField avaliadorNomeEdit;
    private javax.swing.JTextField avaliadorPassword;
    private javax.swing.JTextField avaliadorSenhaEdit;
    private javax.swing.JComboBox avaliadorStatusEdit;
    private javax.swing.JButton bttnAddAvaliador;
    private javax.swing.JButton bttnConfirmAddAvaliador;
    private javax.swing.JButton bttnConfirmEditAvaliador;
    private javax.swing.JButton bttnDeleteAvaliador;
    private javax.swing.JButton bttnEditAvaliador;
    private javax.swing.JButton bttnVoltarAvaliador;
    private javax.swing.JComboBox comboFormacaoAvaliador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAvaliadores;
    // End of variables declaration//GEN-END:variables
}
