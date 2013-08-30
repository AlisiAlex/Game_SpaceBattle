package com.Main;

import com.Logic.Game.Space;

import javax.swing.*;

public class Main extends JFrame {
    public void Ma (){
        add(new Space());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setTitle("SpaceBattle");
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.Ma();
    }
}
