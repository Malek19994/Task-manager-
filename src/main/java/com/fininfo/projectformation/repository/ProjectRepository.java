package com.fininfo.projectformation.repository;

import com.fininfo.projectformation.domain.ProjectTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ProjectRepository extends CrudRepository<ProjectTask,Long> {


    ProjectTask getById(Long id);
}
