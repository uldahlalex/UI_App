/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui_app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author alex
 */
public class UI_App extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Super mega cool musikafspiller");
        Parent root = FXMLLoader.load(getClass().getResource("graphic_user_interface/FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        scene.getStylesheets().add
 (FXMLDocumentController.class.getResource("graphic_user_interface/megacooldesign.css").toExternalForm());
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
