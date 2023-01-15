package JavaProject;



import java.io.File;
import java.io.PrintWriter;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


public class GUIController {

    public void initialize(){
        dateChoice.setValue(LocalDate.now());
    }

  
    @FXML
    Button addButton;
    @FXML
    TextField taskEntryField;

    @FXML
    DatePicker dateChoice;

    @FXML
    ListView<Task> tasksView;
    ObservableList<Task> tasks = FXCollections.observableArrayList();

    @FXML
    public void addTask(ActionEvent event) {
        //creating a new Task item
        Task newTask = new Task(dateChoice.getValue(), taskEntryField.getText());
        tasks.add(newTask);
        //clears the entry field after user input
        taskEntryField.clear();
        //show today's date
        dateChoice.setValue(LocalDate.now());

        //sets what the user sees on the ListView
        tasksView.setItems(tasks);
    }

    @FXML
    public void removeTask(ActionEvent event) {

        //easy remove from the ListView
        tasks.remove(tasksView.getSelectionModel().getSelectedItem());
    }

    @FXML
    private void completeTask(ActionEvent event) {

        //adds a COMPLETED to the end of the task and gives the date of completion
        Task newTask = tasksView.getSelectionModel().getSelectedItem();
        Task doneTask;
        tasks.remove(tasksView.getSelectionModel().getSelectedItem());
        doneTask = new Task(newTask.getDate(), newTask.getTask() + " COMPLETED ON " + LocalDate.now());
        tasks.add(doneTask);
        taskEntryField.clear();
        dateChoice.setValue(LocalDate.now());
        tasksView.setItems(tasks);
    }

    @FXML
    private void saveTasks(String fileName, String taskToSave){
        //function to save our tasks as their toString shows
        File file=new File(fileName);
        try(PrintWriter printWriter = new PrintWriter(file)){
            printWriter.println(taskToSave);
        }catch(Exception e){
            System.out.println("File Error");
        }
      
    }


    @FXML private void saveObject(File file, ArrayList<Task> tasks){
        //function to save our tasks as their Object parameters show
        try(PrintWriter printWriter = new PrintWriter(file)){
            for(Task task: tasks){
                printWriter.println(task.getDate() + " " + task.getTask());
            }
        }catch(Exception e){
            System.out.println("File Error");
        }
    }
    

    @FXML
    private void saveButton(ActionEvent event) {
        //doing two functions within a button
        String taskToSave = "";
        for (Task task : tasks) {
            taskToSave += task.toString() + "\n";
        }
        //saving our tasks
        saveTasks("tasks.txt", taskToSave);
        //take objects from task and make them an arraylist
        //saving objects
        ArrayList<Task> tasks = new ArrayList<Task>();
        for(Task task: tasksView.getItems()){
            tasks.add(task);
        }
        saveObject(new File("taskObjects.txt"), tasks);
    }


    @FXML
    private void loadTasks(String filename){
        //loading by splitting the object parameters and parsing for a LocalDate and a String
        File file = new File(filename);
        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                Task newTask = new Task(LocalDate.parse(parts[0]), parts[1]);
                tasks.add(newTask);
            }
        }catch(Exception e){
            System.out.println("File Error");
        }
    }


    @FXML 
    private void loadButton(ActionEvent event){
        //using our loadTasks method to load our todo list and clearing pre-existing task list
        tasksView.getItems().clear();
        loadTasks("taskObjects.txt");
        tasksView.setItems(tasks);
    }

    @FXML

    private void clearButton(ActionEvent event){
        //clearing the list
        tasksView.getItems().clear();
    }

 
   

}
        



    


    

    


  

    
    


    




