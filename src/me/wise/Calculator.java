package me.wise;

public class Calculator {

    private Main main;
    public Calculator(Main instance){
        this.main = instance;
    }

    public int calculate(String gender, int age, double weight, int height) {
        int bmr = 0;
        if(this.main.checkMetricSystemStatus()) {
            if(gender.equalsIgnoreCase("Male")) bmr = (int) Math.round((10 * weight) + (6.25 * height) - (5 * age) + 5);
            else bmr = (int) Math.round((10 * weight) + (6.25 * height) - (5 * age) - 161);
        }else {
            double w = weight / 2.205;
            double h = height * 2.54;
            if(gender.equalsIgnoreCase("Male")) bmr = (int) Math.round((10 * w) + (6.25 * h) - (5 * age) + 5);
            else bmr = (int) Math.round((10 * w) + (6.25 * h) - (5 * age) - 161);
        }
        return bmr;
    }

}
