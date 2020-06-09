package me.wise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Frame extends JFrame{

    private Main main;
    private Calculator calculator;
    private Files files;

    public Frame(Main instanceOne, Calculator instanceTwo, Files instanceThree) {
        this.main = instanceOne;
        this.calculator = instanceTwo;
        this.files = instanceThree;
        // Creating Content
        this.setLayout(null);
        // Title
        JLabel title = new JLabel("BMR Calculator", SwingConstants.CENTER);
        title.setFont(new Font(Font.MONOSPACED, Font.BOLD, 50));
        title.setBounds(125, 30, 500, 50);
        title.setForeground(Color.BLACK);

        // Gender
        JLabel gender = new JLabel("Gender:", SwingConstants.CENTER);
        gender.setFont(new Font(Font.MONOSPACED, Font.BOLD, 35));
        gender.setBounds(185, 200, 150, 50);
        gender.setForeground(Color.BLACK);
        JRadioButton maleOption = new JRadioButton();
        maleOption.setText("M");
        maleOption.setFont(new Font(Font.MONOSPACED, Font.BOLD, 25));
        maleOption.setBounds(400, 200, 50, 50);
        maleOption.setContentAreaFilled(false);
        maleOption.setBorderPainted(true);
        maleOption.setFocusPainted(false);
        maleOption.setForeground(Color.BLACK);
        JRadioButton femaleOption = new JRadioButton();
        femaleOption.setText("F");
        femaleOption.setFont(new Font(Font.MONOSPACED, Font.BOLD, 25));
        femaleOption.setBounds(480, 200, 50, 50);
        femaleOption.setContentAreaFilled(false);
        femaleOption.setBorderPainted(true);
        femaleOption.setFocusPainted(false);
        femaleOption.setForeground(Color.BLACK);
        ButtonGroup genderOptionGroup = new ButtonGroup();
        genderOptionGroup.add(maleOption);
        genderOptionGroup.add(femaleOption);

        // Age
        JLabel age = new JLabel("Age:", SwingConstants.CENTER);
        age.setFont(new Font(Font.MONOSPACED, Font.BOLD, 35));
        age.setBounds(185, 275, 150, 50);
        age.setForeground(Color.BLACK);
        JTextField ageText = new JTextField(8);
        ageText.setFont(new Font(Font.MONOSPACED, Font.BOLD, 25));
        ageText.setForeground(Color.BLACK);
        ageText.setBounds(400, 275, 50, 50);
        JLabel years = new JLabel("years", SwingConstants.CENTER);
        years.setFont(new Font(Font.MONOSPACED, Font.BOLD, 25));
        years.setBounds(420, 275, 150, 50);
        years.setForeground(Color.BLACK);

        // Height
        JLabel height = new JLabel("Height:", SwingConstants.CENTER);
        height.setFont(new Font(Font.MONOSPACED, Font.BOLD, 35));
        height.setBounds(185, 350, 150, 50);
        height.setForeground(Color.BLACK);
        JTextField heightFirstNum = new JTextField(8);
        heightFirstNum.setFont(new Font(Font.MONOSPACED, Font.BOLD, 25));
        heightFirstNum.setForeground(Color.BLACK);
        heightFirstNum.setBounds(400, 350, 50, 50);
        JLabel heightFirstNumUnit = new JLabel("ft", SwingConstants.CENTER);
        heightFirstNumUnit.setFont(new Font(Font.MONOSPACED, Font.BOLD, 25));
        heightFirstNumUnit.setBounds(400, 350, 150, 50);
        heightFirstNumUnit.setForeground(Color.BLACK);
        JTextField heightSecondNum = new JTextField(8);
        heightSecondNum.setFont(new Font(Font.MONOSPACED, Font.BOLD, 25));
        heightSecondNum.setForeground(Color.BLACK);
        heightSecondNum.setBounds(505, 350, 50, 50);
        JLabel heightSecondNumUnit = new JLabel("in", SwingConstants.CENTER);
        heightSecondNumUnit.setFont(new Font(Font.MONOSPACED, Font.BOLD, 25));
        heightSecondNumUnit.setBounds(505, 350, 150, 50);
        heightSecondNumUnit.setForeground(Color.BLACK);

        // Weight
        JLabel weight = new JLabel("Weight:", SwingConstants.CENTER);
        weight.setFont(new Font(Font.MONOSPACED, Font.BOLD, 35));
        weight.setForeground(Color.BLACK);
        weight.setBounds(185, 425, 150, 50);
        JTextField weightText = new JTextField(8);
        weightText.setFont(new Font(Font.MONOSPACED, Font.BOLD, 25));
        weightText.setForeground(Color.BLACK);
        weightText.setBounds(400, 425, 50, 50);
        JLabel weightUnit = new JLabel("lbs", SwingConstants.CENTER);
        weightUnit.setFont(new Font(Font.MONOSPACED, Font.BOLD, 25));
        weightUnit.setBounds(405, 425, 150, 50);
        weightUnit.setForeground(Color.BLACK);

        // Results Button
        JButton results = new JButton();
        results.setText("Calculate");
        results.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        results.setBounds(275, 595, 200, 50);
        results.setContentAreaFilled(false);
        results.setBorderPainted(true);
        results.setFocusPainted(false);
        results.setForeground(Color.BLACK);

        // Convert Units Button
        JButton convert = new JButton();
        convert.setText("Convert Units");
        convert.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        convert.setBounds(275, 125, 200, 40);
        convert.setContentAreaFilled(false);
        convert.setBorderPainted(true);
        convert.setFocusPainted(false);
        convert.setForeground(Color.BLACK);
        JLabel copyright = new JLabel("© 2020 Wise", SwingConstants.CENTER);
        copyright.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        copyright.setForeground(Color.BLACK);
        copyright.setBounds(5, 665, 150, 25);

        // Track Progress
        // Label
        JLabel progressLabel = new JLabel("Track Progress: ", SwingConstants.CENTER);
        progressLabel.setFont(new Font(Font.MONOSPACED, Font.BOLD, 25));
        progressLabel.setForeground(Color.BLACK);
        progressLabel.setBounds(210, 512, 250, 35);
        // CheckBox
        JCheckBox progressTrack = new JCheckBox();
        progressTrack.setBounds(475, 515, 35, 35);
        progressTrack.setContentAreaFilled(false);
        progressTrack.setBorderPainted(true);
        progressTrack.setHorizontalAlignment(SwingConstants.CENTER);
        progressTrack.setFocusPainted(false);

        // Adding Content to Frame
        this.add(progressTrack);
        this.add(progressLabel);
        this.add(copyright);
        this.add(convert);
        this.add(results);
        this.add(weightUnit);
        this.add(weightText);
        this.add(weight);
        this.add(heightSecondNumUnit);
        this.add(heightSecondNum);
        this.add(heightFirstNumUnit);
        this.add(heightFirstNum);
        this.add(height);
        this.add(years);
        this.add(ageText);
        this.add(age);
        this.add(maleOption);
        this.add(femaleOption);
        this.add(gender);
        this.add(title);

        // Action Listeners
        // Convert Button Click
        convert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(calculator.checkMetricSystemStatus()) {
                    heightFirstNumUnit.setText("ft");
                    heightSecondNumUnit.setText("in");
                    weightUnit.setText("lbs");
                    calculator.setMetricSystemOff();
                }else {
                    calculator.setMetricSystemOn();
                    heightFirstNumUnit.setText("m");
                    heightSecondNumUnit.setText("cm");
                    weightUnit.setText("kgs");
                }
            }
        });

        // Results Button Click
        results.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if((heightFirstNum.getText().length() < 1 && heightSecondNum.getText().length() < 1) || weightText.getText().length() < 1 || ageText.getText().length() < 1 || (!maleOption.isSelected() && !femaleOption.isSelected())) {
                    JLabel temp = new JLabel("Please Make Sure To Fill Everything Out!");
                    temp.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
                    temp.setForeground(Color.BLACK);
                    JOptionPane optionPane = new JOptionPane(temp, JOptionPane.WARNING_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Warning");
                    dialog.setFont(new Font(Font.MONOSPACED, Font.BOLD, 60));
                    dialog.setBounds(615, 350, 625, 300);
                    dialog.setAlwaysOnTop(true);
                    dialog.setIconImage(main.getIconImage());
                    dialog.setVisible(true);
                    return;
                }

                if(heightFirstNum.getText().length() < 1 && heightSecondNum.getText().length() > 0) heightFirstNum.setText("0");
                else if (heightFirstNum.getText().length() > 0 && heightSecondNum.getText().length() < 1) heightSecondNum.setText("0");

                String gender;
                if(maleOption.isSelected()) gender = "Male";
                else gender = "Female";
                try {

                    int age = Integer.parseInt(ageText.getText());
                    double weight = Double.parseDouble(weightText.getText());
                    int height;

                    if(calculator.checkMetricSystemStatus()) {
                        int meters = Integer.parseInt(heightFirstNum.getText()) * 100;
                        height = Integer.parseInt(heightSecondNum.getText()) + meters;
                    }else {
                        int feet = Integer.parseInt(heightFirstNum.getText()) * 12;
                        height = Integer.parseInt(heightSecondNum.getText()) + feet;
                    }
                    int bmr = calculator.calculate(gender, age, weight, height);

                    int looseWeight = bmr - 500;
                    int gainWeight = bmr + 500;

                    // Content for info pop up!
                    JLabel info = new JLabel(
                            "<html><body style='text-align: center'>Your BMR: " + bmr +
                                    "<br>Your BMR is how many calories you burn at rest!<br>To start loosing weight, eat around " + looseWeight +
                                    " calories per day!<br>To maintain your weight, eat around " + bmr +
                                    " calories per day!<br>To start gaining weight, eat around " + gainWeight +
                                    " calories per day!"
                    );
                    info.setFont(new Font(Font.MONOSPACED, Font.BOLD, 25));
                    info.setAlignmentX(CENTER_ALIGNMENT);
                    info.setForeground(Color.BLACK);
                    info.setBackground(Color.WHITE);

                    // Info Pop-up
                    JOptionPane optionPane = new JOptionPane(info, JOptionPane.INFORMATION_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Results:");
                    dialog.setFont(new Font(Font.MONOSPACED, Font.BOLD, 60));
                    dialog.setBounds(415, 400, 1000, 300);
                    dialog.setAlwaysOnTop(true);
                    dialog.setIconImage(main.getIconImage());
                    dialog.setVisible(true);

                    if(progressTrack.isSelected()) {
                        Date date = new Date();
                        SimpleDateFormat DateFor = new SimpleDateFormat("MM/dd/yyyy");
                        String simpleDate = DateFor.format(date);
                        String directory = System.getProperty("user.home") + "\\Desktop\\";
                        files.createDirectory(directory, "Progression");
                        String placeholder = files.createSingleFile("Progression", "README FIRST");
                        String weightChangeFile = files.createSingleFile("Progression", "Overall-Weight_Change");
                        String heightChangeFile = files.createSingleFile("Progression", "Overall-Height_Change");
                        String entryFile = files.createDupeFile("Progression", "Stats-Entry#");
                        File file = new File(placeholder);
                        if(file.getTotalSpace() < 1) {
                            files.writeToFile(placeholder, "README");
                            files.writeToFile(placeholder, "As long as you stay consistent and track your progress,");
                            files.writeToFile(placeholder, "This application will assist you on your journey!");
                            files.writeToFile(placeholder, "However, make sure not to delete the empty file named \"Stats-Entry#\"");
                            files.writeToFile(placeholder, "It acts as a placeholder!");
                            files.writeToFile(placeholder, "Good luck!");
                        }

                        files.writeToFile(entryFile, "Date: " + date);
                        files.writeToFile(entryFile, "Gender: " + gender);
                        files.writeToFile(entryFile, "Age: " + age);

                        if(calculator.checkMetricSystemStatus()) {
                            files.writeToFile(weightChangeFile, "Date: " + simpleDate + "     |     " + "Weight (kgs): " + weight);
                            files.writeToFile(heightChangeFile, "Date: " + simpleDate + "     |     " + "Height (cm): " + height);
                            files.writeToFile(entryFile, "Height (cm): " + height);
                            files.writeToFile(entryFile, "Weight (kgs): " + weight);
                        }else{
                            files.writeToFile(weightChangeFile, "Date: " + simpleDate + "     |     " + "Weight (lbs): " + weight);
                            files.writeToFile(heightChangeFile, "Date: " + simpleDate + "     |     " + "Height (in): " + height);
                            files.writeToFile(entryFile, "Height (in): " + height);
                            files.writeToFile(entryFile, "Weight (lbs): " + weight);
                        }
                        files.writeToFile(entryFile, "BMR: " + bmr);
                    }
                }catch(NumberFormatException | IOException e) {
                    // If the user enters something other than a number then throw an invalid pop-up
                    JLabel temp = new JLabel("Invalid Input!");
                    temp.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
                    temp.setForeground(Color.BLACK);
                    JOptionPane optionPane = new JOptionPane(temp, JOptionPane.WARNING_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Warning");
                    dialog.setFont(new Font(Font.MONOSPACED, Font.BOLD, 60));
                    dialog.setBounds(775, 400, 300, 200);
                    dialog.setAlwaysOnTop(true);
                    dialog.setIconImage(main.getIconImage());
                    dialog.setVisible(true);
                }

            }
        });

    }

}


