/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator.models;

/**
 *
 * @author edangulo
 */
public class Operation {

    private double number1;
    private double number2;
    private String operator;
    private double result;

    public Operation(double number1, double number2, String operator, double result) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
        this.result = result;
    }

    @Override
    public String toString() {
        return number1 + " " + operator + " " + number2 + " = " + result;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public String getOperator() {
        return operator;
    }

    public double getResult() {
        return result;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
   

}
