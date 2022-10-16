package Dashboard;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author varshahindupur-002935078-Northeastern University new
 * Hello World
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        EmpID = new javax.swing.JTextField();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        Age = new javax.swing.JTextField();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        StartDate = new javax.swing.JTextField();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        TeamInfo = new javax.swing.JTextField();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
        PositionTitle = new javax.swing.JTextField();
        javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
        CellPhoneNo = new javax.swing.JTextField();
        javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
        EmailAdd = new javax.swing.JTextField();
        Level = new javax.swing.JComboBox<>();
        Gender = new javax.swing.JComboBox<>();
        javax.swing.JButton BtnDelete = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        EmplTable = new javax.swing.JTable();
        Search = new javax.swing.JTextField();
        MyLabel = new javax.swing.JLabel();
        javax.swing.JButton BtnCreate = new javax.swing.JButton();
        ImageText = new javax.swing.JTextField();
        javax.swing.JButton BtnUpdate = new javax.swing.JButton();
        BtnBrowse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(200, 200, 200));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("List of Employees");

        jPanel2.setBackground(new java.awt.Color(200, 200, 200));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Employee Profile"));
        jPanel2.setOpaque(false);

        jLabel2.setText("Name");

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        jLabel3.setText("Employee ID");

        jLabel4.setText("Age");

        Age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AgeKeyPressed(evt);
            }
        });

        jLabel5.setText("Gender");

        jLabel6.setText("Start Date");

        jLabel7.setText("Level");

        jLabel8.setText("Team Info");

        TeamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeamInfoActionPerformed(evt);
            }
        });

        jLabel9.setText("Position Title");

        jLabel10.setText("Cell Phone No");

        CellPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellPhoneNoActionPerformed(evt);
            }
        });
        CellPhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CellPhoneNoKeyPressed(evt);
            }
        });

        jLabel11.setText("Email Address");

        EmailAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailAddActionPerformed(evt);
            }
        });

        Level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" }));

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(EmailAdd, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PositionTitle, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TeamInfo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StartDate, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Age, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EmpID, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Name, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CellPhoneNo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Level, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CellPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        BtnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard/bin.png"))); // NOI18N
        BtnDelete.setText("Delete");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        EmplTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "EmpID", "Age", "Gender", "StartDate", "Level", "Team Info", "Position Title", "CellNo", "Email", "imageicon"
            }
        ));
        EmplTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmplTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EmplTable);

        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
        });

        MyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard/man.png"))); // NOI18N
        MyLabel.setText("Search");

        BtnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard/plus.png"))); // NOI18N
        BtnCreate.setText("Create");
        BtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateActionPerformed(evt);
            }
        });

        BtnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard/eraser.png"))); // NOI18N
        BtnUpdate.setText("Update");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        BtnBrowse.setText("Browse for Image");
        BtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBrowseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(MyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 54, Short.MAX_VALUE))
                            .addComponent(BtnBrowse, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ImageText, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnDelete)
                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MyLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnBrowse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ImageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnCreate)
                            .addComponent(BtnUpdate))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TeamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeamInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TeamInfoActionPerformed

    private void CellPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CellPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CellPhoneNoActionPerformed

    private void EmailAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailAddActionPerformed
        // TODO add your handling code here:
