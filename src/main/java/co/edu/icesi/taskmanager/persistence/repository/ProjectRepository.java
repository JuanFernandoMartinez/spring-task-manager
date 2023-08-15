package co.edu.icesi.taskmanager.persistence.repository;

import co.edu.icesi.taskmanager.persistence.models.Project;

import java.util.Optional;

public interface ProjectRepository {

    /**
     * method used to store project instances
     * @param p project to be stored
     * @return project if it wasn't in the db otherwise null
     */
    Project save(Project p);

    Optional<Project> findById(long ID);
}
