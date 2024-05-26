/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator.controllers;

import calculator.controllers.utils.Response;
import calculator.controllers.utils.Status;
import calculator.controllers.decimals.DecimalController;

/**
 *
 * @author HP aka Camilo Morales
 */
public class OperationController {

    

    //Primer metodo para la calculadora, la suma
    public static Response addOperation(String number1, String number2, String operator, String result) {

        //Se verifica si el campo es vacio
        if (number1 == null || number1.trim().isEmpty()) {
            return new Response("Number 1 cannot be empty", Status.BAD_REQUEST);
        }
        if (number2 == null || number2.trim().isEmpty()) {
            return new Response("Number 2 cannot be empty", Status.BAD_REQUEST);
        }

        double doubleNumber1, doubleNumber2;

        //Se verifica si el campo es numérico
        try {
            doubleNumber1 = Double.parseDouble(number1);
        } catch (NumberFormatException ex) {
            return new Response("Number 1 must be numeric", Status.BAD_REQUEST);
        }
        try {
            doubleNumber2 = Double.parseDouble(number2);
        } catch (NumberFormatException ex) {
            return new Response("Number 2 must be numeric", Status.BAD_REQUEST);
        }

        //Se verifica si el número tiene más de 3 decimales
        if (!DecimalController.hasAtMostThreeDecimalPlaces(number1)) {
            return new Response("Number 1 must have at most 3 decimal places", Status.BAD_REQUEST);
        }
        if (!DecimalController.hasAtMostThreeDecimalPlaces(number2)) {
            return new Response("Number 2 must have at most 3 decimal places", Status.BAD_REQUEST);
        }

        double doubleResult = doubleNumber1 + doubleNumber2;

        String formattedResult = DecimalController.formatToThreeDecimalPlaces(doubleResult);

        return new Response("Addition done correctly: " + formattedResult, Status.OK);

    }

    //Segundo método para la calculadora, la resta
    //El procedimiento ya está explicado en la suma y es lo mismo para todas
    //las operaciones, no hace falta explicarlo de nuevo
    public static Response substractOperation(String number1, String number2, String operation, String result) {
        if (number1 == null || number1.trim().isEmpty()) {
            return new Response("Number 1 cannot be empty", Status.BAD_REQUEST);
        }
        if (number2 == null || number2.trim().isEmpty()) {
            return new Response("Number 2 cannot be empty", Status.BAD_REQUEST);
        }

        double doubleNumber1, doubleNumber2;
        try {
            doubleNumber1 = Double.parseDouble(number1);
        } catch (NumberFormatException ex) {
            return new Response("Number 1 must be numeric", Status.BAD_REQUEST);
        }
        try {
            doubleNumber2 = Double.parseDouble(number2);
        } catch (NumberFormatException ex) {
            return new Response("Number 2 must be numeric", Status.BAD_REQUEST);
        }

        if (!DecimalController.hasAtMostThreeDecimalPlaces(number1)) {
            return new Response("Number 1 must have at most 3 decimal places", Status.BAD_REQUEST);
        }
        if (!DecimalController.hasAtMostThreeDecimalPlaces(number2)) {
            return new Response("Number 2 must have at most 3 decimal places", Status.BAD_REQUEST);
        }

        double doubleResult = doubleNumber1 - doubleNumber2;

        String formattedResult = DecimalController.formatToThreeDecimalPlaces(doubleResult);

        return new Response("Substraction done correctly: " + formattedResult, Status.OK);

    }

