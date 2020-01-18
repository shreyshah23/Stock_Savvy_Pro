/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
//import ThreeComp.java.*;

public class TestFrame extends javax.swing.JFrame {

    /**
     * Creates new form TestFrame
     */
    public TestFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CompanyLabel = new javax.swing.JTextField();
        YearLabel = new javax.swing.JTextField();
        MonthLabel = new javax.swing.JTextField();
        DateLabel = new javax.swing.JTextField();
        GraphLabel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DownloadButton = new javax.swing.JButton();
        PredictLabel = new javax.swing.JTextField();
        PredictButton = new javax.swing.JButton();
        ThreeCompanies = new javax.swing.JButton();
        Main_Label = new javax.swing.JLabel();
        ThreeCompanies1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1.setText("Enter the company(IBM,GOOG,AAPL):");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel2.setText("Enter the year(between 2016-2019):");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel3.setText("Enter the month(between 1-12):");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel4.setText("Enter the date(between 1-30):");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel5.setText("Enter the graph type(From Simple-1/Candle-2):");

        CompanyLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CompanyLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyLabelActionPerformed(evt);
            }
        });

        YearLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        YearLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearLabelActionPerformed(evt);
            }
        });

        MonthLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        MonthLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthLabelActionPerformed(evt);
            }
        });

        DateLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        DateLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateLabelActionPerformed(evt);
            }
        });

        GraphLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        GraphLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraphLabelActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Enter Information :");

        DownloadButton.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        DownloadButton.setText("Download");
        DownloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownloadButtonActionPerformed(evt);
            }
        });

        PredictButton.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        PredictButton.setText("Predict");
        PredictButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PredictButtonActionPerformed(evt);
            }
        });

        ThreeCompanies.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        ThreeCompanies.setText("Click Here for comparing stocks of ANY THREE COMPANIES");
        ThreeCompanies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreeCompaniesActionPerformed(evt);
            }
        });

        Main_Label.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        Main_Label.setForeground(new java.awt.Color(0, 0, 102));
        Main_Label.setText("Stock Market Prediction ");
        Main_Label.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 0)));
        Main_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Main_LabelMouseClicked(evt);
            }
        });

        ThreeCompanies1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        ThreeCompanies1.setText("Click Here to know you are in Profit OR Loss");
        ThreeCompanies1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreeCompanies1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GraphLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MonthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(YearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CompanyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ThreeCompanies)
                            .addComponent(ThreeCompanies1))
                        .addGap(126, 126, 126))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(DownloadButton)
                        .addGap(25, 25, 25)
                        .addComponent(PredictButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PredictLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Main_Label)
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Main_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CompanyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MonthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GraphLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DownloadButton)
                    .addComponent(PredictLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PredictButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(ThreeCompanies1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThreeCompanies)
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CompanyLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompanyLabelActionPerformed

    private void YearLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearLabelActionPerformed

    private void MonthLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MonthLabelActionPerformed

    private void DateLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateLabelActionPerformed

    private void GraphLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraphLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GraphLabelActionPerformed

    private void DownloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownloadButtonActionPerformed
        
        int permit=0;
        try {
         URL url = new URL("http://www.google.com");
         URLConnection connection = url.openConnection();
         connection.connect();
         System.out.println("Internet is connected");
         permit=1;
      } catch (MalformedURLException e) {
         System.out.println("Internet is not connected");
      } catch (IOException e) {
         System.out.println("Internet is not connected");
      }
        
        if(permit==1)

        {String companyStr,yearStr,monthStr,dateStr,graphStr;
        
        companyStr = CompanyLabel.getText();        // TODO add your handling code here:
        yearStr = YearLabel.getText();
        monthStr = MonthLabel.getText();        // TODO add your handling code here:
        dateStr = DateLabel.getText();        // TODO add your handling code here:
        graphStr = GraphLabel.getText();
        
        //if()
        
        String s = null,c="C:\\Users\\Acer\\Documents\\NetBeansProjects\\SampleTest\\src\\function_calling_file.py";

        try {
            //
            Process p = Runtime.getRuntime().exec("python "+c+" DOWNLOAD "+companyStr+" "+yearStr+" "+monthStr+" "+dateStr+" "+graphStr);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            
            // read the output from the command

            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
               
            // read any errors from the attempted command

            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
        }
        catch (IOException e)
        {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);

        }
        }
        else 
        {
           JOptionPane.showMessageDialog(this,"Check your Internet Connection...");

        }
        
    }//GEN-LAST:event_DownloadButtonActionPerformed

    private void PredictButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PredictButtonActionPerformed
        String companyStr,predictStr;
        companyStr = CompanyLabel.getText(); 
        predictStr=PredictLabel.getText();
        //JOptionPane.showMessageDialog(this,"Successful");
        String s = null,c="C:\\Users\\Acer\\Documents\\NetBeansProjects\\SampleTest\\src\\function_calling_file.py";

        try {
            //
            Process p = Runtime.getRuntime().exec("python "+c+" PREDICT "+predictStr+" "+companyStr);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            
            // read the output from the command

            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
               
            // read any errors from the attempted command

            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
        }
        catch (IOException e)
        {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);

        }
    }//GEN-LAST:event_PredictButtonActionPerformed

    private void ThreeCompaniesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreeCompaniesActionPerformed
            //setVisible(false);
            ThreeComp form = new ThreeComp();
            form.setVisible(true);
            form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
    }//GEN-LAST:event_ThreeCompaniesActionPerformed

    private void Main_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main_LabelMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Some of the companies are: \nGOOG\nAAPL\nIBM\nMSFT\nIRCTC.BO\nICICIB22.NS\nTATAMOTORS.NS\nYESBANK.NS\nPNB.NS\nONGC.NS\nIDEA.NS\nJINDALSTEL.NS");
    }//GEN-LAST:event_Main_LabelMouseClicked
                                       

    private void ThreeCompanies1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreeCompanies1ActionPerformed
            InvestSvm form = new InvestSvm();
            form.setVisible(true);
            form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // TODO add your handling code here:
    }//GEN-LAST:event_ThreeCompanies1ActionPerformed

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
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CompanyLabel;
    private javax.swing.JTextField DateLabel;
    private javax.swing.JButton DownloadButton;
    private javax.swing.JTextField GraphLabel;
    private javax.swing.JLabel Main_Label;
    private javax.swing.JTextField MonthLabel;
    private javax.swing.JButton PredictButton;
    private javax.swing.JTextField PredictLabel;
    private javax.swing.JButton ThreeCompanies;
    private javax.swing.JButton ThreeCompanies1;
    private javax.swing.JTextField YearLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
