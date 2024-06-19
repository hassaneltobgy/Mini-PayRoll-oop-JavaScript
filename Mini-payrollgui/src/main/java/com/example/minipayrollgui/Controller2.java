package com.example.minipayrollgui;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.String.valueOf;

public class Controller2 implements Initializable {

    //Table
    @FXML
    private Button modify;
    @FXML
    private TableView<Engineer> tableView;

    //Columns
    @FXML
    private TableColumn<Engineer, String> nameCol;

    @FXML
    private TableColumn<Engineer, Integer> Agecol;

    @FXML
    private TableColumn<Engineer, Integer> idCol;
    @FXML
    private TableColumn<Engineer, Double> payratecol;

    @FXML
    private TableColumn<Engineer, Double> taxratecol;
    @FXML
    private TableColumn<Engineer, Double> workinghourscol;
    @FXML
    private TableColumn<Engineer, Double> salarycol;
    @FXML
    private TableColumn<Engineer, String> typeCol;


    //Text input
    @FXML
    private TextField nameInput;

    @FXML
    private TextField ageInput;

    @FXML
    private TextField numberInput;
    @FXML
    private TextField payrateinput;

    @FXML
    private TextField taxrateinput;
    @FXML
    private TextField positioninput;

    @FXML
    private TextField salaryinput;
    @FXML
    private TextField idinput;
    @FXML
    private TextField workinghoursInput;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameCol.setCellValueFactory(new PropertyValueFactory<Engineer, String>("name"));
        Agecol.setCellValueFactory(new PropertyValueFactory<Engineer, Integer>("age"));
        idCol.setCellValueFactory(new PropertyValueFactory<Engineer, Integer>("id"));
        payratecol.setCellValueFactory(new PropertyValueFactory<Engineer, Double>("payrate"));
        taxratecol.setCellValueFactory(new PropertyValueFactory<Engineer, Double>("taxrate"));
        typeCol.setCellValueFactory(new PropertyValueFactory<Engineer, String>("position"));

    }

    //Submit button
    @FXML
    void submit(ActionEvent event) {
        double sal, salary;
        sal = Double.parseDouble(taxrateinput.getText()) * Double.parseDouble(payrateinput.getText());
        salary = sal;
        Engineer engineer = new Ceo(Integer.parseInt(idinput.getText()),
                nameInput.getText(), Integer.parseInt(ageInput.getText()), Double.parseDouble(salaryinput.getText()),
                Double.parseDouble(workinghoursInput.getText()),
                new Grade(positioninput.getText(), Double.parseDouble(taxrateinput.getText()), Double.parseDouble(payrateinput.getText())));

//            {
//
//                @Override
//                public double calcSalary() throws NegativeSalary {
//                    return 0;
//                }
//            };
        salaryinput.setText(String.valueOf(salary));
        ObservableList<Engineer> customers = tableView.getItems();
        customers.add(engineer);
        tableView.setItems(customers);
    }

    @FXML
    void removeCustomer(ActionEvent event) {
        int selectedID = tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(selectedID);
    }


    @FXML
    void gonext(MouseEvent event) throws Exception {
        Stage stage = (Stage) modify.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("try2.fxml"));


        stage.show();

    }
}








//  Company c1 = new Company();
//
//
//
//
//
//
//
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        idCol.setCellValueFactory(new PropertyValueFactory<Engineer, Integer>("id"));
//        Agecol.setCellValueFactory(new PropertyValueFactory<Engineer, Integer>("age"));
//        workinghourscol.setCellValueFactory(new PropertyValueFactory<Engineer, Double>("WorkingHours"));
//        typeCol.setCellValueFactory(new PropertyValueFactory<Engineer, String>("position"));
//        nameCol.setCellValueFactory(new PropertyValueFactory<Engineer, String>("name"));
//        salarycol.setCellValueFactory(new PropertyValueFactory<Engineer, Double>("salary"));
//        taxratecol.setCellValueFactory(new PropertyValueFactory<Engineer, Double>("taxrate"));
//        payratecol.setCellValueFactory(new PropertyValueFactory<Engineer, Double>("payrate"));
////        c1.add(new Ceo(0, "marwan", 28, 18000, 50, new Grade("ceo", 1.3, 2.5)));
////        c1.add(new Manager(1, "zeina", 20, 10000, 30, new Grade("manager", 1.1, 2.1)));
////        c1.add(new TeamLeader(5, "mazen", 27, 60000, 30, new Grade("teamleader", 0.7, 1.8)));
////        c1.add(new TeamMember(8, "amira", 25, 1000, 20, new Grade("teammember", 0.7, 1.8)));
////
////        setupTable();
//    }
//
//    //Submit button
//    @FXML
//    void submit(ActionEvent event) {
//
//
////        for (Engineer engineer : currentTableData) {
//
//            double sal = Double.parseDouble(taxrateinput.getText()) * Double.parseDouble(payrateinput.getText());
//        String name =nameInput.getText();
//               int age= Integer.parseInt(ageInput.getText());
//             int id=   Integer.parseInt(idinput.getText());
//               double payrate= Double.parseDouble(payrateinput.getText());
//              double taxrate=  Double.parseDouble(taxrateinput.getText());
//              double workinghours = Double.parseDouble(workinghoursInput.getText());
//              String position=  positioninput.getText();
//        salaryinput.setText(String.valueOf(sal));
////        ObservableList<Engineer> engineer = tableView.getItems();
//      Engineer engineer =new Ceo(id,name,age,sal,workinghours, new Grade(position,taxrate,payrate));
//        ObservableList<Engineer> engineers = tableView.getItems();
//        engineers.add(engineer);
//        tableView.setItems(engineers);
////tableView.refresh();
////break;
//        }
//
//
//    @FXML
//    void removeCustomer(ActionEvent event) {
//        int selectedID = tableView.getSelectionModel().getSelectedIndex();
//        tableView.getItems().remove(selectedID);
//    }
//
//
////    private void setupTable(){
////
//////        Engineer  employee0=(new Ceo(0, "marwan", 28, 18000, 50, new Grade("ceo", 1.3, 2.5))); ;
//////        Engineer  employee1 =(new Manager(1, "zeina", 20, 10000, 30, new Grade("manager", 1.1, 2.1)));
//////        Engineer  employee2 = (new TeamLeader(5, "mazen", 27, 60000, 30, new Grade("teamleader", 0.7, 1.8)));
//////       Engineer  employee3 = (new TeamMember(8, "amira", 25, 1000, 20, new Grade("teammember", 0.7, 1.8)));
//////     //   animals.getItems().addAll(employee0,employee1,employee2,employee3);
////
////        tableView.getItems().addAll((Engineer)c1.eng.get(0), (Engineer)c1.eng.get(1),(Engineer) c1.eng.get(2),(Engineer) c1.eng.get(3));
////    }
//
//    @FXML
//    void gonext(MouseEvent event) throws Exception {
//        Stage stage=(Stage) modify.getScene().getWindow();
//        Parent root = FXMLLoader.load(getClass().getResource("try2.fxml"));
//
//        stage.setScene(new Scene(root));
//        stage.show();
//
//
//    }
//
//
//
//
//
