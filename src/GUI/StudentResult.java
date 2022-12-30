package GUI;

import ConnectionProvider.ConnectionProviderCode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class StudentResult extends javax.swing.JFrame {

    public StudentResult() {
        initComponents();
    }
    
    public StudentResult(String rollNo) {
        initComponents();
        rollField.setText(rollNo);
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        rollNoLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        fatherLabel = new javax.swing.JLabel();
        courseLabel = new javax.swing.JLabel();
        branchLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        rollField = new javax.swing.JTextField();
        genderField = new javax.swing.JTextField();
        fatherField = new javax.swing.JTextField();
        courseField = new javax.swing.JTextField();
        branchField = new javax.swing.JTextField();
        phySubjectLabel = new javax.swing.JLabel();
        mathsSubjectLabel = new javax.swing.JLabel();
        chemSubjectLabel = new javax.swing.JLabel();
        electricalSubjectLabel = new javax.swing.JLabel();
        bioSubjectLabel = new javax.swing.JLabel();
        phyTotal = new javax.swing.JLabel();
        mathsTotal = new javax.swing.JLabel();
        chemTotal = new javax.swing.JLabel();
        electricTotal = new javax.swing.JLabel();
        bioTotal = new javax.swing.JLabel();
        phyPass = new javax.swing.JLabel();
        mathsPass = new javax.swing.JLabel();
        chemPass = new javax.swing.JLabel();
        electricPass = new javax.swing.JLabel();
        bioPass = new javax.swing.JLabel();
        phyMarks = new javax.swing.JTextField();
        mathsMarks = new javax.swing.JTextField();
        chemMarks = new javax.swing.JTextField();
        electricMarks = new javax.swing.JTextField();
        bioMarks = new javax.swing.JTextField();
        totalMarksLabel = new javax.swing.JLabel();
        passingLabel = new javax.swing.JLabel();
        marksObtainLabel = new javax.swing.JLabel();
        verdictField = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        quitBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1050, 920));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameLabel.setText("Name");
        getContentPane().add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        rollNoLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rollNoLabel.setText("Roll No.");
        getContentPane().add(rollNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, -1, -1));

        genderLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        genderLabel.setText("Gender");
        getContentPane().add(genderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        fatherLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fatherLabel.setText("Father Name");
        getContentPane().add(fatherLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, -1, -1));

        courseLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        courseLabel.setText("Course");
        getContentPane().add(courseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        branchLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        branchLabel.setText("Branch");
        getContentPane().add(branchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, -1, -1));

        nameField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 140, -1));

        rollField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(rollField, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 140, -1));

        genderField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(genderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 140, -1));

        fatherField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(fatherField, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 140, -1));

        courseField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(courseField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 140, -1));

        branchField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(branchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 140, -1));

        phySubjectLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        phySubjectLabel.setText("Physics");
        getContentPane().add(phySubjectLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 100, -1));

        mathsSubjectLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mathsSubjectLabel.setText("Mathematics");
        getContentPane().add(mathsSubjectLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 120, -1));

        chemSubjectLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chemSubjectLabel.setText("Chemistry");
        getContentPane().add(chemSubjectLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 100, -1));

        electricalSubjectLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        electricalSubjectLabel.setText("Electrical");
        getContentPane().add(electricalSubjectLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, 100, -1));

        bioSubjectLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bioSubjectLabel.setText("Biology");
        getContentPane().add(bioSubjectLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 660, 80, -1));

        phyTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        phyTotal.setText("100");
        getContentPane().add(phyTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, -1));

        mathsTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mathsTotal.setText("100");
        getContentPane().add(mathsTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, -1, -1));

        chemTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chemTotal.setText("100");
        getContentPane().add(chemTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, -1, -1));

        electricTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        electricTotal.setText("100");
        getContentPane().add(electricTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 600, -1, -1));

        bioTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bioTotal.setText("100");
        getContentPane().add(bioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 660, -1, -1));

        phyPass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        phyPass.setText("30");
        getContentPane().add(phyPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, -1, -1));

        mathsPass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mathsPass.setText("30");
        getContentPane().add(mathsPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, -1, -1));

        chemPass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chemPass.setText("30");
        getContentPane().add(chemPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, -1, -1));

        electricPass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        electricPass.setText("30");
        getContentPane().add(electricPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, -1, -1));

        bioPass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bioPass.setText("30");
        getContentPane().add(bioPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 660, -1, -1));

        phyMarks.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(phyMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 140, -1));

        mathsMarks.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(mathsMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 140, -1));

        chemMarks.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(chemMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, 140, -1));

        electricMarks.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(electricMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 590, 140, -1));

        bioMarks.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(bioMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 660, 140, -1));

        totalMarksLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        totalMarksLabel.setText("Total Marks");
        getContentPane().add(totalMarksLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        passingLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        passingLabel.setText("Passing Marks");
        getContentPane().add(passingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, -1, -1));

        marksObtainLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        marksObtainLabel.setText("Marks Obtained");
        getContentPane().add(marksObtainLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, -1, 20));

        verdictField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(verdictField, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 760, 100, 30));

        totalLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        totalLabel.setText("Total");
        getContentPane().add(totalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 770, -1, -1));

        jTextField8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 770, 120, -1));

        quitBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        quitBtn.setText("Quit");
        quitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(quitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 840, -1, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Verdict");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 770, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Exam Results");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
         String rollNo =rollField.getText();
        try{
            Connection con = ConnectionProviderCode.getcon();
            Statement st = con.prepareStatement("create", ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from student inner join result where student.rollNo='"+rollNo+"' and result.rollNo='"+rollNo+"'");
            if(!rs.first()){
                JOptionPane.showMessageDialog(null, "Entered rollNo doesn't exist");
            }
            else{
                nameField.setText(rs.getString(1));
                genderField.setText(rs.getString(3));
                fatherField.setText(rs.getString(4));
                courseField.setText(rs.getString(5));
                branchField.setText(rs.getString(6));
                
                phyMarks.setText(rs.getString(8));
                mathsMarks.setText(rs.getString(9));
                chemMarks.setText(rs.getString(10));
                electricMarks.setText(rs.getString(11));
                bioMarks.setText(rs.getString(12));
                jTextField8.setText(rs.getString(13));
                
                nameField.setEditable(false);
                genderField.setEditable(false);
                fatherField.setEditable(false);
                courseField.setEditable(false);
                branchField.setEditable(false);
                
                phyMarks.setEditable(false);
                mathsMarks.setEditable(false);
                chemMarks.setEditable(false);
                electricMarks.setEditable(false);
                bioMarks.setEditable(false);
                jTextField8.setEditable(false);
                
                int m1 = Integer.parseInt(rs.getString(8));
                int m2 = Integer.parseInt(rs.getString(9));
                int m3 = Integer.parseInt(rs.getString(10));
                int m4 = Integer.parseInt(rs.getString(11));
                int m5 = Integer.parseInt(rs.getString(12));
                
                if(m1<30 || m2<30 || m3<30 || m4<30 || m5<30){
                    verdictField.setText("Fail");
                }
                else{
                    verdictField.setText("Pass");
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_formComponentShown

    private void quitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitBtnActionPerformed
        int flag = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit this page ...", "Submit", JOptionPane.YES_NO_OPTION);
        if(flag == 0){
            setVisible(false);
        }
        Student frame = new Student();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_quitBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bioMarks;
    private javax.swing.JLabel bioPass;
    private javax.swing.JLabel bioSubjectLabel;
    private javax.swing.JLabel bioTotal;
    private javax.swing.JTextField branchField;
    private javax.swing.JLabel branchLabel;
    private javax.swing.JTextField chemMarks;
    private javax.swing.JLabel chemPass;
    private javax.swing.JLabel chemSubjectLabel;
    private javax.swing.JLabel chemTotal;
    private javax.swing.JTextField courseField;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JTextField electricMarks;
    private javax.swing.JLabel electricPass;
    private javax.swing.JLabel electricTotal;
    private javax.swing.JLabel electricalSubjectLabel;
    private javax.swing.JTextField fatherField;
    private javax.swing.JLabel fatherLabel;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel marksObtainLabel;
    private javax.swing.JTextField mathsMarks;
    private javax.swing.JLabel mathsPass;
    private javax.swing.JLabel mathsSubjectLabel;
    private javax.swing.JLabel mathsTotal;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel passingLabel;
    private javax.swing.JTextField phyMarks;
    private javax.swing.JLabel phyPass;
    private javax.swing.JLabel phySubjectLabel;
    private javax.swing.JLabel phyTotal;
    private javax.swing.JButton quitBtn;
    private javax.swing.JTextField rollField;
    private javax.swing.JLabel rollNoLabel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel totalMarksLabel;
    private javax.swing.JTextField verdictField;
    // End of variables declaration//GEN-END:variables
}
