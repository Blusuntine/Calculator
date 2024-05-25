/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator.models;

import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class History {
    
    private ArrayList<Operation> operations;

    public History() {
        this.operations = new ArrayList<>();
    }
    
    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }
    
    //es probable que tenga que añadir lo del Single
    //Responsability Principle aqui
    
}
