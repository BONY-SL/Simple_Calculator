package com.example.simple_calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
        private Button Clear;
    @FXML
    private Button precentage;
    @FXML
    private Button power;
    @FXML
    private Button div;
    @FXML
    private Button mul;
    @FXML
    private Button sbt;
    @FXML
    private Button add;
    @FXML
    private Button equal;
    @FXML
    private Button decimalpoint;
    @FXML
    private Button zero;
    @FXML
    private Button zerozero;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;

    @FXML
    private Button nine;
    @FXML
    private TextField view;

    private int flage=0;


    @FXML
    private void One1() {

        view.setText(one.getText());
    }
    @FXML
    private void two2() {
        view.setText(two.getText());
    }
    @FXML
    private void tree3() {
        view.setText(three.getText());
    }
    @FXML
    private void four4() {
        view.setText(four.getText());
    }
    @FXML
    private void five5() {
        view.setText(five.getText());
    }
    @FXML
    private void six6() {
        view.setText(six.getText());
    }

}
