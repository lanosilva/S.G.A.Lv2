/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.BookListController;
import View.Components.BookPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author hylan
 */
public class ListOfBooks extends javax.swing.JInternalFrame {

    /**
     * Creates new form LivDis
     */
    
    private static BookPane selectedBookPane;
    
    
    private final BookListController controller; 
    
    public ListOfBooks() {
        
        initComponents();
        
        controller = new BookListController(this);
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanelBookList = new javax.swing.JPanel();
        jPanelBookDetails = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelImageBook = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelAuthor = new javax.swing.JLabel();
        jLabelGenre = new javax.swing.JLabel();
        jLabelAcquiredDate = new javax.swing.JLabel();
        jLabelStock = new javax.swing.JLabel();
        jLabelPublisher = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelSearchIcon = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelet = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Oásis - Livros Disponíveis ");

        jLabelSearch.setText("Pesquisar Livro:");

        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyReleased(evt);
            }
        });

        jPanelBookList.setLayout(new javax.swing.BoxLayout(jPanelBookList, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane2.setViewportView(jPanelBookList);

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setText("Detalhes");

        jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel3.setText("Nome:");

        jLabelName.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabelName.setText("Name");

        jLabelImageBook.setText("Image");

        jLabel6.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel6.setText("Autor:");

        jLabel7.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel7.setText("Publicadora:");

        jLabel8.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel8.setText("Estoque:");

        jLabel9.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel9.setText("Data de Aquisiçao:");

        jLabel10.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel10.setText("Genero:");

        jLabelAuthor.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabelAuthor.setText("Name");

        jLabelGenre.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabelGenre.setText("Name");

        jLabelAcquiredDate.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabelAcquiredDate.setText("Name");

        jLabelStock.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabelStock.setText("Name");

        jLabelPublisher.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabelPublisher.setText("Name");

        jButton1.setText("Alugar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBookDetailsLayout = new javax.swing.GroupLayout(jPanelBookDetails);
        jPanelBookDetails.setLayout(jPanelBookDetailsLayout);
        jPanelBookDetailsLayout.setHorizontalGroup(
            jPanelBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBookDetailsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(110, 110, 110))
            .addGroup(jPanelBookDetailsLayout.createSequentialGroup()
                .addGroup(jPanelBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBookDetailsLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAcquiredDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelBookDetailsLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPublisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelBookDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBookDetailsLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelImageBook, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBookDetailsLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelBookDetailsLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelGenre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelBookDetailsLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(14, 14, 14)
                        .addComponent(jLabelAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelBookDetailsLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBookDetailsLayout.setVerticalGroup(
            jPanelBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBookDetailsLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanelBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabelAuthor))
                .addGap(13, 13, 13)
                .addGroup(jPanelBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabelGenre))
                .addGroup(jPanelBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBookDetailsLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanelBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabelStock)))
                    .addGroup(jPanelBookDetailsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelImageBook, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanelBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabelPublisher))
                .addGap(27, 27, 27)
                .addGroup(jPanelBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabelAcquiredDate))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonUpdate.setText("Alterar");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelet.setText("Deletar");
        jButtonDelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSearchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jButtonDelet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUpdate)))
                .addGap(18, 18, 18)
                .addComponent(jPanelBookDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonUpdate)
                                    .addComponent(jButtonDelet)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSearch)
                                    .addComponent(jLabelSearchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelBookDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeletActionPerformed

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased
        controller.fastSearch();
    }//GEN-LAST:event_jTextFieldSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDelet;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAcquiredDate;
    private javax.swing.JLabel jLabelAuthor;
    private javax.swing.JLabel jLabelGenre;
    private javax.swing.JLabel jLabelImageBook;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPublisher;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JLabel jLabelSearchIcon;
    private javax.swing.JLabel jLabelStock;
    private javax.swing.JPanel jPanelBookDetails;
    private javax.swing.JPanel jPanelBookList;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables

    
    public BookListController getController(){
        
        return controller;
    }
    
    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
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
    
    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabelImageBook() {
        return jLabelImageBook;
    }

    public void setjLabelImageBook(JLabel jLabel5) {
        this.jLabelImageBook = jLabel5;
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

    public JLabel getjLabelAcquiredDate() {
        return jLabelAcquiredDate;
    }

    public void setjLabelAcquiredDate(JLabel jLabelAcquiredDate) {
        this.jLabelAcquiredDate = jLabelAcquiredDate;
    }

    public JLabel getjLabelAuthor() {
        return jLabelAuthor;
    }

    public void setjLabelAuthor(JLabel jLabelAuthor) {
        this.jLabelAuthor = jLabelAuthor;
    }

    public JLabel getjLabelGenre() {
        return jLabelGenre;
    }

    public void setjLabelGenre(JLabel jLabelGenre) {
        this.jLabelGenre = jLabelGenre;
    }

    public JLabel getjLabelName() {
        return jLabelName;
    }

    public void setjLabelName(JLabel jLabelName) {
        this.jLabelName = jLabelName;
    }

    public JLabel getjLabelPublisher() {
        return jLabelPublisher;
    }

    public void setjLabelPublisher(JLabel jLabelPublisher) {
        this.jLabelPublisher = jLabelPublisher;
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

    public JLabel getjLabelStock() {
        return jLabelStock;
    }

    public void setjLabelStock(JLabel jLabelStock) {
        this.jLabelStock = jLabelStock;
    }

    public JPanel getjPanelBookDetails() {
        return jPanelBookDetails;
    }

    public void setjPanelBookDetails(JPanel jPanelBookDetails) {
        this.jPanelBookDetails = jPanelBookDetails;
    }

    public JPanel getjPanelBookList() {
        return jPanelBookList;
    }

    public void setjPanelBookList(JPanel jPanelBookList) {
        this.jPanelBookList = jPanelBookList;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTextField getjTextFieldSearch() {
        return jTextFieldSearch;
    }

    public void setjTextFieldSearch(JTextField jTextFieldSearch) {
        this.jTextFieldSearch = jTextFieldSearch;
    }

    public static BookPane getSelectedBookPane() {
        return selectedBookPane;
    }

    public static void setSelectedBookPane(BookPane selectedBookPane) {
        ListOfBooks.selectedBookPane = selectedBookPane;
    }

}
