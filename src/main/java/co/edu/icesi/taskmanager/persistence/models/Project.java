package co.edu.icesi.taskmanager.persistence.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Project{

    private long ID;
    private String title;


    @Override
    public int hashCode() {
        return super.hashCode();
    }


}
