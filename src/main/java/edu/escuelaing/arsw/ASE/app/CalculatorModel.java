package edu.escuelaing.arsw.ASE.app;

/**
 * CalculatorModel class that represents the model of a calculator.
 * This class uses the Singleton pattern to ensure that only one instance
 * of the CalculatorModel exists.
 */
public class CalculatorModel {
    private double number1;
    private String operation;
    private double result;

    // Singleton instance
    private static CalculatorModel instance;

    // Private constructor to prevent instantiation
    private CalculatorModel() {
        this.result = 0;
    }

    /**
     * Static method to get the single instance of the CalculatorModel class.
     * This method is synchronized to ensure thread safety.
     *
     * @return the single instance of CalculatorModel
     */
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

}