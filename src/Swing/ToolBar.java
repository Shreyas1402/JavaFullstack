package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel implements ActionListener {
    private JButton helloButton;
   private TextPannel textPannel;
    private JButton goodbye;
    private  StringListner stringListner;
    public ToolBar() {
        setBorder(BorderFactory.createEtchedBorder());



        helloButton=new JButton("hello");
       goodbye=new JButton("goodbye");
        helloButton.addActionListener(this);
        goodbye.addActionListener(this);
       setLayout(new FlowLayout(FlowLayout.LEFT));

       add(helloButton);
       add(goodbye);



    }
    public void setTextPannel(TextPannel textPannel){
        this.textPannel=textPannel;
    }

    public void setStringListner(StringListner text){
        this.stringListner=text;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked=(JButton) e.getSource();

        if(clicked==helloButton){
            if(stringListner!=null){
                stringListner.textEmitted("hello\n");
            }
            System.out.println("hello has been clicked");

        }
        else if(clicked==goodbye) {
            if (stringListner != null) {
                stringListner.textEmitted("goodbye\n");
            }
        }
    }



}
