package kalkulator;

public class KalkulatorSederharna extends javax.swing.JFrame {
    
    //global variabel
    String bil="";
    double bil1, bil2, total;
    int pilih;
    
    public KalkulatorSederharna() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BoxInputOutput = new javax.swing.JTextField();
        Button2 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        ButtonClear = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Buttonplus = new javax.swing.JButton();
        Buttonkali = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        ButtonMinus = new javax.swing.JButton();
        ButtonBagi = new javax.swing.JButton();
        ButtonTitik = new javax.swing.JButton();
        ButtonNol = new javax.swing.JButton();
        ButtonTotal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BoxInputOutput.setText("0");
        BoxInputOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxInputOutputActionPerformed(evt);
            }
        });

        Button2.setText("2");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button1.setText("1");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button3.setText("3");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        ButtonClear.setText("C");
        ButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearActionPerformed(evt);
            }
        });

        Button4.setText("4");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button5.setText("5");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setText("6");
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Buttonplus.setText("+");
        Buttonplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonplusActionPerformed(evt);
            }
        });

        Buttonkali.setText("x");
        Buttonkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonkaliActionPerformed(evt);
            }
        });

        Button7.setText("7");
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button9.setText("9");
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        Button8.setText("8");
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        ButtonMinus.setText("-");
        ButtonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMinusActionPerformed(evt);
            }
        });

        ButtonBagi.setText("/");
        ButtonBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBagiActionPerformed(evt);
            }
        });

        ButtonTitik.setText(".");
        ButtonTitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTitikActionPerformed(evt);
            }
        });

        ButtonNol.setText("0");
        ButtonNol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNolActionPerformed(evt);
            }
        });

        ButtonTotal.setText("=");
        ButtonTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BoxInputOutput)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonTitik, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonNol, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Buttonplus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Buttonkali, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ButtonTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(BoxInputOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button2)
                    .addComponent(Button3)
                    .addComponent(ButtonClear)
                    .addComponent(Button1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button4)
                    .addComponent(Button5)
                    .addComponent(Button6)
                    .addComponent(Buttonplus)
                    .addComponent(Buttonkali))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button7)
                    .addComponent(Button9)
                    .addComponent(Button8)
                    .addComponent(ButtonMinus)
                    .addComponent(ButtonBagi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonTitik)
                    .addComponent(ButtonNol)
                    .addComponent(ButtonTotal))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void BoxInputOutputActionPerformed(java.awt.event.ActionEvent evt){                                             
        // tidak digunakan
    } 
    
    private void ButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearActionPerformed
        //button clear data
        BoxInputOutput.setText(null);
        bil1 = 0.0;
        bil2=0.0;
        total=0.0;
        bil="";
    }//GEN-LAST:event_ButtonClearActionPerformed

    private void ButtonplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonplusActionPerformed
        //button plus data
        bil1 = Double.parseDouble(bil);
        BoxInputOutput.setText("+");
        bil="";
        pilih=1;
    }//GEN-LAST:event_ButtonplusActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        //button 1
        bil += "1";
        BoxInputOutput.setText(bil);
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        //button 2
        bil += "2";
        BoxInputOutput.setText(bil);
 
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        //button 3
        bil += "3";
        BoxInputOutput.setText(bil);
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        //button 4
        bil += "4";
        BoxInputOutput.setText(bil);
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        //button 5
        bil += "5";
        BoxInputOutput.setText(bil);
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        //button 6
        bil += "6";
        BoxInputOutput.setText(bil);
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        //button 7
        bil += "7";
        BoxInputOutput.setText(bil);
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        //button 8
        bil += "8";
        BoxInputOutput.setText(bil);
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        //button 9
        bil += "9";
        BoxInputOutput.setText(bil);
    }//GEN-LAST:event_Button9ActionPerformed

    private void ButtonNolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNolActionPerformed
        // button 0
        bil += "0";
        BoxInputOutput.setText(bil);
    }//GEN-LAST:event_ButtonNolActionPerformed

    private void ButtonTitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTitikActionPerformed
        //button koma untuk bilangan pecahan
        bil += ".";
        BoxInputOutput.setText(bil);
    }//GEN-LAST:event_ButtonTitikActionPerformed

    private void ButtonkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonkaliActionPerformed
        //button perkalian
        bil1 = Double.parseDouble(bil);
        BoxInputOutput.setText("x");
        bil="";
        pilih=3;
    }//GEN-LAST:event_ButtonkaliActionPerformed

    private void ButtonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMinusActionPerformed
        //button dikurangi
        bil1 = Double.parseDouble(bil);
        BoxInputOutput.setText("-");
        bil="";
        pilih=2;
    }//GEN-LAST:event_ButtonMinusActionPerformed

    private void ButtonBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBagiActionPerformed
        //button pembagian
        bil1 = Double.parseDouble(bil);
        BoxInputOutput.setText("/");
        bil="";
        pilih=4;
    }//GEN-LAST:event_ButtonBagiActionPerformed

    private void ButtonTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTotalActionPerformed
        //button total/ penjumlahan
        switch(pilih){
            case 1:
                bil2=Double.parseDouble(bil);
                total = bil1+bil2;
                bil = Double.toString(total);
                break;
            case 2:
                bil2=Double.parseDouble(bil);
                total = bil1-bil2;
                bil = Double.toString(total);
                break;
            case 3:
                bil2=Double.parseDouble(bil);
                total = bil1*bil2;
                bil = Double.toString(total);
                break;
            case 4:
                bil2=Double.parseDouble(bil);
                total = bil1/bil2;
                bil = Double.toString(total);
                break;
        }
        BoxInputOutput.setText(bil);
    }//GEN-LAST:event_ButtonTotalActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(KalkulatorSederharna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSederharna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSederharna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSederharna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KalkulatorSederharna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BoxInputOutput;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton ButtonBagi;
    private javax.swing.JButton ButtonClear;
    private javax.swing.JButton ButtonMinus;
    private javax.swing.JButton ButtonNol;
    private javax.swing.JButton ButtonTitik;
    private javax.swing.JButton ButtonTotal;
    private javax.swing.JButton Buttonkali;
    private javax.swing.JButton Buttonplus;
    // End of variables declaration//GEN-END:variables
}
