package xogame;

import javax.swing.*;
import java.awt.*;

public class Winne extends JFrame {
    private static final int WINDOW_POS_X = 640;
    private static final int WINDOW_POS_Y = 520;
    private static final int WINDOW_HEIGHT = 100;
    private static final int WINDOW_WIDTH = 240;

    public Winne(String winnerName){
        setTitle("Winner:");
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextField win = new JTextField("           " + winnerName); // "____" - это костыль, так как еше не удается вывести текст по центру окна (((
        add(win,BorderLayout.CENTER);

       setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
       win.setAlignmentX(CENTER_ALIGNMENT);

//        JPanel panel = new JPanel(new GridLayout(1,1));
//        add(new JLabel(winnerName), BorderLayout.CENTER);
        setVisible(true);
    }

}
