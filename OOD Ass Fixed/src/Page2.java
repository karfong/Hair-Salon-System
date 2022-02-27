import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Page2 extends JFrame implements ActionListener {
    JRadioButton MaleBtn = new JRadioButton("Male", false);
    JRadioButton FemaleBtn = new JRadioButton("Female", false);
    ButtonGroup gender = new ButtonGroup();

    JCheckBox dyedHair = new JCheckBox("Dyed Hair");
    JCheckBox washHair = new JCheckBox("Wash Hair");
    JCheckBox hairCut = new JCheckBox("Hair Cut");
    JLabel lbl = new JLabel("Select Gender");
    JLabel lbl1 = new JLabel("Choose Services");

    JButton submitBtn = new JButton("Next");
    JButton cancelBtn = new JButton("Reset");
    JTextArea output = new JTextArea(8, 30);

    public Page2()
    {
        setLayout(new BorderLayout()); //create a border layout
        setSize(500, 300);
        setTitle("Appointment");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);


        JPanel top = new JPanel();//set a top panel
        top.setLayout(new FlowLayout());//set a new layout for top panel
        add("North",top);//locate the panel
        top.add(lbl);//add your object into panel
        top.add(dyedHair);
        top.add(washHair);
        top.add(hairCut);

        JPanel middle = new JPanel();//set a middle panel
        middle.setLayout(new FlowLayout());//set a new layout for middle panel
        add("Center",middle);//locate the panel
        middle.add(lbl1);//add your object into panel
        gender.add(MaleBtn);
        gender.add(FemaleBtn);
        middle.add(MaleBtn);
        middle.add(FemaleBtn);
        middle.add(output);


        JPanel bottom = new JPanel();//set a bottom panel
        bottom.setLayout(new BorderLayout());//set a new layout for botom panel
        add("South",bottom);//locate the panel
        bottom.add("West",cancelBtn);
        bottom.add("East",submitBtn);//add your object into panel

        MaleBtn.addActionListener(this);//add function for every button
        FemaleBtn.addActionListener(this);
        dyedHair.addActionListener(this);
        washHair.addActionListener(this);
        hairCut.addActionListener(this);
        submitBtn.addActionListener(this);
        cancelBtn.addActionListener(this);

         if(MyData.isColorSet){
            dyedHair.setSelected(true);
         }
         if(MyData.isGenderSet){
            if(MyData.gender.equals("Male")){
                MaleBtn.setSelected(true);
            }else if(MyData.gender.equals("Female")){
                FemaleBtn.setSelected(true);
            }
         }
         
         if(MyData.isWashHairSet){
            washHair.setSelected(true);
         }
        
         if(MyData.isHairCutSet){
             hairCut.setSelected(true);
         }
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (MaleBtn.isSelected()) {
            String gen = MaleBtn.getText();
            MyData.message = "Your Gender is " + gen;
            MyData.isGenderSet = true;
            MyData.gender = "Male";

        } else if (FemaleBtn.isSelected()) {
            String gen = FemaleBtn.getText();
            MyData.message = "Your Gender is  " + gen;
            MyData.isGenderSet = true;
            MyData.gender = "Female";        }

        if (washHair.isSelected() && hairCut.isSelected())
        {
            MyData.display = "Both Wash & Cut Hair";
            MyData.isWashHairSet = true;
            MyData.isHairCutSet = true;
            MyData.wash_cut = 45;
        }
        else if (washHair.isSelected())
        {
            MyData.display = "Wash Hair";
            MyData.isWashHairSet = true;
            MyData.wash_cut = 15;
        }
        else if (hairCut.isSelected())
        {
            MyData.display = "Cut Hair";
            MyData.isHairCutSet = true;
            MyData.wash_cut = 30;
        }
        if(dyedHair.isSelected() && MyData.isColorSet) //if they want to dyed hair can choose hair color
        {
        }
        else if(dyedHair.isSelected()){
            Page4 p4 = new Page4();
            p4.setVisible(true);
            dispose();
        }

        //display output
        output.setText(MyData.displayOutput());

        if(e.getSource() == cancelBtn)
        {
            //call the function to reset all button
            clearFields();
        }else if (e.getSource() == submitBtn)
        {
            Page3 p3 = new Page3();
            p3.setVisible(true);
            dispose();
        }
    }

    private void clearFields() { //reset all button
        //reset all button and go back
        gender.clearSelection();
        output.setText("");
        dyedHair.setSelected(false);
        washHair.setSelected(false);
        hairCut.setSelected(false);
        MyData.clearData();
    }
}

