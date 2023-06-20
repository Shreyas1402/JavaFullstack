package Swing;

import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();


            }
        });

    }
}
