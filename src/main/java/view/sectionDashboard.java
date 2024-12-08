/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.connectionController;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.studentCourse;
import model.studentSection;

/**
 *
 * @author LordD
 */
public class sectionDashboard extends javax.swing.JFrame {

    /**
     * Creates new form sectionDashboard
     */
    public sectionDashboard() {
        initComponents();
        updateTable();
        updateCoursebox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        recordScrollTable = new javax.swing.JScrollPane();
        recordTable = new javax.swing.JTable();
        DetailPanel = new javax.swing.JPanel();
        addBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        updateBTN = new javax.swing.JButton();
        clearBTN = new javax.swing.JButton();
        idTField = new javax.swing.JTextField();
        courseCBox = new javax.swing.JComboBox<>();
        insertIdLabel = new javax.swing.JLabel();
        courseLabel = new javax.swing.JLabel();
        studentRecordTitle = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        leftBTN = new javax.swing.JButton();
        rightBTN = new javax.swing.JButton();
        selectionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        recordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Section Name", "Section Number", "Course"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        recordTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recordTableMouseClicked(evt);
            }
        });
        recordScrollTable.setViewportView(recordTable);

        addBTN.setText("ADD");
        addBTN.setMaximumSize(new java.awt.Dimension(75, 23));
        addBTN.setMinimumSize(new java.awt.Dimension(75, 23));
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        deleteBTN.setText("DELETE");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        updateBTN.setText("UPDATE");

        clearBTN.setText("CLEAR");
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNclearForm(evt);
            }
        });

        insertIdLabel.setText("INSERT SECTION");

        courseLabel.setText("COURSE");

        studentRecordTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        studentRecordTitle.setText("SECTION");

        javax.swing.GroupLayout DetailPanelLayout = new javax.swing.GroupLayout(DetailPanel);
        DetailPanel.setLayout(DetailPanelLayout);
        DetailPanelLayout.setHorizontalGroup(
            DetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetailPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(DetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DetailPanelLayout.createSequentialGroup()
                        .addComponent(courseLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(DetailPanelLayout.createSequentialGroup()
                        .addComponent(courseCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DetailPanelLayout.createSequentialGroup()
                        .addGroup(DetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DetailPanelLayout.createSequentialGroup()
                                .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteBTN))
                            .addComponent(idTField)
                            .addComponent(studentRecordTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DetailPanelLayout.createSequentialGroup()
                                .addComponent(insertIdLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(DetailPanelLayout.createSequentialGroup()
                                .addComponent(updateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(clearBTN)))
                        .addGap(31, 31, 31))))
        );
        DetailPanelLayout.setVerticalGroup(
            DetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DetailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentRecordTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertIdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(courseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(courseCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(DetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBTN)
                    .addComponent(clearBTN))
                .addContainerGap(226, Short.MAX_VALUE))
        );

        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Search :");

        leftBTN.setText("<");
        leftBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftBTNActionPerformed(evt);
            }
        });

        rightBTN.setText(">");
        rightBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightBTNActionPerformed(evt);
            }
        });

        selectionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectionLabel.setText("SECTON");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DetailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(leftBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rightBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(recordScrollTable)))
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DetailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leftBTN)
                            .addComponent(rightBTN)
                            .addComponent(selectionLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recordScrollTable, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recordTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordTableMouseClicked
//        int selectedRow = recordTable.getSelectedRow();
//        if(selectedRow != -1){
//            idTField.setText((String) recordTable.getValueAt(selectedRow,0));
//            firstnameTField.setText((String) recordTable.getValueAt(selectedRow,1));
//            lastnameTField.setText((String) recordTable.getValueAt(selectedRow, 2));
//            String selectedSection = (String) recordTable.getValueAt(selectedRow, 3);
//            String selectedCourse = (String) recordTable.getValueAt(selectedRow, 4);
//            for (int i = 0; i < courseCBox.getItemCount(); i++) {
//                if (courseCBox.getItemAt(i).equals(selectedCourse)) {
//                    courseCBox.setSelectedIndex(i);
//                    break;
//                }
//            }
//            for (int i = 0; i < sectionCBox.getItemCount(); i++) {
//                //                System.out.println(sectionCBox.getItemAt(i) + " | " + selectedSection);
//                if (sectionCBox.getItemAt(i).equals(selectedSection)) {
//                    sectionCBox.setSelectedIndex(i);
//                    break;
//                }
//            }
//        }
    }//GEN-LAST:event_recordTableMouseClicked

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        //CHECK IF EMTY
//        if(isFormEmpty())
//        {
//            fillerrorMessage();
//            return;
//        }
//        connectionController CC = new connectionController();
//        List<studentRecord> records = CC.fetchrecordtable("T");
//        boolean exists = false;
//
//        for (studentRecord record : records) {
//            if (record.getSchoolid().equals(idTField.getText())) {
//                exists = true;
//                break;
//            }
//        }
//
//        if (exists) {
//            //            System.out.println("ERROR");
//            existerrorMessage();
//        } else {
//            if(0 == confirmationMessage()){
//                CC.insertIntoTable(idTField.getText(),
//                    firstnameTField.getText(),
//                    lastnameTField.getText(),
//                    sectionCBox.getSelectedIndex(),
//                    courseCBox.getSelectedIndex()
//                );
//            }
//            clearForm();
//        }
//        updateTable();
    }//GEN-LAST:event_addBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
