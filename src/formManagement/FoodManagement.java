/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import stourestaurant.MyConnect;

/**
 *
 * @author Jin
 */
public class FoodManagement extends javax.swing.JInternalFrame {

    private Connection conn = MyConnect.getConnection();
    private DefaultTableModel modelFood;

    /**
     * Creates new form JFrameApartment
     */
    /**
     * Creates new form MemeberManagerment
     */
    public FoodManagement() {

        initComponents();
        modelFood = (DefaultTableModel) tbFood.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDelete = new javax.swing.JButton();
        headerFood = new javax.swing.JLabel();
        txtFoodName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFood = new javax.swing.JTable();
        lbFoodCost = new javax.swing.JLabel();
        txtFoodCost = new javax.swing.JTextField();
        searchPaneFood = new javax.swing.JPanel();
        txtSearchFood = new javax.swing.JTextField();
        lbFoodID = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        txtFoodID = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        lbFoodName = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("??????????????????????????????????????????");
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
                formInternalFrameOpened(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        headerFood.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        headerFood.setText("??????????????????????????????????????????");

        txtFoodName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tbFood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "???????????????????????????", "???????????????????????????", "???????????????????????????"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbFood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFoodMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbFood);

        lbFoodCost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbFoodCost.setLabelFor(txtFoodCost);
        lbFoodCost.setText("??????????????????????????? :");

        txtFoodCost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        searchPaneFood.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        txtSearchFood.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearchFood.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchFoodKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout searchPaneFoodLayout = new javax.swing.GroupLayout(searchPaneFood);
        searchPaneFood.setLayout(searchPaneFoodLayout);
        searchPaneFoodLayout.setHorizontalGroup(
            searchPaneFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPaneFoodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchFood, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );
        searchPaneFoodLayout.setVerticalGroup(
            searchPaneFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPaneFoodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        lbFoodID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbFoodID.setLabelFor(txtFoodID);
        lbFoodID.setText("??????????????????????????? :");

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        txtFoodID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lbFoodName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbFoodName.setLabelFor(txtFoodName);
        lbFoodName.setText("??????????????????????????? :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbFoodCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbFoodName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbFoodID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtFoodID)
                                            .addComponent(txtFoodName, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFoodCost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnInsert)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUpdate)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDelete)
                                        .addGap(141, 141, 141)))
                                .addComponent(searchPaneFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(headerFood)
                                .addGap(292, 292, 292))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(searchPaneFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(headerFood)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFoodID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFoodCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbFoodID)
                                .addGap(18, 18, 18)
                                .addComponent(lbFoodName)
                                .addGap(18, 18, 18)
                                .addComponent(lbFoodCost)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsert)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete))
                        .addGap(41, 41, 41)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        showData();
    }//GEN-LAST:event_formInternalFrameOpened

    private void tbFoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFoodMouseClicked
        // TODO add your handling code here:
        int index = tbFood.getSelectedRow();
        txtFoodID.setText(tbFood.getValueAt(index, 0).toString());
        txtFoodName.setText(tbFood.getValueAt(index, 1).toString());
        txtFoodCost.setText(tbFood.getValueAt(index, 2).toString());
    }//GEN-LAST:event_tbFoodMouseClicked

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO tb_food (food_id,food_name,food_cost) VALUES (?,?,?)";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, txtFoodID.getText());
            pre.setString(2, txtFoodName.getText());
            pre.setString(3, txtFoodCost.getText());
            if (pre.executeUpdate() != -1) {
                JOptionPane.showMessageDialog(this, "????????????????????????????????????????????????", "???????????????????????????????????????????????????", JOptionPane.INFORMATION_MESSAGE);
                txtFoodID.setText("");
                txtFoodName.setText("");
                txtFoodCost.setText("");
                showData();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int index = tbFood.getSelectedRow();
        if (index != -1) {

            String pk = txtFoodID.getText().trim();
            String sql = "Delete from tb_food where food_id =?";

            try {
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, pk);
                if (pre.executeUpdate() != -1) {
                    JOptionPane.showMessageDialog(this, "????????????????????????????????????", "???????????????????????????????????????",
                            JOptionPane.INFORMATION_MESSAGE);
                    txtFoodID.setText("");
                    txtFoodName.setText("");
                    txtFoodCost.setText("");
                    showData();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int index = tbFood.getSelectedRow();
        if (index != -1) {
            String pk = txtFoodID.getText().trim();
            String sql = "UPDATE tb_food SET "
                    + "food_name = ?, "
                    + "food_cost = ? "
                    + "WHERE food_id = ?";

            try {
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, txtFoodName.getText());
                pre.setString(2, txtFoodCost.getText());
                pre.setString(3, pk);
                if (pre.executeUpdate() != -1) {
                }
                JOptionPane.showMessageDialog(this, "?????????????????????????????????????????????", "???????????????????????????????????????????????????",
                        JOptionPane.INFORMATION_MESSAGE);
                txtFoodID.setText("");
                txtFoodName.setText("");
                txtFoodCost.setText("");
                showData();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtSearchFoodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchFoodKeyReleased
        // TODO add your handling code here:
        String searchText = txtSearchFood.getText();
        try {
            showData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSearchFoodKeyReleased

    public void showData() {
        try {
//clear data
            int totalRow = tbFood.getRowCount() - 1;
            while (totalRow > - 1) {
                modelFood.removeRow(totalRow);
                totalRow--;
            }
// add record
            String search = txtSearchFood.getText();
            String sql = " SELECT * FROM tb_food "
                    + " where "
                    + " food_id LIKE ('%" + search + "%' )"
                    + " OR food_name LIKE ('%" + search + "%')"
                    + " OR food_cost LIKE ('%" + search + "%')";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            int row = 0;
            while (rs.next()) {
                modelFood.addRow(new Object[0]);
                modelFood.setValueAt(rs.getString("food_id"), row, 0);
                modelFood.setValueAt(rs.getString("food_name"), row, 1);
                modelFood.setValueAt(rs.getString("food_cost"), row, 2);
                row++;
            }
            tbFood.setModel(modelFood);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel headerFood;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbFoodCost;
    private javax.swing.JLabel lbFoodID;
    private javax.swing.JLabel lbFoodName;
    private javax.swing.JPanel searchPaneFood;
    private javax.swing.JTable tbFood;
    private javax.swing.JTextField txtFoodCost;
    private javax.swing.JTextField txtFoodID;
    private javax.swing.JTextField txtFoodName;
    private javax.swing.JTextField txtSearchFood;
    // End of variables declaration//GEN-END:variables
}
