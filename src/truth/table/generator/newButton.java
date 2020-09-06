package truth.table.generator;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
public class newButton {
    Button btn1 = new Button();
    Button btn2 = new Button();
    HBox hbox = new HBox();
    Font font = new  Font(30);
    
public newButton (String name1 , String name2){
    btn1.setText(name1);
    btn2.setText(name2);
    btn1.setFont(font);
    btn2.setFont(font);
    btn1.setPrefSize(150,150);
    btn2.setPrefSize(150,150);
    hbox.getChildren().addAll(btn1,btn2);   
}
public HBox getHBox(){
    return hbox;
}
public Button getButtonT(){
    return btn1;
}
public Button getButtonF(){
    return btn2;
}
}