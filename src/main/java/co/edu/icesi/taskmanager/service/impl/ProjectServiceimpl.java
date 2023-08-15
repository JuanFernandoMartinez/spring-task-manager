package co.edu.icesi.taskmanager.service.impl;

import co.edu.icesi.taskmanager.persistence.models.Project;
import co.edu.icesi.taskmanager.persistence.repository.ProjectRepository;
import co.edu.icesi.taskmanager.persistence.repository.impl.ProjectRepositoryImpl;
import co.edu.icesi.taskmanager.service.ProjectService;

public class ProjectServiceimpl implements ProjectService {

    private final ProjectRepository projectRepository;

    public  ProjectServiceimpl(){
        projectRepository = new ProjectRepositoryImpl();
    }


    @Override
    public Project save(Project p) {
        return projectRepository.save(p);
    }

    @Override
    public Project findById(long id) {
        return projectRepository.findById(id).orElse(null);
    }

    //lombok

    //data - service - controller
}
