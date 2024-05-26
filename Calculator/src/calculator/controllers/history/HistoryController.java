/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator.controllers.history;

import calculator.models.History;
import calculator.models.Operation;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;

/**
 *
 * @author HP aka Camilo Morales
 */
public class HistoryController {
    
    private History history;

    public HistoryController(History history) {
        this.history = history;
    }
    public DefaultListModel<String> getHistoryModel() {
        ArrayList<Operation> operationHistory = history.getOperations();
        Collections.reverse(operationHistory);

        DefaultListModel<String> model = new DefaultListModel<>();
        for (Operation operation : operationHistory) {
            model.addElement(operation.toString());
        }
        return model;
    }   
    
    
    
    
}
