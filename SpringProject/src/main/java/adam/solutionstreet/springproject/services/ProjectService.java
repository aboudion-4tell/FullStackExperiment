package adam.solutionstreet.springproject.services;

import adam.solutionstreet.springproject.domain.Project;
import adam.solutionstreet.springproject.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){

        return projectRepository.save(project);
    }
}
