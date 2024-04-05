/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package memPackage;


import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author avih2
 */
public class gameMenu extends javax.swing.JFrame {
    JButton[] buttonArray = new JButton[9];
    ArrayList<Integer> sequence = new ArrayList<Integer>();
    int buttonsClicked = 0;
    int roundNum = 1;
    int sequenceLength = 0;
    Color defaultColor = new Color(255,255,254);
    boolean loss = false;
    static int score = 0;
    boolean freezeButtons = false;
    int expectedIndex = 0;
    /**
     * Creates new form gameMenu
     */
    public gameMenu() {
        initComponents();
        JButton[] buttonArray01={Red, Cyan, Blue, Yellow, Green, Purple, Pink, Orange, Black};
        System.arraycopy(buttonArray01, 0, buttonArray, 0, buttonArray01.length);
     
        Color colour = new Color(198, 202, 204);
        getContentPane().setBackground(colour);
        score=0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Red = new javax.swing.JButton();
        Blue = new javax.swing.JButton();
        Green = new javax.swing.JButton();
        Orange = new javax.swing.JButton();
        Cyan = new javax.swing.JButton();
        Purple = new javax.swing.JButton();
        Yellow = new javax.swing.JButton();
        Pink = new javax.swing.JButton();
        Black = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        scoreLabel = new javax.swing.JLabel();
        roundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Red.setBackground(new java.awt.Color(255, 255, 254));
        Red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedActionPerformed(evt);
            }
        });

        Blue.setBackground(new java.awt.Color(255, 255, 254));
        Blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlueActionPerformed(evt);
            }
        });

        Green.setBackground(new java.awt.Color(255, 255, 254));
        Green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreenActionPerformed(evt);
            }
        });

        Orange.setBackground(new java.awt.Color(255, 255, 254));
        Orange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrangeActionPerformed(evt);
            }
        });

        Cyan.setBackground(new java.awt.Color(255, 255, 254));
        Cyan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CyanActionPerformed(evt);
            }
        });

        Purple.setBackground(new java.awt.Color(255, 255, 254));
        Purple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PurpleActionPerformed(evt);
            }
        });

        Yellow.setBackground(new java.awt.Color(255, 255, 254));
        Yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YellowActionPerformed(evt);
            }
        });

        Pink.setBackground(new java.awt.Color(255, 255, 254));
        Pink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PinkActionPerformed(evt);
            }
        });

        Black.setBackground(new java.awt.Color(255, 255, 254));
        Black.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlackActionPerformed(evt);
            }
        });

        playButton.setBackground(new java.awt.Color(255, 255, 254));
        playButton.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        playButton.setText("PLAY");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        returnButton.setBackground(new java.awt.Color(255, 255, 254));
        returnButton.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        returnButton.setText("RETURN");
        returnButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        scoreLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        scoreLabel.setText("0");

        roundLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        roundLabel.setText("ROUND 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(142, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Red, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Yellow, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pink, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(returnButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Orange, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Black, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Green, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Purple, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Cyan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(Blue, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(roundLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundLabel)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Red, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Blue, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cyan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Green, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purple, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Yellow, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Orange, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pink, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Black, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(700, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        startGame();
    }//GEN-LAST:event_playButtonActionPerformed

    private void GreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreenActionPerformed
        buttonAction(Green, green, 4);
    }//GEN-LAST:event_GreenActionPerformed

    private void RedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedActionPerformed
        buttonAction(Red, red, 0);
    }//GEN-LAST:event_RedActionPerformed

    private void CyanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CyanActionPerformed
        buttonAction(Cyan, cyan, 1);
    }//GEN-LAST:event_CyanActionPerformed

    private void BlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlueActionPerformed
        buttonAction(Blue, blue, 2);
    }//GEN-LAST:event_BlueActionPerformed

    private void YellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YellowActionPerformed
        buttonAction(Yellow, yellow, 3);
    }//GEN-LAST:event_YellowActionPerformed

    private void PurpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurpleActionPerformed
        buttonAction(Purple, magenta, 5);
    }//GEN-LAST:event_PurpleActionPerformed

    private void PinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PinkActionPerformed
        buttonAction(Pink, pink, 6);
    }//GEN-LAST:event_PinkActionPerformed

    private void OrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrangeActionPerformed
        buttonAction(Orange, orange, 7);
    }//GEN-LAST:event_OrangeActionPerformed

    private void BlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlackActionPerformed
        buttonAction(Black, black, 8);
    }//GEN-LAST:event_BlackActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        String text;
        if(loss==false){
            text = "Are you sure you want to return? Your highscore will not be saved.";
            score=0;
        }
        else{
            text = "Are you sure you want to return?";
        }
        JFrame returnConfirm = new JFrame();
        if(JOptionPane.showConfirmDialog(returnConfirm, text, "RETURN", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            close();
            mainMenu main = new mainMenu();
            main.setVisible(true);
        }
    }//GEN-LAST:event_returnButtonActionPerformed

