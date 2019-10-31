package guis;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Funcionario;
import services.GerenciadoraFuncionario;

/**
 *
 * @author thiago
 */
public class TelaListagemFuncionario extends javax.swing.JFrame {

    GerenciadoraFuncionario GF = new GerenciadoraFuncionario();

    public TelaListagemFuncionario() {
        initComponents();
        listarFuncionarios();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFun = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        labelBusca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableFun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "FUNÇÃO"
            }
        ));
        jScrollPane1.setViewportView(jTableFun);

        jLabel1.setText("FUNCIONÁRIOS");

        labelBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_search.png"))); // NOI18N
        labelBusca.setToolTipText("buscar funcionário");
        labelBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                labelBuscaMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelBusca)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelBusca)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelBuscaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBuscaMouseReleased
        buscarFuncionario();
    }//GEN-LAST:event_labelBuscaMouseReleased

    //Busca todos os funcionários do banco e lista em uma jTable;
    public void listarFuncionarios() {

        DefaultTableModel tabelaFun = (DefaultTableModel) jTableFun.getModel();
        tabelaFun.setNumRows(0);
        for (Funcionario f : GF.listarFuncionarios()) {

            Object[] models = {f.getId(), f.getNome(), f.getFuncao()};
            tabelaFun.addRow(models);
        }
    }

    public void buscarFuncionario() {

        Funcionario f = new Funcionario();

        try {
            f = GF.buscar(Integer.parseInt(txtBusca.getText()));
            if(f != null){
                TelaFuncionario tf = new TelaFuncionario(f);
                tf.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Nada encontrado com ID "+ txtBusca.getText());
                txtBusca.setText(null);
            }  
        } catch (java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Informe um número válido!");
            txtBusca.setText(null);
            
        }
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFun;
    private javax.swing.JLabel labelBusca;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
