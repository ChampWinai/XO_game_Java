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
public class Xogame_4 extends javax.swing.JFrame {
     Player obj = new Player() ;
     D_ate date =new D_ate();
 
    public Xogame_4() {
        initComponents();
        dt();
        Times ();
         setSize (750, 600);
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
          //-
          if (b1==("X") && b2 == ("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Xwin();
            gameScore();
         reset();
        }
        //-
        if (b2==("X") && b3 == ("X") && b4 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player  X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Xwin();
            gameScore();
         reset();
        }
        //-
        if (b5==("X") && b6 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Xwin();
            gameScore();
         reset();
        }
        //-
        if (b6==("X") && b7 == ("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Xwin();
            gameScore();
         reset();
        }
        //-
        if (b9==("X") && b10 == ("X") && b11 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
        //-
        if (b10==("X") && b11 == ("X") && b12 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
        //-
        if (b13==("X") && b14 == ("X") && b15 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
        //-
        if (b14==("X") && b15 == ("X") && b16 == ("X")) 
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
        // |
         if (b1==("X") && b5 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
         // |
         if (b5==("X") && b9 == ("X") && b13 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
         // |
         if (b2==("X") && b6 == ("X") && b10 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
         // |
         if (b6==("X") && b10 == ("X") && b14 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
         // |
         if (b3==("X") && b7 == ("X") && b11 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
         // |
         if (b7==("X") && b11 == ("X") && b15 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
         // |
         if (b4==("X") && b8 == ("X") && b12 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
         // |
         if (b8==("X") && b12 == ("X") && b16 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
         // \
         if (b1==("X") && b6 == ("X") && b11 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
         // \
         if (b6==("X") && b11 == ("X") && b16 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
          // \
         if (b5==("X") && b10 == ("X") && b15 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
          // \
         if (b2==("X") && b7 == ("X") && b12 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
         // /
         if (b7==("X") && b10 == ("X") && b13 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
       // /
         if (b6==("X") && b11 == ("X") && b16 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
           // /
         if (b3==("X") && b6 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
           // /
         if (b8==("X") && b11 == ("X") && b14 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Xwin();
            gameScore();
         reset();
        }
         //****************************************** ของ O **************************
          //-
          if (b1==("O") && b2 == ("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Owin();
            gameScore();
         reset();
        }
        //-
        if (b2==("O") && b3 == ("O") && b4 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player  O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Owin();
            gameScore();
         reset();
        }
        //-
        if (b5==("O") && b6 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Owin();
            gameScore();
         reset();
        }
        //-
        if (b6==("O") && b7 == ("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
           obj.Owin();
            gameScore();
         reset();
        }
        //-
        if (b9==("O") && b10 == ("O") && b11 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
        //-
        if (b10==("O") && b11 == ("O") && b12 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
        //-
        if (b13==("O") && b14 == ("O") && b15 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
        //-
        if (b14==("O") && b15 == ("O") && b16 == ("O")) 
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
        // |
         if (b1==("O") && b5 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
         // |
         if (b5==("O") && b9 == ("O") && b13 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
         // |
         if (b2==("O") && b6 == ("O") && b10 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
         // |
         if (b6==("O") && b10 == ("O") && b14 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
         // |
         if (b3==("O") && b7 == ("O") && b11 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
         // |
         if (b7==("O") && b11 == ("O") && b15 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
         // |
         if (b4==("O") && b8 == ("O") && b12 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
         // |
         if (b8==("O") && b12 == ("O") && b16 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
         // \
         if (b1==("O") && b6 == ("O") && b11 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
         // \
         if (b6==("O") && b11 == ("O") && b16 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
         // \
         if (b5==("O") && b10 == ("O") && b15 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
         // \
         if (b5==("O") && b10 == ("O") && b15 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
         // /
         if (b2==("O") && b7 == ("O") && b12 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
       // /
         if (b6==("O") && b11 == ("O") && b16 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
           // /
         if (b3==("O") && b6 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Xo Game",JOptionPane.INFORMATION_MESSAGE);
            obj.Owin();
            gameScore();
         reset();
        }
         // /
          if (b8==("O") && b11 == ("O") && b14 == ("O"))
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

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelRco = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jLabelO = new javax.swing.JLabel();
        jlblPlayerO = new javax.swing.JLabel();
        jlblPlayerX = new javax.swing.JLabel();
        jLabelX = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        l_date = new javax.swing.JLabel();
        l_time = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 550));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("OX Game");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Round Of Games :");

        jLabelRco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelRco.setText("0");
        jLabelRco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 255, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 255, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton8.setMaximumSize(new java.awt.Dimension(2, 2));
        jButton8.setMinimumSize(new java.awt.Dimension(2, 2));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 255, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(0, 255, 255));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 255, 255));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton12.setMaximumSize(new java.awt.Dimension(2, 2));
        jButton12.setMinimumSize(new java.awt.Dimension(2, 2));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 255, 255));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(0, 255, 255));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 255, 255));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 255, 255));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(0, 255, 255));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jbtnExit.setBackground(new java.awt.Color(204, 255, 204));
        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.setMaximumSize(new java.awt.Dimension(84, 29));
        jbtnExit.setMinimumSize(new java.awt.Dimension(84, 29));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jbtnReset.setBackground(new java.awt.Color(204, 255, 204));
        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.setMaximumSize(new java.awt.Dimension(84, 29));
        jbtnReset.setMinimumSize(new java.awt.Dimension(84, 29));
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jLabelO.setBackground(new java.awt.Color(204, 204, 204));
        jLabelO.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelO.setText("Player O :");
        jLabelO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelO.setOpaque(true);

        jlblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("0");
        jlblPlayerO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jlblPlayerX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelX.setBackground(new java.awt.Color(255, 0, 153));
        jLabelX.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelX.setText("Player X :");
        jLabelX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelX.setOpaque(true);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Date :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Time : ");

        l_date.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        l_time.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRco, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(l_time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(l_date, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelX, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlblPlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelO)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlblPlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabelRco, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblPlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelX, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelO, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblPlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_date, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_time, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addContainerGap())
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(obj.startGame);
        jButton4.setEnabled(false);
        choose_a_Player();
        winningGame(); 
    }//GEN-LAST:event_jButton4ActionPerformed

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
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
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
