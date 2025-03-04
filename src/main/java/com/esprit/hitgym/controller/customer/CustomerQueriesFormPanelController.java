package com.esprit.hitgym.controller.customer;

import com.esprit.hitgym.GeneralFunctions;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class CustomerQueriesFormPanelController {

    @FXML
    private TableColumn<?, ?> Description;

    @FXML
    private TableColumn<?, ?> Heading;

    @FXML
    private TableColumn<?, ?> Id;

    @FXML
    private TableColumn<?, ?> Status;

    @FXML
    private TableColumn<?, ?> action;

    @FXML
    private Button addbutton;

    @FXML
    private TableView<?> employeesView;

    @FXML
    private TextField keyword;

    @FXML
    private Pagination pagination;

    @FXML
    private Button refreshButton;

    @FXML
    private Button sortButton;

    @FXML
    private Button sortButton1;

    @FXML
    void CreateQuery(ActionEvent event) throws IOException {
        new GeneralFunctions().switchSceneModality("CreateQuery.fxml");
    }

    @FXML
    void refreshbtn(ActionEvent event) {

    }

    @FXML
    void sortbtn1(ActionEvent event) {

    }

}
