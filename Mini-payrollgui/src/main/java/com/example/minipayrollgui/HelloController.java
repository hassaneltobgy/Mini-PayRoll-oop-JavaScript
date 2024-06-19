package com.example.minipayrollgui;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.ResourceBundle;

public class HelloController {
    //  @FXML
    // private ChoiceBox<String> choiceBox;
    // private String []choice ={"Employee","Team leader ","Team Member"};
    public static ArrayList<Employee> eng = new ArrayList<Employee>();
    Company c2 = new Company();
    @FXML
    private Button login;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    //Table
    @FXML
    private TableView<Employee> tableView;

    @FXML
    private Label print;

    @FXML
    private Button printarraylist;
    @FXML
    private Button nextscene;
    @FXML
    private TextField idinput;

    @FXML
    private TextField nameinput;

    @FXML
    private Button neweng;


    @FXML
    private TextField payrateinput;

    @FXML
    private TextField positioninput;


    @FXML
    private TextField salaryinput;

    @FXML
    private TextField taxrateinput;

    @FXML
    private TextField workinghoursinput;
    @FXML
    private TextField ageinput;
    @FXML
    private Button Modify;
    @FXML
    private Button remove;


    //Columns

    //Text input
    String s;
    String newS=" ";
    boolean flag = true;

    @FXML
    public void homepage(MouseEvent event) throws Exception {
        Stage stage = (Stage) login.getScene().getWindow();
        if (username.getText().equals("admin") && password.getText().equals("123")) {
            stage.setFullScreen(true);
            stage.setMaximized(true);
            Parent root = FXMLLoader.load(getClass().getResource("print.fxml"));
            stage.setScene(new Scene(root));
            stage.show();
        }
    }


    public void valid(MouseEvent event) throws NoItemsException, NegativeSalary {
        Stage stage = (Stage) printarraylist.getScene().getWindow();
        String s = " ";
        for (int i = 0; i < c2.eng.size(); i++) {
            if (c2.eng.get(i) instanceof Engineer) {
                s += c2.printEngineer(i) + '\n';
            }
else
            s += c2.printTrainee(i) + '\n';
        }


        print.setText(s);
    }
    //print.setText(c2.printEngineer(4));
//print.setText(c2.printEngineer(3));
//print.setText(c2.printEngineer(2));


    public void gonext(MouseEvent event) throws Exception {

        Stage stage = (Stage) nextscene.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Edit.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }


    //
    @FXML
    public void addarraylist(MouseEvent event) throws Exception {


        Stage stage = (Stage) neweng.getScene().getWindow();
      try {
        int id = Integer.parseInt(idinput.getText());
        String name = nameinput.getText();
        double salary = Double.parseDouble(salaryinput.getText());
        double payrate = Double.parseDouble(payrateinput.getText());
        double taxrate = Double.parseDouble(taxrateinput.getText());
        int age = Integer.parseInt(ageinput.getText());
        String position = positioninput.getText();
        double workinghours = Double.parseDouble(workinghoursinput.getText());
if ( c2.Search(id)==1){
    throw new NoItemsException("item already exists");
}
            if (position.equals("ceo") )
                c2.add(new Ceo(id, name, age, salary, workinghours, new Grade(position, payrate, taxrate)));
            else if( position.equals("manager") )
                c2.add(new Manager(id, name, age, salary, workinghours, new Grade(position, payrate, taxrate)));
            else if (position.equals("teamleader"))
                c2.add(new TeamLeader(id, name, age, salary, workinghours, new Grade(position, payrate, taxrate)));
            else if (position.equals("teammember"))
                c2.add(new TeamMember(id, name, age, salary, workinghours, new Grade(position, payrate, taxrate)));
else
    throw new WrongPositionException("please input ceo / trainee/ manager / teamleader/ teammember");
if (id <0 ||salary<0 || payrate<0 || taxrate<0 || age <0 || workinghours<0)
    throw new NegativeSalary("please input positive numbers");
        }
        catch (NumberFormatException e)
        {
           print.setText("please insert data in the right format");
        }
      catch (WrongPositionException e){
          print.setText("please insert ceo / trainee/ manager / teamleader/ teammember in position text field");
      }
      catch (NegativeSalary e){
          print.setText("please insert positive numbers");
      }
      catch( NoItemsException e){
          print.setText("item already exists");
      }

///////////////////////////////////////////////////////////////////////////// lesa addddddddd
        //   Integer.parseInt(ageInput.getText()),

    }


    //public Ceo(int id, String name, int age, double salary, double workingHours, Grade grade)

//(0, "marwan", 28, 18000, 50, new Grade("ceo", 1.3, 2.5)

    public void Modifyarraylist(MouseEvent event)  {
        Stage stage = (Stage) Modify.getScene().getWindow();
        int id = Integer.parseInt(idinput.getText());
        String name = nameinput.getText();
        double salary = Double.parseDouble(salaryinput.getText());
        double payrate = Double.parseDouble(payrateinput.getText());
        double taxrate = Double.parseDouble(taxrateinput.getText());
        int age = Integer.parseInt(ageinput.getText());
        String position = positioninput.getText();
        double workinghours = Double.parseDouble(workinghoursinput.getText());

        try {
            if (c2.Search(id) == 0)
                throw new NoItemsException("item does not exist");

            if (position.equals("ceo") )
                c2.modify(new Ceo(id, name, age, salary, workinghours, new Grade(position, payrate, taxrate)) , id);
            else if( position.equals("manager") )
                c2.modify(new Manager(id, name, age, salary, workinghours, new Grade(position, payrate, taxrate)), id);
            else if (position.equals("teamleader"))
                c2.modify(new TeamLeader(id, name, age, salary, workinghours, new Grade(position, payrate, taxrate)), id);
            else if (position.equals("teammember"))
                c2.modify(new TeamMember(id, name, age, salary, workinghours, new Grade(position, payrate, taxrate)), id);
            else
                throw new WrongPositionException("please input ceo / trainee/ manager / teamleader/ teammember");
            if (id <0 ||salary<0 || payrate<0 || taxrate<0 || age <0 || workinghours<0)
                throw new NegativeSalary("please input positive numbers");
        }
        catch (NumberFormatException e)
        {
            print.setText("please insert data in the right format");
        }
        catch (WrongPositionException e){
            print.setText("please insert ceo / trainee/ manager / teamleader/ teammember in position text field");
        }
        catch (NegativeSalary e){
            print.setText("please insert positive numbers");
        }

        catch (NoItemsException noitems)
        {
          print.setText("no items exist");
        }

    }
    boolean flagdelete = true;
    String deletestring=" ";

    public void Removearraylist(MouseEvent event) throws Exception
    { int x;


        Stage stage = (Stage) remove.getScene().getWindow();

//            try {
           int id = Integer.parseInt(idinput.getText());


                       x= c2.delete(id);
                       if (x==0){
                           print.setText("no items to show");
                       }




                }
    }

//                }
//
//                if (flagdelete == true)
//                {
//                    throw new NoItemsException("no items to show");
//                }
//            }
//            catch (NoItemsException noitems)
//            {
//
//               // deletestring += "no items to show";
//                //.setText(deletestring);
//            }






    //if (Search((eng.get(i)).getId()) == 1) {











    //















