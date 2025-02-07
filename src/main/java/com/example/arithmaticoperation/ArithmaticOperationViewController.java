package com.example.arithmaticoperation;

import javafx.event.Event;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ArithmaticOperationViewController
{
    @javafx.fxml.FXML
    private Text resultText;
    @javafx.fxml.FXML
    private TextField nOneTextField;
    @javafx.fxml.FXML
    private TextField nTwoTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addButtonOnMouseClicked(Event event) {
        String str1 = nOneTextField.getText();
        String str2 = nTwoTextField.getText();

        int valOne = Integer.parseInt(str1);
        int valTwo = Integer.parseInt(str2);

        int sum = valOne + valTwo;

        String result = Integer.toString(sum);

        resultText.setText(result);
    }

    @javafx.fxml.FXML
    public void mulButtonOnMouseClicked(Event event) {
        String str1 = nOneTextField.getText();
        String str2 = nTwoTextField.getText();

        int valOne = Integer.parseInt(str1);
        int valTwo = Integer.parseInt(str2);

        int sum = valOne * valTwo;

        String result = Integer.toString(sum);

        resultText.setText(result);
    }

    @javafx.fxml.FXML
    public void subButtonOnMouseClicked(Event event) {
        String str1 = nOneTextField.getText();
        String str2 = nTwoTextField.getText();

        int valOne = Integer.parseInt(str1);
        int valTwo = Integer.parseInt(str2);

        int sum = valOne - valTwo;

        String result = Integer.toString(sum);

        resultText.setText(result);
    }

    @javafx.fxml.FXML
    public void divButtonOnMouseClicked(Event event) {

    }
}