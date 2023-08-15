package co.edu.icesi.taskmanager.persistence.repository.impl;

import co.edu.icesi.taskmanager.persistence.models.Project;
import co.edu.icesi.taskmanager.persistence.repository.ProjectRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProjectRepositoryImpl implements ProjectRepository {

    private List<Project> projects;

    public ProjectRepositoryImpl(){
        projects = new ArrayList<>();
    }

    @Override
    public Project save(Project p) {
        if (!projects.contains(p)) {
            projects.add(p);
            return p;
        }else{
            return null;
        }
    }

    @Override
    public Optional<Project> findById(long ID) {
        return Optional.of(projects.stream().filter(e-> e.getID() == ID).toList().get(0));
    }
}
