/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
public class Xogame_5 extends javax.swing.JFrame {
  Player obj = new Player() ;
   D_ate date =new D_ate();
   
    public Xogame_5() {
        initComponents();
        dt();
        Times ();
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
        jButton10.setText(null);
        jButton11.setText(null);
        jButton12.setText(null);
        jButton13.setText(null);
        jButton14.setText(null);
        jButton15.setText(null);
        jButton16.setText(null);
         jButton17.setText(null);
        jButton18.setText(null);
        jButton19.setText(null);
        jButton20.setText(null);
        jButton21.setText(null);
        jButton22.setText(null);
        jButton23.setText(null);
        jButton24.setText(null);
        jButton25.setText(null);
        
        jButton1.setBackground(Color.CYAN);
        jButton2.setBackground(Color.CYAN);
        jButton3.setBackground(Color.CYAN);
        jButton4.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
        jButton6.setBackground(Color.CYAN);
        jButton7.setBackground(Color.CYAN);
        jButton8.setBackground(Color.CYAN);
        jButton9.setBackground(Color.CYAN);
        jButton10.setBackground(Color.CYAN);
        jButton11.setBackground(Color.CYAN);
        jButton12.setBackground(Color.CYAN);
        jButton13.setBackground(Color.CYAN);
        jButton14.setBackground(Color.CYAN);
        jButton15.setBackground(Color.CYAN);
        jButton16.setBackground(Color.CYAN);
        jButton17.setBackground(Color.CYAN);
        jButton18.setBackground(Color.CYAN);
        jButton19.setBackground(Color.CYAN);
        jButton20.setBackground(Color.CYAN);
        jButton22.setBackground(Color.CYAN);
        jButton23.setBackground(Color.CYAN);
        jButton24.setBackground(Color.CYAN);
        jButton25.setBackground(Color.CYAN);
        
        
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
          jButton10.setEnabled(true);
         jButton11.setEnabled(true);
         jButton12.setEnabled(true);
         jButton13.setEnabled(true);
          jButton14.setEnabled(true);
         jButton15.setEnabled(true);
         jButton16.setEnabled(true);
          jButton17.setEnabled(true);
         jButton18.setEnabled(true);
          jButton18.setEnabled(true);
         jButton19.setEnabled(true);
         jButton20.setEnabled(true);
         jButton21.setEnabled(true);
          jButton22.setEnabled(true);
         jButton23.setEnabled(true);
         jButton24.setEnabled(true);
         jButton25.setEnabled(true);
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
          String b10 = jButton10.getText ();
          String b11 = jButton11.getText ();
          String b12 = jButton12.getText ();
          String b13 = jButton13.getText ();
          String b14 = jButton14.getText ();
          String b15 = jButton15.getText ();
          String b16 = jButton16.getText ();
          String b17 = jButton17.getText ();
          String b18 = jButton18.getText ();
          String b19 = jButton19.getText ();
          String b20 = jButton20.getText ();
          String b21 = jButton21.getText ();
          String b22 = jButton22.getText ();
          String b23 = jButton23.getText ();
          String b24 = jButton24.getText ();
          String b25 = jButton25.getText ();
          if (b1==("X") && b2 == ("X") && b3 == ("X")&& b4 == ("X")&& b5 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Xwin();
            gameScore();
         reset();
        }
        
        if (b6==("X") && b7 == ("X") && b8 == ("X")&& b9 == ("X")&& b10 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player  X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Xwin();
            gameScore();
         reset();
        }
        
        if  (b11==("X") && b12 == ("X") && b13 == ("X")&& b14 == ("X")&& b15 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Xwin();
            gameScore();
         reset();
        }
        
        if  (b16==("X") && b17 == ("X") && b18 == ("X")&& b19 == ("X")&& b20 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Xwin();
            gameScore();
         reset();
        }
        
         if(b21==("X") && b22 == ("X") && b23 == ("X")&& b24 == ("X")&& b25 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
        
        if  (b1==("X") && b6 == ("X") && b11 == ("X")&& b16 == ("X")&& b21 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
        
        if  (b2==("X") && b7 == ("X") && b12 == ("X")&& b17 == ("X")&& b22 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
        
        if  (b3==("X") && b8 == ("X") && b13 == ("X")&& b18 == ("X")&& b23 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
         if (b4==("X") && b9 == ("X") && b14 == ("X")&& b19 == ("X")&& b24 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
        if (b5==("X") && b10 == ("X") && b15 == ("X")&& b20 == ("X")&& b25 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
        if (b1==("X") && b7 == ("X") && b13 == ("X")&& b19 == ("X")&& b25 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
        if (b5==("X") && b9 == ("X") && b13 == ("X")&& b17 == ("X")&& b21 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
         //****************************************** ของ O **************************
        if (b1==("O") && b2 == ("O") && b3 == ("O")&& b4 == ("O")&& b5 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Owin();
            gameScore();
         reset();
        }
        
        if (b6==("O") && b7 == ("O") && b8 == ("O")&& b9 == ("O")&& b10 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player  O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Owin();
            gameScore();
         reset();
        }
        
        if  (b11==("O") && b12 == ("O") && b13 == ("O")&& b14 == ("O")&& b15 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Owin();
            gameScore();
         reset();
        }
        
        if  (b16==("O") && b17 == ("O") && b18 == ("O")&& b19 == ("O")&& b20 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Owin();
            gameScore();
         reset();
        }
        
         if(b21==("O") && b22 == ("O") && b23 == ("O")&& b24 == ("O")&& b25 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
        
        if  (b1==("O") && b6 == ("O") && b11 == ("O")&& b16 == ("O")&& b21 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
        
        if  (b2==("O") && b7 == ("O") && b12 == ("O")&& b17 == ("O")&& b22 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
        
        if  (b3==("O") && b8 == ("O") && b13 == ("O")&& b18 == ("O")&& b23 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
         if (b4==("O") && b9 == ("O") && b14 == ("O")&& b19 == ("O")&& b24 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
        if (b5==("O") && b10 == ("O") && b15 == ("O")&& b20 == ("O")&& b25 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
        if (b1==("O") && b7 == ("O") && b13 == ("O")&& b19 == ("O")&& b25 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
        if (b5==("O") && b9 == ("O") && b13 == ("O")&& b17 == ("O")&& b21 == ("O"))
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

        jLabel2 = new javax.swing.JLabel();
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
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelX = new javax.swing.JLabel();
        jLabelO = new javax.swing.JLabel();
        jlblPlayerX = new javax.swing.JLabel();
        jlblPlayerO = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelRco = new javax.swing.JLabel();
        jbtnReset = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        l_date = new javax.swing.JLabel();
        l_time = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("OX Game");

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton1.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton1.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton2.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton2.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton3.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton3.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 204, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton4.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton4.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 204, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton5.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton5.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton5.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 204, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton6.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton6.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton6.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 204, 204));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton7.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton7.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton7.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 204, 204));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton8.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton8.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton8.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 204, 204));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton9.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton9.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton9.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 204, 204));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton10.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton10.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton10.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(0, 204, 204));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton11.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton11.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton11.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 204, 204));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton12.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton12.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton12.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(0, 204, 204));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton13.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton13.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton13.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 204, 204));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton14.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton14.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton14.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 204, 204));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton15.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton15.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton15.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(0, 204, 204));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton16.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton16.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton16.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(0, 204, 204));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton17.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton17.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton17.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(0, 204, 204));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton18.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton18.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton18.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(0, 204, 204));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton19.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton19.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton19.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(0, 204, 204));
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton20.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton20.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(0, 204, 204));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton21.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton21.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton21.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(0, 204, 204));
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton22.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton22.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton22.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(0, 204, 204));
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton23.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton23.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton23.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(0, 204, 204));
        jButton24.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton24.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton24.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton24.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(0, 204, 204));
        jButton25.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton25.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton25.setMaximumSize(new java.awt.Dimension(97, 101));
        jButton25.setMinimumSize(new java.awt.Dimension(97, 101));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Date :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Time :");

        jLabelX.setBackground(new java.awt.Color(153, 0, 153));
        jLabelX.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelX.setText("Player X :");
        jLabelX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelX.setOpaque(true);

        jLabelO.setBackground(new java.awt.Color(204, 204, 204));
        jLabelO.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelO.setText("Player O :");
        jLabelO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelO.setOpaque(true);

        jlblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jlblPlayerX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("0");
        jlblPlayerO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Round Of Games :");

        jLabelRco.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelRco.setText("0");
        jLabelRco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        l_date.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        l_time.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelRco, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(l_date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(l_time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                        .addGap(283, 283, 283))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelX, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlblPlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlblPlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabelRco, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblPlayerX, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelO, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblPlayerO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(jbtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(l_date, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(l_time, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(obj.startGame);
        jButton1.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       jButton2.setText(obj.startGame);
        jButton2.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(obj.startGame);
        jButton3.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(obj.startGame);
        jButton5.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(obj.startGame);
        jButton6.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(obj.startGame);
        jButton7.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(obj.startGame);
        jButton8.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(obj.startGame);
        jButton9.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton10.setText(obj.startGame);
        jButton10.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       jButton11.setText(obj.startGame);
        jButton11.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jButton12.setText(obj.startGame);
        jButton12.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jButton13.setText(obj.startGame);
        jButton13.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jButton14.setText(obj.startGame);
        jButton14.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jButton15.setText(obj.startGame);
        jButton15.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
       jButton16.setText(obj.startGame);
        jButton16.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
       jButton17.setText(obj.startGame);
        jButton17.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jButton18.setText(obj.startGame);
        jButton18.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        jButton19.setText(obj.startGame);
        jButton19.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jButton20.setText(obj.startGame);
        jButton20.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        jButton21.setText(obj.startGame);
        jButton21.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        jButton22.setText(obj.startGame);
        jButton22.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
       jButton23.setText(obj.startGame);
        jButton23.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        jButton24.setText(obj.startGame);
        jButton24.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        jButton25.setText(obj.startGame);
        jButton25.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton25ActionPerformed

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
        jButton10.setText(null);
        jButton11.setText(null);
        jButton12.setText(null);
        jButton13.setText(null);
        jButton14.setText(null);
        jButton15.setText(null);
        jButton16.setText(null);
         jButton17.setText(null);
        jButton18.setText(null);
        jButton19.setText(null);
        jButton20.setText(null);
        jButton21.setText(null);
        jButton22.setText(null);
        jButton23.setText(null);
        jButton24.setText(null);
        jButton25.setText(null);
        
        jButton1.setBackground(Color.CYAN);
        jButton2.setBackground(Color.CYAN);
        jButton3.setBackground(Color.CYAN);
        jButton4.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
        jButton6.setBackground(Color.CYAN);
        jButton7.setBackground(Color.CYAN);
        jButton8.setBackground(Color.CYAN);
        jButton9.setBackground(Color.CYAN);
        jButton10.setBackground(Color.CYAN);
        jButton11.setBackground(Color.CYAN);
        jButton12.setBackground(Color.CYAN);
        jButton13.setBackground(Color.CYAN);
        jButton14.setBackground(Color.CYAN);
        jButton15.setBackground(Color.CYAN);
        jButton16.setBackground(Color.CYAN);
        jButton17.setBackground(Color.CYAN);
        jButton18.setBackground(Color.CYAN);
        jButton19.setBackground(Color.CYAN);
        jButton20.setBackground(Color.CYAN);
        jButton22.setBackground(Color.CYAN);
        jButton23.setBackground(Color.CYAN);
        jButton24.setBackground(Color.CYAN);
        jButton25.setBackground(Color.CYAN);
        
        
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
          jButton10.setEnabled(true);
         jButton11.setEnabled(true);
         jButton12.setEnabled(true);
         jButton13.setEnabled(true);
          jButton14.setEnabled(true);
         jButton15.setEnabled(true);
         jButton16.setEnabled(true);
          jButton17.setEnabled(true);
         jButton18.setEnabled(true);
          jButton18.setEnabled(true);
         jButton19.setEnabled(true);
         jButton20.setEnabled(true);
         jButton21.setEnabled(true);
          jButton22.setEnabled(true);
         jButton23.setEnabled(true);
         jButton24.setEnabled(true);
         jButton25.setEnabled(true);
         obj.roundPlay();
        gameScore();
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        int confirmed = JOptionPane.showConfirmDialog(null, 
        "Are you sure you want to exit the XO 3X3 Game?", "Exit Program XO 4X4 Game",
        JOptionPane.YES_NO_OPTION);

         if (confirmed == JOptionPane.YES_OPTION) {
          dispose();
    }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(obj.startGame);
        jButton4.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
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
