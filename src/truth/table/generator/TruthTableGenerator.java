package truth.table.generator;
// Importing packages
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class TruthTableGenerator extends Application {
    // Creating objects
    Button plus= new Button();
    Button equal=new Button();
    Button reset = new Button();
    TextField input = new TextField(); 
    Font font = new  Font(26);
    HBox hbox= new HBox();
    Label lbl1 = new Label("\n\t     Enter the boolean equation");
    Label lbl2 = new Label("\t\t  Truth Table\n\n");
    Label lbl3 = new Label("\n\n\n\n\n\n\n\n\t\t\tKarnaugh Map\n\n\n\n\n");
    StackPane pane = new StackPane();
    // Declaring variables
    int select1 = 0,select2 = 0,select3 = 0,select4 = 0,select5 = 0,select6 = 0,
            select7 = 0,select8 = 0,select9 = 0,select10 = 0,select11 = 0,select12 = 0
            ,select13 = 0,select14 = 0,select15 = 0,select16 = 0, maxVal =0;
    @Override
    public void start(Stage primaryStage) {
        // Setting properties
        lbl1.setStyle("-fx-font-weight: bold");
        pane.getChildren().addAll(input);
        pane.setPadding(new Insets(10,10,10,10));
        // Create buttons
        newButton A = new newButton("A","!A");
        newButton B = new newButton("B","!B");
        newButton C = new newButton("C","!C");
        newButton D = new newButton("D","!D");
        plus.setText("+");    
        equal.setText("=");
        reset.setText("Reset");
        plus.setFont(font);
        equal.setFont(font);
        reset.setFont(font);
        plus.setPrefSize(100,150);
        equal.setPrefSize(100,150);
        reset.setPrefSize(100,150);
        hbox.getChildren().addAll(plus,equal,reset);
        // Scene creation
        VBox vbox = new VBox ();
        vbox.getChildren().addAll(lbl1,pane,A.getHBox(),B.getHBox(),C.getHBox(),D.getHBox(),hbox);
        Scene scene = new Scene(vbox, 288, 832);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Truth table");
        primaryStage.setScene(scene);
        primaryStage.show();
        // Creating truth table
        lbl2.setStyle("-fx-font-weight: bold");
        lbl3.setStyle("-fx-font-weight: bold");
        truthTable truth = new truthTable("A","B","C","D","F",true);
        truthTable truth1 = new truthTable("0","0","0","0","",true);
        truthTable truth2 = new truthTable("0","0","0","1","",true);
        truthTable truth3 = new truthTable("0","0","1","0","",true);
        truthTable truth4 = new truthTable("0","0","1","1","",true);
        truthTable truth5 = new truthTable("0","1","0","0","",true);
        truthTable truth6 = new truthTable("0","1","0","1","",true);
        truthTable truth7 = new truthTable("0","1","1","0","",true);
        truthTable truth8 = new truthTable("0","1","1","1","",true);
        truthTable truth9 = new truthTable("1","0","0","0","",true);
        truthTable truth10 = new truthTable("1","0","0","1","",true);
        truthTable truth11 = new truthTable("1","0","1","0","",true);
        truthTable truth12 = new truthTable("1","0","1","1","",true);
        truthTable truth13 = new truthTable("1","1","0","0","",true);
        truthTable truth14 = new truthTable("1","1","0","1","",true);
        truthTable truth15 = new truthTable("1","1","1","0","",true);
        truthTable truth16 = new truthTable("1","1","1","1","",true);
        // Ordering result window
        VBox vbox2 = new VBox();
        vbox2.getChildren().addAll(lbl2,truth.getHBox(),truth1.getHBox(),truth2.getHBox()
                ,truth3.getHBox(),truth4.getHBox(),truth5.getHBox(),truth6.getHBox()
                ,truth7.getHBox(),truth8.getHBox(),truth9.getHBox(),truth10.getHBox()
                ,truth11.getHBox(),truth12.getHBox(),truth13.getHBox(),truth14.getHBox()
                ,truth15.getHBox(),truth16.getHBox());
        // Buttons listner
        A.getButtonT().setOnAction(e->{
            select9++; select10++; select11++;
            select12++; select13++; select14++;
            select15++; select16++;
            input.setText(input.getText()+"A");
            A.getButtonT().setDisable(true);
            A.getButtonF().setDisable(true);
            equal.setDisable(false);
        });
        A.getButtonF().setOnAction(e->{
            select1++; select2++; select3++;
            select4++; select5++; select6++;
            select7++; select8++;
            input.setText(input.getText()+"A*");
            A.getButtonT().setDisable(true);
            A.getButtonF().setDisable(true);       
            equal.setDisable(false);
        });
        B.getButtonT().setOnAction(e->{
            select5++; select6++; select7++;
            select8++; select13++; select14++;
            select15++; select16++;
            input.setText(input.getText()+"B");
            B.getButtonT().setDisable(true);
            B.getButtonF().setDisable(true);
            equal.setDisable(false);
        });
        B.getButtonF().setOnAction(e->{
            select1++; select2++; select3++;
            select4++; select9++; select10++;
            select11++; select12++;
            input.setText(input.getText()+"B*");
            B.getButtonT().setDisable(true);
            B.getButtonF().setDisable(true);
            equal.setDisable(false);
        });
        C.getButtonT().setOnAction(e->{
            select3++; select4++; select7++;
            select8++; select11++; select12++;
            select15++; select16++;
            input.setText(input.getText()+"C");
            C.getButtonT().setDisable(true);
            C.getButtonF().setDisable(true);
            equal.setDisable(false);
        });
        C.getButtonF().setOnAction(e->{
            select1++; select2++; select5++;
            select6++; select9++; select10++;
            select13++; select14++;
            input.setText(input.getText()+"C*");
            C.getButtonT().setDisable(true);
            C.getButtonF().setDisable(true);
            equal.setDisable(false);
        });
        D.getButtonT().setOnAction(e->{
            select2++; select4++; select6++;
            select8++; select10++; select12++;
            select14++; select16++;
            input.setText(input.getText()+"D");
            D.getButtonT().setDisable(true);
            D.getButtonF().setDisable(true);
            equal.setDisable(false);
        });
        D.getButtonF().setOnAction(e->{
            select1++; select3++; select5++;
            select7++; select9++; select11++;
            select13++; select15++;
            input.setText(input.getText()+"D*");
            D.getButtonT().setDisable(true);
            D.getButtonF().setDisable(true);
            equal.setDisable(false);
        });
        // plus button action
        plus.setOnAction(e->{
            int Select[]={select1,select2,select3,select4,select5,select6,
            select7,select8,select9,select10,select11,select12
            ,select13,select14,select15,select16};
            // Calculating the most selected column
            for (int i = 1; i < Select.length; i++)
            {
            if (Select[i] > maxVal)
            {
             maxVal = Select[i];
            }}
            if (select1 == maxVal) truth1.getLbl5().setText("  1");
            if (select2 == maxVal) truth2.getLbl5().setText("  1");
            if (select3 == maxVal) truth3.getLbl5().setText("  1");
            if (select4 == maxVal) truth4.getLbl5().setText("  1");
            if (select5 == maxVal) truth5.getLbl5().setText("  1");
            if (select6 == maxVal) truth6.getLbl5().setText("  1");
            if (select7 == maxVal) truth7.getLbl5().setText("  1");
            if (select8 == maxVal) truth8.getLbl5().setText("  1");
            if (select9 == maxVal) truth9.getLbl5().setText("  1");
            if (select10 == maxVal) truth10.getLbl5().setText("  1");
            if (select11 == maxVal) truth11.getLbl5().setText("  1");
            if (select12 == maxVal) truth12.getLbl5().setText("  1");
            if (select13 == maxVal) truth13.getLbl5().setText("  1");
            if (select14 == maxVal) truth14.getLbl5().setText("  1");
            if (select15 == maxVal) truth15.getLbl5().setText("  1");
            if (select16 == maxVal) truth16.getLbl5().setText("  1");
            select1 = 0;
            select2 = 0;
            select3 = 0;
            select4 = 0;
            select5 = 0;
            select6 = 0;
            select7 = 0;
            select8 = 0;
            select9 = 0;
            select10 = 0;
            select11 = 0;
            select12 = 0;
            select13 = 0;
            select14 = 0;
            select15 = 0;
            select16 = 0;
            maxVal =0;
            A.getButtonT().setDisable(false);A.getButtonF().setDisable(false);
            B.getButtonT().setDisable(false);B.getButtonF().setDisable(false);
            C.getButtonT().setDisable(false);C.getButtonF().setDisable(false);
            D.getButtonT().setDisable(false);D.getButtonF().setDisable(false);
            equal.setDisable(true);
            input.setText(input.getText()+"+");
        });
        equal.setOnAction(e->{
            int Select[]={select1,select2,select3,select4,select5,select6,
            select7,select8,select9,select10,select11,select12
            ,select13,select14,select15,select16};
            for (int i = 1; i < Select.length; i++)
            {
            if (Select[i] > maxVal)
            {
             maxVal = Select[i];
            }}
            System.out.println(maxVal);
            if(select1 == 0&select2 == 0&select3 == 0&select4 == 0&select5 == 0&select6 == 0&
            select7 == 0&select8 == 0&select9 == 0&select10 == 0&select11 == 0&select12 == 0
            &select13 == 0&select14 == 0&select15 == 0&select16 == 0&maxVal ==0)
            {
                truth1.getLbl5().setText("  0");
                truth2.getLbl5().setText("  0");
                truth3.getLbl5().setText("  0");
                truth4.getLbl5().setText("  0");
                truth5.getLbl5().setText("  0");
                truth6.getLbl5().setText("  0");
                truth7.getLbl5().setText("  0");
                truth8.getLbl5().setText("  0");
                truth9.getLbl5().setText("  0");
                truth10.getLbl5().setText("  0");
                truth11.getLbl5().setText("  0");
                truth12.getLbl5().setText("  0");
                truth13.getLbl5().setText("  0");
                truth14.getLbl5().setText("  0");
                truth15.getLbl5().setText("  0");
                truth16.getLbl5().setText("  0");
            }
            else{
            if (select1 == maxVal) truth1.getLbl5().setText("  1");
            if (select2 == maxVal) truth2.getLbl5().setText("  1");
            if (select3 == maxVal) truth3.getLbl5().setText("  1");
            if (select4 == maxVal) truth4.getLbl5().setText("  1");
            if (select5 == maxVal) truth5.getLbl5().setText("  1");
            if (select6 == maxVal) truth6.getLbl5().setText("  1");
            if (select7 == maxVal) truth7.getLbl5().setText("  1");
            if (select8 == maxVal) truth8.getLbl5().setText("  1");
            if (select9 == maxVal) truth9.getLbl5().setText("  1");
            if (select10 == maxVal) truth10.getLbl5().setText("  1");
            if (select11 == maxVal) truth11.getLbl5().setText("  1");
            if (select12 == maxVal) truth12.getLbl5().setText("  1");
            if (select13 == maxVal) truth13.getLbl5().setText("  1");
            if (select14 == maxVal) truth14.getLbl5().setText("  1");
            if (select15 == maxVal) truth15.getLbl5().setText("  1");
            if (select16 == maxVal) truth16.getLbl5().setText("  1");
            }
            // Complete the truth table with zeroes
            if (truth1.getLbl5().getText() != "  1") truth1.getLbl5().setText("  0");
            if (truth2.getLbl5().getText() != "  1") truth2.getLbl5().setText("  0");
            if (truth3.getLbl5().getText() != "  1") truth3.getLbl5().setText("  0");
            if (truth4.getLbl5().getText() != "  1") truth4.getLbl5().setText("  0");
            if (truth5.getLbl5().getText() != "  1") truth5.getLbl5().setText("  0");
            if (truth6.getLbl5().getText() != "  1") truth6.getLbl5().setText("  0");
            if (truth7.getLbl5().getText() != "  1") truth7.getLbl5().setText("  0");
            if (truth8.getLbl5().getText() != "  1") truth8.getLbl5().setText("  0");
            if (truth9.getLbl5().getText() != "  1") truth9.getLbl5().setText("  0");
            if (truth10.getLbl5().getText() != "  1") truth10.getLbl5().setText("  0");
            if (truth11.getLbl5().getText() != "  1") truth11.getLbl5().setText("  0");
            if (truth12.getLbl5().getText() != "  1") truth12.getLbl5().setText("  0");
            if (truth13.getLbl5().getText() != "  1") truth13.getLbl5().setText("  0");
            if (truth14.getLbl5().getText() != "  1") truth14.getLbl5().setText("  0");
            if (truth15.getLbl5().getText() != "  1") truth15.getLbl5().setText("  0");
            if (truth16.getLbl5().getText() != "  1") truth16.getLbl5().setText("  0");
            // Creating K_Map
            truthTable K1 = new truthTable(truth1.getLbl5().getText(),truth5.getLbl5().getText(),truth13.getLbl5().getText(),truth9.getLbl5().getText(),"",false);
            truthTable K2 = new truthTable(truth2.getLbl5().getText(),truth6.getLbl5().getText(),truth14.getLbl5().getText(),truth10.getLbl5().getText(),"",false);
            truthTable K3 = new truthTable(truth4.getLbl5().getText(),truth8.getLbl5().getText(),truth16.getLbl5().getText(),truth12.getLbl5().getText(),"",false);
            truthTable K4 = new truthTable(truth3.getLbl5().getText(),truth7.getLbl5().getText(),truth15.getLbl5().getText(),truth11.getLbl5().getText(),"",false);
            VBox KVBox = new VBox();
            KVBox.getChildren().addAll(lbl3,K1.getHBox(),K2.getHBox(),K3.getHBox(),K4.getHBox());
            HBox result = new HBox(50);
            result.getChildren().addAll(vbox2,KVBox);
            result.setPadding(new Insets(5,5,5,5));
            Scene resultScene = new Scene(result,575,843);
            Stage resultStage = new Stage();    
            resultStage.setResizable(false);
            resultStage.setTitle("Result");
            resultStage.setScene(resultScene);
            resultStage.show();
            // Resetting
            A.getButtonT().setDisable(false);A.getButtonF().setDisable(false);
            B.getButtonT().setDisable(false);B.getButtonF().setDisable(false);
            C.getButtonT().setDisable(false);C.getButtonF().setDisable(false);
            D.getButtonT().setDisable(false);D.getButtonF().setDisable(false);
            select1 = 0;
            select2 = 0;
            select3 = 0;
            select4 = 0;
            select5 = 0;
            select6 = 0;
            select7 = 0;
            select8 = 0;
            select9 = 0;
            select10 = 0;
            select11 = 0;
            select12 = 0;
            select13 = 0;
            select14 = 0;
            select15 = 0;
            select16 = 0;
            maxVal =0;
        });  
        reset.setOnAction(e->{
            A.getButtonT().setDisable(false);A.getButtonF().setDisable(false);
            B.getButtonT().setDisable(false);B.getButtonF().setDisable(false);
            C.getButtonT().setDisable(false);C.getButtonF().setDisable(false);
            D.getButtonT().setDisable(false);D.getButtonF().setDisable(false);
            input.setText("");
            select1 = 0;
            select2 = 0;
            select3 = 0;
            select4 = 0;
            select5 = 0;
            select6 = 0;
            select7 = 0;
            select8 = 0;
            select9 = 0;
            select10 = 0;
            select11 = 0;
            select12 = 0;
            select13 = 0;
            select14 = 0;
            select15 = 0;
            select16 = 0;
            maxVal =0;
        });
    }
    public static void main(String[] args) {
        launch(args);
    }
}