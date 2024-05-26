/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator.views;

import calculator.controllers.OperationController;
import calculator.controllers.utils.Response;
import calculator.models.History;
import calculator.models.Calculator;
import calculator.models.Operation;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author edangulo
 */
public class CalculatorFrame extends javax.swing.JFrame {

    private History history;

    /**
     * Creates new form Calculator
     */
    public CalculatorFrame() {
        this.history = new History();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        substractButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        potencyButton = new javax.swing.JButton();
        clearNumbersButton = new javax.swing.JButton();
        updateHistoryButton = new javax.swing.JButton();
        number1TextField = new javax.swing.JTextField();
        number2TextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        updateHistoryList = new javax.swing.JList<>();
        resultTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Calculator");

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        substractButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        substractButton.setText("Subtract");
        substractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                substractButtonActionPerformed(evt);
            }
        });

        multiplyButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        multiplyButton.setText("Multiply");
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });

        divideButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        divideButton.setText("Divide");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });

        potencyButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        potencyButton.setText("Potency");
        potencyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potencyButtonActionPerformed(evt);
            }
        });

        clearNumbersButton.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        clearNumbersButton.setText("Clear numbers");
        clearNumbersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearNumbersButtonActionPerformed(evt);
            }
        });

        updateHistoryButton.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        updateHistoryButton.setText("Update history");
        updateHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateHistoryButtonActionPerformed(evt);
            }
        });

        number1TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        number1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1TextFieldActionPerformed(evt);
            }
        });

        number2TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Number 1");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Number 2");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Result");

        updateHistoryList.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        updateHistoryList.setEnabled(false);
        jScrollPane1.setViewportView(updateHistoryList);

        resultTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        resultTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resultTextField.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearNumbersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(number1TextField)
                            .addComponent(number2TextField)
                            .addComponent(resultTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(potencyButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(multiplyButton, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(substractButton, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(divideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(number1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateHistoryButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(number2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(resultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(substractButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(divideButton)
                            .addComponent(multiplyButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(potencyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearNumbersButton))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        Calculator calculator = new Calculator();

        String number1Str = number1TextField.getText();
        String number2Str = number2TextField.getText();
        String operator = "+";

        Response response = OperationController.addOperation(number1Str, number2Str, operator, "");

        if (response.getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {

            String resultMessage = response.getMessage();
            String[] parts = resultMessage.split(": ");
            if (parts.length == 2) {
                String result = parts[1];
                resultTextField.setText(result);

                double number1 = Double.parseDouble(number1Str);
                double number2 = Double.parseDouble(number2Str);
                double resultDouble = calculator.add(number1, number2);

                this.history.addOperation(new Operation(number1, number2, operator, resultDouble));
            }
        }
        JOptionPane.showMessageDialog(null, response.getMessage(), "Response Message", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_addButtonActionPerformed

    private void substractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_substractButtonActionPerformed
        // TODO add your handling code here:
        Calculator calculator = new Calculator();

        String number1Str = number1TextField.getText();
        String number2Str = number2TextField.getText();
        String operator = "-";

        Response response = OperationController.substractOperation(number1Str, number2Str, operator, "");

        if (response.getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {

            String resultMessage = response.getMessage();
            String[] parts = resultMessage.split(": ");
            if (parts.length == 2) {
                String result = parts[1];
                resultTextField.setText(result);

                double number1 = Double.parseDouble(number1Str);
                double number2 = Double.parseDouble(number2Str);
                double resultDouble = calculator.subtract(number1, number2);

                this.history.addOperation(new Operation(number1, number2, operator, resultDouble));
            }
        }
        JOptionPane.showMessageDialog(null, response.getMessage(), "Response Message", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_substractButtonActionPerformed

    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButtonActionPerformed
        // TODO add your handling code here:
        Calculator calculator = new Calculator();

        String number1Str = number1TextField.getText();
        String number2Str = number2TextField.getText();
        String operator = "*";

        Response response = OperationController.multiplyOperation(number1Str, number2Str, operator, "");

        if (response.getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {

            String resultMessage = response.getMessage();
            String[] parts = resultMessage.split(": ");
            if (parts.length == 2) {
                String result = parts[1];
                resultTextField.setText(result);

                double number1 = Double.parseDouble(number1Str);
                double number2 = Double.parseDouble(number2Str);
                double resultDouble = calculator.multiply(number1, number2);

                this.history.addOperation(new Operation(number1, number2, operator, resultDouble));
            }
        }
        JOptionPane.showMessageDialog(null, response.getMessage(), "Response Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_multiplyButtonActionPerformed

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
        // TODO add your handling code here:
        Calculator calculator = new Calculator();

        String number1Str = number1TextField.getText();
        String number2Str = number2TextField.getText();
        String operator = "/";

        Response response = OperationController.divideOperation(number1Str, number2Str, operator, "");

        if (response.getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {

            String resultMessage = response.getMessage();
            String[] parts = resultMessage.split(": ");
            if (parts.length == 2) {
                String result = parts[1];
                resultTextField.setText(result);

                double number1 = Double.parseDouble(number1Str);
                double number2 = Double.parseDouble(number2Str);
                double resultDouble = calculator.divide(number1, number2);

                this.history.addOperation(new Operation(number1, number2, operator, resultDouble));
            }
        }
        JOptionPane.showMessageDialog(null, response.getMessage(), "Response Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_divideButtonActionPerformed

    private void potencyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potencyButtonActionPerformed
        // TODO add your handling code here:

        Calculator calculator = new Calculator();
        String number1Str = number1TextField.getText();
        String number2Str = number2TextField.getText();
        String operator = "^";

        Response response = OperationController.potencyOperation(number1Str, number2Str, operator, "");

        if (response.getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {

            String resultMessage = response.getMessage();
            String[] parts = resultMessage.split(": ");
            if (parts.length == 2) {
                String result = parts[1];
                resultTextField.setText(result);

                double number1 = Double.parseDouble(number1Str);
                double number2 = Double.parseDouble(number2Str);
                double resultDouble = calculator.potency(number1, number2);

                this.history.addOperation(new Operation(number1, number2, operator, resultDouble));
            }
        }
        JOptionPane.showMessageDialog(null, response.getMessage(), "Response Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_potencyButtonActionPerformed

    private void clearNumbersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearNumbersButtonActionPerformed
        // TODO add your handling code here:
        number1TextField.setText("");
        number2TextField.setText("");
        resultTextField.setText("");
    }//GEN-LAST:event_clearNumbersButtonActionPerformed

    private void updateHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateHistoryButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<Operation> operationHistory = this.history.getOperations();
        Collections.reverse(this.history.getOperations());

        DefaultListModel model = new DefaultListModel();
        model.addAll(operationHistory);
        updateHistoryList.setModel(model);

    }//GEN-LAST:event_updateHistoryButtonActionPerformed
    //no tengo ni la más mínima idea de como esto llegó aquí
    private void number1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_number1TextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearNumbersButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JTextField number1TextField;
    private javax.swing.JTextField number2TextField;
    private javax.swing.JButton potencyButton;
    private javax.swing.JTextField resultTextField;
    private javax.swing.JButton substractButton;
    private javax.swing.JButton updateHistoryButton;
    private javax.swing.JList<String> updateHistoryList;
    // End of variables declaration//GEN-END:variables
}