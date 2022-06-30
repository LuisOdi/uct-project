package pe.edu.upc.uct.business.crud;

import java.util.List;

import pe.edu.upc.uct.model.entity.Teacher;

public interface TeacherService extends CrudService<Teacher, String>{
	List<Teacher> findByLastNameAndFirstName(String lastName, String firstName) throws Exception;

}
