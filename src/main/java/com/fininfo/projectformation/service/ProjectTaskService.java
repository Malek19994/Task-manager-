package com.fininfo.projectformation.service;

import com.fininfo.projectformation.domain.ProjectTask;
import com.fininfo.projectformation.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Transactional
@Service
public class ProjectTaskService {
    @Autowired
    private ProjectRepository projectRepository;
    public ProjectTask saveOrUpdateProjectTask(ProjectTask projectTask){

        if (projectTask.getStatus()==null || projectTask.getStatus()==""){
            projectTask.setStatus("TO_DO");
        }

        return projectRepository.save(projectTask);
    }


    public Iterable<ProjectTask> findAll() {

        return projectRepository.findAll();
    }


    public  ProjectTask findById(Long id){
        return projectRepository.getById(id);
    }

    public void delete(Long id){
        ProjectTask projectTask = findById(id);
        projectRepository.delete(projectTask);
    }

}
