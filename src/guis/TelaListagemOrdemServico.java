package guis;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.OrdemServico;
import services.GerenciadoraOS;

public class TelaListagemOrdemServico extends javax.swing.JFrame {

    
    private GerenciadoraOS GOS = new GerenciadoraOS();
    private OrdemServico os =  new OrdemServico();

    public TelaListagemOrdemServico() {
        initComponents();
        this.setLocationRelativeTo(null);
        listarProcessos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBusca = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAtivo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAguardo = new javax.swing.JTable();
        btAtualizar = new javax.swing.JButton();
        lBuscar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ordem de Serviço");
        setResizable(false);

        jTableAtivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PROCESSO", "FUNCIONÁRIO"
            }
        ));
        jScrollPane2.setViewportView(jTableAtivo);

        jLabel1.setText("O.S ATIVAS:");

        jLabel2.setText("O.S EM ESPERA / FINALIZADAS :");

        jTableAguardo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PROCESSO", "FUNCIONÁRIO"
            }
        ));
        jScrollPane1.setViewportView(jTableAguardo);

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/IconUpdate.png"))); // NOI18N
        btAtualizar.setToolTipText("atualizar lista");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        lBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_search.png"))); // NOI18N
        lBuscar.setToolTipText("buscar");
        lBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lBuscarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAtualizar)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBuscar))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btAtualizar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
       listarProcessos();
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void lBuscarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lBuscarMouseReleased
        buscarOS();
    }//GEN-LAST:event_lBuscarMouseReleased

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
            java.util.logging.Logger.getLogger(TelaListagemOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListagemOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListagemOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListagemOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListagemOrdemServico().setVisible(true);
            }
        });
    }

    public void listarProcessos() {

        List<OrdemServico> list1 = new ArrayList<>();
        List<OrdemServico> list2 = new ArrayList<>();
        
        list1 = GOS.listarOsAberta();
        list2 = GOS.listarOsFechada();
         
        DefaultTableModel tableOsAtiva = (DefaultTableModel) jTableAtivo.getModel();
        DefaultTableModel tableOsAguardo = (DefaultTableModel) jTableAguardo.getModel();
        
        tableOsAtiva.setNumRows(0);
        tableOsAguardo.setNumRows(0);
        
        for (OrdemServico o : list1) {

            Object[] models = {o.getId(), o.getProcesso(), o.getIdUltimoAcesso()};
            tableOsAtiva.addRow(models);
            
        }

        for (OrdemServico o : list2) {

            Object[] models = {o.getId(), o.getProcesso(), o.getIdUltimoAcesso()};
            tableOsAguardo.addRow(models);

        }

    }

    
    
    public void buscarOS(){
         
        try{
        os = GOS.buscarPorId(Integer.parseInt(txtBusca.getText()));
        }catch(java.lang.NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Dígite um número válido!");
            txtBusca.setText(null);
            return;
        }
        if(os != null){
            
            TelaOrdemServico TOS =  new TelaOrdemServico(os);
            
        }else{
            JOptionPane.showMessageDialog(null, "NADA ENCONTRADO COM ID: "+txtBusca.getText());
            txtBusca.setText(null);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAguardo;
    private javax.swing.JTable jTableAtivo;
    private javax.swing.JLabel lBuscar;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
