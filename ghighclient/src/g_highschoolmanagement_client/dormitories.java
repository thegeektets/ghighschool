
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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.File;
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
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author griffin
 */
public class dormitories extends javax.swing.JInternalFrame {


public static Connection con;
public static Statement stmt;

    /** Creates new form student */
    public dormitories() {
        initComponents();
        dblogincred();
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
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtcapacity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdes = new javax.swing.JTextArea();
        pnlotherdetails = new javax.swing.JPanel();
        lbloccupation = new javax.swing.JLabel();
        lblhome = new javax.swing.JLabel();
        txtpatron = new javax.swing.JTextField();
        txtasspatron = new javax.swing.JTextField();
        lblwork = new javax.swing.JLabel();
        txtmotto = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        txtbeds = new javax.swing.JTextField();
        btnhosteloccupants = new javax.swing.JButton();
        btnnewrecord = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnnewrecord1 = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Dormitories Data Form");

        lbldetails.setBackground(new java.awt.Color(153, 255, 153));
        lbldetails.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbldetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldetails.setText("School Boarding Dormitories Data  Form");
        lbldetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbldetails.setName(""); // NOI18N
        lbldetails.setOpaque(true);

        pnlmain.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        pnlprsnldetails.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblparentid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblparentid.setText("Dormitory ID");

        lblfullname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblfullname.setText("Dormitory Name");

        lblogender.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblogender.setText("Bed Capacity");

        lblphone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblphone.setText("Description/History");

        txtid.setBackground(new java.awt.Color(255, 255, 204));
        txtid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtname.setBackground(new java.awt.Color(255, 255, 204));
        txtname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtcapacity.setBackground(new java.awt.Color(255, 255, 204));
        txtcapacity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtdes.setColumns(20);
        txtdes.setRows(5);
        jScrollPane1.setViewportView(txtdes);

        org.jdesktop.layout.GroupLayout pnlprsnldetailsLayout = new org.jdesktop.layout.GroupLayout(pnlprsnldetails);
        pnlprsnldetails.setLayout(pnlprsnldetailsLayout);
        pnlprsnldetailsLayout.setHorizontalGroup(
            pnlprsnldetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlprsnldetailsLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlprsnldetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(lblogender, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, lblphone, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, lblfullname, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, lblparentid, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlprsnldetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(txtname, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .add(txtcapacity)
                    .add(txtid)
                    .add(jScrollPane1))
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
                    .add(txtname)
                    .add(lblfullname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlprsnldetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(txtcapacity)
                    .add(lblogender, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(pnlprsnldetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlprsnldetailsLayout.createSequentialGroup()
                        .add(2, 2, 2)
                        .add(lblphone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(pnlprsnldetailsLayout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
        );

        pnlotherdetails.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbloccupation.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbloccupation.setText("Ass Patron");

        lblhome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblhome.setText("Current Beds");

        txtpatron.setBackground(new java.awt.Color(255, 255, 204));
        txtpatron.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtasspatron.setBackground(new java.awt.Color(255, 255, 204));
        txtasspatron.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblwork.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblwork.setText("Patron");

        txtmotto.setBackground(new java.awt.Color(255, 255, 204));
        txtmotto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblemail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblemail.setText("Motto");

        txtbeds.setBackground(new java.awt.Color(255, 255, 204));
        txtbeds.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        org.jdesktop.layout.GroupLayout pnlotherdetailsLayout = new org.jdesktop.layout.GroupLayout(pnlotherdetails);
        pnlotherdetails.setLayout(pnlotherdetailsLayout);
        pnlotherdetailsLayout.setHorizontalGroup(
            pnlotherdetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlotherdetailsLayout.createSequentialGroup()
                .add(pnlotherdetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblwork, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 187, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lbloccupation, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 158, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pnlotherdetailsLayout.createSequentialGroup()
                        .add(pnlotherdetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lblemail)
                            .add(lblhome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 169, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(pnlotherdetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(txtasspatron, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, txtmotto)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, txtpatron)
                            .add(txtbeds))))
                .add(0, 0, Short.MAX_VALUE))
        );
        pnlotherdetailsLayout.setVerticalGroup(
            pnlotherdetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlotherdetailsLayout.createSequentialGroup()
                .add(pnlotherdetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblhome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtbeds, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(5, 5, 5)
                .add(pnlotherdetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(lblwork, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(txtpatron, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(7, 7, 7)
                .add(pnlotherdetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(txtasspatron)
                    .add(lbloccupation, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(pnlotherdetailsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtmotto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblemail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnhosteloccupants.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnhosteloccupants.setText("View Hostel Occupants");
        btnhosteloccupants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhosteloccupantsActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout pnlmainLayout = new org.jdesktop.layout.GroupLayout(pnlmain);
        pnlmain.setLayout(pnlmainLayout);
        pnlmainLayout.setHorizontalGroup(
            pnlmainLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlmainLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(pnlprsnldetails, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(pnlmainLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlmainLayout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(pnlotherdetails, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(pnlmainLayout.createSequentialGroup()
                        .add(35, 35, 35)
                        .add(btnhosteloccupants, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 276, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
        );
        pnlmainLayout.setVerticalGroup(
            pnlmainLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlmainLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(pnlmainLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlmainLayout.createSequentialGroup()
                        .add(pnlotherdetails, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 157, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnhosteloccupants, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(pnlprsnldetails, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(434, 434, 434))
        );

        btnnewrecord.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnnewrecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g_highschoolmanagement_client/1372438975_Search.png"))); // NOI18N
        btnnewrecord.setText("Find Record");
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

        btnnewrecord1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnnewrecord1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g_highschoolmanagement_client/1372440201_Save.png"))); // NOI18N
        btnnewrecord1.setText("Add  Record");
        btnnewrecord1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewrecord1ActionPerformed(evt);
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
                        .addContainerGap()
                        .add(pnlmain, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(btnsave, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .add(btnedit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(btnnewrecord1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .add(layout.createSequentialGroup()
                        .add(160, 160, 160)
                        .add(lbldetails, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 335, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(107, 107, 107)
                        .add(txtsearch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 114, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(33, 33, 33)
                        .add(btnnewrecord)))
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(6, 6, 6)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(lbldetails, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(txtsearch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(btnnewrecord)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(pnlmain, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 244, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(98, 98, 98)
                        .add(btnnewrecord1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnsave)
                        .add(18, 18, 18)
                        .add(btnedit)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public String dbusername="root";
 public  String dbhostip;
 public  String dbpassword;
public String database;
      public  void dblogincred(){
           try {
            StringBuilder sb = new StringBuilder(File.separator);
            sb.append("C:\\Users\\Public\\Documents\\dblogin.txt");
            File f = new File(sb.toString());
            boolean isCreated = f.createNewFile();
            System.out.println(isCreated);
        } catch (IOException ex) {
            Logger.getLogger(dbsetup.class.getName()).log(Level.SEVERE, null, ex);
        }
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
                 firstwelcome main=new firstwelcome();
        main.setVisible(true);
  
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");					
            
        }
         
    }
  public static void popolate(int s, JTable tbale, ResultSet rs)
    throws SQLException
  {
    
    rs.last();
    int rows = rs.getRow();
    rs.first();
    for (int a = 0; a < rows; a++) {
      for (int b = 0; b < s; b++) {
        try {
          tbale.setValueAt(rs.getString(b + 1), a, b);
        }
        catch (Exception e)
        {
          tbale.setValueAt(Integer.valueOf(rs.getInt(a)), a, b);
        }
      }

      rs.next();
    }
  }
  public  void create(int s, ResultSet rs, String[] heads) throws SQLException { con = DriverManager.getConnection("jdbc:mysql://"+dbhostip+":3306/"+database, dbusername, dbpassword);
    stmt = con.createStatement();
    try
    {
      DefaultTableModel model = new DefaultTableModel();
      final JTable table = new JTable(model);
      int a = 0;
      while (a < s) {
        model.addColumn(heads[a]);
        a++;
      }

      while (rs.next()) {
        model.addRow(new Object[0]);
      }

      JFrame f = new JFrame("Search Results");
      JMenuBar printmenubar = new JMenuBar();
      JMenu printmenu =new JMenu("Print");
      JMenuItem printitem =new JMenuItem("Print Results");
      f.setSize(1000,500);
      f.add(new JScrollPane(table));
      
      printmenubar.add(printmenu);
      printmenu.add(printitem);
      printitem.addActionListener(new ActionListener(){ 
      public void actionPerformed(ActionEvent evt) {
     try {
    boolean complete = table.print();
    if (complete) {
         JOptionPane.showMessageDialog(null, "Results Printed");
    } else {
              
        JOptionPane.showMessageDialog(null, "Printing cancelled by user");   }
} catch (PrinterException pe) {
             JOptionPane.showMessageDialog(null, "Printing failed"+pe.getMessage());
}
      }
      }
              );
      f.setJMenuBar(printmenubar);
      
      
      f.setVisible(true);
      f.setExtendedState(JFrame.MAXIMIZED_BOTH);
      popolate(s, table, rs);
      f.setDefaultCloseOperation(2);
    } catch (SQLException ex) {
      Logger.getLogger(dormitories.class.getName()).log(Level.SEVERE, null, ex);
    } }
    
    private void btnnewrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewrecordActionPerformed
        // TODO add your handling code here:
        try
    {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(dormitories.class.getName()).log(Level.SEVERE, null, ex);
            }
   
        con = DriverManager.getConnection("jdbc:mysql://"+dbhostip+":3306/"+database, dbusername, dbpassword);
    stmt = con.createStatement();
    
      ResultSet rs = stmt.executeQuery("Select * from hostel where id=" + Integer.parseInt(txtsearch.getText()));
      int s = 9;
      create(s, rs, new String[] { "ID", "Name", "Capacity", "Description", "Beds","Patron", "Ass Patron" ,"Motto" });

      rs.first();

     
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Record not found" + ex.getMessage());
    }
        
        
    }//GEN-LAST:event_btnnewrecordActionPerformed

    private void btnnewrecord1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewrecord1ActionPerformed
        // TODO add your handling code here:
        txtid.setText("");
        txtname.setText("");
        txtcapacity.setText("");
        txtbeds.setText("");
        txtpatron.setText("");
        txtdes.setText("");
        txtasspatron.setText("");
        txtmotto.setText("");
        
        
        
    }//GEN-LAST:event_btnnewrecord1ActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
          try {
              Class.forName("com.mysql.jdbc.Driver");
   
      String host = "jdbc:mysql://"+dbhostip+":3306/"+database;
      String user = dbusername;
      String password = dbpassword;
      Connection con = DriverManager.getConnection(host, user, password);
       
   
        
   
      


      PreparedStatement stmt = con.prepareStatement("INSERT INTO hostel VALUES(?,?,?,?,?,?,?,?)");

      stmt.setInt(1, Integer.parseInt(txtid.getText()));
      stmt.setString(2, txtname.getText());
      stmt.setInt(3, Integer.parseInt(txtcapacity.getText()));
      stmt.setString(4, txtdes.getText());
      stmt.setInt(5,  Integer.parseInt(txtbeds.getText()));
      stmt.setString(6,txtpatron.getText());
      stmt.setString(7,txtasspatron.getText());
      stmt.setString(8,txtmotto.getText());
     
       stmt.executeUpdate();
      JOptionPane.showMessageDialog(rootPane, "Save operation successfull");
    }
    catch (Exception e)
    {
      e.printStackTrace();
         JOptionPane.showMessageDialog(rootPane, "Save operation failed please check that all the fields are input well");
 
      
    }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
   
        String host = "jdbc:mysql://"+dbhostip+":3306/"+database;
      String user = dbusername;
      String password = dbpassword;
      Connection con = DriverManager.getConnection(host, user, password);
       
   
        
   
      


      PreparedStatement stmt = con.prepareStatement("UPdate  hostel set id=?,name=?,capacity=?,des=?,beds=?,patron=?,ass patron=?,motto=? where id="+Integer.parseInt(txtsearch.getText()));

      stmt.setInt(1, Integer.parseInt(txtid.getText()));
      stmt.setString(2, txtname.getText());
      stmt.setInt(3, Integer.parseInt(txtcapacity.getText()));
      stmt.setString(4, txtdes.getText());
      stmt.setInt(5,  Integer.parseInt(txtbeds.getText()));
      stmt.setString(6,txtpatron.getText());
      stmt.setString(7,txtasspatron.getText());
      stmt.setString(8,txtmotto.getText());
     
       stmt.executeUpdate();
      JOptionPane.showMessageDialog(rootPane, "Edit operation successfull");
    }
    catch (Exception e)
    {
      e.printStackTrace();
         JOptionPane.showMessageDialog(rootPane, "Edit operation failed please check that all the fields are input well");
 
      
    }  
        
    }//GEN-LAST:event_btneditActionPerformed
  
 
    private void btnhosteloccupantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhosteloccupantsActionPerformed
    try
    {                                                   
        // TODO add your handling code here:
            try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    con = DriverManager.getConnection("jdbc:mysql://"+dbhostip+":3306/"+database, dbusername, dbpassword);
    stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("Select studentnumber,studentname,cclass,stream from student where cclass <= 4 and house= '" + txtname.getText()+"'");
      int s = 4;
      if(rs.first()==false){
          JOptionPane.showMessageDialog(rootPane,"No students have been added for this hostel yet");
      }
      else{
      create(s, rs, new String[] { "Admno", "Name", "Class", "Stream" });
      }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(dormitories.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
        
    }//GEN-LAST:event_btnhosteloccupantsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhosteloccupants;
    private javax.swing.JButton btnnewrecord;
    private javax.swing.JButton btnnewrecord1;
    private javax.swing.JButton btnsave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldetails;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblfullname;
    private javax.swing.JLabel lblhome;
    private javax.swing.JLabel lbloccupation;
    private javax.swing.JLabel lblogender;
    private javax.swing.JLabel lblparentid;
    private javax.swing.JLabel lblphone;
    private javax.swing.JLabel lblwork;
    private javax.swing.JPanel pnlmain;
    private javax.swing.JPanel pnlotherdetails;
    private javax.swing.JPanel pnlprsnldetails;
    private javax.swing.JTextField txtasspatron;
    private javax.swing.JTextField txtbeds;
    private javax.swing.JTextField txtcapacity;
    private javax.swing.JTextArea txtdes;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmotto;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpatron;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}