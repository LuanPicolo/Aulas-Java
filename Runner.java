package com.mycompany.aula;

import javax.swing.*;
import java.awt.Point;
import java.util.Random;

public class Runner extends Thread {
    
    private Random random;
    private JButton button;
    private int x, y;
    private int repeat = 10;
    private int where;
    private boolean finish = false;
    
    public Runner(JButton button){
        this.button = button;
        random = new Random();
        where = random.nextInt(8);
        repeat = random.nextInt(10, 200);
        Point p = button.getLocation();
        x = p.x;
        y = p.y;
    }
    
    @Override
    public void run(){
        try{
            while(!finish){
                move();
                Thread.sleep(5);
            }
        } catch (Exception e){
            
        }
    }
    private void move(){
        repeat--;
        if(repeat == 0 ){
            where = random.nextInt(8);
            repeat = random.nextInt(10, 200);
        }
            
        switch(where){
            case 0: // N
                y--;
                break;
            case 1: // NE
                x++;
                y--;
                break;
            case 2: // E
                x++;
                break;
            case 3: // SE
                x++;
                y++;
                break;
            case 4: // S
                y++;
                break;
            case 5: // SO
                x--;
                y++;
                break;
            case 6: // O
                x--;
                break;
            case 7: // NO
                x--;
                y--;
                break;
        }
       
        if(x<0) x = 0;
        if(y<0) y=0;
        if(x > 400) x=400;
        if(y>400) y=400;
       
        button.setLocation(x, y);
    }
    public void finishGame(){
        finish = true;
    }
}
