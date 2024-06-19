package com.example.minipayrollgui;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static javafx.application.Application.launch;

public class HelloApplication extends Application  {
    @FXML
    private TableView<Engineer> tableView;

    public void start(Stage stage) throws IOException {

        //     Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Mini-payroll");
        stage.setScene(scene);
        stage.setFullScreen(true);

        //stage.setScene(new Scene());
        stage.setFullScreen(true);
        stage.show();
    }


//        //Name column
//        TableColumn<Engineer, String> nameColumn = new TableColumn<>("Name");
//        nameColumn.setMinWidth(200);
//        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        //Price column
//        TableColumn<Engineer, Double> priceColumn = new TableColumn<>("id");
//        priceColumn.setMinWidth(100);
//        priceColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
//
//        tableView = new TableView<>();
//        tableView.setItems(getlist());
//        tableView.getColumns().addAll(nameColumn, priceColumn);
//
//        VBox vBox = new VBox();
//        vBox.getChildren().addAll(tableView);


//    Scene scene = new Scene(vBox);
//        stage.setScene(scene);
//        stage.show();



//    public ObservableList<Engineer> getlist() {
//        ObservableList<Engineer> list =
//                FXCollections.observableArrayList();
//        Company c1 = new Company();
//        c1.add(new Ceo(0, "marwan", 28, 18000, 50, new Grade("ceo", 1.3, 2.5)));
//
//        c1.add(new Manager(1, "zeina", 20, 10000, 30, new Grade("manager", 1.1, 2.1)));
//        list.add((Engineer)c1.eng.get(0));
//        list.add((Engineer)c1.eng.get(1));
//
//
//
//
//        return list;
//
//    }








//minipayroll
// Mazen Mohamed Elsaied 20P5893
// Farida Mohamed Elhusseiny 20P6022
//Hassan Mohamed Mohamed Fathi Eltobgy 20P6173
//Zeina Hesham Ahmed 2000320
//Mariam Diaa Elden Nady 20P3536



/**
 *
 * @author user
 */
//minipayroll
// Mazen Mohamed Elsaied 20P5893
// Farida Mohamed Elhusseiny 20P6022
//Hassan Mohamed Mohamed Fathi Eltobgy 20P6173
//Zeina Hesham Ahmed 2000320
//Mariam Diaa Elden Nady 20P3536


