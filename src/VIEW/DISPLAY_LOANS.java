
package VIEW;
import DAO.D_LOANS;
import Model.Model_Customers;
import Model.Model_Loan;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class DISPLAY_LOANS extends javax.swing.JFrame {

    /**
     * Creates new form DISPLAY_GUI
     */
     private String username ;
    public DISPLAY_LOANS(String username) {
        initComponents();
        this.username = username ;
        
    }
    
    
     // Method to populate the table with loan records
    private void populateTable() {
     D_LOANS d_loan = new D_LOANS ();
     DefaultTableModel model = (DefaultTableModel) data_table.getModel();
     
     model.setRowCount(0);
     
      List <Model_Loan> loans = d_loan.display_loan();
      
      for (Model_Loan loan : loans){
          
          Object [] row = {
              
              loan.getLoan_id(),
              loan.getCustomer_name(),
              loan.getLoan(),
              loan.getInterest_rate(),
              loan.getPayback(),
              loan.getPayback_month(),
              loan.getDuration(),
              loan.getStatus()
              
          };
          
          model.addRow(row);
      }
}


    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        data_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        retrieve_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        applicant_field = new javax.swing.JTextField();
        loan_field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rate_field = new javax.swing.JTextField();
        payback_field = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        monthly_field = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        duration_field = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        update_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        search_entity = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        data_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Loan Id", "Loan Applicant", "Loan Amount", "Interest Rate", "Payback amount", "Payback Month", "Loan duration", "Status"
            }
        ));
        data_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                data_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(data_table);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("All Loans ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/Resized_Logo.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(102, 255, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 204));
        jLabel3.setText("Speedy Loans");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("________________________________________________________________________________________________________________________________________________________________________");

        retrieve_btn.setBackground(new java.awt.Color(102, 255, 204));
        retrieve_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        retrieve_btn.setText("Retrieve");
        retrieve_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieve_btnActionPerformed(evt);
            }
        });

        clear_btn.setBackground(new java.awt.Color(102, 255, 204));
        clear_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear_btn.setText("Clear");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });

        back_btn.setBackground(new java.awt.Color(102, 255, 204));
        back_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Loan Applicant:");

        applicant_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicant_fieldActionPerformed(evt);
            }
        });

        loan_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loan_fieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Loan Amount:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Interest Rate:");

        rate_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rate_fieldActionPerformed(evt);
            }
        });

        payback_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payback_fieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Payback Amount:");

        monthly_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthly_fieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Payaback Month: ");

        duration_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duration_fieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Loan Duration");

        update_btn.setBackground(new java.awt.Color(102, 255, 204));
        update_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update_btn.setText("Update");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        delete_btn.setBackground(new java.awt.Color(102, 255, 204));
        delete_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        search_entity.setBackground(new java.awt.Color(102, 255, 204));
        search_entity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search_entity.setText("Search by entity");
        search_entity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_entityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(26, 26, 26)
                                .addComponent(loan_field, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(26, 26, 26)
                                .addComponent(applicant_field, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(search_entity, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(26, 26, 26)
                                .addComponent(rate_field, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(26, 26, 26)
                                .addComponent(payback_field, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(26, 26, 26)
                        .addComponent(monthly_field, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(353, 353, 353)
                                .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(220, 220, 220)
                                .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(26, 26, 26)
                        .addComponent(duration_field, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(retrieve_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(search_entity, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(applicant_field, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(rate_field, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(monthly_field, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(duration_field, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(payback_field, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(loan_field, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retrieve_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void retrieve_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieve_btnActionPerformed
        populateTable();
    }//GEN-LAST:event_retrieve_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
     this.dispose();
      new ADMIN_DASHBOARD(username).show();
    }//GEN-LAST:event_back_btnActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
         DefaultTableModel model = (DefaultTableModel) data_table.getModel();
         model.setRowCount(0);
         applicant_field.setText("");
         loan_field.setText("");
         rate_field.setText("");
         payback_field.setText("");
         monthly_field.setText("");
         duration_field.setText("");
    }//GEN-LAST:event_clear_btnActionPerformed

    private void applicant_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicant_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_applicant_fieldActionPerformed

    private void loan_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loan_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loan_fieldActionPerformed

    private void rate_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rate_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rate_fieldActionPerformed

    private void payback_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payback_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payback_fieldActionPerformed

    private void monthly_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthly_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthly_fieldActionPerformed

    private void duration_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duration_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duration_fieldActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
           D_LOANS d_loan = new D_LOANS();
           DefaultTableModel model = (DefaultTableModel) data_table.getModel();

           if (data_table.getSelectedRowCount() == 1) {
               int selectedRow = data_table.getSelectedRow();
               int loan_id = (int) model.getValueAt(selectedRow, 0);
               String applicant = applicant_field.getText();
               double loanAmount = Double.parseDouble(loan_field.getText());
               double interestRate = Double.parseDouble(rate_field.getText());
              int duration = Integer.parseInt(duration_field.getText());
               double paybackAmount = Double.parseDouble(payback_field.getText());
               double paybackMonth = Double.parseDouble(monthly_field.getText());

               // Update table model with the new values
               model.setValueAt(applicant, selectedRow, 1);
               model.setValueAt(loanAmount, selectedRow, 2);
               model.setValueAt(interestRate, selectedRow, 3);
               model.setValueAt(paybackAmount, selectedRow, 4);
               model.setValueAt(paybackMonth, selectedRow, 5);
               model.setValueAt(duration, selectedRow, 6);

               // Update loan in the database
               d_loan.update_loan(loan_id, loanAmount, interestRate, duration, paybackAmount, paybackMonth);

               JOptionPane.showMessageDialog(null, "Updated successfully");
           } else {
               if (data_table.getRowCount() == 0) {
                   JOptionPane.showMessageDialog(null, "Table is empty");
               } else {
                   JOptionPane.showMessageDialog(null, "Please select one row");
               }
           }
    }//GEN-LAST:event_update_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        
        D_LOANS d_loan = new D_LOANS();
        DefaultTableModel model = (DefaultTableModel) data_table.getModel();
            if (data_table.getSelectedRowCount() == 1) {
            int selectedRow = data_table.getSelectedRow();
            int loan_id = (int) model.getValueAt(selectedRow, 0); 
            model.removeRow(selectedRow);
            d_loan.delete_loan(loan_id);
            JOptionPane.showMessageDialog(null, "Row deleted successfully");
        } else {
            if (data_table.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Table is empty");
            } else {
                JOptionPane.showMessageDialog(null, "Please select a single row to delete");
            }
        } 
    }//GEN-LAST:event_delete_btnActionPerformed

    private void data_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_tableMouseClicked
        
        DefaultTableModel model = (DefaultTableModel) data_table.getModel();
         
        String applicant = model.getValueAt(data_table.getSelectedRow(), 1).toString();
        double loan = Double.parseDouble(model.getValueAt(data_table.getSelectedRow(), 2).toString());
        double interest = Double.parseDouble(model.getValueAt(data_table.getSelectedRow(), 3).toString());
        double payback = Double.parseDouble(model.getValueAt(data_table.getSelectedRow(), 4).toString());
        double payback_month = Double.parseDouble(model.getValueAt(data_table.getSelectedRow(), 5).toString());
        int duration = Integer.parseInt(model.getValueAt(data_table.getSelectedRow(), 6).toString());


       
       applicant_field.setText(applicant);
       loan_field.setText(String.valueOf(loan));
       payback_field.setText(String.valueOf(payback));
       monthly_field.setText(String.valueOf(payback_month));
       rate_field.setText(String.valueOf(interest));
       duration_field.setText(String.valueOf(duration));
       
       
    }//GEN-LAST:event_data_tableMouseClicked

    private void search_entityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_entityActionPerformed
      this.dispose();
      new ENTITY_VIEW_GUI(username).show();
    }//GEN-LAST:event_search_entityActionPerformed

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
            java.util.logging.Logger.getLogger(DISPLAY_LOANS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DISPLAY_LOANS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DISPLAY_LOANS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DISPLAY_LOANS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        String username = "your username";
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DISPLAY_LOANS(username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField applicant_field;
    private javax.swing.JButton back_btn;
    private javax.swing.JButton clear_btn;
    private javax.swing.JTable data_table;
    private javax.swing.JButton delete_btn;
    private javax.swing.JTextField duration_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField loan_field;
    private javax.swing.JTextField monthly_field;
    private javax.swing.JTextField payback_field;
    private javax.swing.JTextField rate_field;
    private javax.swing.JButton retrieve_btn;
    private javax.swing.JButton search_entity;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
