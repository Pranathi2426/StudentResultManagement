package GUI;

import ConnectionProvider.ConnectionProviderCode;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class InsertNewStudent extends javax.swing.JFrame {

    public InsertNewStudent() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        rollLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        fatherLabel = new javax.swing.JLabel();
        courseLabel = new javax.swing.JLabel();
        branchLabel = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        rollNoField = new javax.swing.JTextField();
        genderField = new javax.swing.JComboBox<>();
        fatherField = new javax.swing.JTextField();
        courseField = new javax.swing.JComboBox<>();
        branchField = new javax.swing.JComboBox<>();
        addStudentLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nameLabel.setText("Name");
        nameLabel.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        rollLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rollLabel.setText("Roll No");
        rollLabel.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(rollLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        genderLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        genderLabel.setText("Gender");
        genderLabel.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(genderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        fatherLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fatherLabel.setText("Father's Name");
        fatherLabel.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(fatherLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        courseLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        courseLabel.setText("Course");
        courseLabel.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(courseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 409, -1, -1));

        branchLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        branchLabel.setText("Branch");
        branchLabel.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(branchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 499, -1, -1));

        submitBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 615, -1, -1));

        exitBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 615, 73, -1));

        nameField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nameField.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        rollNoField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rollNoField.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(rollNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        genderField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        genderField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others", " " }));
        getContentPane().add(genderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 200, -1));

        fatherField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(fatherField, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 336, 200, -1));

        courseField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        courseField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BTech", " " }));
        getContentPane().add(courseField, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 410, 200, -1));

        branchField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        branchField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CS", "CIVIL", "EEE", "ECE", "MECH" }));
        getContentPane().add(branchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 500, 200, -1));

        addStudentLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addStudentLabel.setText("Add Student");
        getContentPane().add(addStudentLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        String name = nameField.getText();
        String rollNo = rollNoField.getText();
        String gender = (String)genderField.getSelectedItem();
        String fatherName = fatherField.getText();
        String course = (String)courseField.getSelectedItem();
        String branch = (String)branchField.getSelectedItem();
        
        try{
            Connection con = ConnectionProviderCode.getcon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into student values('"+ name + "', '" + rollNo +"', '"+ gender +"', '"+ fatherName +"', '"+ course +"', '"+ branch +"')");
            JOptionPane.showMessageDialog(null, "Successfully Added");
            setVisible(false);
            InsertNewStudent frame = new InsertNewStudent();
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
                new InsertNewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addStudentLabel;
    private javax.swing.JComboBox<String> branchField;
    private javax.swing.JLabel branchLabel;
    private javax.swing.JComboBox<String> courseField;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextField fatherField;
    private javax.swing.JLabel fatherLabel;
    private javax.swing.JComboBox<String> genderField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel rollLabel;
    private javax.swing.JTextField rollNoField;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
