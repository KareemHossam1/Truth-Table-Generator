package truth.table.generator;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
public class truthTable {
    Label lbl1 = new Label();
    Label lbl2 = new Label();
    Label lbl3 = new Label();
    Label lbl4 = new Label();
    Label lbl5 = new Label();
    Font font = new  Font(30);
    HBox hbox = new HBox();
public truthTable (String A , String B , String C , String D , String F , boolean truth){
        if (truth==true){
            lbl1.setMinWidth(45);
            lbl1.setMinHeight(45);
            lbl2.setMinWidth(45);
            lbl2.setMinHeight(45);
            lbl3.setMinWidth(45);
            lbl3.setMinHeight(45);
            lbl4.setMinWidth(45);
            lbl4.setMinHeight(45);
            lbl5.setMinWidth(45);
            lbl5.setMinHeight(45);
            lbl1.setStyle("-fx-border-color: black;");
            lbl2.setStyle("-fx-border-color: black;");
            lbl3.setStyle("-fx-border-color: black;");
            lbl4.setStyle("-fx-border-color: black;");
            lbl5.setStyle("-fx-border-color: black;");
            lbl1.setText("  "+A);
            lbl2.setText("  "+B);
            lbl3.setText("  "+C);
            lbl4.setText("  "+D);
            lbl5.setText("  "+F);
            lbl1.setFont(font);
            lbl2.setFont(font);
            lbl3.setFont(font);
            lbl4.setFont(font);
            lbl5.setFont(font);
            hbox.getChildren().addAll(lbl1,lbl2,lbl3,lbl4,lbl5);}
        else
        {
            lbl1.setMinWidth(75);
            lbl1.setMinHeight(75);
            lbl2.setMinWidth(75);
            lbl2.setMinHeight(75);
            lbl3.setMinWidth(75);
            lbl3.setMinHeight(75);
            lbl4.setMinWidth(75);
            lbl4.setMinHeight(75);
            lbl1.setStyle("-fx-border-color: black;");
            lbl2.setStyle("-fx-border-color: black;");
            lbl3.setStyle("-fx-border-color: black;");
            lbl4.setStyle("-fx-border-color: black;");
            lbl1.setText("  "+A);
            lbl2.setText("  "+B);
            lbl3.setText("  "+C);
            lbl4.setText("  "+D);
            lbl1.setFont(font);
            lbl2.setFont(font);
            lbl3.setFont(font);
            lbl4.setFont(font);
            hbox.getChildren().addAll(lbl1,lbl2,lbl3,lbl4);
        }
}
public HBox getHBox(){
    return hbox;
}
public Label getLbl5(){
    return lbl5;
}
}