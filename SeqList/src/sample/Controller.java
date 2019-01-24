package sample;

import Exception.MyException;
import Logic.Solution;
import TSeqList.TSeqList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TextField newValue;

    @FXML
    private TextField newPosition;

    @FXML
    private Label status;

    @FXML
    private TextField chainOfChar;

    private TSeqList list;

    public Controller() {

    }

    public void add(){
        try{
            if(!newValue.getText().isEmpty() && newPosition.getText().isEmpty()) {
                if (newValue.getText().isEmpty()) {
                    throw new MyException(1);
                } else {
                    if (list.isFull()) {
                        throw new MyException(0);
                    } else {
                        list.add(Float.parseFloat(newValue.getText()));
                        newValue.setText("");
                        status.setText("Añadido con éxito.");
                    }
                }
            }
            if(!newValue.getText().isEmpty() && !newPosition.getText().isEmpty()){
                if(Integer.parseInt(newPosition.getText())-1 > list.getIdx()){
                    throw new MyException(4);
                }else {
                    list.addAt(Integer.parseInt(newPosition.getText())-1, Float.parseFloat(newValue.getText()));
                    newValue.setText("");
                    newPosition.setText("");
                    status.setText("Añadido con éxito.");
                }
            }
        }catch (MyException e){
            status.setText(e.getMessage());
        }

    }

    public void check() {
      try{
          if(chainOfChar.getText().isEmpty()){
              throw new MyException(5);
          }else {
              Solution solution = new Solution(chainOfChar.getText());
              status.setText(solution.determinate());
          }
      } catch (MyException e) {
          status.setText(e.getMessage());
      }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list = new TSeqList(3);
    }
}
