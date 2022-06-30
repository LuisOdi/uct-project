package pe.edu.upc.uct.business.crud;

import java.util.List;

import pe.edu.upc.uct.model.entity.Student;

public interface StudentService extends CrudService<Student, String>{
	List<Student> findByLastNameAndFirstName(String lastName, String firstName) throws Exception;

}
