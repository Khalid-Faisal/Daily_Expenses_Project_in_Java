import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;
public class login extends javax.swing.JFrame {
    public int img_counter=1;
    public login() {
        try {
            initComponents();
            own_detail.setEditable(false);
            F2.setVisible(false);

            Connection con;
            Statement st,st1,st5;
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/money","root","******");
            st = con.createStatement();
            st1 = con.createStatement();
            st5 = con.createStatement();

            ResultSet un= st.executeQuery("select time from unauthorized");
            while(un.next())
            {
                unauth.addItem(un.getString(1));
            }
            ResultSet take= st.executeQuery("select distinct(name) from taken");
            while(take.next())
            {
                taken_list.addItem(take.getString(1));
                msgname.addItem(take.getString(1));
                search.addItem(take.getString(1));
            }
            ResultSet give= st1.executeQuery("select distinct(name) from given");
            while(give.next())
            {
                given_list.addItem(give.getString(1));
                search.addItem(give.getString(1));
                msgname.addItem(give.getString(1));
            }
            ResultSet aveg= st5.executeQuery("select avg(pocket) from own");
            while(aveg.next())
            {
                avg.setText(aveg.getString(1));
            }
            ResultSet tot_day= st5.executeQuery("select count(distinct(date)) from own");
            while(tot_day.next())
            {
                days.setText(tot_day.getString(1));
            }
            ResultSet allmine= st5.executeQuery("select sum(amt) from own");
            while(allmine.next())
            {
                all_own.setText(allmine.getString(1));
            }
            ResultSet allmine1= st5.executeQuery("select sum(amt) from given");
            while(allmine1.next())
            {
                all_given.setText(allmine1.getString(1));
            }
            ResultSet alltheir= st5.executeQuery("select sum(amt) from taken");
            while(alltheir.next())
            {
                all_taken.setText(alltheir.getString(1));
            }
            ResultSet poc= st5.executeQuery("select sum(pocket) from own");
            while(poc.next())
            {
                total.setText(poc.getString(1));
            }

             con.close();
//mainfeedback.setVisible(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new javax.swing.ButtonGroup();
        F2 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        taken_amt = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        taken_detail = new javax.swing.JTextArea();
        taken_list = new javax.swing.JComboBox<>();
        taken_save = new javax.swing.JButton();
        taken_clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taken_record = new javax.swing.JTextArea();
        addcontact = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        own_detail = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        own_amt = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        pocket = new javax.swing.JTextField();
        auto = new javax.swing.JRadioButton();
        afternoon = new javax.swing.JRadioButton();
        other = new javax.swing.JRadioButton();
        save = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        search = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        given = new javax.swing.JLabel();
        taken = new javax.swing.JLabel();
        sms = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        details = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        avg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        days = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        all_own = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        all_given = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        all_taken = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        unauth = new javax.swing.JComboBox<>();
        undate = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        untime = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        unimage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        messg = new javax.swing.JTextArea();
        contact = new javax.swing.JTextField();
        send = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        msgname = new javax.swing.JComboBox<>();
        txtPass = new javax.swing.JPasswordField();
        txtGmail = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        given_amt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        given_detail = new javax.swing.JTextArea();
        given_list = new javax.swing.JComboBox<>();
        given_save = new javax.swing.JButton();
        given_clear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        given_record = new javax.swing.JTextArea();
        addcontact1 = new javax.swing.JButton();
        unknown = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jScrollPane20 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        userid = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        change_image = new javax.swing.JButton();
        change_passwd = new javax.swing.JButton();
        page1_img = new javax.swing.JLabel();
        cnt = new javax.swing.JLabel();

        Toolkit tk=Toolkit.getDefaultToolkit();
		int xsize=(int)tk.getScreenSize().getWidth();
		int ysize=(int)tk.getScreenSize().getHeight();
		F2.setSize(820,570);
		F2.setResizable(false);
		F2.setVisible(true);
        F2.setLocation(((xsize/2)-(720/2)),((ysize/2)-(440/2)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(null);

        jPanel11.setLayout(null);

        jLabel26.setText("NAME");
        jPanel11.add(jLabel26);
        jLabel26.setBounds(20, 80, 43, 20);

        jLabel30.setText("Details");
        jPanel11.add(jLabel30);
        jLabel30.setBounds(30, 150, 51, 20);

        jLabel31.setText("Amount");
        jPanel11.add(jLabel31);
        jLabel31.setBounds(30, 230, 70, 20);
        jPanel11.add(taken_amt);
        taken_amt.setBounds(100, 230, 90, 30);

        taken_detail.setColumns(20);
        taken_detail.setRows(5);
        jScrollPane5.setViewportView(taken_detail);

        jPanel11.add(jScrollPane5);
        jScrollPane5.setBounds(100, 120, 166, 96);

        taken_list.setEditable(true);
        taken_list.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name" }));
        taken_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taken_listActionPerformed(evt);
            }
        });
        jPanel11.add(taken_list);
        taken_list.setBounds(100, 80, 160, 30);

        taken_save.setText("SAVE");
        taken_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taken_saveActionPerformed(evt);
            }
        });
        jPanel11.add(taken_save);
        taken_save.setBounds(71, 270, 90, 40);

        taken_clear.setText("CLEAR");
        taken_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taken_clearActionPerformed(evt);
            }
        });
        jPanel11.add(taken_clear);
        taken_clear.setBounds(180, 270, 90, 40);

        taken_record.setEditable(false);
        taken_record.setColumns(20);
        taken_record.setRows(5);
        jScrollPane1.setViewportView(taken_record);

        jPanel11.add(jScrollPane1);
        jScrollPane1.setBounds(320, 80, 460, 240);

        addcontact.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        addcontact.setText("Contact No.");
        addcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcontactActionPerformed(evt);
            }
        });
        jPanel11.add(addcontact);
        addcontact.setBounds(200, 230, 87, 30);

        jTabbedPane6.addTab("Taken From", jPanel11);

        jPanel6.setLayout(null);

        jLabel20.setText("NAME");
        jPanel6.add(jLabel20);
        jLabel20.setBounds(30, 80, 43, 20);

        jTextField1.setEditable(false);
        jTextField1.setText("KHALID FAISAL");
        jPanel6.add(jTextField1);
        jTextField1.setBounds(140, 80, 130, 26);

        jLabel21.setText("Details");
        jPanel6.add(jLabel21);
        jLabel21.setBounds(30, 150, 51, 20);

        own_detail.setColumns(20);
        own_detail.setRows(5);
        jScrollPane4.setViewportView(own_detail);

        jPanel6.add(jScrollPane4);
        jScrollPane4.setBounds(140, 120, 230, 96);

        jLabel22.setText("Amount");
        jPanel6.add(jLabel22);
        jLabel22.setBounds(30, 230, 70, 20);
        jPanel6.add(own_amt);
        own_amt.setBounds(140, 230, 90, 26);

        jLabel23.setText("Pocket Money");
        jPanel6.add(jLabel23);
        jLabel23.setBounds(30, 270, 97, 20);
        jPanel6.add(pocket);
        pocket.setBounds(140, 270, 90, 26);

        bg1.add(auto);
        auto.setText("Auto Rickshaw");
        auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoActionPerformed(evt);
            }
        });
        jPanel6.add(auto);
        auto.setBounds(400, 120, 140, 29);

        bg1.add(afternoon);
        afternoon.setText("Afternoon Meal");
        afternoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afternoonActionPerformed(evt);
            }
        });
        jPanel6.add(afternoon);
        afternoon.setBounds(400, 160, 150, 29);

        bg1.add(other);
        other.setText("Other");
        other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherActionPerformed(evt);
            }
        });
        jPanel6.add(other);
        other.setBounds(400, 200, 73, 29);

        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel6.add(save);
        save.setBounds(260, 230, 80, 29);

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel6.add(clear);
        clear.setBounds(260, 270, 80, 29);

        jTabbedPane6.addTab("Own Expendature", jPanel6);

        jPanel12.setLayout(null);

        jLabel32.setText("NAME");
        jPanel12.add(jLabel32);
        jLabel32.setBounds(10, 40, 43, 30);

        search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Own" }));
        search.setToolTipText("");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel12.add(search);
        search.setBounds(60, 40, 150, 30);

        jLabel33.setText("GIVEN AMOUNT");
        jPanel12.add(jLabel33);
        jLabel33.setBounds(20, 110, 119, 20);

        jLabel34.setText("TAKEN AMOUNT");
        jPanel12.add(jLabel34);
        jLabel34.setBounds(20, 160, 122, 20);

        given.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        given.setForeground(new java.awt.Color(255, 0, 0));
        given.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel12.add(given);
        given.setBounds(150, 100, 70, 40);

        taken.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        taken.setForeground(new java.awt.Color(0, 204, 0));
        taken.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel12.add(taken);
        taken.setBounds(150, 150, 70, 40);

        sms.setText("SEND SMS");
        sms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smsActionPerformed(evt);
            }
        });
        jPanel12.add(sms);
        sms.setBounds(50, 220, 120, 40);

        details.setEditable(false);
        details.setColumns(20);
        details.setRows(5);
        jScrollPane7.setViewportView(details);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 62, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );

        jScrollPane6.setViewportView(jPanel7);

        jPanel12.add(jScrollPane6);
        jScrollPane6.setBounds(230, 20, 550, 270);

        jLabel1.setText("AVERAGE EXPENSES");
        jPanel12.add(jLabel1);
        jLabel1.setBounds(20, 330, 150, 40);

        avg.setEditable(false);
        avg.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        avg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        avg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.add(avg);
        avg.setBounds(180, 330, 100, 40);

        jLabel3.setText("TOTAL DAYS");
        jPanel12.add(jLabel3);
        jLabel3.setBounds(20, 390, 97, 40);

        days.setEditable(false);
        days.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        days.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        days.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.add(days);
        days.setBounds(180, 390, 100, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setText("TOTAL OWN EXPENSES");
        jPanel12.add(jLabel4);
        jLabel4.setBounds(330, 330, 120, 40);

        all_own.setEditable(false);
        all_own.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        all_own.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        all_own.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.add(all_own);
        all_own.setBounds(490, 330, 100, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("TOTAL GIVEN");
        jPanel12.add(jLabel5);
        jLabel5.setBounds(330, 390, 83, 40);

        all_given.setEditable(false);
        all_given.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        all_given.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        all_given.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.add(all_given);
        all_given.setBounds(490, 390, 100, 40);

        jLabel6.setText("TOTAL TAKEN");
        jPanel12.add(jLabel6);
        jLabel6.setBounds(660, 340, 110, 30);

        all_taken.setEditable(false);
        all_taken.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        all_taken.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        all_taken.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.add(all_taken);
        all_taken.setBounds(670, 380, 100, 50);

        jTabbedPane6.addTab("Details", jPanel12);

        unauth.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        unauth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select Time" }));
        unauth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unauthActionPerformed(evt);
            }
        });

        undate.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        undate.setForeground(new java.awt.Color(255, 51, 51));
        undate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        undate.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DATE");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("TIME");

        untime.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        untime.setForeground(new java.awt.Color(255, 51, 51));
        untime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        untime.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("UNAUTHORIZED PERSONS");

        unimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unimage, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unauth, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(undate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(untime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(unauth, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(undate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(untime, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unimage, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Unauthorized", jPanel2);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel10.setText("CONTACT NUMBER");

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("GMAIL ID");

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("PASSWORD");

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel15.setText("MESSAGE");

        messg.setColumns(20);
        messg.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        messg.setRows(5);
        jScrollPane8.setViewportView(messg);

        contact.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });

        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        jLabel16.setText("+91");

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Name");

        msgname.setEditable(true);
        msgname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        msgname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Self(Khalid Faisal)" }));
        msgname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgnameActionPerformed(evt);
            }
        });

        txtPass.setEditable(false);
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.setText("KFAnsari17");
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        txtGmail.setEditable(true);
        txtGmail.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N
        txtGmail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ABC@gmail.com", "PQRT@gmail.com", "SVTW@gmail.com" }));

        jLabel18.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("UNDER DEVELOPMENT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(msgname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPass)
                                .addComponent(txtGmail, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jLabel15)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(199, 205, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(msgname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(send, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txtPass))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel15)))
                .addGap(78, 78, 78))
        );

        jTabbedPane6.addTab("Send SMS", jPanel3);

        jPanel10.setLayout(null);

        jLabel7.setText("NAME");
        jPanel10.add(jLabel7);
        jLabel7.setBounds(30, 80, 70, 30);

        jLabel24.setText("Details");
        jPanel10.add(jLabel24);
        jLabel24.setBounds(30, 150, 51, 20);

        jLabel25.setText("Amount");
        jPanel10.add(jLabel25);
        jLabel25.setBounds(30, 230, 70, 20);
        jPanel10.add(given_amt);
        given_amt.setBounds(100, 230, 90, 26);

        given_detail.setColumns(20);
        given_detail.setRows(5);
        jScrollPane2.setViewportView(given_detail);

        jPanel10.add(jScrollPane2);
        jScrollPane2.setBounds(100, 120, 190, 96);

        given_list.setEditable(true);
        given_list.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name" }));
        given_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                given_listActionPerformed(evt);
            }
        });
        jPanel10.add(given_list);
        given_list.setBounds(100, 80, 190, 30);

        given_save.setText("SAVE");
        given_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                given_saveActionPerformed(evt);
            }
        });
        jPanel10.add(given_save);
        given_save.setBounds(101, 270, 80, 40);

        given_clear.setText("CLEAR");
        given_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                given_clearActionPerformed(evt);
            }
        });
        jPanel10.add(given_clear);
        given_clear.setBounds(190, 270, 90, 40);

        given_record.setEditable(false);
        given_record.setColumns(20);
        given_record.setRows(5);
        jScrollPane3.setViewportView(given_record);

        jPanel10.add(jScrollPane3);
        jScrollPane3.setBounds(340, 70, 450, 240);

        addcontact1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        addcontact1.setText("Contact No.");
        addcontact1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcontact1ActionPerformed(evt);
            }
        });
        jPanel10.add(addcontact1);
        addcontact1.setBounds(200, 230, 87, 30);

        jTabbedPane6.addTab("Given To", jPanel10);

        jPanel1.add(jTabbedPane6);
        jTabbedPane6.setBounds(0, 70, 800, 500);

        unknown.setText("TOTAL POCKET MONEY");
        jPanel1.add(unknown);
        unknown.setBounds(40, 20, 174, 30);

        total.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(total);
        total.setBounds(230, 20, 100, 30);

        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(680, 20, 120, 50);

        F2.getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 820, 570);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel4.setMinimumSize(new java.awt.Dimension(1640, 690));
        jPanel4.setLayout(null);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jTextField6.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        jTextField6.setText("USER ID");

        jPasswordField1.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        jPasswordField1.setText("PASSWORD");

        login.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.jpg"))); // NOI18N
        login.setText("LOGIN");
        login.setMargin(new java.awt.Insets(2, 0, 2, 0));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.jpg"))); // NOI18N
        exit.setText("EXIT");
        exit.setMargin(new java.awt.Insets(2, 0, 2, 0));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        userid.setEditable(false);
        userid.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        userid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userid.setText("KHALID FAISAL");
        userid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        userid.setNextFocusableComponent(password);

        password.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        password.setNextFocusableComponent(login);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        jLabel8.setText("LOGIN");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user_lock.png"))); // NOI18N

        change_image.setFont(new java.awt.Font("Calibri", 3, 12)); // NOI18N
        change_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/change.jpg"))); // NOI18N
        change_image.setText("CHANGE BACKGROUND");
        change_image.setMargin(new java.awt.Insets(2, 0, 2, 0));
        change_image.setPreferredSize(new java.awt.Dimension(350, 250));
        change_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_imageActionPerformed(evt);
            }
        });

        change_passwd.setFont(new java.awt.Font("Viner Hand ITC", 0, 10)); // NOI18N
        change_passwd.setText("CHANGE PASSWORD");
        change_passwd.setMargin(new java.awt.Insets(2, 1, 2, 1));
        change_passwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_passwdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField1)
                            .addComponent(jTextField6))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(change_image, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(change_passwd))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(userid, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                    .addComponent(password))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(change_passwd)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(change_image, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        password.getAccessibleContext().setAccessibleParent(userid);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(180, 170, 440, 270);

        page1_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e120710.jpg"))); // NOI18N
        page1_img.setToolTipText("");
        page1_img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(page1_img);
        page1_img.setBounds(0, 0, 810, 640);

        cnt.setText("0");
        jPanel4.add(cnt);
        cnt.setBounds(80, 650, 20, 20);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 830, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
    try {
        String stored_pass = null;
        Connection con;
        Statement st;
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/money","root","****");
        st = con.createStatement();

        ResultSet password_db=st.executeQuery("select new_password from password");
        while(password_db.next())
        {
            stored_pass=password_db.getString(1);
        }
        char passw[]=password.getPassword();
        String p=new String(passw);
        if(p.equals(stored_pass))
        {    F2.setVisible(true);
             this.setVisible(false);
            JOptionPane.showMessageDialog(null,"SUCCESSFULLY LOGIN");
        }
        else{
            JOptionPane.showMessageDialog(null,"INVALID PASSWORD");

            cnt.setText(cnt.getText()+"0");
            if(cnt.getText().equals("000"))
            {
                //Capture Image...
                        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
                        VideoCapture camera = new VideoCapture(0);

                        if(!camera.isOpened()){
                            JOptionPane.showMessageDialog(null,"Can't Open Camera...\nSorry for Inconvinience");
                        }
                        else {
                            Mat frame = new Mat();
                            while(true)
                            {
                                if (camera.read(frame)){
                                    System.out.println("Frame Obtained");
                                    System.out.println("Captured Frame Width " +
                                    frame.width() + " Height " + frame.height());
                                    Imgcodecs.imwrite("capture.jpg", frame);
                                    System.out.println("OK");
                                    break;
                                }
                            }
                        }
                        camera.release();
                    //Capture Image... code Ends here
                   // C:\\Users\\Khalid Ansari\\Documents\\NetBeansProjects\\Self\\camera.jpg

                st.execute("insert into unauthorized values(curtime(),curdate(),LOAD_FILE('C:\\\\Users\\\\Khalid Ansari\\\\Documents\\\\NetBeansProjects\\\\Self\\\\dist\\\\capture.jpg'))");
                JOptionPane.showMessageDialog(null,"YOU ARE NOT \'XYZ\' \n\tPLEASE LEAVE");
                System.exit(0);
            }
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null,"ERROR !! \n"+ex);
    }
        password.setText("");
        // TODO add your
    }
