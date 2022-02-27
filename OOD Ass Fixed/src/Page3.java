import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;

public class Page3 extends JFrame implements ActionListener{
    JLabel j = new JLabel("Would uou like to buy our Products?");
    JButton no = new JButton("No");
    JButton yes = new JButton("Yes");

    public Page3() {
        setLayout(new BorderLayout());
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    
        JPanel top = new JPanel();
        top.setLayout(new FlowLayout());
        j.setBorder(new EmptyBorder(50, 0, 0, 0));
        j.setFont(new Font("", Font.BOLD, 20));
        top.add(j);
        add("North", top);

        JPanel middle = new JPanel();
        middle.setLayout(new FlowLayout());
        middle.add(no);
        middle.add(yes);
        add("Center", middle);

        no.addActionListener(this);
        yes.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == yes) {
            Page5 p5 = new Page5();
            p5.setVisible(true);
            dispose();
        }
        else if (e.getSource() == no)
        {
            Page7 p7 = new Page7();
            p7.setVisible(true);
            dispose();
        }
    }
}
