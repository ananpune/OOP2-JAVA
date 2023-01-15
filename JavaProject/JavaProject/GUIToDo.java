package JavaProject;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUIToDo extends Application {
    
    public static void main (String [] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(("GUIToDoList.fxml")));
        primaryStage.setTitle("To Do List");
        primaryStage.setScene(new Scene(root, 1000, 500));
        primaryStage.show();
     
    }
}
