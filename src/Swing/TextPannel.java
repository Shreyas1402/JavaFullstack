package Swing;

import javax.swing.*;
import java.awt.*;

public class TextPannel extends JPanel {
    private JTextArea text;
    public TextPannel() {
        text = new JTextArea();
        setLayout(new BorderLayout());
        add(new JScrollPane(text), BorderLayout.CENTER);
    }
        public void appendText(String txt){
           text.append(txt);
           //text.append("yoyo");
        }
    }

