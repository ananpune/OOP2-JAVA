package JavaProject;

import java.time.LocalDate;



//task Object for our ToDo List
public class Task {
    private LocalDate date;
    private String task;

    public Task(LocalDate date, String task) {
        this.date = date;
        this.task = task;
    }

    public LocalDate getDate() {
        return date;
    }
    public String getTask() {
        return task;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setTask(String task) {
        this.task = task;
    }
    @Override
    public String toString() {
        return "Date: " + date + " Task: " + task;
    }

  
    
    
}
