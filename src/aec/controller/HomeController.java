/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aec.controller;

import animatefx.animation.FadeInDown;
import animatefx.animation.FadeInUp;
import de.jensd.fx.glyphs.materialicons.MaterialIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SRUN VANNARA
 */
public class HomeController implements Initializable {

    @FXML
    private AnchorPane paneHome;
    @FXML
    private AnchorPane paneTeacher;
    @FXML
    private AnchorPane paneResetPassword;
    @FXML
    private AnchorPane paneLogin;
    @FXML
    private AnchorPane paneStudent;
    @FXML
    private HBox btnTeacher;
    @FXML
    private HBox btnStudent;
    @FXML
    private HBox btnPayment;
    @FXML
    private HBox btnReport;
    @FXML
    private StackPane stackPane;
    @FXML
    private MaterialIconView btnHome;
    @FXML
    private MaterialIconView btnLock;
    @FXML
    private AnchorPane panePayment;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnHome.setVisible(false);
        btnLock.setVisible(false);
    }

    private void hidePane() {
        paneHome.setVisible(false);
        paneTeacher.setVisible(false);
        panePayment.setVisible(false);
        paneResetPassword.setVisible(false);
        paneLogin.setVisible(false);
        paneStudent.setVisible(false);
        btnHome.setVisible(false);
        btnLock.setVisible(false);
    }

    @FXML
    private void btnTeacherClick(MouseEvent event) {
        hidePane();
        paneTeacher.setVisible(true);
        btnHome.setVisible(true);
        btnLock.setVisible(true);
    }

    @FXML
    private void btnStudentClick(MouseEvent event) {
        hidePane();
        paneStudent.setVisible(true);
        btnHome.setVisible(true);
        btnLock.setVisible(true);
    }

    @FXML
    private void btnPaymentClick(MouseEvent event) {
        hidePane();
        panePayment.setVisible(true);
        btnLock.setVisible(true);
        btnHome.setVisible(true);
    }

    @FXML
    private void btnAboutClick(MouseEvent event) {
        System.out.println("About");
    }

    @FXML
    private void btnReportClick(MouseEvent event) {
        System.out.println("Report");

    }

    @FXML
    private void btnHomeClick(MouseEvent event) {
        hidePane();
        paneHome.setVisible(true);
        new FadeInDown(paneHome).play();
        btnLock.setVisible(true);
    }

    @FXML
    private void btnCloseClick(MouseEvent event) {
        Platform.exit();
    }

    @FXML
    private void btnMinClick(MouseEvent event) {
        Stage stage = (Stage) stackPane.getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    private void btnLoginClick(MouseEvent event) {
        hidePane();
        paneHome.setVisible(true);
        new FadeInUp(paneHome).play();
        btnHome.setVisible(false);
        btnLock.setVisible(true);
    }

    @FXML
    private void btnResetPasswordClick(MouseEvent event) {
        hidePane();
        paneResetPassword.setVisible(true);
        btnLock.setVisible(false);
    }
    
    @FXML
    private void btnCancelClick(MouseEvent event) {
        hidePane();
        paneLogin.setVisible(true);
    }

    @FXML
    private void btnLockClick(MouseEvent event) {
        hidePane();
        paneLogin.setVisible(true);
        btnLock.setVisible(false);
    }
}
