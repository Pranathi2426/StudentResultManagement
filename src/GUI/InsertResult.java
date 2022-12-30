package GUI;

import ConnectionProvider.ConnectionProviderCode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class InsertResult extends javax.swing.JFrame {

    public InsertResult() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rollLabel = new javax.swing.JLabel();
        rollField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        phyLabel = new javax.swing.JLabel();
        mathsLabel = new javax.swing.JLabel();
        chemLabel = new javax.swing.JLabel();
        electricalLabel = new javax.swing.JLabel();
        bioLabel = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        phyField = new javax.swing.JTextField();
        mathsField = new javax.swing.JTextField();
        chemField = new javax.swing.JTextField();
        electricField = new javax.swing.JTextField();
        bioField = new javax.swing.JTextField();
        addResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rollLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rollLabel.setText("Roll No");
        getContentPane().add(rollLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        rollField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(rollField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 123, -1));

        searchBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));

        studentTable.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Roll No", "Gender", "Fahter's Name", "Course", "Branch"
            }
        ));
        studentTable.setRowHeight(30);
        jScrollPane1.setViewportView(studentTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 720, 160));

        phyLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        phyLabel.setText("Physics");
        phyLabel.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(phyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, -1));

        mathsLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        mathsLabel.setText("Maths");
        mathsLabel.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(mathsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, -1, -1));

        chemLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        chemLabel.setText("Chemistry");
        chemLabel.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(chemLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, -1, -1));

        electricalLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        electricalLabel.setText("Electrical");
        electricalLabel.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(electricalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 650, -1, -1));

        bioLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bioLabel.setText("Biology");
        bioLabel.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(bioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 720, -1, -1));

        submitBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 670, -1, -1));

        exitBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 730, 82, -1));

        phyField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        phyField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(phyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, -1));

        mathsField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        mathsField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(mathsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, -1, -1));

        chemField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        chemField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(chemField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, -1, -1));

        electricField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        electricField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(electricField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 650, -1, -1));

        bioField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bioField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(bioField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 720, -1, -1));

        addResult.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addResult.setText("Add Result");
        getContentPane().add(addResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String rollNo =rollField.getText();
        try{
            Connection con = ConnectionProviderCode.getcon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from student where rollNo='"+rollNo+"'");
            studentTable.setModel(DbUtils.resultSetToTableModel(rs));
            if(!rs.first()){ 
                JOptionPane.showMessageDialog(null, "Entered rollNo doesn't exist");
            }
            else{
                rollField.setEditable(false);
            }
         
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        String rollNo = rollField.getText();
        int physicsMarks = Integer.parseInt(phyField.getText());
        int mathsMarks = Integer.parseInt(mathsField.getText());
        int chemMarks = Integer.parseInt(chemField.getText());
        int electricalMarks = Integer.parseInt(electricField.getText());
        int bioMarks = Integer.parseInt(bioField.getText());
        int result = 0;
        result = physicsMarks + chemMarks + mathsMarks + electricalMarks + bioMarks;
        
        try{
            Connection con = ConnectionProviderCode.getcon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into result values("+ rollNo + ", " + physicsMarks +", "+ mathsMarks +", "+ chemMarks +", "+ electricalMarks +", "+ bioMarks + ", " + result + ")");
            JOptionPane.showMessageDialog(null, "Successfully Added");
            setVisible(false);
            InsertResult frame = new InsertResult();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        int flag = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit this page ...", "Submit", JOptionPane.YES_NO_OPTION);
        if(flag == 0){
            setVisible(false);
        }   
    }//GEN-LAST:event_exitBtnActionPerformed

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertResult().setVisible(true);
            }
        });
    }
    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addResult;
    private javax.swing.JTextField bioField;
    private javax.swing.JLabel bioLabel;
    private javax.swing.JTextField chemField;
    private javax.swing.JLabel chemLabel;
    private javax.swing.JTextField electricField;
    private javax.swing.JLabel electricalLabel;
    private javax.swing.JButton exitBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mathsField;
    private javax.swing.JLabel mathsLabel;
    private javax.swing.JTextField phyField;
    private javax.swing.JLabel phyLabel;
    private javax.swing.JTextField rollField;
    private javax.swing.JLabel rollLabel;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTable studentTable;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
