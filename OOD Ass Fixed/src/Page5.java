import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.text.*;

public class Page5 extends JFrame implements ActionListener {
    private static DecimalFormat dp = new DecimalFormat("#.##");
    //main Page7.method
    JButton receipt = new JButton("Next");
    JButton cancel = new JButton("Cancel");

    //next button

    //constructor
    public Page5() {

        //create new JFrame
        new JFrame();

        //create a JLabel to display the title for this GUI
        JLabel title = new JLabel("Wavy Hair Salon Products is the best");
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setForeground(Color.red);
                /* setBounds(int x-coordinate, int y-coordinate, int width, int height) 
                The setBounds() Page7.method needs four arguments.
                The first two arguments are x and y coordinates of the top-left corner of the component, 
                the third argument is the width of the component and 
                the fourth argument is the height of the component.
                */
        title.setBounds(200, 10, 1000, 50);
        add(title);

        //create a JLabel to display the image of the food
        JLabel label2 = new JLabel(new ImageIcon("redken.jfif"));
        label2.setBounds(30, 70, 240, 260);
        add(label2);

        //create a JLabel to display the name of the food
        JLabel labelTitle1 = new JLabel("Redken Hair Mouisturizer");
        labelTitle1.setFont(new Font("Arial", Font.PLAIN, 12));
        labelTitle1.setBounds(50, 200, 240, 260);
        add(labelTitle1);

        //create a JLabel to display the quantity ordered
        JLabel labelQuantity1 = new JLabel("Quantity: ");
        labelQuantity1.setFont(new Font("Arial", Font.PLAIN, 12));
        labelQuantity1.setBounds(50, 220, 280, 280);
        add(labelQuantity1);

        //create a JLabel to display the price of the food
        JLabel labelPrice1 = new JLabel("Price: RM0.00");
        labelPrice1.setFont(new Font("Arial", Font.PLAIN, 12));
        labelPrice1.setBounds(50, 250, 280, 280);
        add(labelPrice1);

        //create a JSpinner to let the user add the quantity of the food they want to order- max 6
   		/*   SpinnerNumberModel(int value, int min, int max, int step) : 
                returns a spinner model whose initial value is set to value, with minimum and maximum value, and a definite step value.*/

        JSpinner spinner1 = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        add(spinner1);
        //when JSpinner's value changes, the corresponding price label is changed
        spinner1.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                labelPrice1.setText("Price: RM" + dp.format(20.00 * (int) spinner1.getValue()));
                MyData.productPrice_one = 20.00 * (int) spinner1.getValue();
                MyData.quantity_one = (MyData.productPrice_one / 20.0);
            }
        });
        spinner1.setBounds(100, 350, 50, 20);

        //create a JLabel to display the image of the food
        JLabel label4 = new JLabel(new ImageIcon("loreal.jpg"));
        label4.setBounds(320, 70, 240, 240);
        add(label4);

        //create a JLabel to display the name of the food
        JLabel labelTitle3 = new JLabel("Loreal Hair Louchup");
        labelTitle3.setFont(new Font("Arial", Font.PLAIN, 12));
        labelTitle3.setBounds(320, 320, 150, 20);
        add(labelTitle3);

        //create a JLabel to display the quantity ordered
        JLabel labelQuantity3 = new JLabel("Quantity: ");
        labelQuantity3.setFont(new Font("Arial", Font.PLAIN, 12));
        labelQuantity3.setBounds(320, 350, 90, 20);
        add(labelQuantity3);

        //create a JLabel to display the price of the food
        JLabel labelPrice3 = new JLabel("Price: RM0.00");
        labelPrice3.setFont(new Font("Arial", Font.PLAIN, 12));
        labelPrice3.setBounds(320, 380, 90, 20);
        add(labelPrice3);

        //create a JSpinner to let the user add the quantity of the food they want to order-max 6
        JSpinner spinner3 = new JSpinner(new SpinnerNumberModel(0, 0, 6, 1));
        spinner3.setBounds(370, 350, 50, 20);
        add(spinner3);

        //when JSpinner's value changes, the corresponding price is changed
        spinner3.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                labelPrice3.setText("Price: RM" + dp.format(12.90 * (int) spinner3.getValue()));
				MyData.productPrice_two = 12.90 * (int) spinner3.getValue();
                MyData.quantity_two = (MyData.productPrice_two / 12.9);
            }
        });




        /* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

        //create a JLabel to display the image of the food
        JLabel label3 = new JLabel(new ImageIcon("wai.jpg"));
        label3.setBounds(620, 70, 240, 240);
        add(label3);

        //create a JLabel to display the name of the food
        JLabel labelTitle2 = new JLabel("Ginseng Shampoo Anti Hair Fall");
        labelTitle2.setFont(new Font("Arial", Font.PLAIN, 12));
        labelTitle2.setBounds(620, 210, 240, 240);
        add(labelTitle2);

        //create a JLabel to display the quantity ordered
        JLabel labelQuantity2 = new JLabel("Quantity: ");
        labelQuantity2.setFont(new Font("Arial", Font.PLAIN, 12));
        labelQuantity2.setBounds(620, 350, 50, 20);
        add(labelQuantity2);

        //create a JLabel to display the price of the food
        JLabel labelPrice2 = new JLabel("Price: RM0.00");
        labelPrice2.setFont(new Font("Arial", Font.PLAIN, 12));
        labelPrice2.setBounds(620, 380, 90, 20);
        add(labelPrice2);

        //create a JSpinner to let the user add the quantity of the food they want to order- max 10
        JSpinner spinner2 = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spinner2.setBounds(670, 350, 50, 20);
        add(spinner2);

        //when JSpinner's value changes, the corresponding price is changed
        spinner2.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                labelPrice2.setText("Price: RM" + dp.format(29.50 * (int) spinner2.getValue()));
				MyData.productPrice_three = 29.50 * (int) spinner2.getValue();
                MyData.quantity_three = (MyData.productPrice_three / 20.0);
            }
        });

        /* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
        //create button
        add(receipt);
        receipt.setBounds(820, 450, 100, 50);
        receipt.addActionListener(this);

        //cancel button
        add(cancel);
        cancel.setBounds(20, 450, 100, 50);
        cancel.addActionListener(this);

        //the setting of this JPanel
        setSize(950, 550);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        //button function
        if (e.getSource() == receipt) {
            Page6 p6 = new Page6();
            p6.setVisible(true);
            dispose();
        }
        if (e.getSource() == cancel) {
            Page1 p1 = new Page1();
            p1.setVisible(true);
            dispose();
        }
    }
}//end constrcutor


