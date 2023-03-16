package org.academiadecodigo.badashes;

import java.awt.*;
import javax.swing.*;
public class MyGridLayout{
    JFrame f;
    MyGridLayout(){
        for (int i=0; )
        f=new JFrame();
        JButton b1=new JButton("");
        JButton b2=new JButton("");
        JButton b3=new JButton("");
        JButton b4=new JButton("");
        JButton b5=new JButton("");
        JButton b6=new JButton("");
        JButton b7=new JButton("");
        JButton b8=new JButton("");
        JButton b9=new JButton("");
        // adding buttons to the frame
        f.add(b1); f.add(b2); f.add(b3);
        f.add(b4); f.add(b5); f.add(b6);
        f.add(b7); f.add(b8); f.add(b9);

        // setting grid layout of 3 rows and 3 columns
        f.setLayout(new GridLayout(6,6));
        f.setSize(300,300);
        f.setVisible(true);
    }

}