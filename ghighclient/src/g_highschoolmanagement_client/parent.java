/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * student.java
 *
 * Created on Jun 9, 2013, 1:38:14 PM
 */
package g_highschoolmanagement_client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author griffin
 */
public class parent extends javax.swing.JInternalFrame {
     public parent() {
        dblogincred();
        initComponents();
        try {
    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (Exception e) {
    // If Nimbus is not available, you can set the GUI to another look and feel.
}
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbldetails = new javax.swing.JLabel();
        pnlmain = new javax.swing.JPanel();
        pnlprsnldetails = new javax.swing.JPanel();
        lblparentid = new javax.swing.JLabel();
        lblfullname = new javax.swing.JLabel();
        lblogender = new javax.swing.JLabel();
        lblphone = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblpost = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtfname = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtpost = new javax.swing.JTextField();
        txtgender = new javax.swing.JComboBox();
        pnlotherdetails = new javax.swing.JPanel();
        txtonumber = new javax.swing.JTextField();
        txtopaorent = new javax.swing.JTextField();
        lbloccupation = new javax.swing.JLabel();
        lbloparents = new javax.swing.JLabel();
        txthome = new javax.swing.JTextField();
        lblhome = new javax.swing.JLabel();
        txtwork = new javax.swing.JTextField();
        lblonumbers = new javax.swing.JLabel();
        txtoccupation = new javax.swing.JTextField();
        lblwork = new javax.swing.JLabel();
        btnnewrecord = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Parent Details Form");

        lbldetails.setBackground(new java.awt.Color(153, 255, 153));
        lbldetails.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbldetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldetails.setText("Parent Details Data Entry Form");
        lbldetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbldetails.setName(""); // NOI18N
        lbldetails.setOpaque(true);

        pnlmain.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        pnlprsnldetails.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblparentid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblparentid.setText("Parent ID Number");

        lblfullname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblfullname.setText("Full Name");

        lblogender.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblogender.setText("Gender");

        lblphone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblphone.setText("Phone Number");

        lblemail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblemail.setText("Email Address");

        lblpost.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblpost.setText("Postal Address");

        txtid.setBackground(new java.awt.Color(255, 255, 204));
        txtid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtfname.setBackground(new java.awt.Color(255, 255, 204));
        txtfname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtphone.setBackground(new java.awt.Color(255, 255, 204));
        txtphone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtemail.setBackground(new java.awt.Color(255, 255, 204));
        txtemail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtpost.setBackground(new java.awt.Color(255, 255, 204));
        txtpost.setToolTipText("");
        txtpost.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtgender.setEditable(true);
        txtgender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", " ", " " }));

        org.jdesktop.layout.GroupLayout pnlprsnldetailsLayout = new org.jdesktop.layout.GroupLayout(pnlprsnldetails);
        pnlprsnldetails.setLayout(pnlprsnldetailsLayout);
        pnlprsnldetailsLayout.setHorizontalGroup(
            pnlprsnldetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlprsnldetailsLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlprsnldetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(lblogender, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, lblpost, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, lblemail, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, lblphone, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, lblfullname, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, lblparentid, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlprsnldetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(txtid, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .add(txtfname)
                    .add(txtphone)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, txtemail)
                    .add(txtpost)
                    .add(txtgender, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlprsnldetailsLayout.setVerticalGroup(
            pnlprsnldetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlprsnldetailsLayout.createSequentialGroup()
                .add(pnlprsnldetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(lblparentid, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(txtid, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(7, 7, 7)
                .add(pnlprsnldetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(txtfname)
                    .add(lblfullname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlprsnldetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(lblogender, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pnlprsnldetailsLayout.createSequentialGroup()
                        .add(txtgender)
                        .add(4, 4, 4)))
                .add(2, 2, 2)
                .add(pnlprsnldetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(lblphone, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(txtphone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlprsnldetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(txtemail)
                    .add(lblemail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlprsnldetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlprsnldetailsLayout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(txtpost, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(lblpost, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnlotherdetails.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtonumber.setBackground(new java.awt.Color(255, 255, 204));
        txtonumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtopaorent.setBackground(new java.awt.Color(255, 255, 204));
        txtopaorent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lbloccupation.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbloccupation.setText("Occupation");

        lbloparents.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbloparents.setText("Other Parent");

        txthome.setBackground(new java.awt.Color(255, 255, 204));
        txthome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblhome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblhome.setText("Home Location");

        txtwork.setBackground(new java.awt.Color(255, 255, 204));
        txtwork.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblonumbers.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblonumbers.setText("Other Number");

        txtoccupation.setBackground(new java.awt.Color(255, 255, 204));
        txtoccupation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblwork.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblwork.setText("Work Location");

        org.jdesktop.layout.GroupLayout pnlotherdetailsLayout = new org.jdesktop.layout.GroupLayout(pnlotherdetails);
        pnlotherdetails.setLayout(pnlotherdetailsLayout);
        pnlotherdetailsLayout.setHorizontalGroup(
            pnlotherdetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlotherdetailsLayout.createSequentialGroup()
                .add(176, 176, 176)
                .add(pnlotherdetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, txtwork, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, txtoccupation)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, txtopaorent)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, txthome)
                    .add(txtonumber)))
            .add(pnlotherdetailsLayout.createSequentialGroup()
                .add(pnlotherdetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, lblwork, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, lbloccupation, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(lbloparents, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, lblhome, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, lblonumbers, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(0, 0, Short.MAX_VALUE))
        );
        pnlotherdetailsLayout.setVerticalGroup(
            pnlotherdetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlotherdetailsLayout.createSequentialGroup()
                .add(pnlotherdetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txthome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblhome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(5, 5, 5)
                .add(pnlotherdetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(lblwork, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(txtwork, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(7, 7, 7)
                .add(pnlotherdetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(txtoccupation)
                    .add(lbloccupation, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlotherdetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(txtopaorent)
                    .add(lbloparents, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlotherdetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblonumbers, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtonumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout pnlmainLayout = new org.jdesktop.layout.GroupLayout(pnlmain);
        pnlmain.setLayout(pnlmainLayout);
        pnlmainLayout.setHorizontalGroup(
            pnlmainLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlmainLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(pnlprsnldetails, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(pnlotherdetails, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlmainLayout.setVerticalGroup(
            pnlmainLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, pnlmainLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(pnlmainLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(pnlprsnldetails, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(pnlotherdetails, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(176, 176, 176))
        );

        btnnewrecord.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnnewrecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g_highschoolmanagement_client/1372439035_save_edit.png"))); // NOI18N
        btnnewrecord.setText("Add New Record");
        btnnewrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewrecordActionPerformed(evt);
            }
        });

        btnsave.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g_highschoolmanagement_client/1372440201_Save.png"))); // NOI18N
        btnsave.setText("Save Record");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnedit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g_highschoolmanagement_client/1372440261_filesaveas.png"))); // NOI18N
        btnedit.setText("Edit Record");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g_highschoolmanagement_client/1372440315_trash-can-delete.png"))); // NOI18N
        btndelete.setText("Delete Record");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnsearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g_highschoolmanagement_client/1372438975_Search.png"))); // NOI18N
        btnsearch.setText("Search Student's Parent");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        txtsearch.setBackground(new java.awt.Color(255, 255, 204));
        txtsearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(21, 21, 21)
                        .add(pnlmain, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .add(lbldetails, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 335, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(69, 69, 69)
                        .add(txtsearch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 217, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(14, 14, 14)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(btnnewrecord, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .add(btnsave, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(btnedit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(btndelete, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(btnsearch)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(93, 93, 93)
                        .add(btnnewrecord)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(btnsave)
                        .add(18, 18, 18)
                        .add(btnedit)
                        .add(18, 18, 18)
                        .add(btndelete))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(39, 39, 39)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(txtsearch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(btnsearch))
                                .add(4, 4, 4))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .add(lbldetails, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)))
                        .add(pnlmain, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 282, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public String dbusername="root";
 public  String dbhostip;
 public  String dbpassword;
public String database;  
    public  void dblogincred(){
    
        String fileName = "C:\\Users\\Public\\Documents\\dblogin.txt";

        try {
            // Use this for reading the data.
            String[] login=new String[10];
            byte[] buffer = new byte[1000];

            FileInputStream inputStream = 
                new FileInputStream(fileName);

            int total = 0;
            int nRead = 0;
            while((nRead = inputStream.read(buffer)) != -1) {
               
             login[total]= (new String(buffer));
                total += nRead;
                
            }
            if(login[1]!=null){
            dbpassword=login[1].trim();
            }
             if(login[0]!=null){
            dbhostip=login[0].trim();
            }
               inputStream.close();
               if(dbhostip.isEmpty()==false){
               int l=dbhostip.indexOf("n");
               int e=dbhostip.indexOf("%");
               
        dbpassword=dbhostip.substring(l+1,e).trim();
        database=dbhostip.substring(e+1).trim();
        dbhostip=dbhostip.substring(0, l).trim();
         System.out.println(""+dbhostip);
         System.out.println(""+database);
         System.out.println(""+dbpassword);
               }
          
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");
      
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");					
            
        }
         
    }
    private void btnnewrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewrecordActionPerformed
        // TODO add your handling code here:
        txtid.setText("")  ;
    txtfname.setText("");
    txtphone.setText("");
    txtgender.setSelectedItem("");
    txtoccupation.setText("");
    txtwork.setText("");
    txthome.setText("");
    txtopaorent.setText("");
    txtonumber.setText("");
    txtemail.setText("");
    txtpost.setText("");
 
    }//GEN-LAST:event_btnnewrecordActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        try {
            // TODO add your handling code here:
          String numbr=txtsearch.getText();
        int no=Integer.parseInt(numbr);
        int number ;
Class.forName("com.mysql.jdbc.Driver");
   
                  String host = "jdbc:mysql://"+dbhostip+":3306/"+database;
              String user = dbusername;
              String password = dbpassword;
              Connection con = DriverManager.getConnection(host, user, password);

              Statement stmt = con.createStatement();

              ResultSet rs = stmt.executeQuery("Select *from STUDENT where studentnumber= " + no);

              if (rs.next()) {
             
              number = rs.getInt("ParentsId");
              Statement stm = con.createStatement();

              ResultSet rst = stm.executeQuery("Select * from PARENT where PARENTID= " + number);
               if (rst.next()) {
    txtid.setText(""+rst.getInt("parentid"))  ;
    txtfname.setText(""+rst.getString("parentname"));
    txtphone.setText(""+rst.getInt("phone"));
    txtgender.setSelectedItem(""+rst.getString("sex"));
    txtoccupation.setText(""+rst.getString("occupation"));
    txtwork.setText(""+rst.getString("workloc"));
    txthome.setText(""+rst.getString("residence"));
    txtopaorent.setText(""+rst.getString("oparent"));
    txtonumber.setText(""+rst.getInt("ophone"));
    txtemail.setText(""+rst.getString("emailaddress"));
    txtpost.setText(""+rst.getString("postaladd"));
   
                   
               }
               else{
                     JOptionPane.showMessageDialog(rootPane,"Parent details for the above student are un available");
            
               }
              
              
              }
              else 
              {
                  JOptionPane.showMessageDialog(rootPane,"A student by that admission does not exist on our database");
              }
        } catch (SQLException ex) {
            Logger.getLogger(parent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(parent.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
       if(main.txtcredentials.getText().equals("Administrator")){
           
        try {
            String numbr=txtsearch.getText();
           int no=Integer.parseInt(numbr);
           int number ;
Class.forName("com.mysql.jdbc.Driver");
   
                     String host = "jdbc:mysql://"+dbhostip+":3306/"+database;
                 String user = dbusername;
                 String password = dbpassword;
                 Connection con = DriverManager.getConnection(host, user, password);

                 Statement stmt = con.createStatement();

                 ResultSet rs = stmt.executeQuery("Select *from STUDENT where studentnumber= " + no);

                 if (rs.next()) {
                
                 number = rs.getInt("ParentsId");
       try{        
      PreparedStatement st = con.prepareStatement("UPDATE PARENT SET parentname=?,parentid=?,sex=?,occupation=?,emailaddress=?,residence=?,phone=?,postaladd=?,workloc=?,oparent=?,ophone=?WHERE parentid=?");

      st.setString(1, txtfname.getText());
      st.setInt(2, Integer.parseInt(txtid.getText()));
      st.setString(3, (String)txtgender.getSelectedItem());
      st.setString(4, txtoccupation.getText());
      st.setString(5, txtemail.getText());
      st.setString(6,txthome.getText());
    
      st.setInt(7,Integer.parseInt(txtphone.getText()) );
      st.setString(8,  txtpost.getText());
      st.setString(9,  txtwork.getText());
      st.setString(10, txtopaorent.getText());
      st.setInt(11,Integer.parseInt(txtonumber.getText()));
      st.setInt(12,number);
     
       st.executeUpdate();
      JOptionPane.showMessageDialog(rootPane, "Edit operation successfull");
    }
    catch (Exception e)
    {
      e.printStackTrace();
         JOptionPane.showMessageDialog(rootPane, "Edit operation failed please check that all the fields are input well");
 
      
    } 
                 }
                 else{
               JOptionPane.showMessageDialog(rootPane,"A student by that admission does not exist on our database");
           
                 }
           
           // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(parent.class.getName()).log(Level.SEVERE, null, ex);
        }  catch (ClassNotFoundException ex) {
               Logger.getLogger(parent.class.getName()).log(Level.SEVERE, null, ex);
           }
}
else{
 JOptionPane.showMessageDialog(rootPane,"Insufficient rights to perform this action");
}
        
        
    }//GEN-LAST:event_btneditActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
              if(main.txtcredentials.getText().equals("Administrator")){
           
        try {
            String numbr=txtsearch.getText();
           int no=Integer.parseInt(numbr);
           int number ;
Class.forName("com.mysql.jdbc.Driver");
   
                     String host = "jdbc:mysql://"+dbhostip+":3306/"+database;
                 String user = dbusername;
                 String password = dbpassword;
                 Connection con = DriverManager.getConnection(host, user, password);

                 Statement stmt = con.createStatement();

                 ResultSet rs = stmt.executeQuery("Select *from STUDENT where studentnumber= " + no);

                 if (rs.next()) {
                
                 number = rs.getInt("ParentsId");
                    int c =JOptionPane.showConfirmDialog(rootPane,"Are you sure you want to delete this record?","Delete",0);
          if(c==0){
   
       try{     
           
      int r=stmt.executeUpdate("Delete from parent where parentid= " + number);
            
              
             if(r==1){
                 
                     JOptionPane.showMessageDialog(rootPane,"Record Deleted");

             }
             else{
               JOptionPane.showMessageDialog(rootPane,"Delete operation failed");
  
             }
          
    }
    catch (Exception e)
    {
      e.printStackTrace();
        
    }} 
                 }
                 else{
               JOptionPane.showMessageDialog(rootPane,"A student by that admission does not exist on our database");
           
                 }
           
           // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(parent.class.getName()).log(Level.SEVERE, null, ex);
        }         catch (ClassNotFoundException ex) {
                      Logger.getLogger(parent.class.getName()).log(Level.SEVERE, null, ex);
                  }
}
else{
 JOptionPane.showMessageDialog(rootPane,"Insufficient rights to perform this action");
}
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
                   try{                                        
            // TODO add your handling code here:
                       Class.forName("com.mysql.jdbc.Driver");
   
                 String host = "jdbc:mysql://"+dbhostip+":3306/"+database;
                     String user = dbusername;
                     String password = dbpassword;
                     Connection con = DriverManager.getConnection(host, user, password);
                       try{
       PreparedStatement st = con.prepareStatement("INSERT INTO parent VALUES(?,?,?,?,?,?,?,?,?,?,?)");

          st.setString(1, txtfname.getText());
          st.setInt(2, Integer.parseInt(txtid.getText()));
          st.setString(3, (String)txtgender.getSelectedItem());
          st.setString(4, txtoccupation.getText());
          st.setString(5, txtemail.getText());
          st.setString(6,txthome.getText());
          st.setInt(7,Integer.parseInt(txtphone.getText()) );
          st.setString(8,  txtpost.getText());
          st.setString(9,  txtwork.getText());
          st.setString(10, txtopaorent.getText());
          st.setInt(11,Integer.parseInt(txtonumber.getText()));
         
           st.executeUpdate();
          JOptionPane.showMessageDialog(rootPane, "Save operation successfull");
        }
        catch (Exception e)
        {
          e.printStackTrace();
             JOptionPane.showMessageDialog(rootPane, "Save operation failed please check that all the fields are input well");
     
          
        } 

        }
    catch (SQLException ex)
    {
            Logger.getLogger(parent.class.getName()).log(Level.SEVERE, null,ex);
 
      
    }   catch (ClassNotFoundException ex) { 
            Logger.getLogger(parent.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }//GEN-LAST:event_btnsaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnnewrecord;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel lbldetails;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblfullname;
    private javax.swing.JLabel lblhome;
    private javax.swing.JLabel lbloccupation;
    private javax.swing.JLabel lblogender;
    private javax.swing.JLabel lblonumbers;
    private javax.swing.JLabel lbloparents;
    private javax.swing.JLabel lblparentid;
    private javax.swing.JLabel lblphone;
    private javax.swing.JLabel lblpost;
    private javax.swing.JLabel lblwork;
    private javax.swing.JPanel pnlmain;
    private javax.swing.JPanel pnlotherdetails;
    private javax.swing.JPanel pnlprsnldetails;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfname;
    private javax.swing.JComboBox txtgender;
    private javax.swing.JTextField txthome;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtoccupation;
    private javax.swing.JTextField txtonumber;
    private javax.swing.JTextField txtopaorent;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtpost;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtwork;
    // End of variables declaration//GEN-END:variables
}
