/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khalid Ansari
 */
import java.awt.Toolkit;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
public class KF extends javax.swing.JFrame {

    /**
     * Creates new form KF
     */
    public KF() {
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
        send = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        messg = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtGmail = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        exit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        send.setText("SEND");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        jPanel1.add(send);
        send.setBounds(380, 40, 90, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Contact Number");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 40, 140, 40);

        contact.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel1.add(contact);
        contact.setBounds(190, 40, 180, 40);

        messg.setColumns(20);
        messg.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        messg.setRows(5);
        jScrollPane1.setViewportView(messg);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(150, 190, 400, 200);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setText("MESSAGE");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 250, 90, 30);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setText("GMail ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 90, 100, 40);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel4.setText("PASSWORD");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 140, 100, 40);

        txtGmail.setEditable(false);
        txtGmail.setText("******.datamax@gmail.com");
        jPanel1.add(txtGmail);
        txtGmail.setBounds(150, 90, 400, 40);

        txtPass.setEditable(false);
        txtPass.setText("KFAnsari17");
        jPanel1.add(txtPass);
        txtPass.setBounds(150, 140, 400, 40);

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(480, 40, 70, 40);

        jLabel5.setText("+91");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(151, 40, 30, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*public void setProxy(String proxyHost,int proxyPort)
    {
        proxy = new Proxy(Proxy.Type.HTTP,java.net.InetSocketAddress.createUnresolved(proxyHost, proxyPort));
    }*/
    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        try{
            String host = "smtp.gmail.com";
            String user = txtGmail.getText();
            String pas = txtPass.getText();
            String to_a = contact.getText();
            String to = "977"+to_a+"@txtlocal.co.uk";
            String from = user;
            String subject = "Message";
            String message = messg.getText();
            boolean sessionDebug = false;
            Properties pros = System.getProperties();
            pros.put("mail.smtp.starttls.enable","true");
            pros.put("mail.smtp.host","host");
            pros.put("mail.smtp.auth","true");
            pros.put("mail.smtp.port","587");
            pros.put("mail.smtp.starttls.required","true");
            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(pros,null);
            mailSession.setDebug(sessionDebug);
            Message msg= new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress [] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject);
            msg.setSentDate(new Date());
            msg.setText(message);
            Transport transport = mailSession.getTransport("smtp");
            transport.connect(host, user, pas);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
            JOptionPane.showMessageDialog(null,"Message Sent Successfully");
            contact.setText("");
            messg.setText("");


        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR !!\n"+e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_sendActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        int a=JOptionPane.showConfirmDialog(null,"Are You Sure Want To Close ??");
        if(a==0)
            this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Toolkit tk=Toolkit.getDefaultToolkit();
        int xsize=(int)tk.getScreenSize().getWidth();
        int ysize=(int)tk.getScreenSize().getHeight();
        KF kf=new KF();
        kf.setSize(560,440);
        kf.setResizable(false);
        kf.setVisible(true);
        kf.setLocation(((xsize/2)-(560/2)),((ysize/2)-(440/2)));
        kf.setDefaultCloseOperation(3);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contact;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea messg;
    private javax.swing.JButton send;
    private javax.swing.JTextField txtGmail;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