//        if(isFormEmpty())
//        {
//            fillerrorMessage();
//            return;
//        }
//        connectionController CC = new connectionController();
//        int selectedRow = recordTable.getSelectedRow();
//        if(selectedRow != -1 && 0 == deleteconformation()){
//            String studentId = (String) recordTable.getValueAt(selectedRow,0);
//            CC.removeFromtable(studentId);
//        }
//        updateTable();
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void clearBTNclearForm(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNclearForm
//        clearForm();
    }//GEN-LAST:event_clearBTNclearForm

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        DefaultTableModel dTable = (DefaultTableModel) recordTable.getModel();
        String text = searchBar.getText();
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(dTable);
        recordTable.setRowSorter(sorter);

        if (text.trim().length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
        }
    }//GEN-LAST:event_searchBarKeyReleased

    private void rightBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightBTNActionPerformed
        courseDashboard courseDashboard = new courseDashboard();
        courseDashboard.setVisible(true);
        courseDashboard.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_rightBTNActionPerformed

    private void leftBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftBTNActionPerformed
        adminDashboard adminDashboard = new adminDashboard();
        adminDashboard.setVisible(true);
        adminDashboard.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_leftBTNActionPerformed

    public void updateTable()
    {
        DefaultTableModel dTable = (DefaultTableModel) recordTable.getModel();
        dTable.setRowCount(0);
        connectionController CC = new connectionController();

        List<studentSection> sections = CC.fetchstudentsection();
        for(studentSection section : sections)
        {
            String courseid = section.getCourseid();
            int sectionNum = section.getSectionnumber();
            String sectionname = section.getSectionname();
            dTable.addRow(new Object[] {courseid, sectionNum,sectionname});
        }
    }
    public void updateCoursebox()
    {
        connectionController CC = new connectionController();
        List<studentCourse> courses = CC.fetchstudentcourse();
        
        for(studentCourse course : courses)
        {
            courseCBox.addItem(course.getCourse());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel DetailPanel;
    private javax.swing.JButton addBTN;
    private javax.swing.JButton clearBTN;
    private javax.swing.JComboBox<String> courseCBox;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JTextField idTField;
    private javax.swing.JLabel insertIdLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton leftBTN;
    private javax.swing.JScrollPane recordScrollTable;
    private javax.swing.JTable recordTable;
    private javax.swing.JButton rightBTN;
    private javax.swing.JTextField searchBar;
    private javax.swing.JLabel selectionLabel;
    private javax.swing.JLabel studentRecordTitle;
    private javax.swing.JButton updateBTN;
    // End of variables declaration//GEN-END:variables
}