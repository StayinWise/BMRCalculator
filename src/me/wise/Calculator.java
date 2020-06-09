package me.wise;

public class Calculator {

    private boolean metricSystem;
    public Calculator(){
        this.metricSystem = false;
    }

    public void setMetricSystemOn(){
        this.metricSystem = true;
    }
    public void setMetricSystemOff(){
        this.metricSystem = false;
    }
    public boolean checkMetricSystemStatus(){
        return this.metricSystem;
    }

    public int calculate(String gender, int age, double weight, int height) {
        // This is using the Mifflin-St Jeor Equation which is the best to date that doesn't include body fat percentages
        int bmr;
        if(this.checkMetricSystemStatus()) {
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
