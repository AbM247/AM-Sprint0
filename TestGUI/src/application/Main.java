package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;  
import javafx.scene.control.ToggleGroup;  
import javafx.scene.layout.VBox;
import javafx.scene.control.CheckBox; 
import javafx.scene.shape.Line;
import javafx.scene.text.Text;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			ToggleGroup group = new ToggleGroup();
			RadioButton button1 = new RadioButton("Op 1");
			RadioButton button2 = new RadioButton("Op 2");
			button1.setToggleGroup(group);
			button2.setToggleGroup(group);
			VBox root = new VBox();
			
			
			CheckBox c1 = new CheckBox("one");
			CheckBox c2 = new CheckBox("two");
			
			Text te = new Text();
			te.setText("This is text");
			
			Line l = new Line();
			l.setStartX(50);
			l.setStartY(200);
			l.setEndX(200);
			l.setEndY(200);
			
			root.setSpacing(10);
			root.getChildren().addAll(button1,button2,c1,c2,l,te);
			
			
			Scene scene = new Scene(root,600,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
