/*
 */
package presentacion;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author 50765
 */
public class FrmLogin extends javax.swing.JFrame {
    
    
    private static final String userLogin ="admin"; 
    private static final String passwordLogin="admin123"; 
    
    public FrmLogin() {
        initComponents(); 
        setLocationRelativeTo(null);  

    }
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        labe_password = new javax.swing.JLabel();
        label_name = new javax.swing.JLabel();
        txfld_user = new javax.swing.JTextField();
        txfld_password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        btn_register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Laboratorio 2 | Login Principal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        labe_password.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        labe_password.setText("Password");

        label_name.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        label_name.setText("User");

        txfld_user.setFont(new java.awt.Font("Calisto MT", 1, 12)); // NOI18N
        txfld_user.setForeground(new java.awt.Color(51, 51, 51));

        txfld_password.setFont(new java.awt.Font("Calisto MT", 1, 12)); // NOI18N
        txfld_password.setForeground(new java.awt.Color(51, 51, 51));
        txfld_password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txfld_password.setToolTipText("Insert to Password");

        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        btn_register.setText("Register");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_register)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labe_password)
                            .addComponent(label_name))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfld_user, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(txfld_password))
                        .addContainerGap(53, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_name)
                    .addComponent(txfld_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labe_password)
                    .addComponent(txfld_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_login)
                    .addComponent(btn_register))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        
    //--> Arriba del todo hay una variable estatica global <--- Para la validacion  
       if((txfld_user.getText().equals(userLogin)) &&(String.valueOf(txfld_password.getPassword()).equals(passwordLogin))){
           JOptionPane.showMessageDialog(rootPane, "Se ha iniciado sesion CORRECTAMENTE! "); 
           FrmMenu frmmenu = new FrmMenu(true); 
           this.dispose(); 
           JOptionPane.showMessageDialog(null, "Nota Importante! \nPresionar 'RESTABLECER' Si Algun punto del programa al cambiar de Problema \nSe desmarquen casillas o campos a llenar \nPresione o Pulse 'OK' para CONTINUAR! ","Aviso Programa",JOptionPane.WARNING_MESSAGE);
       }    
       else{
           FrmMenu frmmenu =new FrmMenu(false); 
           JOptionPane.showMessageDialog(null, "\tHa ocurrido un error,\nContraseña o Usuario incorrectos Verifique nuevamente!" ,"Error Session" ,JOptionPane.ERROR_MESSAGE);
       } 
       
       
       
       
    }//GEN-LAST:event_btn_loginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        
        
        try {
            //        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } 

UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//</editor-fold>
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_register;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labe_password;
    private javax.swing.JLabel label_name;
    private javax.swing.JPasswordField txfld_password;
    private javax.swing.JTextField txfld_user;
    // End of variables declaration//GEN-END:variables
}
