package pe.edu.upc.uct.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.uct.model.entity.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student, String>{
	List<Student> findByLastNameAndFirstName(String lastName, String firstName) throws Exception;

}
