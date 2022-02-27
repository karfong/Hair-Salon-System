import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;

public class Page6 extends JFrame implements ActionListener{
    MyData data = new MyData();
    JLabel j = new JLabel("Would You like to look for services?");
    JButton yes = new JButton("Yes");
    JButton no = new JButton("No");

    public Page6() {
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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
      if(e.getSource()== yes){
          Page2 p2 = new Page2();
          p2.setVisible(true);
          dispose();
        }
        else if (e.getSource()== no){
            Page7 p7=new Page7();
            p7.setVisible(true);
          dispose();
        };
    }
}

