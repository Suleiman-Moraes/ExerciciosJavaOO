package Interfacegrafica;

import dados.PessoaFisica;
import dados.PessoaJuridica;
import dados.Validacao;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    PessoaFisica pessoaF = null;
    PessoaJuridica pessoaJ = null;
    boolean butao = true;
    
    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonFisica = new javax.swing.JButton();
        jButtonJuridica = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEMail = new javax.swing.JTextField();
        jLabelVariavel1 = new javax.swing.JLabel();
        jTextFieldVariavel1 = new javax.swing.JTextField();
        jLabelVariavel2 = new javax.swing.JLabel();
        jTextFieldVariavel2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSaida = new javax.swing.JTextArea();
        jButtonExecutar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Tipos de Pessoa");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PROJETO TIPOS DE PESSOA");

        jButtonFisica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonFisica.setText("PESSOA FÍSICA");
        jButtonFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFisicaActionPerformed(evt);
            }
        });

        jButtonJuridica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonJuridica.setText("PESSOA JURÍDICA");
        jButtonJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJuridicaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("NOME:");

        jTextFieldNome.setEditable(false);
        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("ENDEREÇO:");

        jTextFieldEndereco.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("TELEFONE:");

        jTextFieldTelefone.setEditable(false);
        jTextFieldTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefoneKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("E-MAIL:");

        jTextFieldEMail.setEditable(false);

        jLabelVariavel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelVariavel1.setText("XXX:");

        jTextFieldVariavel1.setEditable(false);
        jTextFieldVariavel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldVariavel1KeyTyped(evt);
            }
        });

        jLabelVariavel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelVariavel2.setText("XXX:");

        jTextFieldVariavel2.setEditable(false);
        jTextFieldVariavel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldVariavel2KeyTyped(evt);
            }
        });

        jTextAreaSaida.setEditable(false);
        jTextAreaSaida.setColumns(20);
        jTextAreaSaida.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSaida);

        jButtonExecutar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonExecutar.setText("EXECUTAR");
        jButtonExecutar.setEnabled(false);
        jButtonExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExecutarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButtonFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelVariavel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldVariavel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelVariavel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldVariavel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFisica)
                    .addComponent(jButtonJuridica))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVariavel1)
                    .addComponent(jTextFieldVariavel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVariavel2)
                    .addComponent(jTextFieldVariavel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonExecutar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFisicaActionPerformed
        liberaCampo(true);
        labelFisica();
        butao = true;
    }//GEN-LAST:event_jButtonFisicaActionPerformed

    private void jButtonJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJuridicaActionPerformed
        liberaCampo(true);
        labelJuridica();
        butao = false;
    }//GEN-LAST:event_jButtonJuridicaActionPerformed

    private void jButtonExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExecutarActionPerformed
        try{
            liberaCampo(false);
            label0();
            if(butao) {
                receberDadosF();
                saida(pessoaF);
            }
            else {
                receberDadosJ();
                saida(pessoaJ);
            }
            limparCampo();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonExecutarActionPerformed

    private void jTextFieldNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyTyped
        try {
            Validacao x = new Validacao();
        if(!x.validaCampoTexto(String.valueOf(evt.getKeyChar()))){
            evt.consume();
        }
        } catch (Exception e) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNomeKeyTyped

    private void jTextFieldTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneKeyTyped
        try {
            int x = Integer.parseInt(String.valueOf(evt.getKeyChar()));
        } catch (Exception e) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldTelefoneKeyTyped

    private void jTextFieldVariavel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldVariavel1KeyTyped
        try {
            int x = Integer.parseInt(String.valueOf(evt.getKeyChar()));
        } catch (Exception e) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldVariavel1KeyTyped

    private void jTextFieldVariavel2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldVariavel2KeyTyped
        try {
            Validacao x = new Validacao();
        if(!x.validaCampoTexto(String.valueOf(evt.getKeyChar()))){
            evt.consume();
        }
        } catch (Exception e) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldVariavel2KeyTyped

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    private void liberaCampo(boolean trueOuFalse){
        
        jTextFieldEMail.setEditable(trueOuFalse);
        jTextFieldEndereco.setEditable(trueOuFalse);
        jTextFieldNome.setEditable(trueOuFalse);
        jTextFieldTelefone.setEditable(trueOuFalse);
        jTextFieldVariavel1.setEditable(trueOuFalse);
        jTextFieldVariavel2.setEditable(trueOuFalse);
        jButtonExecutar.setEnabled(trueOuFalse);
        jButtonFisica.setEnabled(!trueOuFalse);
        jButtonJuridica.setEnabled(!trueOuFalse);
    }
    private void saida(PessoaFisica objeto){
        String tudo = "";
        tudo += "Nome: " + objeto.getNome() + "\n";
        tudo += "Endereço: " + objeto.getEndereco() + "\n";
        tudo += "Telefone: (62)" + objeto.getTelefone() + "\n";
        tudo += "email: " + objeto.getEmail() + "\n";
        tudo += "CPF: " + objeto.getCpf() + "\n";
        tudo += "Sexo: " + objeto.getSexo();
        
        pessoaF = null;
        
        jTextAreaSaida.setText(tudo);
    }
    private void saida(PessoaJuridica objeto){
        String tudo = "";
        tudo += "Nome: " + objeto.getNome() + "\n";
        tudo += "Endereço: " + objeto.getEndereco() + "\n";
        tudo += "Telefone: (62)" + objeto.getTelefone() + "\n";
        tudo += "email: " + objeto.getEmail() + "\n";
        tudo += "CNPJ: " + objeto.getCnpj()+ "\n";
        tudo += "Razão Social: " + objeto.getRazaoSocial();
        
        pessoaJ = null;
        
        jTextAreaSaida.setText(tudo);
    }
    private void labelFisica(){
        jLabelVariavel1.setText("CPF:");
        jLabelVariavel2.setText("SEXO:");
    }
    private void labelJuridica(){
        jLabelVariavel1.setText("CNPJ:");
        jLabelVariavel2.setText("RAZÃO SOCIAL:");
    }
    private void label0(){
        jLabelVariavel1.setText("XXX:");
        jLabelVariavel2.setText("XXX:");
    }
    private void receberDadosF() throws Exception{
        try{
            pessoaF = new PessoaFisica(jTextFieldNome.getText(), jTextFieldEndereco.getText(), Integer.parseInt(jTextFieldTelefone.getText()),
            jTextFieldEMail.getText(), Long.parseLong(jTextFieldVariavel1.getText()), jTextFieldVariavel2.getText());
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void receberDadosJ() throws Exception{
        try{
            pessoaJ = new PessoaJuridica(jTextFieldNome.getText(), jTextFieldEndereco.getText(), Integer.parseInt(jTextFieldTelefone.getText()),
            jTextFieldEMail.getText(), Long.parseLong(jTextFieldVariavel1.getText()), jTextFieldVariavel2.getText());
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void limparCampo(){
        jTextFieldEMail.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldNome.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldVariavel1.setText("");
        jTextFieldVariavel2.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExecutar;
    private javax.swing.JButton jButtonFisica;
    private javax.swing.JButton jButtonJuridica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelVariavel1;
    private javax.swing.JLabel jLabelVariavel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaSaida;
    private javax.swing.JTextField jTextFieldEMail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldVariavel1;
    private javax.swing.JTextField jTextFieldVariavel2;
    // End of variables declaration//GEN-END:variables
}
