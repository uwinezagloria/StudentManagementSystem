
import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

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
    
public void showStudent() {
    try {
        stmt = conn.createStatement();
        String sql = "SELECT id, name, email, course, marks FROM student"; // Course before Marks to match table
        rs = stmt.executeQuery(sql);

        // Create table model
        javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                new String[]{"ID", "Name", "Email", "Course", "Marks"}, 0
        );

        while (rs.next()) {
            model.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("course"),
                    rs.getInt("marks")
            });
        }

        jTable1.setModel(model); // Set model to JTable
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
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
        addStudent = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        studentTable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        searchInput = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        sortbyId = new javax.swing.JRadioButton();
        sortByname = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jCheckBfail = new javax.swing.JCheckBox();
        jCheckBpass = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        sldmarks = new javax.swing.JSlider();
        allStudent = new javax.swing.JButton();
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
        updateStudent.addActionListener(this::updateStudentActionPerformed);
        jPanel1.add(updateStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 197, -1, -1));

        deleteStudent.setBackground(new java.awt.Color(153, 204, 255));
        deleteStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deleteStudent.setText("Delete");
        deleteStudent.addActionListener(this::deleteStudentActionPerformed);
        jPanel1.add(deleteStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 197, 82, -1));

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

        sortbyId.setText("ID");
        sortbyId.addActionListener(this::sortbyIdActionPerformed);
        jPanel2.add(sortbyId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        sortByname.setText("name");
        jPanel2.add(sortByname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel6.setText("Filter:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jCheckBfail.setText("failed");
        jPanel2.add(jCheckBfail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jCheckBpass.setText("pass");
        jPanel2.add(jCheckBpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabel7.setText("Filter by marks:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        jPanel2.add(sldmarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        allStudent.setBackground(new java.awt.Color(0, 51, 255));
        allStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        allStudent.setForeground(new java.awt.Color(255, 255, 255));
        allStudent.setText("Show All");
        allStudent.addActionListener(this::allStudentActionPerformed);

        searchButton.setBackground(new java.awt.Color(0, 51, 255));
        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.addActionListener(this::searchButtonActionPerformed);

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
                                .addComponent(allStudent)))))
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
                            .addComponent(allStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                                  
    try {
        stmt = conn.createStatement();

        String stdName = name.getText().trim();
        String stdEmail = email.getText().trim();
        int stdMarks = Integer.parseInt(marks.getText().trim());
        String stdCourse = course.getSelectedItem().toString();

        // Check if email exists in the student table
        String checkSql = "SELECT * FROM student WHERE email='" + stdEmail + "'";
        rs = stmt.executeQuery(checkSql);

        if (rs.next()) {
            JOptionPane.showMessageDialog(null, "Email already used!");
            return;
        }

        String sql = "INSERT INTO student (name, email, course, marks) VALUES ('"
                + stdName + "','" + stdEmail + "','" + stdCourse + "'," + stdMarks + ")";
        stmt.executeUpdate(sql);

        JOptionPane.showMessageDialog(null, "Student Added Successfully");

        // Refresh table
        showStudent();

        // Clear form
        name.setText("");
        email.setText("");
        marks.setText("");
        course.setSelectedIndex(0);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }

    }//GEN-LAST:event_addStudentActionPerformed

    private void allStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allStudentActionPerformed
        showStudent();
    }//GEN-LAST:event_allStudentActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

    try {
        stmt = conn.createStatement();

        String sql = "SELECT id, name, email, marks, course FROM student WHERE 1=1";

        String keyword = searchInput.getText().trim();

        // ✅ PRIORITY SEARCH (keyword)
        if (!keyword.isEmpty()) {
            keyword = keyword.toUpperCase();

            sql += " AND (UPPER(name) LIKE '%" + keyword + "%'"
                 + " OR UPPER(email) LIKE '%" + keyword + "%'"
                 + " OR UPPER(course) LIKE '%" + keyword + "%')";

        } else {
            // ✅ ONLY apply filters when NO keyword

            // --- Course filter ---
            String selectedCourse = course.getSelectedItem().toString();
            if (selectedCourse != null &&
                !selectedCourse.equals("") &&
                !selectedCourse.equalsIgnoreCase("All") &&
                !selectedCourse.equalsIgnoreCase("Select Course")) {

                sql += " AND course = '" + selectedCourse + "'";
            }

            // --- Pass / Fail ---
            if (jCheckBpass.isSelected() && !jCheckBfail.isSelected()) {
                sql += " AND marks >= 50";
            } else if (!jCheckBpass.isSelected() && jCheckBfail.isSelected()) {
                sql += " AND marks < 50";
            }

            // --- Slider ---
            int sliderMarks = sldmarks.getValue();
            if (sliderMarks > 0) {
                sql += " AND marks >= " + sliderMarks;
            }
        }

        // --- Sorting ---
        if (sortbyId.isSelected()) {
            sql += " ORDER BY id";
        } else if (sortByname.isSelected()) {
            sql += " ORDER BY name";
        }

        // 🔥 DEBUG
        System.out.println("SQL: " + sql);

        rs = stmt.executeQuery(sql);

        javax.swing.table.DefaultTableModel model =
            new javax.swing.table.DefaultTableModel(
                new String[]{"ID", "Name", "Email", "Course", "Marks"}, 0
            );

        boolean found = false;

        while (rs.next()) {
            found = true;
            model.addRow(new Object[]{
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("email"),
                rs.getString("course"),
                rs.getInt("marks")
            });
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "No student found.");
        }

        jTable1.setModel(model);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }

    }//GEN-LAST:event_searchButtonActionPerformed

    private void updateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentActionPerformed

    try {
        // 1️⃣ Ensure database connection exist
        if (conn == null) {
            JOptionPane.showMessageDialog(null, "Database not connected!");
            return;
        }

        stmt = conn.createStatement();

        // 2️⃣ Get email to identify student
        String studentEmail = email.getText().trim();
        if (studentEmail.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the student's email to update!");
            return;
        }

        // 3️⃣ Check if student exists
        rs = stmt.executeQuery("SELECT * FROM student WHERE email='" + studentEmail + "'");
        if (!rs.next()) {
            JOptionPane.showMessageDialog(null, "No student found with email: " + studentEmail);
            return;
        }

        int studentId = rs.getInt("id"); // unique identifier

        // 4️⃣ Prepare fields to update
        StringBuilder updateQuery = new StringBuilder("UPDATE student SET ");
        boolean firstField = true;

        // Name
        String newName = name.getText().trim();
        if (!newName.isEmpty()) {
            updateQuery.append("name='").append(newName).append("'");
            firstField = false;
        }

        // Marks
        String newMarksText = marks.getText().trim();
        if (!newMarksText.isEmpty()) {
            try {
                int newMarks = Integer.parseInt(newMarksText);
                if (!firstField) updateQuery.append(", ");
                updateQuery.append("marks=").append(newMarks);
                firstField = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Marks must be a number!");
                return;
            }
        }

        // Course
        Object selectedCourse = course.getSelectedItem();
        if (selectedCourse != null && !selectedCourse.toString().isEmpty()) {
            if (!firstField) updateQuery.append(", ");
            updateQuery.append("course='").append(selectedCourse.toString()).append("'");
        }

        // 5️⃣ If no fields were provided to update
        if (firstField) {
            JOptionPane.showMessageDialog(null, "No fields to update! Enter name, marks, or course.");
            return;
        }

        // 6️⃣ Complete query with WHERE clause
        updateQuery.append(" WHERE id=").append(studentId);

        // 7️⃣ Execute update
        int rowsUpdated = stmt.executeUpdate(updateQuery.toString());
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Student updated successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Update failed!");
        }

        // 8️⃣ Refresh table and clear form
        showStudent(); // refresh table
        name.setText("");
        marks.setText("");
        email.setText("");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        e.printStackTrace();
    }

    }//GEN-LAST:event_updateStudentActionPerformed

    private void deleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentActionPerformed

    try {
        // 1️⃣ Ensure database connection exists
        if (conn == null) {
            JOptionPane.showMessageDialog(null, "Database not connected!");
            return;
        }

        stmt = conn.createStatement();

        // 2️⃣ Get email from input
        String studentEmail = email.getText().trim();
        if (studentEmail.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the student's email to delete!");
            return;
        }

        // 3️⃣ Check if student exists
        rs = stmt.executeQuery("SELECT * FROM student WHERE email='" + studentEmail + "'");
        if (!rs.next()) {
            JOptionPane.showMessageDialog(null, "No student found with email: " + studentEmail);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(
            null,
            "Are you sure you want to delete student with email: " + studentEmail + "?",
            "Confirm Delete",
            JOptionPane.YES_NO_OPTION
        );

        if (confirm != JOptionPane.YES_OPTION) {
            return; // user cancelled
        }

        // 4️⃣ Delete student
        int rowsDeleted = stmt.executeUpdate("DELETE FROM student WHERE email='" + studentEmail + "'");
        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(null, "Student deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Delete failed!");
        }

        // 5️⃣ Refresh table and clear form
        showStudent(); // refresh table
        name.setText("");
        marks.setText("");
        email.setText("");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_deleteStudentActionPerformed

    private void sortbyIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortbyIdActionPerformed
      
    try {
        stmt = conn.createStatement();

        String sql = "SELECT id, name, email, course, marks FROM student";

        // Sorting
        if (sortbyId.isSelected()) {
            sql += " ORDER BY id";      // numeric sort by ID
        } else if (sortByname.isSelected()) {
            sql += " ORDER BY name";    // alphabetical sort by name
        }

        rs = stmt.executeQuery(sql);

        javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                new String[]{"ID", "Name", "Email", "Course", "Marks"}, 0
        );

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("email"),
                rs.getString("course"),
                rs.getInt("marks")
            });
        }

        jTable1.setModel(model);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        e.printStackTrace();
    }

    }//GEN-LAST:event_sortbyIdActionPerformed

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
    private javax.swing.JButton allStudent;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JButton deleteStudent;
    private javax.swing.JTextField email;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem logout;
    private javax.swing.JTextField marks;
    private javax.swing.JTextField name;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchInput;
    private javax.swing.JSlider sldmarks;
    private javax.swing.JRadioButton sortByname;
    private javax.swing.JRadioButton sortbyId;
    private javax.swing.JScrollPane studentTable;
    private javax.swing.JButton updateStudent;
    // End of variables declaration//GEN-END:variables
}
