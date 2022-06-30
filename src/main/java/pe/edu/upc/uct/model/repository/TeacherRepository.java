package pe.edu.upc.uct.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.uct.model.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, String>{
	List<Teacher> findByLastNameAndFirstName(String lastName, String firstName) throws Exception;
	
}
