package applet;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class appletredblue extends Applet implements ActionListener
{
    Button red,blue;
    Label l;
    int x=0,y=0;
    public void init()
    {
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        c.weighty = 1.0;
        c.weightx = 1.0;
        red = new Button("Red");
        c.gridwidth = GridBagConstraints.RELATIVE;
        gridbag.setConstraints(red, c);
        add(red);
        red.addActionListener(this);
        blue = new Button("Blue");
        c.gridwidth = GridBagConstraints.REMAINDER;
        gridbag.setConstraints(blue, c);
        add(blue);
        blue.addActionListener(this);
        setSize(300,300);
        setLayout(gridbag);
    }
    public void start(){}
    public void stop(){}
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == red)
        {
            setBackground(Color.red);
        }
        if(e.getSource()== blue)
        {
            setBackground(Color.blue);
        }
    }
} 
