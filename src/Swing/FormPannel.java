package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.security.spec.RSAOtherPrimeInfo;

public class FormPannel extends JPanel {

    private JTextArea T = new JTextArea();
    private JLabel nameLabel;
    private JLabel occupation;
    private JTextField nameField;
    private JTextField occupationField;
    private JButton okbtn;

    public FormPannel() {

        nameLabel = new JLabel("Name: ");
        occupation = new JLabel("Occputation");
        nameField = new JTextField(10);
        occupationField = new JTextField(10);
        okbtn = new JButton("Okay");

        Dimension dim = getPreferredSize();
        System.out.println(dim);
        dim.width = 250;
        dim.setSize(200, 100);
        setPreferredSize(dim);
        Border innerBorder = BorderFactory.createTitledBorder("Add Person");
        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outer, innerBorder));

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();


        //// first row////

        gc.weightx = 1;// the weight controls how much space it will take up relative to the other cells
        gc.weighty = 0.01;
        gc.gridx = 0;// the cell location in our grid imagine this like a matrix
        gc.gridy = 0;

        gc.fill = GridBagConstraints.NONE;//whether to take up all the space or not
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets=new Insets(0,0,0,5);
        add(nameLabel, gc);
        gc.weightx = 1;// the weight controls how much space it will take up relative to the other cells
        gc.weighty = 0.01;
        //for name field the area where we type(as we want it to the right we make our grid as y=0,x=1;
        gc.gridx = 1;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;// makes the label and textfield come close together
        add(nameField, gc);

        ///// Second ROW///////

        gc.weightx = 1;// the weight controls how much space it will take up relative to the other cells
        gc.weighty = 0.01;
        gc.gridy = 1;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        //gc.insets=new Insets(0,0,0,5);
        add(occupation, gc);



        gc.gridx = 1;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(occupationField, gc);


        ////// THIRD ROW ///////////////
        gc.weightx = 1;// the weight controls how much space it will take up relative to the other cells
        gc.weighty = 0.5;
        gc.gridx = 1;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(okbtn, gc);

        okbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name=nameField.getText();
                String occ=occupationField.getText();

                FormEvent ev=new FormEvent(this,name,occ);

            }
        });


    }


}
