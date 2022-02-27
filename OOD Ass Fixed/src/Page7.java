import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Page7 extends JFrame implements ActionListener{
    JLabel name = new JLabel("Wavy Hair Salon");
    JButton okBtn = new JButton("Ok");
    JTextArea reciept =new JTextArea(15,45);
    
    public Page7()
    {
        setLayout(new FlowLayout());
        setSize(800, 500);
        setTitle("Reciept page");  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        name.setFont(new Font(name.getFont().getName(), name.getFont().getStyle(), 30));
        Font font = new Font("Verdana",Font.PLAIN, 15);
        reciept.setFont(font);
        JPanel top = new JPanel();
        top.setLayout(new FlowLayout());
        top.add(name);
        add("North",top);
        JPanel middle = new JPanel();
        middle.setLayout(new FlowLayout());
        middle.add(reciept);
        reciept.setEditable(false);
        
        reciept.setText(MyData.displayReciept());

        add("Center",middle);
        JPanel below = new JPanel();
        below.setLayout(new FlowLayout());
        below.add(okBtn);
        add("South",below);
        setVisible(true);
        okBtn.addActionListener(this);
    }
@Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==okBtn){
            dispose();
        }
    }
}
