package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Controller {


    String extend = "";
    String course = "";
    Module module = new Module();

    @FXML
    private TextField textPath;

    @FXML
    private TextField fileName;

    @FXML
    private TextField lastName;

    @FXML
    private TextField textName;

    @FXML
    private TextField textPatronymic;

    @FXML
    private Label showResult;


//CheckBox;
    @FXML
    public void pressChekBox(ActionEvent event) {
        course = ((CheckBox) event.getSource()).getText();
    }

//RadioButton;
    @FXML
    public void pressRadioButton(ActionEvent event){
        extend = ((RadioButton)event.getSource()).getText();
    }

//Button;
    @FXML
    public void pressButton(ActionEvent event) throws IOException {
        module.createFile(textPath.getText(), fileName.getText(), extend, lastName.getText(), textName.getText(), textPatronymic.getText(), course);
    }

    @FXML
    public void selPath(ActionEvent event){
        module.selPath(textPath);
    }

    @FXML
    public void selFile(ActionEvent event) throws IOException {
        module.selFile(textPath.getText(), fileName.getText(), extend );
    }
}