//        JOptionPane.showMessageDialog(null, "button pressed");
        String email = EmailAdd.getText();
        if(EmailValidation.isValid(email)== false)
        {
            JOptionPane.showMessageDialog(null, "Enter in Format - a@gmail.com");
        }
    }//GEN-LAST:event_EmailAddActionPerformed


    private void BtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateActionPerformed
        String name = Name.getText();
        String empid = EmpID.getText();
        String age = Age.getText();
        String gender = Gender.getSelectedItem().toString();
        String startdate = StartDate.getText();
        String level = Level.getSelectedItem().toString();
        String teaminfo = TeamInfo.getText();
        String positiontitle = PositionTitle.getText();
        String cellphoneno = CellPhoneNo.getText();
        String email = EmailAdd.getText();
        String image = ImageText.getText();

        EmplTable.getColumn("imageicon").setCellRenderer(new myTableCellRenderer());

        JLabel ImageLabel = new JLabel();
        ImageIcon imageicon = new ImageIcon(image);
        //Resize image to fixed dimension 60 *60 (width and height)
        Image newImage = imageicon.getImage(); 
        Image ImageIC = newImage.getScaledInstance(60, 60,  java.awt.Image.SCALE_SMOOTH);
        //storimng image in JLabel
        ImageLabel.setIcon(new ImageIcon(ImageIC));

        if (name.isEmpty() || empid.isEmpty() || age.isEmpty() || gender.isEmpty() || startdate.isEmpty()
                || level.isEmpty() || teaminfo.isEmpty() || positiontitle.isEmpty()
                || cellphoneno.isEmpty() || email.isEmpty() || image.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter all fields",
                    "Try Again",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) EmplTable.getModel();
            model.addRow(new Object[]{name, empid, age, gender, startdate, level, teaminfo,
                positiontitle, cellphoneno, email, ImageLabel});

            Name.setText("Enter Name:");
            EmpID.setText("Enter EmpID");
            Age.setText("Age");
            Gender.setSelectedIndex(1);
            StartDate.setText("Enter in DD-MM-YYYY format");
            Level.setSelectedIndex(0);
            TeamInfo.setText("Enter Team Name");
            PositionTitle.setText("Enter PositionTitle");
            CellPhoneNo.setText("Enter CellPhoneNo");
            EmailAdd.setText("Enter Email");
            ImageText.setText("");
        }
        
        
        

    }//GEN-LAST:event_BtnCreateActionPerformed
    class myTableCellRenderer implements TableCellRenderer {

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                boolean hasFocus, int row, int column) {

            //Change Image column minimum width and maximum width
            TableColumn tb = EmplTable.getColumn("imageicon");
            tb.setMaxWidth(60);

            EmplTable.setRowHeight(60);
            return (Component) value;
        }
    }


    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        // TODO add your handling code here:
        //Get table Model
        DefaultTableModel model = (DefaultTableModel) EmplTable.getModel();
        if (EmplTable.getSelectedRowCount() == 1) {
            //if single row is selected then update
            String name = Name.getText();
            String empid = EmpID.getText();
            String age = Age.getText();
            String gender = Gender.getSelectedItem().toString();
            String startdate = StartDate.getText();
            String level = Level.getSelectedItem().toString();
            String teaminfo = TeamInfo.getText();
            String positiontitle = PositionTitle.getText();
            String cellphoneno = CellPhoneNo.getText();
            String email = EmailAdd.getText();
           // String image = Image.getText();

            //Set updated value on table row
            model.setValueAt(name, EmplTable.getSelectedRow(), 0);
            model.setValueAt(empid, EmplTable.getSelectedRow(), 1);
            model.setValueAt(age, EmplTable.getSelectedRow(), 2);
            model.setValueAt(gender, EmplTable.getSelectedRow(), 3);
            model.setValueAt(startdate, EmplTable.getSelectedRow(), 4);
            model.setValueAt(level, EmplTable.getSelectedRow(), 5);
            model.setValueAt(teaminfo, EmplTable.getSelectedRow(), 6);
            model.setValueAt(positiontitle, EmplTable.getSelectedRow(), 7);
            model.setValueAt(cellphoneno, EmplTable.getSelectedRow(), 8);
            model.setValueAt(email, EmplTable.getSelectedRow(), 9);
          //  model.setValueAt(image, EmplTable.getSelectedRow(), 10);

            //upadte message display
            JOptionPane.showMessageDialog(this, "Update Successfully");
        } else {
            if (EmplTable.getRowCount() == 0) {
                //if table is empty
                JOptionPane.showMessageDialog(this, "table is empty");
            } else {
                //if row is not selected or multiple row is selected
                JOptionPane.showMessageDialog(this, "Please select single row for update");
            }
        }

        Name.setText("");
        EmpID.setText("");
        Age.setText("");
        Gender.setSelectedIndex(0);
        StartDate.setText("");
        Level.setSelectedIndex(0);
        TeamInfo.setText("");
        PositionTitle.setText("");
        CellPhoneNo.setText("");
        EmailAdd.setText("");
        ImageText.setText("");
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        int row = EmplTable.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(this,
                    "No row is selected! Please select one row",
                    "Select row",
                    JOptionPane.ERROR_MESSAGE);

        } else {
            DefaultTableModel model = (DefaultTableModel) EmplTable.getModel();
            model.removeRow(row);
        }
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void EmplTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmplTableMouseClicked
        // set data to textfield

        DefaultTableModel model = (DefaultTableModel) EmplTable.getModel();

        //set data to text field when row is selected
        String TableName = model.getValueAt(git .getSelectedRow(), 0).toString();
        String TableEmpID = model.getValueAt(EmplTable.getSelectedRow(), 1).toString();
        String TableAge = model.getValueAt(EmplTable.getSelectedRow(), 2).toString();
        String TableGender = model.getValueAt(EmplTable.getSelectedRow(), 3).toString();
        String TableStartDate = model.getValueAt(EmplTable.getSelectedRow(), 4).toString();
        String TableLevel = model.getValueAt(EmplTable.getSelectedRow(), 5).toString();
        String TableTeamInfo = model.getValueAt(EmplTable.getSelectedRow(), 6).toString();
        String TablePositionTitle = model.getValueAt(EmplTable.getSelectedRow(), 7).toString();
        String TableCellNo = model.getValueAt(EmplTable.getSelectedRow(), 8).toString();
        String TableEmail = model.getValueAt(EmplTable.getSelectedRow(), 9).toString();
        String TableImage = model.getValueAt(EmplTable.getSelectedRow(), 10).toString();
        //set to textField

        Name.setText(TableName);
        EmpID.setText(TableEmpID);
        Age.setText(TableAge);
        Gender.setSelectedItem(TableGender);
        StartDate.setText(TableStartDate);
        Level.setSelectedItem(TableLevel);
        TeamInfo.setText(TableTeamInfo);
        PositionTitle.setText(TablePositionTitle);
        CellPhoneNo.setText(TableCellNo);
        EmailAdd.setText(TableEmail);
