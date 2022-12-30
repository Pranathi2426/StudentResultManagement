package GUI;

import ConnectionProvider.ConnectionProviderCode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class UpdateResult extends javax.swing.JFrame {

    public UpdateResult() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rollLabel = new javax.swing.JLabel();
        rollNoField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        phyLabel = new javax.swing.JLabel();
        mathsLabel = new javax.swing.JLabel();
        chemLabel = new javax.swing.JLabel();
        electricLabel = new javax.swing.JLabel();
        bioLabel = new javax.swing.JLabel();
        phyfield = new javax.swing.JTextField();
        mathsField = new javax.swing.JTextField();
        chemField = new javax.swing.JTextField();
        electricField = new javax.swing.JTextField();
        bioField = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rollLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rollLabel.setText("Roll No");
        getContentPane().add(rollLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        rollNoField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(rollNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 108, -1));

        searchBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        phyLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        phyLabel.setText("Physics");
        phyLabel.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(phyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        mathsLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        mathsLabel.setText("Maths");
        mathsLabel.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(mathsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        chemLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        chemLabel.setText("Chemistry");
        chemLabel.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(chemLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        electricLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        electricLabel.setText("Electrical");
        electricLabel.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(electricLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        bioLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bioLabel.setText("Biology");
        bioLabel.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(bioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, -1, -1));

        phyfield.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        phyfield.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(phyfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        mathsField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        mathsField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(mathsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        chemField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        chemField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(chemField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        electricField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        electricField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(electricField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, -1, -1));

        bioField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bioField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(bioField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, -1, -1));

        submitBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 620, 97, -1));

        exitBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, 95, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Update Result");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
           String rollNo =rollNoField.getText();
        try{
            Connection con = ConnectionProviderCode.getcon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from result where rollNo='"+rollNo+"'");
            if(!rs.first()){ 
                JOptionPane.showMessageDialog(null, "Entered rollNo doesn't exist");
            }
             else{
                rollNoField.setEditable(false);
                phyfield.setText(rs.getString(2));
                mathsField.setText(rs.getString(3));
                chemField.setText(rs.getString(4));
                electricField.setText(rs.getString(5));
                bioField.setText(rs.getString(6));
            }
         
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        String rollNo = rollNoField.getText();
        int physicsMarks = Integer.parseInt(phyfield.getText());
        int mathsMarks = Integer.parseInt(mathsField.getText());
        int chemMarks = Integer.parseInt(chemField.getText());
        int electricalMarks = Integer.parseInt(electricField.getText());
        int bioMarks = Integer.parseInt(bioField.getText());
        int result = 0;
        result = physicsMarks + chemMarks + mathsMarks + electricalMarks + bioMarks;
        
        try{
            Connection con = ConnectionProviderCode.getcon();
            Statement st = con.createStatement();
            st.executeUpdate("update result set physics=" + physicsMarks +", maths="+ mathsMarks +", chemistry="+ chemMarks +","
                + " electrical="+ electricalMarks +", biology="+ bioMarks + ", total=" + result+ " where rollNo='"+ rollNo +"'");
            JOptionPane.showMessageDialog(null,"Added successfully");
            setVisible(false);
            UpdateResult frame = new UpdateResult();
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
                new UpdateResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bioField;
    private javax.swing.JLabel bioLabel;
    private javax.swing.JTextField chemField;
    private javax.swing.JLabel chemLabel;
    private javax.swing.JTextField electricField;
    private javax.swing.JLabel electricLabel;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField mathsField;
    private javax.swing.JLabel mathsLabel;
    private javax.swing.JLabel phyLabel;
    private javax.swing.JTextField phyfield;
    private javax.swing.JLabel rollLabel;
    private javax.swing.JTextField rollNoField;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
