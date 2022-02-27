import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Page1 extends JFrame implements ActionListener
{
    JButton serviceBtn = new JButton("Services");
    JButton productBtn = new JButton("Products");


    public static void main(String[] args) {
        Page1 jf = new Page1(); //Set Frame

    }

    public Page1()
    {
        setLayout(new FlowLayout());
        setSize(400, 160);
        setTitle("Wavy Hair Salon");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Create a Frame
        setLocationRelativeTo(null);
        setResizable(false);


        JLabel title = new JLabel("Welcome to Wavy Hair Salon");
        title.setFont(new Font("Arial", Font.PLAIN, 25));
        title.setForeground(Color.red);
        add(title);


        JLabel lbl = new JLabel("Choose Your Option! ");
        lbl.setFont(new Font("Arial", Font.PLAIN,25));
        lbl.setForeground(Color.blue);
        add(lbl);

        JPanel bottom = new JPanel();
        bottom.setLayout(new FlowLayout());
        bottom.add(productBtn);
        bottom.add(serviceBtn);
        add("South",bottom);

        serviceBtn.addActionListener(this);
        productBtn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== productBtn){
            Page5 p5 = new Page5();
            p5.setVisible(true);
            dispose();
        }
        else if (e.getSource()== serviceBtn){
            Page2 p2 = new Page2();
            p2.setVisible(true);
            dispose();
        };
    }
}