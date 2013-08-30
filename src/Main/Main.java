package Main;

import com.Logic.Game.Space;

import javax.swing.*;

public class Main extends JFrame {
    public Main (){
        add(new Space());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setTitle("R - Type");
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Space();
    }
}
