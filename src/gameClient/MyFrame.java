package gameClient;


import Server.Game_Server_Ex2;
import api.game_service;

import javax.swing.*;
import java.awt.*;


/**
 * This class represents a very simple GUI class to present a
 * game on a graph - you are welcome to use this class - yet keep in mind
 * that the code is not well written in order to force you improve the
 * code and not to take it "as is".
 *
 */
public class MyFrame extends JFrame{
    private Arena _ar;
    private MyPanel panel;


    public MyFrame(String a) {
        super(a);
        _ar = new Arena();
        panel = new MyPanel();
        this.add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}