private void checkButton(int buttonNum){
    if(buttonsClicked!=1){
        expectedIndex++;
    }
    System.out.println("expected ="+ expectedIndex);
    
    if (expectedIndex >= 0 && expectedIndex < sequence.size()) {
        if (buttonNum == sequence.get(expectedIndex)) {
            System.out.println("Correct button clicked");
            score++;
            scoreLabel.setText(String.valueOf(score));
        } else {
            System.out.println("Incorrect button clicked");
            loss = true;
            new Thread(() -> {
                for (JButton button : buttonArray) {
                    flashColor(button, red, defaultColor, 500, 100);
                    button.setEnabled(false);
                    playButton.setEnabled(false);
                }
                    JFrame loseMenu = new JFrame();
                    if(JOptionPane.showConfirmDialog(loseMenu, "You Lose! Return to Menu?", "LOSER", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                        close();
                        mainMenu main = new mainMenu();
                        main.setVisible(true);
                    }
                   
            }).start();
        }
    }
        switch (roundNum) {
            case 1:
                if(score==2){
                    restartGame();
                }       break;
            case 2:
                if(score==6){
                    restartGame();
                }       break;
            case 3:
                if(score==12){
                    restartGame();
                }       break;
            case 4:
                if(score==20){
                    restartGame();
                }       break;
            case 5:
                if(score==30){
                    new Thread(() -> {
                        for (JButton button : buttonArray) {
                            flashColor(button, green, defaultColor, 500, 100);
                            button.setEnabled(false);
                            playButton.setEnabled(false);
                        }
                        JFrame loseMenu = new JFrame();
                        if(JOptionPane.showConfirmDialog(loseMenu, "You Win! Return to Menu?", "WINNER", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                            close();
                            mainMenu main = new mainMenu();
                            main.setVisible(true);
                        }
                    }).start();
                }       
            default:
                break;
        }
}

public void buttonAction(JButton button, Color color, int buttonNum){
    if(freezeButtons==false){
        flashColor(button, color, defaultColor, 150, 50);
        buttonsClicked++;
        checkButton(buttonNum);
    }
}

public static void wait(int ms){
    try{
        Thread.sleep(ms);
    }
    catch(InterruptedException ex){
        Thread.currentThread().interrupt();
    }
}

public void restartGame(){
    sequence.clear();
    expectedIndex = 0;
    buttonsClicked = 0;
    playButton.setVisible(true);
    roundNum++;
}
public static void flashColor(JButton button, Color color, Color returnColor, int timerTime, int waitTime){
    SwingUtilities.invokeLater(() -> {
        button.setBackground(color);
        Timer timer = new Timer(timerTime, e -> button.setBackground(returnColor));
        timer.setRepeats(false);
        timer.start();
    });
    wait(waitTime); 
}

public void startGame() {
    roundLabel.setText("ROUND "+String.valueOf(roundNum));
    playButton.setVisible(false);
    Random rand = new Random();
    sequenceLength = roundNum*2;
    int box;
    for(int i=0;i<sequenceLength;i++){
        box = rand.nextInt(9);
        sequence.add(i,box);
    }
    freezeButtons = true;
    Color colour = new Color(198, 202, 204);
    getContentPane().setBackground(colour);
    new Thread(() -> {
            wait(500);
            for (int i = 0; i < sequence.size(); i++) {
                switch(sequence.get(i)){
                    case 0:
                        flashColor(Red, red, defaultColor,1000,2000);
                        break;
                    case 1:
                        flashColor(Cyan, cyan, defaultColor,1000,2000);
                        break;
                    case 2:
                        flashColor(Blue, blue, defaultColor,1000,2000);
                        break;
                    case 3:
                        flashColor(Yellow, yellow, defaultColor,1000,2000);
                        break;
                    case 4:
                        flashColor(Green, green, defaultColor,1000,2000);
                        break;
                    case 5:
                        flashColor(Purple, magenta, defaultColor,1000,2000);
                        break;
                    case 6:
                        flashColor(Pink, pink, defaultColor,1000,2000);
                        break;
                    case 7:
                        flashColor(Orange, orange, defaultColor,1000,2000);
                        break;
                    case 8:
                        flashColor(Black, black, defaultColor,1000,2000);
                        break;
                }
                
                
            }
        freezeButtons = false;
        Color colour1 = new Color(172, 241, 250);
        getContentPane().setBackground(colour1);
        }).start();         
}
   
public void close(){
    WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
}

public static int getScore(){
    return score;
}
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
            java.util.logging.Logger.getLogger(gameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gameMenu().setVisible(true);
                SwingUtilities.invokeLater(gameMenu::new);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Black;
    private javax.swing.JButton Blue;
    private javax.swing.JButton Cyan;
    private javax.swing.JButton Green;
    private javax.swing.JButton Orange;
    private javax.swing.JButton Pink;
    private javax.swing.JButton Purple;
    private javax.swing.JButton Red;
    private javax.swing.JButton Yellow;
    private javax.swing.JButton playButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel roundLabel;
    private javax.swing.JLabel scoreLabel;
    // End of variables declaration//GEN-END:variables
}
