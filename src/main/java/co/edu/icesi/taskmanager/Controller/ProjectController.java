package co.edu.icesi.taskmanager.Controller;

import co.edu.icesi.taskmanager.DTO.ProjectDTO;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/project")
public interface ProjectController {
    // CRUD -> Create Read Update Delete
    //methods->POST  GET   PUT  DELETE


    //DTO -> data transfer object

    @PostMapping
    ProjectDTO create(@RequestBody ProjectDTO projectDTO);

    @GetMapping("/{id}")
    ProjectDTO findById(@PathVariable long id);




}
