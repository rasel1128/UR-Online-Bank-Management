package controllers;

import com.jfoenix.controls.JFXTextField;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

public class CreateController implements Initializable {
    @FXML
    private JFXTextField name;

     @FXML
    private JFXTextField dob;

      @FXML
    private JFXTextField cnic;

       @FXML
    private JFXTextField nation;

        @FXML
    private JFXTextField mob;
         @FXML
    private JFXTextField addr;
          @FXML
    private JFXTextField acc;
           @FXML
    private JFXTextField cast;
            @FXML
    private JFXTextField gend;
            @FXML
    private JFXTextField accty;
             @FXML
    private AnchorPane root;
              @FXML
    private JFXTextField user;
        @FXML
    private JFXTextField date;
        
 @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void control_search(ActionEvent event){
        final String FNAME = ac_num.getText();
		ArrayList<String> list_copy = new ArrayList<>();
                String text1 = name.getText();
                String text2 = father_name.getText();
                 String text3 = mother_name.getText();
                String text4 = date.getText();
                String text5 = nation.getText();
                String text6 = religion.getText();
                String text7 = gendar.getText();
                 String text8 = address.getText();
                String text9 =ac_type.getText();
		list_copy.add (text1);
		list_copy.add (text2);
                list_copy.add (text3);
               
		list_copy.add (text4);
               
                list_copy.add (text5);
               
		list_copy.add (text6);
               
                list_copy.add (text7);
                
		list_copy.add (text8);
                list_copy.add (text9);
               
                
		try ( BufferedWriter bw = 
				new BufferedWriter (new FileWriter (FNAME)) ) 
		{			
			for (String line : list_copy) {
				bw.write (line + "\n");
			}
			
			bw.close ();
			
		} catch (IOException e) {
		}
        
    }
}