    //Tercer método para la calculadora, la multiplicación
    public static Response multiplyOperation(String number1, String number2, String operator, String result) {

        if (number1 == null || number1.trim().isEmpty()) {
            return new Response("Number 1 cannot be empty", Status.BAD_REQUEST);
        }
        if (number2 == null || number2.trim().isEmpty()) {
            return new Response("Number 2 cannot be empty", Status.BAD_REQUEST);
        }

        double doubleNumber1, doubleNumber2;
        try {
            doubleNumber1 = Double.parseDouble(number1);
        } catch (NumberFormatException ex) {
            return new Response("Number 1 must be numeric", Status.BAD_REQUEST);
        }
        try {
            doubleNumber2 = Double.parseDouble(number2);
        } catch (NumberFormatException ex) {
            return new Response("Number 2 must be numeric", Status.BAD_REQUEST);
        }

        if (!DecimalController.hasAtMostThreeDecimalPlaces(number1)) {
            return new Response("Number 1 must have at most 3 decimal places", Status.BAD_REQUEST);
        }
        if (!DecimalController.hasAtMostThreeDecimalPlaces(number2)) {
            return new Response("Number 2 must have at most 3 decimal places", Status.BAD_REQUEST);
        }

        double doubleResult = doubleNumber1 * doubleNumber2;

        String formattedResult = DecimalController.formatToThreeDecimalPlaces(doubleResult);

        return new Response("Multiplication done correctly: " + formattedResult, Status.OK);

    }

    //Cuarto método para la calculadora, la división
    public static Response divideOperation(String number1, String number2, String operator, String result) {
        if (number1 == null || number1.trim().isEmpty()) {
            return new Response("Number 1 cannot be empty", Status.BAD_REQUEST);
        }
        if (number2 == null || number2.trim().isEmpty()) {
            return new Response("Number 2 cannot be empty", Status.BAD_REQUEST);
        }

        double doubleNumber1, doubleNumber2;
        try {
            doubleNumber1 = Double.parseDouble(number1);
        } catch (NumberFormatException ex) {
            return new Response("Number 1 must be numeric", Status.BAD_REQUEST);
        }
        try {
            doubleNumber2 = Double.parseDouble(number2);
        } catch (NumberFormatException ex) {
            return new Response("Number 2 must be numeric", Status.BAD_REQUEST);
        }

        if (!DecimalController.hasAtMostThreeDecimalPlaces(number1)) {
            return new Response("Number 1 must have at most 3 decimal places", Status.BAD_REQUEST);
        }
        if (!DecimalController.hasAtMostThreeDecimalPlaces(number2)) {
            return new Response("Number 2 must have at most 3 decimal places", Status.BAD_REQUEST);
        }

        double doubleResult = doubleNumber1 / doubleNumber2;

        String formattedResult = DecimalController.formatToThreeDecimalPlaces(doubleResult);

        return new Response("Division done correctly: " + formattedResult, Status.OK);

    }

    //Quinto método para la calculadora, la potenciación
    public static Response potencyOperation(String number1, String number2, String operator, String result) {
        if (number1 == null || number1.trim().isEmpty()) {
            return new Response("Number 1 cannot be empty", Status.BAD_REQUEST);
        }
        if (number2 == null || number2.trim().isEmpty()) {
            return new Response("Number 2 cannot be empty", Status.BAD_REQUEST);
        }

        double doubleNumber1, doubleNumber2;
        try {
            doubleNumber1 = Double.parseDouble(number1);
        } catch (NumberFormatException ex) {
            return new Response("Number 1 must be numeric", Status.BAD_REQUEST);
        }
        try {
            doubleNumber2 = Double.parseDouble(number2);
        } catch (NumberFormatException ex) {
            return new Response("Number 2 must be numeric", Status.BAD_REQUEST);
        }

        if (!DecimalController.hasAtMostThreeDecimalPlaces(number1)) {
            return new Response("Number 1 must have at most 3 decimal places", Status.BAD_REQUEST);
        }
        if (!DecimalController.hasAtMostThreeDecimalPlaces(number2)) {
            return new Response("Number 2 must have at most 3 decimal places", Status.BAD_REQUEST);
        }

        double doubleResult = Math.pow(doubleNumber1, doubleNumber2);

        String formattedResult = DecimalController.formatToThreeDecimalPlaces(doubleResult);

        return new Response("Potentiation done correctly: " + formattedResult, Status.OK);

    }

  
}
