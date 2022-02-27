import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class Page4 extends JFrame implements ActionListener{



        JLabel j1 = new JLabel("You can choose More than one color");

        //CheckBox
        JCheckBox cbx1 = new JCheckBox("RM100                   ");
        JCheckBox cbx2 = new JCheckBox("RM110                  ");
        JCheckBox cbx3 = new JCheckBox("RM115                ");

        //Image
        ImageIcon Img1 = new ImageIcon(new ImageIcon("Img1.png").getImage().getScaledInstance(120, 100, Image.SCALE_DEFAULT));
        JLabel label1 = new JLabel();
        ImageIcon Img2 = new ImageIcon(new ImageIcon("Img2.png").getImage().getScaledInstance(120, 100, Image.SCALE_DEFAULT));
        JLabel label2 = new JLabel();
        ImageIcon Img3 = new ImageIcon(new ImageIcon("Img3.png").getImage().getScaledInstance(120, 100, Image.SCALE_DEFAULT));
        JLabel label3 = new JLabel();


        JButton cancel = new JButton("Cancel") {
            @Override
            public void setSize(int width, int height) {
                super.setSize(80, 30);
                setMaximumSize(getSize());
            }
        };
        JButton ok = new JButton("Ok") {
            @Override
            public void setSize(int width, int height) {
                super.setSize(80, 30);
                setMaximumSize(getSize());
            }
        };



    public Page4() {
        setLayout(new BorderLayout());
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel top = new JPanel();
        top.setLayout(new FlowLayout());
        j1.setBorder(new EmptyBorder(20, 0, 0, 0));
        j1.setFont(new Font("", Font.BOLD, 20));
        top.add(j1);
        add("North", top);

        JPanel middle = new JPanel();
        middle.setLayout(new FlowLayout());
        label1.setIcon(Img1);
        middle.add(label1);
        label2.setIcon(Img2);
        middle.add(label2);
        label3.setIcon(Img3);
        middle.add(label3);

        middle.add(cbx1);
        middle.add(cbx2);
        middle.add(cbx3);
        add("Center", middle);

        JPanel bottom = new JPanel();
        bottom.setLayout(new FlowLayout());
        bottom.add(cancel);
        bottom.add(ok);
        add("South", bottom);
        cancel.addActionListener(this);
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String color = "";
                if(cbx1.isSelected()){
                    MyData.color = "Dark Brown Color.";
                    MyData.hairPrice = 100;
                }
                else if(cbx2.isSelected()){
                    MyData.color = "Brown Color.";
                    MyData.hairPrice = 110;

                }
                else if(cbx3.isSelected()){
                    MyData.color = "Light Brown Color.";
                    MyData.hairPrice= 115;
                }
                else{
                    MyData.color = "none.";
                    MyData.hairPrice = 0;
                }

                MyData.isColorSet = true;
                dispose();
                Page2 p2 = new Page2();
                p2.setVisible(true);
            }
        });
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cancel)
       {
           cleardata();
           dispose();
        }
    }
    private void cleardata() { //reset all checkbox
        if (cbx1.isSelected())
        {
            cbx1.setSelected(false);            
        }
        else if ((cbx2.isSelected()))
        {
            cbx2.setSelected(false); 
        }
        else if ((cbx3.isSelected())){
            cbx3.setSelected(false); 
        }
    }
}
