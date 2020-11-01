/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui_app;

import java.awt.Insets;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.scene.media.MediaView;

/**
 *
 * @author alex
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane pane;
    @FXML
    private Button prevButton;
    @FXML
    private Button nextButton;
    @FXML
    private Button playButton;
    
    Media sound;
    MediaPlayer mediaPlayer;
    int songNumber;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        songNumber = 1;
        sound = new Media("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-"+songNumber+".mp3");
       
        mediaPlayer = new MediaPlayer(sound);
        
    }    

    @FXML
    private void pressPrev(ActionEvent event) {
        if(songNumber<2) {
            return;
        }
        if (songNumber>1) {
            mediaPlayer.stop();
            songNumber--;
            sound = new Media("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-"+songNumber+".mp3");
            mediaPlayer = new MediaPlayer(sound);
        }
    }


    @FXML
    private void pressNextButton(ActionEvent event) {
        if(songNumber>15) {
            return;
        }
        if (songNumber<16) {
            mediaPlayer.stop();
            songNumber++;
            sound = new Media("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-"+songNumber+".mp3");
       
        mediaPlayer = new MediaPlayer(sound);
        }
    }

    @FXML
    private void pressPlay(ActionEvent event) {
        
        if(!mediaPlayer.getStatus().equals(Status.PLAYING)) {
            mediaPlayer.play();
            playButton.setText("Pause");
        } else {
            mediaPlayer.pause();
            playButton.setText("Play");
        }
        
    }
    
}
