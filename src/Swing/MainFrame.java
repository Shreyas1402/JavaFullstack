package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    TextPannel TextPannel;
    ToolBar toolBar;
    FormPannel formPannel;

    private JButton btn;
    public MainFrame(){

        super("Hello World");
        setLayout(new BorderLayout( ));
        TextPannel=new TextPannel();
      //  btn=new JButton("click me");
        formPannel=new FormPannel();

        toolBar=new ToolBar();
        toolBar.setTextPannel(TextPannel);
       /* btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextPannel.appendText("hello");
            }
        });*/

       // formPannel.setFormListener(new FormListener()){

       // }

        toolBar.setStringListner(new StringListner() {
            @Override
            public void textEmitted(String text) {
                TextPannel.appendText(text);
            }
        });




        add(formPannel,BorderLayout.WEST);
        add(toolBar,BorderLayout.NORTH);
        add(TextPannel,BorderLayout.CENTER);

        setSize(500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }


}
