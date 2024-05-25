/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator.models.storage;

import calculator.models.Operation;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Storage {
    
    private static Storage instance;
    
    private ArrayList<Operation> operations;
    
    private Storage(){
        this.operations = new ArrayList<>();
    }
    //hmm debería tener esto aqui?
    //no tengo ni idea de que haré con un storage pero probablemente
    //no tengo ni el 10% del proyecto hecho así que no importa
    public static Storage getInstance(){
        if (instance == null){
            instance = new Storage ();
        }
        return instance;
    }
    
}
