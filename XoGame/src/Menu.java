/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Champ
 */
public class Menu extends javax.swing.JFrame {

public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jButton4x4 = new javax.swing.JButton();
        jButton3x3 = new javax.swing.JButton();
        jButton5x5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(300, 400));
        setMinimumSize(new java.awt.Dimension(300, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));

        jButton4x4.setText("4 X 4");
        jButton4x4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4x4MouseClicked(evt);
            }
        });

        jButton3x3.setText("3 X 3");
        jButton3x3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3x3MouseClicked(evt);
            }
        });

        jButton5x5.setText("5 X 5");
        jButton5x5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5x5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3x3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5x5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4x4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton3x3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton4x4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton5x5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3x3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3x3MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Xogame_3().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton3x3MouseClicked

    private void jButton4x4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4x4MouseClicked
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Xogame_4().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton4x4MouseClicked

    private void jButton5x5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5x5MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Xogame_5().setVisible(true);
            }
        }); 
    }//GEN-LAST:event_jButton5x5MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3x3;
    private javax.swing.JButton jButton4x4;
    private javax.swing.JButton jButton5x5;
    // End of variables declaration//GEN-END:variables
}
