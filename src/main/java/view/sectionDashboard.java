/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.sectionDashboardController;

/**
 *
 * @author LordD
 */
public class sectionDashboard extends javax.swing.JFrame {

    /**
     * Creates new form sectionDashboard
     */
    public sectionDashboard() {
        sectionDashboardController sectionDC = new sectionDashboardController();
        initComponents();
        sectionDC.updateSectiontable(sectionTable);
        sectionDC.updateCoursebox(courseCBox);
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
        sectionTable = new javax.swing.JTable();
        DetailPanel = new javax.swing.JPanel();
        addBTN = new javax.swing.JButton();
        updateBTN = new javax.swing.JButton();
        clearBTN = new javax.swing.JButton();
        sectionTField = new javax.swing.JTextField();
        courseCBox = new javax.swing.JComboBox<>();
        insertIdLabel = new javax.swing.JLabel();
        courseLabel = new javax.swing.JLabel();
        studentRecordTitle = new javax.swing.JLabel();
        sectionNumLabel = new javax.swing.JLabel();
        sectionNum = new javax.swing.JLabel();
        sectionIDLabel = new javax.swing.JLabel();
        sectionId = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        leftBTN = new javax.swing.JButton();
        rightBTN = new javax.swing.JButton();
        selectionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sectionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Course", "Section Number", "Section"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sectionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sectionTableMouseClicked(evt);
            }
        });
        recordScrollTable.setViewportView(sectionTable);

        addBTN.setText("ADD");
        addBTN.setMaximumSize(new java.awt.Dimension(75, 23));
        addBTN.setMinimumSize(new java.awt.Dimension(75, 23));
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        updateBTN.setText("UPDATE");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        clearBTN.setText("CLEAR");
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNclearForm(evt);
            }
        });

        courseCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseCBoxActionPerformed(evt);
            }
        });

        insertIdLabel.setText("INSERT SECTION :");

        courseLabel.setText("COURSE");

        studentRecordTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        studentRecordTitle.setText("SECTION");

        sectionNumLabel.setText("Section Number: ");

        sectionNum.setText("0");

        sectionIDLabel.setText("ID :");

        sectionId.setText("0");

        javax.swing.GroupLayout DetailPanelLayout = new javax.swing.GroupLayout(DetailPanel);
        DetailPanel.setLayout(DetailPanelLayout);
        DetailPanelLayout.setHorizontalGroup(
            DetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetailPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(DetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DetailPanelLayout.createSequentialGroup()
                        .addComponent(insertIdLabel)
                        .addContainerGap())
                    .addComponent(sectionTField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DetailPanelLayout.createSequentialGroup()
                        .addGroup(DetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DetailPanelLayout.createSequentialGroup()
                                .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DetailPanelLayout.createSequentialGroup()
                                .addComponent(clearBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                .addGap(128, 128, 128))
                            .addComponent(studentRecordTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DetailPanelLayout.createSequentialGroup()
                                .addGroup(DetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(courseLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(courseCBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(31, 31, 31))
                    .addGroup(DetailPanelLayout.createSequentialGroup()
                        .addGroup(DetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DetailPanelLayout.createSequentialGroup()
                                .addComponent(sectionNumLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sectionNum, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DetailPanelLayout.createSequentialGroup()
                                .addComponent(sectionIDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sectionId)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        DetailPanelLayout.setVerticalGroup(
            DetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DetailPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(studentRecordTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sectionIDLabel)
                    .addComponent(sectionId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sectionNumLabel)
                    .addComponent(sectionNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertIdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sectionTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(courseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(courseCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void sectionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sectionTableMouseClicked
        sectionDashboardController sectionDC = new sectionDashboardController();
        sectionDC.clickedTable(sectionTable,sectionTField,sectionNum, courseCBox , sectionId);
    }//GEN-LAST:event_sectionTableMouseClicked

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        sectionDashboardController sectionDashboardController = new sectionDashboardController();
        sectionDashboardController.addSectiontotable(sectionTField, courseCBox, sectionTable);
        clearForm();
    }//GEN-LAST:event_addBTNActionPerformed

    private void clearBTNclearForm(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNclearForm
        clearForm();
    }//GEN-LAST:event_clearBTNclearForm

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        sectionDashboardController sectionDashboardController = new sectionDashboardController();
        sectionDashboardController.searchBar(searchBar, sectionTable);
    }//GEN-LAST:event_searchBarKeyReleased

    private void rightBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightBTNActionPerformed
        courseDashboard courseDashboard = new courseDashboard();
        courseDashboard.setVisible(true);
        courseDashboard.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_rightBTNActionPerformed

    private void leftBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftBTNActionPerformed
        recordDashboard adminDashboard = new recordDashboard();
        adminDashboard.setVisible(true);
        adminDashboard.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_leftBTNActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        sectionDashboardController sectionDC = new sectionDashboardController();
        sectionDC.updateSectiontable(sectionTable, sectionTField, sectionId, courseCBox);
        clearForm();
    }//GEN-LAST:event_updateBTNActionPerformed

    private void courseCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseCBoxActionPerformed
        
    }//GEN-LAST:event_courseCBoxActionPerformed

    private void clearForm()
    {
        sectionTField.setText("");
        sectionNum.setText("");
        courseCBox.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel DetailPanel;
    private javax.swing.JButton addBTN;
    private javax.swing.JButton clearBTN;
    private javax.swing.JComboBox<String> courseCBox;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JLabel insertIdLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton leftBTN;
    private javax.swing.JScrollPane recordScrollTable;
    private javax.swing.JButton rightBTN;
    private javax.swing.JTextField searchBar;
    private javax.swing.JLabel sectionIDLabel;
    private javax.swing.JLabel sectionId;
    private javax.swing.JLabel sectionNum;
    private javax.swing.JLabel sectionNumLabel;
    private javax.swing.JTextField sectionTField;
    private javax.swing.JTable sectionTable;
    private javax.swing.JLabel selectionLabel;
    private javax.swing.JLabel studentRecordTitle;
    private javax.swing.JButton updateBTN;
    // End of variables declaration//GEN-END:variables
}
