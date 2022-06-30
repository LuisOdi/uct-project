package pe.edu.upc.uct.business.crud;

import java.util.List;

import pe.edu.upc.uct.model.entity.Enrollment;
import pe.edu.upc.uct.model.entity.Section;
import pe.edu.upc.uct.model.entity.Student;

public interface EnrollmentService extends CrudService<Enrollment, Integer>{
	public List<String[]> Reporte1();

	public Integer insert(Enrollment enrollment);
	
	public Integer verifyVacancies(Enrollment enrollment);
	
	public Integer veriflyCredits(Enrollment enrollment);
	
	public void NewVacancies(Section section,Enrollment enrollment);

	public void UpdateCredit(Student student,Enrollment enrollment);
	
	
	public void Restaurar(Integer IDenrollment);
}
