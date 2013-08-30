package com.Logic.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Flight {
    private String craft = "Shatl.png";

    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;

    public Flight(){
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(craft));
        image = imageIcon.getImage();
        x = 40;
        y = 60;
    }

    public void move(){
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}
