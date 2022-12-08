import javax.swing.*;
// import javax.swing.plaf.FontUIResource;

import java.awt.*;
import java.awt.event.*;
// import java.nio.file.AtomicMoveNotSupportedException;

// import org.w3c.dom.Text;

public class HotelManagementSystem extends JFrame implements ActionListener{

    HotelManagementSystem(){
        setSize(2500, 1050);
        setLocation(-10, 0);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Atlantis.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1930, 1045); //loacation X,loation Y, Length, Breadth
        add(image);

        JLabel text = new JLabel("Akshardham Palace");
        text.setBounds(315, 25, 1500, 150);
        text.setForeground(Color.orange);
        text.setFont(new Font("Times New Roman", Font.BOLD, 145));
        image.add(text);    

        JButton next = new JButton("Next");
        next.setBounds(1700 , 920, 150, 50);
        next.setBackground(Color.BLACK);;
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        next.setFont(new Font("serif", Font.PLAIN, 25));
        image.add(next);

        setVisible(true);

        while (true) {
            text.setVisible(false);
            try{
                Thread.sleep(100);
            } catch (Exception e){
                e.printStackTrace();
            } 
            text.setVisible(true);
            try{
                Thread.sleep(500);
            } catch (Exception e){
                e.printStackTrace();
            } 
        }
    }

    public void actionPerformed(ActionEvent ae){
        new Login();
    }

    public static void main(String[] args) {
        new HotelManagementSystem();
    }
}