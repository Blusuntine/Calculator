/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator.controllers.decimals;

/**
 *
 * @author HP
 */
public class DecimalController {
    
    //metodo para verificar q tenga 3 o mas decimales
    public static boolean hasAtMostThreeDecimalPlaces(String number) {
        if (number.contains(".")) {
            String[] parts = number.split("\\.");
            return parts[1].length() <= 3;
        }
        return true;
    }

    //Metodo para formatear el número y que solo tenga 3 decimales
    public static String formatToThreeDecimalPlaces(double number) {
        return String.format("%.3f", number);
    }
    
}
