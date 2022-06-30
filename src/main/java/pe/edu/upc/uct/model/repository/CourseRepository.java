package pe.edu.upc.uct.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.uct.model.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, String>{

}
