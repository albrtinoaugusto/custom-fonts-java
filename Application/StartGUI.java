
package Application;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Albertino Augusto */

public class StartGUI extends javax.swing.JFrame 
{

    String location = "Fonts\\Simplifica.ttf";
    
    public StartGUI() 
    {
        initComponents();
//        lbName.setFont(simplifica);
        
        try
        {
            Font simplifica = Font.createFont(Font.TRUETYPE_FONT, new File(location)).deriveFont(12);
            GraphicsEnvironment GE = GraphicsEnvironment.getLocalGraphicsEnvironment(); 
            GE.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(location)));
            
            lbName.setFont(simplifica);
        }
        catch(FontFormatException | IOException e)
        {
            System.out.println("Error: \n" + e);    
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbName = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbName.setText("Nome:");
        getContentPane().add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 130, 16));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 89, 180, 18));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                new StartGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbName;
    // End of variables declaration//GEN-END:variables
}
