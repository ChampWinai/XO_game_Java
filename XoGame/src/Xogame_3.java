/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
// import Libary ต่างๆที่จำเป็น
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Xogame_3 extends javax.swing.JFrame {
     Player obj = new Player() ;
     D_ate date =new D_ate();
     

//เซ็ทขนาดหน้าจอโปรแกรมเเละเรียกฟังก์ัชั่น
public Xogame_3() {
        initComponents();
        dt();
        Times ();
         setSize (645, 550);
         setLocationRelativeTo (null);
    }
//ปี-เดือน-วัน
public void dt(){
    l_date.setText(date.dd);
}
//เวลา
Timer t;
SimpleDateFormat st;
public void Times (){

t = new Timer (0, new ActionListener () {
                @Override
                 public void actionPerformed(ActionEvent e) {
                 Date dt =new Date();
                 st = new SimpleDateFormat ("hh:mm:ss  a");
        
                 String tt  = st.format(dt);
                  l_time.setText(tt);
        
                 }
        });
        t.start();
} 
//เซ็ทคะเเนนผู้เล่นเเละจำนวนเกมที่เล่น
private void gameScore()
     {
         jlblPlayerX. setText (String. valueOf(obj.getxCount()));
         jlblPlayerO. setText (String. valueOf(obj.getoCount()));
         jLabelRco. setText (String. valueOf(obj.getRoundPlay()));
     }
//เลือกผู้เล่นคนเเรก
public void choose_a_Player()
      { 
          if (obj.startGame.equalsIgnoreCase("X"))
          {
            obj.startGame ="O";
            jLabelO.setBackground(Color.magenta);
             jLabelO.setOpaque(true);
             jLabelX.setBackground(Color.LIGHT_GRAY);
             jLabelX.setOpaque(true);
          }
          else
          {
              obj.startGame ="X";
              jLabelX.setBackground(Color.magenta);
              jLabelX.setOpaque(true);
              jLabelO.setBackground(Color.LIGHT_GRAY);
             jLabelX.setOpaque(true);
          }
      }
//ฟังก์ชั่นรีเซทกระดานเกมเมื่อเจอผู้ชนะ
private void reset(){
    jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        jButton4.setText(null);
        jButton5.setText(null);
        jButton6.setText(null);
        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);
        
        jButton1.setBackground(Color.CYAN);
        jButton2.setBackground(Color.CYAN);
        jButton3.setBackground(Color.CYAN);
        jButton4.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
        jButton6.setBackground(Color.CYAN);
        jButton7.setBackground(Color.CYAN);
        jButton8.setBackground(Color.CYAN);
        jButton9.setBackground(Color.CYAN);
         jLabelX.setBackground(Color.LIGHT_GRAY);
         jLabelO.setBackground(Color.LIGHT_GRAY);
        
         jButton1.setEnabled(true);
         jButton2.setEnabled(true);
         jButton3.setEnabled(true);
         jButton4.setEnabled(true);
         jButton5.setEnabled(true);
         jButton6.setEnabled(true);
         jButton7.setEnabled(true);
         jButton8.setEnabled(true);
         jButton9.setEnabled(true);
         obj.roundPlay();
        gameScore();
}
//ฟังก์ชั่นหาผู้ชนะ
private void winningGame()
      {
          String b1 = jButton1.getText ();
          String b2 = jButton2.getText ();
          String b3 = jButton3.getText ();
         
          String b4 = jButton4.getText ();
          String b5 = jButton5.getText ();
          String b6 = jButton6.getText ();
          
          String b7 = jButton7.getText ();
          String b8 = jButton8.getText ();
          String b9 = jButton9.getText ();
          
          if (b1==("X") && b2 == ("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Xwin();
            gameScore();
         reset();
        }
        
        if (b4==("X") && b5 == ("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player  X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Xwin();
            gameScore();
         reset();
        }
        
        if (b7==("X") && b8 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Xwin();
            gameScore();
         reset();
        }
        
        if (b1==("X") && b4 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Xwin();
            gameScore();
         reset();
        }
        
        if (b2==("X") && b5 == ("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
        
        if (b3==("X") && b6 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
        
        if (b1==("X") && b5 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
        
        if (b3==("X") && b5 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
        if (b1==("O") && b2 == ("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
        
        if (b4==("O") && b5 == ("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
        
        if (b7==("O") && b8 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
        
        if (b1==("O") && b4 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Owin();
            gameScore();
         reset();
        }
        
        if (b2==("O") && b5 == ("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Owin();
            gameScore();
         reset();
        }
        
        if (b3==("O") && b6 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
        
        if (b1==("O") && b5 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Owin();
            gameScore();
         reset();
        }
        
        if (b3==("O") && b5 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
            reset();
           }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabelX = new javax.swing.JLabel();
        jlblPlayerX = new javax.swing.JLabel();
        jLabelO = new javax.swing.JLabel();
        jlblPlayerO = new javax.swing.JLabel();
        jbtnReset = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabelRco = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        l_date = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        l_time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("OX Game");

        jButton1.setBackground(new java.awt.Color(51, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(51, 255, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(51, 255, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(51, 255, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabelX.setBackground(new java.awt.Color(153, 0, 153));
        jLabelX.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelX.setText("Player X :");
        jLabelX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelX.setOpaque(true);

        jlblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jlblPlayerX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelO.setBackground(new java.awt.Color(204, 204, 204));
        jLabelO.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelO.setText("Player O :");
        jLabelO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelO.setOpaque(true);

        jlblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("0");
        jlblPlayerO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbtnReset.setBackground(new java.awt.Color(204, 255, 204));
        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnExit.setBackground(new java.awt.Color(204, 255, 204));
        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Round Of Games :");

        jLabelRco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelRco.setText("0");
        jLabelRco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Date :");

        l_date.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Time :");

        l_time.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRco, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelX, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlblPlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_date, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_time, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelO, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblPlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabelRco, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlblPlayerX, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlblPlayerO, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jLabelO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_date, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_time, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Evenของปุ่มที่ 1 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(obj.startGame);
        jButton1.setEnabled(false);
        choose_a_Player();
        winningGame();  
    }//GEN-LAST:event_jButton1ActionPerformed
//Evenของปุ่มที่ 2
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(obj.startGame);
        jButton2.setEnabled(false);
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton2ActionPerformed
//Evenของปุ่มที่ 3 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(obj.startGame);
        jButton3.setEnabled(false);
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton3ActionPerformed
//Evenของปุ่มที่ 4
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         jButton4.setText(obj.startGame);
         jButton4.setEnabled(false);
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton4ActionPerformed
//Evenของปุ่มที่ 5
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(obj.startGame);
        jButton5.setEnabled(false);
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton5ActionPerformed
//Evenของปุ่มที่ 6
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(obj.startGame);
        jButton6.setEnabled(false);
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton6ActionPerformed
//Evenของปุ่มที่ 7
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         jButton7.setText(obj.startGame);
         jButton7.setEnabled(false);
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton7ActionPerformed
//Evenของปุ่มที่ 8
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       jButton8.setText(obj.startGame);
       jButton8.setEnabled(false);
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton8ActionPerformed
//Evenของปุ่มที่ 9         
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       jButton9.setText(obj.startGame);
       jButton9.setEnabled(false);
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton9ActionPerformed
//Evenของปุ่มที่ reset เมื่อผู้เล่นกดเกมจะถูก reset  ฟังก์ชั่น reset หน้ากระดานเกม
    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
         jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        jButton4.setText(null);
        jButton5.setText(null);
        jButton6.setText(null);
        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);
        
        jButton1.setBackground(Color.CYAN);
        jButton2.setBackground(Color.CYAN);
        jButton3.setBackground(Color.CYAN);
        jButton4.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
        jButton6.setBackground(Color.CYAN);
        jButton7.setBackground(Color.CYAN);
        jButton8.setBackground(Color.CYAN);
        jButton9.setBackground(Color.CYAN);
         jLabelX.setBackground(Color.LIGHT_GRAY);
         jLabelO.setBackground(Color.LIGHT_GRAY);
        
         jButton1.setEnabled(true);
         jButton2.setEnabled(true);
         jButton3.setEnabled(true);
         jButton4.setEnabled(true);
         jButton5.setEnabled(true);
         jButton6.setEnabled(true);
         jButton7.setEnabled(true);
         jButton8.setEnabled(true);
         jButton9.setEnabled(true);
         obj.roundPlay();
        gameScore();
    }//GEN-LAST:event_jbtnResetActionPerformed
//Evenของปุ่มที่ exit ผู้เล่นจะกดเมื่อต้องการออกจากโปรเเกรม  ฟังก์ชันออกจากโปรแกรม
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
         int confirmed = JOptionPane.showConfirmDialog(null, 
        "Are you sure you want to exit the XO 3X3 Game?", "Exit Program XO 3X3 Game",
        JOptionPane.YES_NO_OPTION);

         if (confirmed == JOptionPane.YES_OPTION) {
          dispose();
    }
    }//GEN-LAST:event_jbtnExitActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelO;
    private javax.swing.JLabel jLabelRco;
    private javax.swing.JLabel jLabelX;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    private javax.swing.JLabel l_date;
    private javax.swing.JLabel l_time;
    // End of variables declaration//GEN-END:variables
}
