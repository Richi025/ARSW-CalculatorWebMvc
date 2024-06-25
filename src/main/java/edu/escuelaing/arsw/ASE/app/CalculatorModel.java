package edu.escuelaing.arsw.ASE.app;

public class CalculatorModel {
    private double number1;
    private double number2;
    private String operation;
    private double result;

    // Singleton instance
    private static CalculatorModel instance;

    // Private constructor to prevent instantiation
    private CalculatorModel() {
        this.result = 0;
    }

    // Static method to get the single instance of the class
    public static synchronized CalculatorModel getInstance() {
        if (instance == null) {
            instance = new CalculatorModel();
        }
        return instance;
    }

    // Getters and setters
    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void clearResult() {
        this.result = 0;
    }
}
