
import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class MainPage extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainPage.class.getName());

     Connection conn=null;
    java.sql.Statement stmt=null;
    java.sql.ResultSet rs=null;
    public MainPage() {
        super("Add student");
        initComponents();
        conn=DatabaseConnection.getConnection();
    }
    
public void showStudent(){
    try{
        stmt=conn.createStatement();
        
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        marks = new javax.swing.JTextField();
        course = new javax.swing.JComboBox<>();
        updateStudent = new javax.swing.JButton();
        deleteStudent = new javax.swing.JButton();
        clearStudentForm = new javax.swing.JButton();
        addStudent = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        studentTable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        searchInput = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jRadid = new javax.swing.JRadioButton();
        jRadname = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jCheckBfail = new javax.swing.JCheckBox();
        jCheckBpass = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        sldmarks = new javax.swing.JSlider();
        jButton5 = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Management System - Dashboard");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Students information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel1.setText("Name :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 42, -1, -1));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 37, 290, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setText("Email :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 82, -1, -1));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 77, 293, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel3.setText("Marks :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 122, -1, -1));
        jPanel1.add(marks, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 117, 293, -1));

        course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Java programming", "Digital and analog", "Math IV", "CCNA" }));
        course.addActionListener(this::courseActionPerformed);
        jPanel1.add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 157, -1, -1));

        updateStudent.setBackground(new java.awt.Color(153, 204, 255));
        updateStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        updateStudent.setText("Update");
        jPanel1.add(updateStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 197, -1, -1));

        deleteStudent.setBackground(new java.awt.Color(153, 204, 255));
        deleteStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deleteStudent.setText("Delete");
        jPanel1.add(deleteStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 197, 82, -1));

        clearStudentForm.setBackground(new java.awt.Color(153, 204, 255));
        clearStudentForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearStudentForm.setText("Clear");
        jPanel1.add(clearStudentForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 197, -1, -1));

        addStudent.setBackground(new java.awt.Color(153, 204, 255));
        addStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addStudent.setText("Add");
        addStudent.addActionListener(this::addStudentActionPerformed);
        jPanel1.add(addStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 197, 57, -1));
        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 410, 280));

        studentTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Students Table", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Emoji", 1, 14), new java.awt.Color(0, 51, 255))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Email", "Course", "Marks"
            }
        ));
        studentTable.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel4.setText("Search Student :");

        searchInput.setForeground(new java.awt.Color(0, 255, 255));
        searchInput.setText("txt  Search");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sort and Filtering", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("sort by:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jRadid.setText("ID");
        jPanel2.add(jRadid, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jRadname.setText("name");
        jPanel2.add(jRadname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel6.setText("Filter:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jCheckBfail.setText("failed");
        jPanel2.add(jCheckBfail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jCheckBpass.setText("pass");
        jPanel2.add(jCheckBpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabel7.setText("Filter by marks:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        jPanel2.add(sldmarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 51, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Show All");

        searchButton.setBackground(new java.awt.Color(0, 51, 255));
        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 255));

        jMenu1.setText("File");

        logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        logout.setText("Logout");
        jMenu1.add(logout);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Students");

        jMenuItem5.setText("Add");
        jMenuItem5.addActionListener(this::jMenuItem5ActionPerformed);
        jMenu2.add(jMenuItem5);

        jMenuItem2.setText("Update");
        jMenuItem2.addActionListener(this::jMenuItem2ActionPerformed);
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Delete");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        jMenuItem4.setText("About");
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Tools");

        jMenuItem6.setText("jMenuItem6");
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(searchButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentTable, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentActionPerformed
                                                  
    try{
        stmt = conn.createStatement();  
        String stdName = name.getText();
        String stdEmail = email.getText();
        int stdMarks = Integer.parseInt(marks.getText());
        String stdCourse = course.getSelectedItem().toString();
// 1️⃣ Check if email exists
    String checkSql = "SELECT * FROM person WHERE email='" + stdEmail + "'";
    rs = stmt.executeQuery(checkSql);

    if (rs.next()) {
        // Email exists
        JOptionPane.showMessageDialog(null, "Email already used!");
    }
    else{
       String sql = "INSERT INTO student (name, email, marks, course) VALUES ('"
                     + stdName + "','" + stdEmail + "'," + stdMarks + ",'" + stdCourse + "')";
        stmt.executeUpdate(sql);

        JOptionPane.showMessageDialog(null,"Student Added Successfully"); 
    }
        
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    
}  
    }//GEN-LAST:event_addStudentActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MainPage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudent;
    private javax.swing.JButton clearStudentForm;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JButton deleteStudent;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBfail;
    private javax.swing.JCheckBox jCheckBpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadid;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadname;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem logout;
    private javax.swing.JTextField marks;
    private javax.swing.JTextField name;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchInput;
    private javax.swing.JSlider sldmarks;
    private javax.swing.JScrollPane studentTable;
    private javax.swing.JButton updateStudent;
    // End of variables declaration//GEN-END:variables
}
