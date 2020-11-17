/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Researchers;

import Controller.Researchers.BookListController;
import Controller.Researchers.StudentListController;
import View.Components.StudentPane;
import View.Components.StudentPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import org.xml.sax.Attributes;

/**
 *
 * @author hylan
 */
public class ListOfStudents extends javax.swing.JInternalFrame {

    /**
     * Creates new form LivDis
     */
    
    private static StudentPane selectedStudentPane;
    
    
    private final StudentListController controller; 
    
    public ListOfStudents() {
        
        initComponents();
        
        controller = new StudentListController(this);
        
        controller.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSearch = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jLabelSearchIcon = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanelStudentList = new javax.swing.JPanel();
        jTabbedPaneDetails = new javax.swing.JTabbedPane();
        jPanelDetails = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelCourse = new javax.swing.JLabel();
        jLabelGrade = new javax.swing.JLabel();
        jTextFieldCourse = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabelRegistration = new javax.swing.JLabel();
        jTextFieldRegistration = new javax.swing.JTextField();
        jLabelSchool = new javax.swing.JLabel();
        jLabelShift = new javax.swing.JLabel();
        jComboBoxGrade = new javax.swing.JComboBox<>();
        jComboBoxShift = new javax.swing.JComboBox<>();
        jComboBoxSchool = new javax.swing.JComboBox<>();
        jLabelModule = new javax.swing.JLabel();
        jComboBoxModule = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanelContact = new javax.swing.JPanel();
        jLabelPhone = new javax.swing.JLabel();
        jFormattedTextFieldPhone = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanelAddress = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jComboBoxAddress = new javax.swing.JComboBox<>();
        jLabelCEP = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();
        jPanelAccount = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelet = new javax.swing.JButton();
        jLabelStudentImage = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Oásis - Livros Disponíveis ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSearch.setText("Pesquisar Estudante:");
        getContentPane().add(jLabelSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 42, -1, -1));

        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 390, -1));
        getContentPane().add(jLabelSearchIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 55, 24));

        jPanelStudentList.setLayout(new javax.swing.BoxLayout(jPanelStudentList, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane2.setViewportView(jPanelStudentList);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 586, 453));

        jPanelDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel3.setText("Nome:");
        jPanelDetails.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabelName.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabelName.setText("Name");
        jPanelDetails.add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 265, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel6.setText("Classe:");
        jPanelDetails.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel7.setText("Escola:");
        jPanelDetails.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel8.setText("Turno:");
        jPanelDetails.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel9.setText("Matricula:");
        jPanelDetails.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel10.setText("Curso:");
        jPanelDetails.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabelCourse.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabelCourse.setText("Name");
        jPanelDetails.add(jLabelCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 265, -1));

        jLabelGrade.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabelGrade.setText("Name");
        jPanelDetails.add(jLabelGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 240, -1));
        jPanelDetails.add(jTextFieldCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 270, -1));
        jPanelDetails.add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 270, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel11.setText("Modulo:");
        jPanelDetails.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabelRegistration.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabelRegistration.setText("Name");
        jPanelDetails.add(jLabelRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 260, -1));
        jPanelDetails.add(jTextFieldRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 260, -1));

        jLabelSchool.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabelSchool.setText("Name");
        jPanelDetails.add(jLabelSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 240, -1));

        jLabelShift.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabelShift.setText("Name");
        jPanelDetails.add(jLabelShift, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 250, -1));

        jComboBoxGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelDetails.add(jComboBoxGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 270, -1));

        jComboBoxShift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelDetails.add(jComboBoxShift, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 280, -1));

        jComboBoxSchool.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelDetails.add(jComboBoxSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 270, -1));

        jLabelModule.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabelModule.setText("Name");
        jPanelDetails.add(jLabelModule, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 250, -1));

        jComboBoxModule.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelDetails.add(jComboBoxModule, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 270, -1));
        jPanelDetails.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 350, 10));
        jPanelDetails.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 350, 10));

        jTabbedPaneDetails.addTab("Geral", jPanelDetails);

        jPanelContact.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPhone.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabelPhone.setText("Name");
        jPanelContact.add(jLabelPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 270, -1));

        jFormattedTextFieldPhone.setText("jFormattedTextField1");
        jPanelContact.add(jFormattedTextFieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 260, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel4.setText("Email:");
        jPanelContact.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabelEmail.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabelEmail.setText("Name");
        jPanelContact.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 270, -1));
        jPanelContact.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 280, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel5.setText("Celular:");
        jPanelContact.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jTabbedPaneDetails.addTab("Contato", jPanelContact);

        jPanelAddress.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel12.setText("CEP:");
        jPanelAddress.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabelAddress.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabelAddress.setText("Name");
        jPanelAddress.add(jLabelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 270, -1));

        jComboBoxAddress.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelAddress.add(jComboBoxAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 250, -1));

        jLabelCEP.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabelCEP.setText("Name");
        jPanelAddress.add(jLabelCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 290, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel13.setText("Endereço:");
        jPanelAddress.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jFormattedTextFieldCEP.setText("jFormattedTextField2");
        jPanelAddress.add(jFormattedTextFieldCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 290, -1));

        jTabbedPaneDetails.addTab("Endereço", jPanelAddress);

        jPanelAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel14.setText("Login:");
        jPanelAccount.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabelLogin.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabelLogin.setText("Name");
        jPanelAccount.add(jLabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 270, -1));
        jPanelAccount.add(jTextFieldLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 280, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel15.setText("Senha:");
        jPanelAccount.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabelPassword.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabelPassword.setText("Name");
        jPanelAccount.add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 270, -1));
        jPanelAccount.add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 280, -1));

        jTabbedPaneDetails.addTab("Conta", jPanelAccount);

        getContentPane().add(jTabbedPaneDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 360, 280));

        jButtonUpdate.setText("Alterar");
        jButtonUpdate.setEnabled(false);
        getContentPane().add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 120, 40));

        jButtonDelet.setText("Deletar");
        getContentPane().add(jButtonDelet, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, -1, -1));

        jLabelStudentImage.setText("Image");
        getContentPane().add(jLabelStudentImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 200, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased
        controller.fastSearch();
    }//GEN-LAST:event_jTextFieldSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelet;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxAddress;
    private javax.swing.JComboBox<String> jComboBoxGrade;
    private javax.swing.JComboBox<String> jComboBoxModule;
    private javax.swing.JComboBox<String> jComboBoxSchool;
    private javax.swing.JComboBox<String> jComboBoxShift;
    private javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    private javax.swing.JFormattedTextField jFormattedTextFieldPhone;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCourse;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelGrade;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelModule;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabelRegistration;
    private javax.swing.JLabel jLabelSchool;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JLabel jLabelSearchIcon;
    private javax.swing.JLabel jLabelShift;
    private javax.swing.JLabel jLabelStudentImage;
    private javax.swing.JPanel jPanelAccount;
    private javax.swing.JPanel jPanelAddress;
    private javax.swing.JPanel jPanelContact;
    private javax.swing.JPanel jPanelDetails;
    private javax.swing.JPanel jPanelStudentList;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPaneDetails;
    private javax.swing.JTextField jTextFieldCourse;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldRegistration;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables

    public static StudentPane getSelectedStudentPane() {
        return selectedStudentPane;
    }

    public static void setSelectedStudentPane(StudentPane selectedStudentPane) {
        ListOfStudents.selectedStudentPane = selectedStudentPane;
    }

    public JButton getjButtonDelet() {
        return jButtonDelet;
    }

    public void setjButtonDelet(JButton jButtonDelet) {
        this.jButtonDelet = jButtonDelet;
    }

    public JButton getjButtonUpdate() {
        return jButtonUpdate;
    }

    public void setjButtonUpdate(JButton jButtonUpdate) {
        this.jButtonUpdate = jButtonUpdate;
    }

    public JComboBox<String> getjComboBoxAddress() {
        return jComboBoxAddress;
    }

    public void setjComboBoxAddress(JComboBox<String> jComboBoxAddress) {
        this.jComboBoxAddress = jComboBoxAddress;
    }

    public JComboBox<String> getjComboBoxGrade() {
        return jComboBoxGrade;
    }

    public void setjComboBoxGrade(JComboBox<String> jComboBoxGrade) {
        this.jComboBoxGrade = jComboBoxGrade;
    }

    public JComboBox<String> getjComboBoxModule() {
        return jComboBoxModule;
    }

    public void setjComboBoxModule(JComboBox<String> jComboBoxModule) {
        this.jComboBoxModule = jComboBoxModule;
    }

    public JComboBox<String> getjComboBoxSchool() {
        return jComboBoxSchool;
    }

    public void setjComboBoxSchool(JComboBox<String> jComboBoxSchool) {
        this.jComboBoxSchool = jComboBoxSchool;
    }

    public JComboBox<String> getjComboBoxShift() {
        return jComboBoxShift;
    }

    public void setjComboBoxShift(JComboBox<String> jComboBoxShift) {
        this.jComboBoxShift = jComboBoxShift;
    }

    public JFormattedTextField getjFormattedTextFieldCEP() {
        return jFormattedTextFieldCEP;
    }

    public void setjFormattedTextFieldCEP(JFormattedTextField jFormattedTextFieldCEP) {
        this.jFormattedTextFieldCEP = jFormattedTextFieldCEP;
    }

    public JFormattedTextField getjFormattedTextFieldPhone() {
        return jFormattedTextFieldPhone;
    }

    public void setjFormattedTextFieldPhone(JFormattedTextField jFormattedTextFieldPhone) {
        this.jFormattedTextFieldPhone = jFormattedTextFieldPhone;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JLabel getjLabel15() {
        return jLabel15;
    }

    public void setjLabel15(JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JLabel getjLabelAddress() {
        return jLabelAddress;
    }

    public void setjLabelAddress(JLabel jLabelAddress) {
        this.jLabelAddress = jLabelAddress;
    }

    public JLabel getjLabelCEP() {
        return jLabelCEP;
    }

    public void setjLabelCEP(JLabel jLabelCEP) {
        this.jLabelCEP = jLabelCEP;
    }

    public JLabel getjLabelCourse() {
        return jLabelCourse;
    }

    public void setjLabelCourse(JLabel jLabelCourse) {
        this.jLabelCourse = jLabelCourse;
    }

    public JLabel getjLabelEmail() {
        return jLabelEmail;
    }

    public void setjLabelEmail(JLabel jLabelEmail) {
        this.jLabelEmail = jLabelEmail;
    }

    public JLabel getjLabelGrade() {
        return jLabelGrade;
    }

    public void setjLabelGrade(JLabel jLabelGrade) {
        this.jLabelGrade = jLabelGrade;
    }

    public JLabel getjLabelLogin() {
        return jLabelLogin;
    }

    public void setjLabelLogin(JLabel jLabelLogin) {
        this.jLabelLogin = jLabelLogin;
    }

    public JLabel getjLabelModule() {
        return jLabelModule;
    }

    public void setjLabelModule(JLabel jLabelModule) {
        this.jLabelModule = jLabelModule;
    }

    public JLabel getjLabelName() {
        return jLabelName;
    }

    public void setjLabelName(JLabel jLabelName) {
        this.jLabelName = jLabelName;
    }

    public JLabel getjLabelPassword() {
        return jLabelPassword;
    }

    public void setjLabelPassword(JLabel jLabelPassword) {
        this.jLabelPassword = jLabelPassword;
    }

    public JLabel getjLabelPhone() {
        return jLabelPhone;
    }

    public void setjLabelPhone(JLabel jLabelPhone) {
        this.jLabelPhone = jLabelPhone;
    }

    public JLabel getjLabelRegistration() {
        return jLabelRegistration;
    }

    public void setjLabelRegistration(JLabel jLabelRegistration) {
        this.jLabelRegistration = jLabelRegistration;
    }

    public JLabel getjLabelSchool() {
        return jLabelSchool;
    }

    public void setjLabelSchool(JLabel jLabelSchool) {
        this.jLabelSchool = jLabelSchool;
    }

    public JLabel getjLabelSearch() {
        return jLabelSearch;
    }

    public void setjLabelSearch(JLabel jLabelSearch) {
        this.jLabelSearch = jLabelSearch;
    }

    public JLabel getjLabelSearchIcon() {
        return jLabelSearchIcon;
    }

    public void setjLabelSearchIcon(JLabel jLabelSearchIcon) {
        this.jLabelSearchIcon = jLabelSearchIcon;
    }

    public JLabel getjLabelShift() {
        return jLabelShift;
    }

    public void setjLabelShift(JLabel jLabelShift) {
        this.jLabelShift = jLabelShift;
    }

    public JLabel getjLabelStudentImage() {
        return jLabelStudentImage;
    }

    public void setjLabelStudentImage(JLabel jLabelStudentImage) {
        this.jLabelStudentImage = jLabelStudentImage;
    }

    public JPanel getjPanelAccount() {
        return jPanelAccount;
    }

    public void setjPanelAccount(JPanel jPanelAccount) {
        this.jPanelAccount = jPanelAccount;
    }

    public JPanel getjPanelAddress() {
        return jPanelAddress;
    }

    public void setjPanelAddress(JPanel jPanelAddress) {
        this.jPanelAddress = jPanelAddress;
    }

    public JPanel getjPanelContact() {
        return jPanelContact;
    }

    public void setjPanelContact(JPanel jPanelContact) {
        this.jPanelContact = jPanelContact;
    }

    public JPanel getjPanelDetails() {
        return jPanelDetails;
    }

    public void setjPanelDetails(JPanel jPanelDetails) {
        this.jPanelDetails = jPanelDetails;
    }

    public JPanel getjPanelStudentList() {
        return jPanelStudentList;
    }

    public void setjPanelStudentList(JPanel jPanelStudentList) {
        this.jPanelStudentList = jPanelStudentList;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(JSeparator jSeparator2) {
        this.jSeparator2 = jSeparator2;
    }

    public JTabbedPane getjTabbedPaneDetails() {
        return jTabbedPaneDetails;
    }

    public void setjTabbedPaneDetails(JTabbedPane jTabbedPaneDetails) {
        this.jTabbedPaneDetails = jTabbedPaneDetails;
    }

    public JTextField getjTextFieldCourse() {
        return jTextFieldCourse;
    }

    public void setjTextFieldCourse(JTextField jTextFieldCourse) {
        this.jTextFieldCourse = jTextFieldCourse;
    }

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public void setjTextFieldEmail(JTextField jTextFieldEmail) {
        this.jTextFieldEmail = jTextFieldEmail;
    }

    public JTextField getjTextFieldLogin() {
        return jTextFieldLogin;
    }

    public void setjTextFieldLogin(JTextField jTextFieldLogin) {
        this.jTextFieldLogin = jTextFieldLogin;
    }

    public JTextField getjTextFieldName() {
        return jTextFieldName;
    }

    public void setjTextFieldName(JTextField jTextFieldName) {
        this.jTextFieldName = jTextFieldName;
    }

    public JTextField getjTextFieldPassword() {
        return jTextFieldPassword;
    }

    public void setjTextFieldPassword(JTextField jTextFieldPassword) {
        this.jTextFieldPassword = jTextFieldPassword;
    }

    public JTextField getjTextFieldRegistration() {
        return jTextFieldRegistration;
    }

    public void setjTextFieldRegistration(JTextField jTextFieldRegistration) {
        this.jTextFieldRegistration = jTextFieldRegistration;
    }

    public JTextField getjTextFieldSearch() {
        return jTextFieldSearch;
    }

    public void setjTextFieldSearch(JTextField jTextFieldSearch) {
        this.jTextFieldSearch = jTextFieldSearch;
    }

    public StudentListController getController() {
        return controller;
    }
}
