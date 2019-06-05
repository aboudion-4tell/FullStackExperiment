package adam.solutionstreet.springproject.repositories;

import adam.solutionstreet.springproject.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository <Project, Long> {

}
