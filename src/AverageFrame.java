/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author modab5310
 */
public class AverageFrame extends javax.swing.JFrame {

    /**
     * Creates new form AverageFrame
     */
    public AverageFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        FirstCourse = new javax.swing.JLabel();
        SecondCourse = new javax.swing.JLabel();
        ThirdCourse = new javax.swing.JLabel();
        FourthCourse = new javax.swing.JLabel();
        Marknum1 = new javax.swing.JTextField();
        Marknum2 = new javax.swing.JTextField();
        Marknum3 = new javax.swing.JTextField();
        Marknum4 = new javax.swing.JTextField();
        CalculateAnswer = new javax.swing.JButton();
        Final = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 153));

        TitleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TitleLabel.setText("Course Mark Average Calculator");

        FirstCourse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FirstCourse.setText("First Course's Mark: ");

        SecondCourse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SecondCourse.setText("Second Course's Mark: ");

        ThirdCourse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ThirdCourse.setText("Third Course's Mark: ");

        FourthCourse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FourthCourse.setText("Fourth Course's Mark: ");

        Marknum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Marknum1ActionPerformed(evt);
            }
        });

        CalculateAnswer.setText("Calculate ");
        CalculateAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateAnswerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(TitleLabel)
                .addGap(85, 85, 85))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FirstCourse)
                    .addComponent(SecondCourse)
                    .addComponent(ThirdCourse)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CalculateAnswer)
                        .addComponent(FourthCourse)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Marknum1)
                        .addComponent(Marknum2)
                        .addComponent(Marknum3)
                        .addComponent(Marknum4, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                    .addComponent(Final, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstCourse)
                    .addComponent(Marknum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SecondCourse)
                    .addComponent(Marknum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThirdCourse)
                    .addComponent(Marknum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FourthCourse)
                    .addComponent(Marknum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CalculateAnswer)
                    .addComponent(Final, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Marknum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Marknum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Marknum1ActionPerformed

    private void CalculateAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateAnswerActionPerformed

        int num1; 
        int num2;
        int num3;
        int num4;
        int answer; 
        
        num1 = Integer.parseInt(Marknum1.getText()); 
        num2 = Integer.parseInt(Marknum2.getText()); 
        num3 = Integer.parseInt(Marknum3.getText()); 
        num4 = Integer.parseInt(Marknum4.getText()); 
        
        answer = (num1 + num2 + num3 + num4 ) / 4; 
        
        Final.setText(String.valueOf(answer)); 
        
        
    }//GEN-LAST:event_CalculateAnswerActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AverageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AverageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AverageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AverageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AverageFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalculateAnswer;
    private javax.swing.JLabel Final;
    private javax.swing.JLabel FirstCourse;
    private javax.swing.JLabel FourthCourse;
    private javax.swing.JTextField Marknum1;
    private javax.swing.JTextField Marknum2;
    private javax.swing.JTextField Marknum3;
    private javax.swing.JTextField Marknum4;
    private javax.swing.JLabel SecondCourse;
    private javax.swing.JLabel ThirdCourse;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
