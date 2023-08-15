package co.edu.icesi.taskmanager.service;

import co.edu.icesi.taskmanager.persistence.models.Project;

public interface ProjectService {

    Project save(Project p);

    Project findById(long id);
}
