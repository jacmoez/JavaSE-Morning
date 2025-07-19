package mm.com.ams.demo2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private boolean completed;

    public void setId(int id){
        this.id = id;
    }

    public Integer id(){
        return id;
    }
    
    public void setTitle(String title){
        this.title = title;
    }

    public String gettTitle(){
        return title;
    }

    public void setCompleted(boolean completed){
        this.completed = completed;
    }

    public boolean isCompleted(){
        return completed;
    }
}