            /**
             * @param args the command line arguments
             */
            public static void main(String[] args) throws NoItemsException, NegativeSalary {







char c;
int x;


                Scanner sc = new Scanner(System.in);
      Company com = new Company();
                String deletestr;
                Admin ad= new Admin();
                ad.addd(new Trainee(2, "faridaa", 30, 270099 , "ainshams", 2027, 2.8f),com);
                ad.addd(new Trainee(3, "john", 23, 2700 , "arizona", 2025, 2.8f),com);
                ad.addd(new Ceo(0, "marwan", 28, 18000, 50, new Grade("ceo", 1.3, 2.5)),com);
                ad.addd(new Manager(1, "zeina", 20, 10000, 30, new Grade("manager", 1.1, 2.1)),com);
                ad.addd(new TeamLeader(5, "mazen", 27, 60000, 30, new Grade("teamleader", 0.7, 1.8)),com);
                ad.addd(new TeamMember(8, "amira", 25, 1000, 20, new Grade("teammember", 0.7, 1.8)),com);

                launch(args);
                for (int i = 0; i < 10; i++) {
                    boolean flagdelete=true;
                    boolean f= true;

                  try {
                      System.out.println("Enter 0 for adding new item , 1 for editing ,2 for removing, 3 for calculating salary , 4 for printing, 5 for exit");
                       x = sc.nextInt();

                  }
                  catch (InputMismatchException in){
                      System.out.println("please input a number from 0 to 5 ");
                      sc.next();
                      continue;


                    }
                    double salary;
                    double oldsalary;
                    double newsalary;


                    switch (x) {
                        //add
                        case 0: {
                            boolean flagg= true;
                            while (flagg==true) {
                                try {
                                    System.out.println("Enter T for trainee , C for ceo, M for manager , L for team leader , m for team member");
                                    c = sc.next().charAt(0);
                                    if (c != 'T' && c != 'C' && c != 'M' && c != 'L' && c != 'm')
                                        throw new InputMismatchExceptionchar("please input a character");
                                    else {
                                        switch (c) {

                                            case 'T': {
                                                try {
                                                    System.out.println("Enter id");
                                                    int id = sc.nextInt();
                                                    if (com.Search(id) == 0)
                                                    {
                                                        System.out.println("Enter university name");
                                                        String uniname = sc.next();
                                                        System.out.println("Enter academic year");
                                                        int year = sc.nextInt();
                                                        System.out.println("Enter gpa");
                                                        float gpa = sc.nextFloat();

                                                        System.out.println("Enter name");
                                                        String name = sc.next();
                                                        System.out.println("Enter age");
                                                        int age = sc.nextInt();
                                                        salary = new Trainee().calcSalary();
                                                        if (salary != -1)
                                                            ad.addd(new Trainee(id, name, age, salary, uniname, year, gpa), com);
                                                    }
                                                    else throw new NoItemsException("item already exists");
                                                } catch (NoItemsException n) {
                                                    System.out.println(n.getMessage());
                                                }
                                            }

                                            break;
                                            case 'C': {
                                                try {
                                                    System.out.println("Enter id");
                                                    int id = sc.nextInt();
                                                    if (com.Search(id) == 0) {
                                                        System.out.println("Enter working hours");
                                                        double w = sc.nextDouble();
                                                        System.out.println("Enter tax Rate");
                                                        double taxrate = sc.nextDouble();
                                                        System.out.println("Enter payrate");
                                                        double payrate = sc.nextDouble();

                                                        System.out.println("Enter name");
                                                        String name = sc.next();
                                                        System.out.println("Enter age");
                                                        int age = sc.nextInt();
                                                        salary = new Ceo(id, name, age, w, new Grade("ceo", taxrate, payrate)).calcSalary();
                                                        if (salary != -1)
                                                            ad.addd(new Ceo(id, name, age, salary, w, new Grade("ceo", taxrate, payrate)), com);
                                                    } else throw new NoItemsException("item already exists");
                                                } catch (NoItemsException n) {
                                                    System.out.println(n.getMessage());
                                                }

                                            }
                                            break;

                                            case 'M': {
                                                try {
                                                    System.out.println("Enter id");
                                                    int id = sc.nextInt();
                                                    if (com.Search(id) == 0) {
                                                        System.out.println("Enter working hours");
                                                        double w = sc.nextDouble();
                                                        System.out.println("Enter tax Rate");
                                                        double taxrate = sc.nextDouble();
                                                        System.out.println("Enter payrate");
                                                        double payrate = sc.nextDouble();

                                                        System.out.println("Enter name");
                                                        String name = sc.next();
                                                        System.out.println("Enter age");
                                                        int age = sc.nextInt();
                                                        salary = new Manager(id, name, age, w, new Grade("manager", taxrate, payrate)).calcSalary();
                                                        if (salary != -1)
                                                            ad.addd(new Manager(id, name, age, salary, w, new Grade("manager", taxrate, payrate)), com);
                                                    } else throw new NoItemsException("item already exists");
                                                } catch (NoItemsException n) {
                                                    System.out.println(n.getMessage());

                                                }
                                            }

                                            break;
                                            case 'L': {
                                                try {
                                                    System.out.println("Enter id");
                                                    int id = sc.nextInt();
                                                    if (com.Search(id) == 0) {
                                                        System.out.println("Enter working hours");
                                                        double w = sc.nextDouble();
                                                        System.out.println("Enter tax Rate");
                                                        double taxrate = sc.nextDouble();
                                                        System.out.println("Enter payrate");
                                                        double payrate = sc.nextDouble();

                                                        System.out.println("Enter name");
                                                        String name = sc.next();
                                                        System.out.println("Enter age");
                                                        int age = sc.nextInt();
                                                        salary = new TeamLeader(id, name, age, w, new Grade("teamleader", taxrate, payrate)).calcSalary();
                                                        if (salary != -1)
                                                            ad.addd(new TeamLeader(id, name, age, salary, w, new Grade("teamleader", taxrate, payrate)), com);
                                                    } else throw new NoItemsException("item already exists");
                                                } catch (NoItemsException n) {
                                                    System.out.println(n.getMessage());
                                                }
                                            }
                                            break;
                                            case 'm': {
                                                try {
                                                    System.out.println("Enter id");
                                                    int id = sc.nextInt();
                                                    if (com.Search(id) == 0) {
                                                        System.out.println("Enter working hours");
                                                        double w = sc.nextDouble();
                                                        System.out.println("Enter tax Rate");
                                                        double taxrate = sc.nextDouble();
                                                        System.out.println("Enter payrate");
                                                        double payrate = sc.nextDouble();

                                                        System.out.println("Enter name");
                                                        String name = sc.next();
                                                        System.out.println("Enter age");
                                                        int age = sc.nextInt();
                                                        salary = new TeamMember(id, name, age, w, new Grade("teammember", taxrate, payrate)).calcSalary();
                                                        if (salary != -1)
                                                            ad.addd(new TeamMember(id, name, age, salary, w, new Grade("teammember", taxrate, payrate)), com);
                                                    } else throw new NoItemsException("item already exists");

                                                } catch (NoItemsException n) {
                                                    System.out.println(n.getMessage());
                                                }

                                            }
                                            break;

                                        }

                                        flagg=false;

                                    }
                                }

                                catch (InputMismatchExceptionchar in) {
                                    System.out.println("please input a character ");
                                    sc.next();
                                    flagg=true;
                                }

                            }
                        }
                                break;


                        //modify
                        case 1:

                        {
                            boolean flagg= true;
                            while (flagg==true) {
                            try {
                            System.out.println("Enter T for trainee , C for ceo, M for manager , L for team leader , m for team member");
                            c = sc.next().charAt(0);
                            if (c != 'T' && c != 'C' && c != 'M' && c != 'L' && c != 'm')
                                throw new InputMismatchExceptionchar("please input a character");
                            else {
                            switch (c) {
                                case 'T': {
                                    System.out.println("Enter id for trainee to be modified");
                                    int id = sc.nextInt();
                                    try {
                                        if (com.Search(id) == 0)
                                            throw new NoItemsException("item does not exist");

                                        else {
                                            System.out.println("Enter new university name");
                                            String newUniName = sc.next();
                                            System.out.println("Enter new  academic year");
                                            int newyear = sc.nextInt();
                                            System.out.println("Enter new gpa");
                                            float newgpa = sc.nextFloat();
                                            System.out.println("Enter new id");
                                            int newid = sc.nextInt();
                                            System.out.println("Enter new name");
                                            String newname = sc.next();
                                            System.out.println("Enter new age");
                                            int newage = sc.nextInt();
                                            newsalary = new Trainee().calcSalary();
                                            ad.editt((new Trainee(newid, newname, newage, newsalary, newUniName, newyear, newgpa)), com, id);
                                        }
                                    } catch (NoItemsException noitems) {
                                        System.out.println(noitems.getMessage());
                                    }

                                        //////



                                }
                                break;
                                case 'C': {
                                    System.out.println("Enter id for ceo to be modified");
                                    int id = sc.nextInt();
                                    try {
                                        if (com.Search(id) == 0)
                                            throw new NoItemsException("item does not exist");
                                        else {
                                            System.out.println("Enter new working hours for new ceo");
                                            double neww = sc.nextDouble();
                                            System.out.println("Enter new position");
                                            String newposition = sc.next();
                                            System.out.println("Enter new tax Rate");
                                            double newtaxrate = sc.nextDouble();
                                            System.out.println("Enter new payrate");
                                            double newpayrate = sc.nextDouble();
                                            System.out.println("Enter new id");
                                            int newid = sc.nextInt();
                                            System.out.println("Enter new name");
                                            String newname = sc.next();
                                            System.out.println("Enter new age");
                                            int newage = sc.nextInt();
                                            newsalary = new Ceo(id, newname, newage, neww, new Grade("ceo", newtaxrate, newpayrate)).calcSalary();
                                            if (newsalary!=-1)
                                                ad.editt(new Ceo(newid, newname, newage, newsalary, neww, new Grade(newposition, newtaxrate, newpayrate)), com, id);


                                        }
                                    } catch (NoItemsException noitems) {
                                        System.out.println(noitems.getMessage());
                                    }

                                    /////


                                }
                                break;

                                case 'M': {

                                    System.out.println("Enter id for manager to be modified");
                                    int id = sc.nextInt();
                                    try {
                                        if (com.Search(id) == 0)
                                            throw new NoItemsException("item does not exist");

                                        else {
                                            System.out.println("Enter new working hours for new manager");
                                            double neww = sc.nextDouble();
                                            System.out.println("Enter new position");
                                            String newposition = sc.next();
                                            System.out.println("Enter new tax Rate");
                                            double newtaxrate = sc.nextDouble();
                                            System.out.println("Enter new payrate");
                                            double newpayrate = sc.nextDouble();
                                            System.out.println("Enter new id");
                                            int newid = sc.nextInt();
                                            System.out.println("Enter new name");
                                            String newname = sc.next();
                                            System.out.println("Enter new age");
                                            int newage = sc.nextInt();
                                            newsalary = new Manager(id, newname, newage, neww, new Grade("manager", newtaxrate, newpayrate)).calcSalary();
                                            if (newsalary!=-1)
                                                ad.editt(new Manager(newid, newname, newage, newsalary, neww, new Grade(newposition, newtaxrate, newpayrate)), com, id);

                                        }
                                    } catch (NoItemsException noitems) {
                                        System.out.println(noitems.getMessage());
                                    }
                                    //////


                                }

                                break;
                                case 'L': {

                                    System.out.println("Enter id for team leader to be modified");
                                    int id = sc.nextInt();
                                    try {
                                        if (com.Search(id) == 0)
                                            throw new NoItemsException("item does not exist");
                                        else {
                                            System.out.println("Enter new working hours for new teamleader");
                                            double neww = sc.nextDouble();
                                            System.out.println("Enter new position");
                                            String newposition = sc.next();
                                            System.out.println("Enter new tax Rate");
                                            double newtaxrate = sc.nextDouble();
                                            System.out.println("Enter new payrate");
                                            double newpayrate = sc.nextDouble();
                                            System.out.println("Enter new id");
                                            int newid = sc.nextInt();
                                            System.out.println("Enter new name");
                                            String newname = sc.next();
                                            System.out.println("Enter new age");
                                            int newage = sc.nextInt();
                                            newsalary = new TeamLeader(id, newname, newage, neww, new Grade("teamleader", newtaxrate, newpayrate)).calcSalary();
                                            if (newsalary!=-1)
                                                ad.editt(new TeamLeader(newid, newname, newage, newsalary, neww, new Grade(newposition, newtaxrate, newpayrate)), com, id);


                                        }
                                    } catch (NoItemsException noitems) {
                                        System.out.println(noitems.getMessage());
                                    }
                                    ////


                                }

                                break;
                                case 'm': {

                                    System.out.println("Enter id for team member to be modified");
                                    int id = sc.nextInt();
                                    try {
                                        if (com.Search(id) == 0)
                                            throw new NoItemsException("item does not exist");
                                        else {

                                            System.out.println("Enter new working hour for new team member");
                                            double neww = sc.nextDouble();
                                            System.out.println("Enter new position");
                                            String newposition = sc.next();
                                            System.out.println("Enter new tax Rate");
                                            double newtaxrate = sc.nextDouble();
                                            System.out.println("Enter new payrate");
                                            double newpayrate = sc.nextDouble();
                                            System.out.println("Enter new id");
                                            int newid = sc.nextInt();
                                            System.out.println("Enter new name");
                                            String newname = sc.next();
                                            System.out.println("Enter new age");
                                            int newage = sc.nextInt();
                                            newsalary = new TeamMember(id, newname, newage, neww, new Grade("teammember", newtaxrate, newpayrate)).calcSalary();
                                            if (newsalary!=-1)
                                                ad.editt(new TeamMember(newid, newname, newage, newsalary, neww, new Grade(newposition, newtaxrate, newpayrate)), com, id);
                                        }
                                    } catch (NoItemsException noitems) {
                                        System.out.println(noitems.getMessage());       //
                                    }
                                    ////

                                }
                                break;

                            }
                        break;
                        } }
                            catch (InputMismatchExceptionchar in) {
                                System.out.println("please input a character ");
                                sc.next();
                                flagg=true;
                            }  } }

                     break;
//delete
                        case 2: {

                            boolean flagg= true;
                            while (flagg==true) {
                                try {
                                    System.out.println("Enter T for trainee , C for ceo, M for manager , L for team leader , m for team member");
                                    c = sc.next().charAt(0);
                                    if (c != 'T' && c != 'C' && c != 'M' && c != 'L' && c != 'm')
                                        throw new InputMismatchExceptionchar("please input a character");
                                    else {

                                        switch (c) {

                                            case 'T': {

                                                System.out.println("Enter id for trainee to be deleted");
                                                int id = sc.nextInt();
                                                ad.deletee(com, id);

                                            }
                                            break;
                                            case 'C': {

                                                System.out.println("Enter id for ceo to be deleted");

                                                int id = sc.nextInt();
                                                ad.deletee(com, id);

                                            }
                                            break;

                                            case 'M': {


                                                System.out.println("Enter id for manager to be deleted");
                                                int id = sc.nextInt();
                                                ad.deletee(com, id);

                                            }


                                            break;
                                            case 'L': {

                                                System.out.println("Enter id for team leader to be deleted");
                                                int id = sc.nextInt();
                                                ad.deletee(com, id);

                                            }


                                            break;
                                            case 'm': {

                                                System.out.println("Enter id for team member to be deleted");
                                                int id = sc.nextInt();
                                                ad.deletee(com, id);

                                            }

                                            break;
                                        }
                                        flagg=false; }
                                    }

                                catch (InputMismatchExceptionchar in) {
                                    System.out.println("please input a character ");
                                    sc.next();
                                    flagg=true;
                                }  } }
                        break;

                        //calcsalary
                        case 3: {
                            Employee e;
                            boolean flagg= true;
                            while (flagg==true) {
                            try {
                                System.out.println("Enter T for trainee , C for ceo, M for manager , L for team leader , m for team member");
                                c = sc.next().charAt(0);
                                if (c != 'T' && c != 'C' && c != 'M' && c != 'L' && c != 'm')
                                    throw new InputMismatchExceptionchar("please input a character");
                                else {

                            switch (c) {
                                case 'T': {
                                    e = new Trainee();

                                    salary = ad.calcsalary(e);
                                    if (salary!=-1)
                                    System.out.println("salary is" + salary);
                                }
                                break;
                                case 'C': {
                                    System.out.println("Enter working hours ");
                                    double workinghours = sc.nextDouble();
                                    System.out.println("Enter tax Rate");
                                    double taxrate = sc.nextDouble();
                                    System.out.println("Enter payrate");
                                    double payrate = sc.nextDouble();
                                    e = new Ceo( new Grade (taxrate, payrate), workinghours);
                                    salary = ad.calcsalary(e);
                                    if (salary!=-1)
                                    System.out.println("salary is" + salary);
                                }
                                break;
                                case 'M': {
                                    System.out.println("Enter working hours ");
                                    double workinghours = sc.nextDouble();
                                    System.out.println("Enter tax Rate");
                                    double taxrate = sc.nextDouble();
                                    System.out.println("Enter payrate");
                                    double payrate = sc.nextDouble();
                                    e = new Manager( new Grade (taxrate, payrate), workinghours);

                                    salary = ad.calcsalary(e);
                                    if (salary!=-1)
                                    System.out.println("salary is" + salary);
                                }
                                break;
                                case 'L': {
                                    System.out.println("Enter working hours ");
                                    double workinghours = sc.nextDouble();
                                    System.out.println("Enter tax Rate");
                                    double taxrate = sc.nextDouble();
                                    System.out.println("Enter payrate");
                                    double payrate = sc.nextDouble();
                                    e = new TeamLeader( new Grade (taxrate, payrate), workinghours);
                                    salary = ad.calcsalary(e);
                                    if (salary!=-1)
                                    System.out.println("salary is" + salary);
                                }
                                break;
                                case 'm': {
                                    System.out.println("Enter working hours ");
                                    double workinghours = sc.nextDouble();
                                    System.out.println("Enter tax Rate");
                                    double taxrate = sc.nextDouble();
                                    System.out.println("Enter payrate");
                                    double payrate = sc.nextDouble();
                                    e = new TeamMember( new Grade (taxrate, payrate), workinghours);
                                    salary = ad.calcsalary(e);
                                    if (salary!=-1)
                                    System.out.println("salary is" + salary);
                                }
                                break;


                            }
                                    flagg=false;
                        } }
                                    catch (InputMismatchExceptionchar in) {
                                    System.out.println("please input a character ");
                                    sc.next();
                                    flagg=true;
                                }   }}
                        break;
                        //print

                        case 4:
                        {      boolean flagg= true;
                            while (flagg==true) {
                                try {
                                    System.out.println("Enter T for trainee , E to print all engineers");
                                    c = sc.next().charAt(0);
                                    if (c != 'T' && c != 'E')
                                        throw new InputMismatchExceptionchar("please input a character");
                                    else {

                            switch (c) {
                                case 'T':
                                {
                                    System.out.println("list of trainees" +'\n');
                                    for (int j=0;j<com.eng.size();j++)
                                    {   if (com.eng.get(j) instanceof Trainee)
                                    ad.printTraineee(com, j); }
}

                                    break;
                                case 'E':
                                { System.out.println("list of engineers"+'\n');
                                    for (int j=0;j<com.eng.size();j++)
                                    {  if (com.eng.get(j) instanceof Engineer)
                                    ad.printEng(com, j); } }
                                    break;

                            }

                            flagg=false;  } }

                                catch (InputMismatchExceptionchar in) {
                                    System.out.println("please input a character ");
                                    sc.next();
                                    flagg=true;
                                }   }}



                        break;
                        case 5:
                            System.out.println("exit...");

                            // Terminate JVM
                            System.exit(0);

                    }
                }
            }
        }










// TODO code application logic here










