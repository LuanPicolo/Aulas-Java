package com.mycompany.aula;

// import java.awt.Font;
//JLabel nome = new JLabel("olá");
//Font font = new Font(nome.getFont().getName(), nome.getFont().getStyle(), 32);
//nome.setFont(font);

import java.awt.event.ActionEvent;
import javax.swing.*;

public class RunningButton extends JFrame{
    
    private JButton button = new JButton("Click me");
    private Runner runner;
    
    public RunningButton(){
        setTitle("The Running Game");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        button.setSize(button.getPreferredSize());
        int x = (400 - button.getSize().width) / 2;
        int y = (400 - button.getSize().width) / 2;
        button.setLocation(x, y);
        add(button);
        setVisible(true);
        button.addActionListener(this::button_click);
        runner = new Runner(button);
        runner.start();
    }
    private void button_click(ActionEvent e){
        runner.finishGame();
        JOptionPane.showMessageDialog(this, "Congrats", "Game", JOptionPane.INFORMATION_MESSAGE);
    }
}
