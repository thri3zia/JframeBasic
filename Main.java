
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

        private Map<String, String> users = new HashMap<String, String>();

        public Main() {
                initComponents();
        }

        private void initComponents() {

                name = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                password = new javax.swing.JLabel();
                passfield = new javax.swing.JPasswordField();
                loginbutton = new javax.swing.JButton();
                namefield = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                name.setBackground(new java.awt.Color(250, 208, 201));

                jPanel2.setBackground(new java.awt.Color(54, 69, 79));

                jLabel1.setBackground(new java.awt.Color(250, 208, 201));
                jLabel1.setFont(new java.awt.Font("Jokerman", 1, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(250, 208, 201));
                jLabel1.setText("LOG-IN FORM");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(29, 29, 29)
                                                                .addComponent(jLabel1)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addComponent(jLabel1)
                                                                .addContainerGap(19, Short.MAX_VALUE)));

                jLabel2.setFont(new java.awt.Font("Jokerman", 0, 18)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(54, 69, 79));
                jLabel2.setText("USERNAME:");

                password.setFont(new java.awt.Font("Jokerman", 0, 18)); // NOI18N
                password.setForeground(new java.awt.Color(54, 69, 79));
                password.setText("PASSWORD:");

                passfield.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
                passfield.setToolTipText("");
                passfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 69, 79), 2));

                loginbutton.setBackground(new java.awt.Color(54, 69, 79));
                loginbutton.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
                loginbutton.setForeground(new java.awt.Color(250, 208, 201));
                loginbutton.setText("LOG IN");
                loginbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                loginbutton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                loginbuttonActionPerformed(evt);
                        }
                });

                namefield.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
                namefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 69, 79), 2));

                jButton1.setBackground(new java.awt.Color(250, 208, 201));
                jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
                jButton1.setForeground(new java.awt.Color(54, 69, 79));
                jButton1.setText("CLEAR");
                jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout nameLayout = new javax.swing.GroupLayout(name);
                name.setLayout(nameLayout);
                nameLayout.setHorizontalGroup(
                                nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(nameLayout.createSequentialGroup()
                                                                .addGap(38, 38, 38)
                                                                .addGroup(nameLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(nameLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jButton1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                132,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(39, 39, 39)
                                                                                                .addComponent(loginbutton,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                136,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(nameLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(nameLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                123,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(password))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(nameLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(passfield,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                186,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(namefield,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                186,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addContainerGap(48, Short.MAX_VALUE)));
                nameLayout.setVerticalGroup(
                                nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(nameLayout.createSequentialGroup()
                                                                .addComponent(jPanel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(35, 35, 35)
                                                                .addGroup(nameLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel2)
                                                                                .addGroup(nameLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(2, 2, 2)
                                                                                                .addComponent(namefield,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                34,
                                                                                                                Short.MAX_VALUE)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(nameLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(passfield,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                33,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(password))
                                                                .addGap(45, 45, 45)
                                                                .addGroup(nameLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(loginbutton,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                46,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                46,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(39, 39, 39)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>

        private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {

                users.put("lebosada", "hahaha");
                users.put("chavez", "huhuhu");

                namefield.getText();
                passfield.getText();

                var myuser = namefield.getText();
                var mypass = String.valueOf(passfield.getPassword());

                if (myuser.equals("") || mypass.equals("")) {
                        JOptionPane.showMessageDialog(null, "No username or password entered.");
                } else if (users.get(myuser) != null && users.get(myuser).equals(mypass)) {
                        JOptionPane.showMessageDialog(null, "User " + namefield.getText() + " has logged in!");
                        this.dispose();
                        new Dashboard().setVisible(true);
                } else {
                        JOptionPane.showMessageDialog(null, "User " + namefield.getText() + " is not found!");
                }

        }

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
                namefield.setText("");
                passfield.setText("");
        }

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Main().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JButton loginbutton;
        private javax.swing.JPanel name;
        private javax.swing.JTextField namefield;
        private javax.swing.JPasswordField passfield;
        private javax.swing.JLabel password;
        // End of variables declaration
}