//GEN-LAST:event_loginActionPerformed
    private void autoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoActionPerformed
        own_detail.setText("");
        own_detail.setText("Auto Rickshaw");        // TODO add your handling code here:
    }//GEN-LAST:event_autoActionPerformed

    private void afternoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afternoonActionPerformed
        own_detail.setText("");
        own_detail.setText("Afternoon Meal");

        // TODO add your handling code here:
    }//GEN-LAST:event_afternoonActionPerformed

    private void otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherActionPerformed
        own_detail.setText("");
        own_detail.setEditable(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_otherActionPerformed

    private void given_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_given_saveActionPerformed
        try {
            Connection con;
            Statement st;
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/money","root","******");
            st = con.createStatement();
            float amount;
            String g_name= given_list.getSelectedItem().toString();
            if(g_name.equals("NAME"))
            JOptionPane.showMessageDialog(null,"SELECT NAME");
            else
            {
                String des = given_detail.getText();
                try{
                    amount= Float.parseFloat(given_amt.getText());
                    st.execute("insert into given values ('"+g_name+"',"+amount+",'"+des+"',NOW())");
                    JOptionPane.showMessageDialog(null,"SAVED SUCCESSFULLY");
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"INVALID AMOUNT  "+given_amt.getText());
                }
                given_amt.setText("");
                given_detail.setText("");
                given_list.setSelectedItem("NAME");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"ERROR !! \n"+ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_given_saveActionPerformed

    private void given_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_given_clearActionPerformed
        given_detail.setText("");
        given_amt.setText("0");
        // TODO add your handling code here:
    }//GEN-LAST:event_given_clearActionPerformed

    private void taken_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taken_saveActionPerformed
        try {
            Connection con;
            Statement st;
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/money","root","******");
            st = con.createStatement();
            float amount;
            String tname= taken_list.getSelectedItem().toString();
            //String g_name= name.getSelectedItem().toString();
            if(tname.equals("NAME"))
            JOptionPane.showMessageDialog(null,"SELECT NAME");
            else
            {
                String des = taken_detail.getText();
                try{
                    amount= Float.parseFloat(taken_amt.getText());
                    st.execute("insert into taken values ('"+tname+"',"+amount+",'"+des+"',NOW())");
                    JOptionPane.showMessageDialog(null,"SAVED SUCCESSFULLY");
                    taken_amt.setText("");
                    taken_list.setSelectedItem("");
                    taken_detail.setText("");
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"INVALID AMOUNT"+e);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"ERROR !! \n"+ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_taken_saveActionPerformed

    private void taken_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taken_clearActionPerformed
    taken_list.setSelectedItem("Other");
    taken_detail.setText("");
    taken_amt.setText("0");
        // TODO add your handling code here:
    }//GEN-LAST:event_taken_clearActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        try {
            Connection con;
            Statement st,st1;
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/money","root","******");
            st = con.createStatement();
            st1 = con.createStatement();
            float amount,pm,total_amt=0;
            String des = own_detail.getText();
            try{
                amount= Float.parseFloat(own_amt.getText());
                pm=Float.parseFloat(pocket.getText());
                st.execute("insert into own values ("+amount+",'"+des+"',NOW(),"+pm+")");
                JOptionPane.showMessageDialog(null,"SAVED SUCCESSFULLY");
                ResultSet t=st1.executeQuery("select sum(pocket) from own");
                while(t.next())
                {
                    total_amt=t.getFloat(1);
                }
                total.setText(""+total_amt);
                own_amt.setText("");
                own_detail.setText("");
                own_detail.setEditable(false);
                pocket.setText("");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"ERROR !! \n"+ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        own_detail.setText("");
        own_detail.setEditable(false);
        own_amt.setText("0");
        pocket.setText("0");
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void given_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_given_listActionPerformed
        given_record.setText("Amount \t\t Reason \t\t Date \n");
        if(taken_list.getSelectedItem().equals("Other"))
        {
            JOptionPane.showMessageDialog(null,"No Choice For OTHER");
            taken_record.setText("");
            taken_amt.setText("0");
            taken_detail.setText("");
        }
        else{
            try {
                Connection con;
                Statement st;
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3307/money","root","******");
                st = con.createStatement();
                ResultSet give1=st.executeQuery("select amt,des,date from given where name='"+given_list.getSelectedItem().toString()+"'");
                while(give1.next())
                {
                     //JOptionPane.showMessageDialog(null,give1.getString(1)+"\t"+give1.getString(2)+"\t"+give1.getString(3)+"\n");
                    given_record.append(give1.getString(1)+"\t\t"+give1.getString(2)+"\t\t"+give1.getString(3)+" \n ");
                }
                con.close();
            // TODO add your handling code here:
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,"SOMETHING IS GOING WRONG\n"+ex);
                }

        }
    }//GEN-LAST:event_given_listActionPerformed

    private void taken_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taken_listActionPerformed
        taken_record.setText("Amount \t\t Reason \t\t Date \n");
        if(taken_list.getSelectedItem().equals("Other"))
        {
            JOptionPane.showMessageDialog(null,"No Choice For OTHER");
            taken_record.setText("");
            taken_amt.setText("0");
            taken_detail.setText("");
        }
        else{
                try {
                    Connection con;
                    Statement st;
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3307/money","root","******");
                    st = con.createStatement();
                    ResultSet danish= st.executeQuery("select amt,des,date from taken where name='"+taken_list.getSelectedItem().toString()+"'");
                    while(danish.next())
                    {
                        taken_record.append(danish.getString(1)+"\t\t"+danish.getString(2)+"\t\t"+danish.getString(3)+" \n ");
                    }
                    con.close();
                    // TODO add your handling code here:
                    } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,"SOMETHING IS GOING WRONG\n"+ex);
                    }

            }

        // TODO add your handling code here:
    }//GEN-LAST:event_taken_listActionPerformed

    private void smsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smsActionPerformed
            JOptionPane.showMessageDialog(null,"You can send Messages on (Send SMS).......");
    }//GEN-LAST:event_smsActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        //JOptionPane.showMessageDialog(null,search.getSelectedItem().toString());
        if(taken_list.getSelectedItem().equals("Other"))
        {
            JOptionPane.showMessageDialog(null,"No Choice For OTHER");
            taken.setText("");
            given.setText("");
            sms.setVisible(false);
        }
        else if(search.getSelectedItem().toString().equals("Own"))
        {
            try {
                Connection con ;
                Statement st;
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3307/money","root","khalid");
                st = con.createStatement();
                details.setText("\t\t\t---- Own Expenditures -----\n");
                ResultSet k = st.executeQuery("select * from own");
                while(k.next())
                {
                    details.append("\t"+k.getFloat(1)+"\t"+k.getString(2)+" \t\t "+k.getString(3)+" \n ");
                }
            } catch (Exception ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            try{
                Connection con ;
                Statement st;
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3307/money","root","******");
                st = con.createStatement();
                ResultSet k = st.executeQuery("select sum(amt) from given where name='"+search.getSelectedItem().toString()+"'");
                while(k.next())
                {
                    given.setText(k.getString(1));
                }
                ResultSet f = st.executeQuery("select sum(amt) from taken where name='"+search.getSelectedItem().toString()+"'");
                while(f.next())
                {
                    taken.setText(f.getString(1));
                }
                details.setText("\t\t   *-----*TAKEN*-----*\n\t-----------------------------------------------------------------------\n");
                ResultSet a=st.executeQuery("select amt,des,date from taken where name='"+search.getSelectedItem().toString()+"'");
                while(a.next())
                {
                    details.append("\t"+a.getString(1)+"\t"+a.getString(2)+" \t "+a.getString(3)+" \n ");
                }
                details.append("\n\n\t\t   *-----*GIVEN*-----*\n\t-----------------------------------------------------------------------\n");
                ResultSet an=st.executeQuery("select amt,des,date from given where name='"+search.getSelectedItem().toString()+"'");
                while(an.next())
                {
                    details.append("\t"+an.getString(1)+"\t"+an.getString(2)+" \t "+an.getString(3)+" \n ");
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"SOMETHING IS GOING WRONG...\n"+e);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.setVisible(true);
        F2.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void unauthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unauthActionPerformed
            try {
                    Connection con;
                    Statement st;
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3307/money","root","*******");
                    st = con.createStatement();
                    ResultSet danish= st.executeQuery("select * from unauthorized where time='"+unauth.getSelectedItem()+"'");
                    while(danish.next())
                    {
                        undate.setText(danish.getString(1));
                        untime.setText(danish.getString(2));
                        byte[] imge = danish.getBytes("img");
                        ImageIcon image = new ImageIcon(imge);
                        Image im = image.getImage();
                        Image myImg = im.getScaledInstance(unimage.getWidth(), unimage.getHeight(),Image.SCALE_SMOOTH);
                        ImageIcon newImage = new ImageIcon(myImg);
                        unimage.setIcon(newImage);
                        //unimage
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,"SOMETHING IS GOING WRONG"+ex);
                    }
        // TODO add your handling code here:
    }//GEN-LAST:event_unauthActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        JOptionPane.showMessageDialog(null,"Try to UnderStand... \nThis Pane is Unser Maintanance");
/*        try {
            String host = "smtp.gmail.com";
            String user = txtGmail.getSelectedItem().toString();
            String pas = txtPass.getText();
            String to_a = contact.getText();
            String to = "+91"+to_a+"@txtlocal.co.uk";
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

            // TODO add your handling code here:
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Error !! \n"+ex);
        } */
    }//GEN-LAST:event_sendActionPerformed

    private void msgnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgnameActionPerformed
        contact.setText("");
        messg.setText("");
        String name;
        float give=0,take=0;
        name = msgname.getSelectedItem().toString();
        try {
                    Connection con;
                    Statement st,st1;
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3307/money","root","******");
                    st = con.createStatement();
                    ResultSet danish= st.executeQuery("select sum(amt) from taken where name='"+msgname.getSelectedItem()+"'");
                    while(danish.next())
                    {
                        take = danish.getFloat(1);
                    }
                    ResultSet khalid= st.executeQuery("select sum(amt) from given where name='"+msgname.getSelectedItem()+"'");
                    while(khalid.next())
                    {
                        give = khalid.getFloat(1);
                    }
                    messg.setText("Hello Mr/Miss "+name+"\n");
                    if(take != 0.00)
                        messg.append("You have Given \""+take+"Rs.\" to Mr. Khalid \n");
                    if(give != 0.00)
                        messg.append("You have Taken \""+give+"Rs.\" from Him\n");

                    messg.append("This Message is just Information");
                    st1 = con.createStatement();
                    ResultSet kf = st1.executeQuery("select contact from contact where name='"+name+"'");
                    while(kf.next())
                    {
                        contact.setText(kf.getString(1));
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,"SOMETHING IS GOING WRONG\n"+ex);
                }
        // TODO add your handling code here:
    }//GEN-LAST:event_msgnameActionPerformed

    private void addcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcontactActionPerformed
                try {
                    Connection con;
                    Statement st;
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3307/money","root","******");
                    st = con.createStatement();
                    String c = JOptionPane.showInputDialog("Enter Contact Number");
                    st.execute("insert into contact values('"+taken_list.getSelectedItem().toString()+"','"+c+"')");

                    con.close();
                    // TODO add your handling code here:
                    } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,"SOMETHING IS GOING WRONG\n"+ex);
                    }
        // TODO add your handling code here:
    }//GEN-LAST:event_addcontactActionPerformed

    private void addcontact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcontact1ActionPerformed
            try {
                    Connection con;
                    Statement st;
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3307/money","root","khalid");
                    st = con.createStatement();
                    String c = JOptionPane.showInputDialog("Enter Contact Number");
                    st.execute("insert into contact values('"+given_list.getSelectedItem().toString()+"','"+c+"')");

                    con.close();
                    // TODO add your handling code here:
                    } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,"SOMETHING IS GOING WRONG\n"+ex);
                    }
        // TODO add your handling code here:
    }//GEN-LAST:event_addcontact1ActionPerformed

    private void change_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_imageActionPerformed

            String imgs[] = {"0.jpg","1.jpg","2.jpg","3.jpg","4.jpg","5.jpg","6.jpg","7.jpg","8.jpg","9.jpg","10.jpg","11.jpg","12.jpg"};
            page1_img.setIcon(new javax.swing.ImageIcon(getClass().getResource(imgs[img_counter%12])));
            img_counter++;
        // TODO add your handling code here:
    }//GEN-LAST:event_change_imageActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void change_passwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_passwdActionPerformed
        try {
                    Connection con;
                    Statement st;
                    Class.forName("com.mysql.jdbc.Driver");

                    String get_db_pass = null;
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3307/money","root","******");
                    st = con.createStatement();
                    String old = JOptionPane.showInputDialog("Old Password  ");

                    ResultSet old_pass_db= st.executeQuery("select new_password from password");
                    while(old_pass_db.next())
                    {
                        get_db_pass = old_pass_db.getString(1);
                    }

                    String new_passwd = "";
                    String new_passwd1 = "";

                    if(old.equals(get_db_pass))
                    {
                        while(new_passwd.length() < 6){
                            JOptionPane.showMessageDialog(null,"Please Enter Atleast 7 Characters Password");
                            new_passwd = JOptionPane.showInputDialog("New Password  ");
                            new_passwd1 = JOptionPane.showInputDialog("Confirm New Password  ");
                        }

                        if(new_passwd.equals(new_passwd1)){
                            st.execute("insert into password values(curdate(),curtime(),'"+old+"','"+new_passwd+"')");
                            JOptionPane.showMessageDialog(null,"Password Changed Successfully");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"You Entered Wrong Password\nYou are an Unauthorized Person");
                    }
                    con.close();
                    // TODO add your handling code here:
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null,"SOMETHING IS GOING WRONG\n"+ex);
                    }

        // TODO add your handling code here:
    }//GEN-LAST:event_change_passwdActionPerformed
    public static void main(String args[]) {
        Toolkit tk=Toolkit.getDefaultToolkit();
        int xsize=(int)tk.getScreenSize().getWidth();
        int ysize=(int)tk.getScreenSize().getHeight();
        login kf=new login();
        kf.setSize(820,570);
        kf.setResizable(false);
        kf.setVisible(true);
        kf.setLocation(((xsize/2)-(720/2)),((ysize/2)-(440/2)));
        kf.setDefaultCloseOperation(3);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame F2;
    private javax.swing.JButton addcontact;
    private javax.swing.JButton addcontact1;
    private javax.swing.JRadioButton afternoon;
    private javax.swing.JTextField all_given;
    private javax.swing.JTextField all_own;
    private javax.swing.JTextField all_taken;
    private javax.swing.JRadioButton auto;
    private javax.swing.JTextField avg;
    private javax.swing.ButtonGroup bg1;
    private javax.swing.JButton change_image;
    private javax.swing.JButton change_passwd;
    private javax.swing.JButton clear;
    private javax.swing.JLabel cnt;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField days;
    private javax.swing.JTextArea details;
    private javax.swing.JButton exit;
    private javax.swing.JLabel given;
    private javax.swing.JTextField given_amt;
    private javax.swing.JButton given_clear;
    private javax.swing.JTextArea given_detail;
    private javax.swing.JComboBox<String> given_list;
    private javax.swing.JTextArea given_record;
    private javax.swing.JButton given_save;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jTextField6;
    private javax.swing.JButton login;
    private javax.swing.JButton logout;
    private javax.swing.JTextArea messg;
    private javax.swing.JComboBox<String> msgname;
    private javax.swing.JRadioButton other;
    private javax.swing.JTextField own_amt;
    private javax.swing.JTextArea own_detail;
    private javax.swing.JLabel page1_img;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField pocket;
    private javax.swing.JButton save;
    private javax.swing.JComboBox<String> search;
    private javax.swing.JButton send;
    private javax.swing.JButton sms;
    private javax.swing.JLabel taken;
    private javax.swing.JTextField taken_amt;
    private javax.swing.JButton taken_clear;
    private javax.swing.JTextArea taken_detail;
    private javax.swing.JComboBox<String> taken_list;
    private javax.swing.JTextArea taken_record;
    private javax.swing.JButton taken_save;
    private javax.swing.JLabel total;
    private javax.swing.JComboBox<String> txtGmail;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JComboBox<String> unauth;
    private javax.swing.JLabel undate;
    private javax.swing.JLabel unimage;
    private javax.swing.JLabel unknown;
    private javax.swing.JLabel untime;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
}
