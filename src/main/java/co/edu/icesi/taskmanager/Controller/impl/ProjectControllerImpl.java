package co.edu.icesi.taskmanager.Controller.impl;

import co.edu.icesi.taskmanager.Controller.ProjectController;
import co.edu.icesi.taskmanager.DTO.ProjectDTO;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProjectControllerImpl implements ProjectController {
    @Override
    public ProjectDTO create(ProjectDTO projectDTO) {
        return null;
    }

    @Override
    public ProjectDTO findById(long id) {
        return null;
    }
}
