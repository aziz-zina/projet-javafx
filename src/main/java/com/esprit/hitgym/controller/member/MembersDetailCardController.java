package com.esprit.hitgym.controller.member;

import com.esprit.hitgym.GeneralFunctions;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MembersDetailCardController implements Initializable {

    MembersPanelController membersPanel_controller = new MembersPanelController();
    private double x = 0;
    private double y = 0;
    /* Non FXML fields */
    public static String FullName, Weight, Address, Emails, Username, PackageType, PackagePrice;

    @FXML
    private Text address;

    @FXML
    private Button closeButton;

    @FXML
    private Text email;

    @FXML
    private Text fullName;

    @FXML
    private Text packageprice;

    @FXML
    private Text packagetype;

    @FXML
    private Text username;

    @FXML
    private Text weight;

    @FXML
    private AnchorPane Main;

    @FXML
    void closebtn(ActionEvent event) {
        new GeneralFunctions().close(closeButton);
    }

    public void dragWindow(MouseEvent e) {
        membersPanel_controller.membercardstage = (Stage) Main.getScene().getWindow();

        membersPanel_controller.membercardstage.setX(e.getScreenX() - x);

        membersPanel_controller.membercardstage.setY(e.getScreenY() - y);
    }

    @FXML
    public void pressedWindow(MouseEvent e) {
        x = e.getSceneX();
        y = e.getSceneY();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fullName.setText(FullName);
        weight.setText(Weight);
        address.setText(Address);
        email.setText(Emails);
        username.setText(Username);
        packagetype.setText(PackageType);
        packageprice.setText(PackagePrice);
    }
}
