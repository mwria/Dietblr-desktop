package view;

import Controller.ControleVeiculo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Veiculo;
import model.dao.VeiculoDAO;

public class VeiculoFrm extends javax.swing.JFrame {

    ControleVeiculo ctrlv1 = new ControleVeiculo();

    public VeiculoFrm() {
        initComponents();
        btnBuscarActionPerformed(null);
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblCor = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVeiculos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox();
        cmbBuscar = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 82, 111));

        lblMarca.setForeground(new java.awt.Color(255, 255, 255));
        lblMarca.setText("Horário");

        lblModelo.setForeground(new java.awt.Color(255, 255, 255));
        lblModelo.setText("Indice Glicemico:");

        lblCor.setForeground(new java.awt.Color(255, 255, 255));
        lblCor.setText("Periodo:");

        lblPlaca.setForeground(new java.awt.Color(255, 255, 255));
        lblPlaca.setText("Dia");

        txtCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorActionPerformed(evt);
            }
        });

        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tblVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dia ", "Horario", "Indice Glicemico", "Periodo", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVeiculosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVeiculos);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("Status:");

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alta", "Normal", "Baixa", "Hipoglicemia", "Hiperglicemia" }));

        cmbBuscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Bom", "Manutenção", "Quebrado" }));
        cmbBuscar.setName("buscarCbbx"); // NOI18N
        cmbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DIETBLR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCor)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlaca)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblModelo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMarca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStatus)
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExcluir)
                            .addComponent(btnInserir)
                            .addComponent(btnLimpar)
                            .addComponent(btnBuscar)
                            .addComponent(cmbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(264, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCor)
                            .addComponent(lblPlaca)
                            .addComponent(lblMarca)
                            .addComponent(lblModelo)
                            .addComponent(lblStatus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnInserir)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(27, 27, 27)
                        .addComponent(cmbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        cmbBuscar.getAccessibleContext().setAccessibleName("buscarCbbx");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        boolean inseriu = false;
        if (this.txtMarca.getText().isEmpty() || this.txtModelo.getText().isEmpty() || this.txtPlaca.getText().isEmpty() || this.txtCor.getText().isEmpty() || this.cmbStatus.getSelectedItem() == "") {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }else{
            inseriu = ctrlv1.insereVeiculo(this.txtPlaca.getText(), this.txtMarca.getText(), this.txtModelo.getText(), this.txtCor.getText(), (String) this.cmbStatus.getSelectedItem());
        }
            if (inseriu) {
                JOptionPane.showMessageDialog(null, "Inserido com Sucesso!");
                this.txtPlaca.setText("");
                this.txtMarca.setText("");
                this.txtModelo.setText("");
                this.txtCor.setText("");
                  
                this.cmbStatus.setSelectedItem("");
            }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        boolean excluiu = false;
        
        int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja exlcuir?");
        if(i == JOptionPane.YES_OPTION) {
            excluiu = ctrlv1.excluiVeiculo(this.txtPlaca.getText(), this.txtMarca.getText(), this.txtModelo.getText(), this.txtCor.getText(), (String) this.cmbStatus.getSelectedItem());
        }
        else if(i == JOptionPane.NO_OPTION) {
            excluiu = false;
            JOptionPane.showMessageDialog(null, "Operação cancelada!");
        }
        else if(i == JOptionPane.CANCEL_OPTION) {
            excluiu = false;            
        }
        if(excluiu){
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");        
            this.txtPlaca.setText("");
            this.txtMarca.setText("");
            this.txtModelo.setText("");
            this.txtCor.setText("");
            
            this.cmbStatus.setSelectedItem("");
            ((DefaultTableModel) tblVeiculos.getModel()).removeRow(tblVeiculos.getSelectedRow());
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        ArrayList lista = null;
        try{
            switch((String) this.cmbBuscar.getSelectedItem()){
                case "Todos":
                    lista = ctrlv1.buscarVeiculo();
                break;
                case "Bom":
                        lista = ctrlv1.buscarVeiculo();
                break;

                case "Manutenção":
                    lista = ctrlv1.buscarManutencao();
                break;

                case "Quebrado":
                    lista = ctrlv1.buscarQuebrado();
                break;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        try{
            DefaultTableModel dados = (DefaultTableModel) tblVeiculos.getModel();
            dados.setNumRows(0);
            Iterator it = lista.iterator();
            while (it.hasNext()){
                Veiculo v1 = (Veiculo) it.next();
                dados.addRow(new Object[]{v1.getPlaca(), v1.getMarca(), v1.getModelo(), v1.getCor(), v1.getAno(), v1.getStatus()});
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        this.txtPlaca.setText("");
        this.txtMarca.setText("");
        this.txtModelo.setText("");
        this.txtCor.setText("");
      
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tblVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVeiculosMouseClicked
        txtPlaca.setText((String) tblVeiculos.getValueAt(tblVeiculos.getSelectedRow(), 0));
        txtMarca.setText((String) tblVeiculos.getValueAt(tblVeiculos.getSelectedRow(), 1));
        txtModelo.setText((String) tblVeiculos.getValueAt(tblVeiculos.getSelectedRow(), 2));
        txtCor.setText((String) tblVeiculos.getValueAt(tblVeiculos.getSelectedRow(), 3));  
        cmbStatus.setSelectedItem(tblVeiculos.getValueAt(tblVeiculos.getSelectedRow(), 5));
    }//GEN-LAST:event_tblVeiculosMouseClicked

    private void txtCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorActionPerformed

    private void cmbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBuscarActionPerformed

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

        
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VeiculoFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox cmbBuscar;
    private javax.swing.JComboBox cmbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tblVeiculos;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
