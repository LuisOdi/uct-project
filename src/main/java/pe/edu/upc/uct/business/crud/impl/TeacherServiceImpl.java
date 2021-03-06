package pe.edu.upc.uct.business.crud.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.uct.business.crud.TeacherService;
import pe.edu.upc.uct.model.entity.Teacher;
import pe.edu.upc.uct.model.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherRepository teacherRepository;

	@Override
	public JpaRepository<Teacher, String> getJpaRepository() {
		return this.teacherRepository;
	}

	@Override
	public List<Teacher> findByLastNameAndFirstName(String lastName, String firstName) throws Exception {
		return this.teacherRepository.findByLastNameAndFirstName(lastName, firstName);
	}
}