//        Image.setText(TableImage);


    }//GEN-LAST:event_EmplTableMouseClicked

    public void search(String str) {
        DefaultTableModel model = (DefaultTableModel) EmplTable.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(model);
        EmplTable.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
        // TODO add your handling code here:
        String search = Search.getText();
        search(search);

    }//GEN-LAST:event_SearchKeyReleased

    private void BtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        //Filter image extensions
        FileNameExtensionFilter Fnef = new FileNameExtensionFilter("Image", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(Fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            ImageText.setText(selectedImagePath);
            JOptionPane.showMessageDialog(null, selectedImagePath);

        }

    }//GEN-LAST:event_BtnBrowseActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void CellPhoneNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CellPhoneNoKeyPressed
        // TODO add your handling code here:
        String CellNumber = CellPhoneNo.getText();
        int length = CellNumber.length();
        char c = evt.getKeyChar();

        //check for number 0 to 9
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            //check for length not more than 10 digit
            if (length < 10) {
                CellPhoneNo.setEditable(true);

            } else {
                CellPhoneNo.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                CellPhoneNo.setEditable(true);
            } else {
                CellPhoneNo.setEditable(false);
            }
        }

    }//GEN-LAST:event_CellPhoneNoKeyPressed

    private void AgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeKeyPressed
        // TODO add your handling code here:
        String CellNumber = Age.getText();
        int length = CellNumber.length();
        char c = evt.getKeyChar();

        //check for number 0 to 1
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            //check for length not more than 10 digit
            if (length < 2) {
                Age.setEditable(true);

            } else {
                Age.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                Age.setEditable(true);
            } else {
                Age.setEditable(false);
            }
        }
    }//GEN-LAST:event_AgeKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private javax.swing.JButton BtnBrowse;
    private javax.swing.JTextField CellPhoneNo;
    private javax.swing.JTextField EmailAdd;
    private javax.swing.JTextField EmpID;
    private javax.swing.JTable EmplTable;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JTextField ImageText;
    private javax.swing.JComboBox<String> Level;
    private javax.swing.JLabel MyLabel;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField PositionTitle;
    private javax.swing.JTextField Search;
    private javax.swing.JTextField StartDate;
    private javax.swing.JTextField TeamInfo;
    // End of variables declaration//GEN-END:variables
}
