package com.java_univer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Pract4_Window extends JFrame {
    private static final String MILAN = "AC Milan";
    private static final String REAL_MADRID = "Real Madrid";

    private JButton buttonMilan;
    private JButton buttonRealMadrid;
    private JButton exitButton;
    private JLabel labelResult;
    private JLabel labelLastScorer;
    private Label labelWinner;
    public int milanScore = 0;
    public int realMadridScore = 0;
    public String lastScorer = "N/A";
    public String winner = "N/A";
    public Pract4_Window(){
        super("Example");
        JButton buttonMilan = new JButton(MILAN);
        JButton buttonRealMadrid = new JButton(REAL_MADRID);
        JButton exitButton = new JButton("Exit");
        JLabel labelResult = new JLabel("Result: 0 X 0");
        JLabel labelLastScorer = new JLabel("Last Scorer: N/A");
        Label labelWinner = new Label("Winner: DRAW");
        setSize(300, 300);
        setLayout(new FlowLayout());
        add(buttonMilan);
        add(buttonRealMadrid);
        add(exitButton);
        add(labelResult);
        add(labelLastScorer);
        add(labelWinner);
        buttonMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                labelLastScorer.setText("Last Scorer: " + MILAN);
                labelResult.setText("Result: " + milanScore + " X " + realMadridScore);
                if (milanScore > realMadridScore) {labelWinner.setText("Winner: " + MILAN);}
                else if (realMadridScore > milanScore) {labelWinner.setText("Winner: " + REAL_MADRID);}
                else if (realMadridScore == milanScore) {labelWinner.setText("Winner: DRAW");}
            }
        });
        buttonRealMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realMadridScore++;
                labelLastScorer.setText("Last Scorer: " + REAL_MADRID);
                labelResult.setText("Result: " + milanScore + " X " + realMadridScore);
                if (milanScore > realMadridScore) {labelWinner.setText("Winner: " + MILAN);}
                else if (realMadridScore > milanScore) {labelWinner.setText("Winner: " + REAL_MADRID);}
                else if (realMadridScore == milanScore) {labelWinner.setText("Winner: DRAW");}
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
    }
}
