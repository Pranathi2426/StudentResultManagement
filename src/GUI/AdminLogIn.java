package GUI;

import javax.swing.JOptionPane;

public class AdminLogIn extends javax.swing.JFrame {

    /** Creates new form Admin*/
    public AdminLogIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        logInBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        userField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        headerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        userLabel.setText("UserName");
        userLabel.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        passwordLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        passwordLabel.setText("Password");
        passwordLabel.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        logInBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        logInBtn.setText("Login");
        logInBtn.setPreferredSize(new java.awt.Dimension(100, 30));
        logInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        exitBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.setPreferredSize(new java.awt.Dimension(100, 30));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        userField.setPreferredSize(new java.awt.Dimension(15, 25));
        getContentPane().add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 100, -1));

        passwordField.setPreferredSize(new java.awt.Dimension(15, 25));
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 100, -1));

        headerLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        headerLabel.setText("Admin");
        getContentPane().add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInBtnActionPerformed
        String userName = userField.getText();
        String password = passwordField.getText();
        if(userName.contentEquals("user")&& password.contentEquals("password")){
            setVisible(false);
            Admin frame = new Admin();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        else{
            JOptionPane.showMessageDialog(null, "username or password is incorrect");
       
        }
    }//GEN-LAST:event_logInBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
       int response = JOptionPane.showConfirmDialog(null, "Are you sure", "submit",JOptionPane.YES_NO_OPTION);
            
       if(response==0){
       setVisible(false);
       Home frame = new Home();
       frame.setVisible(true);
       frame.setLocationRelativeTo(null);
            
            }
    }//GEN-LAST:event_exitBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JButton logInBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
