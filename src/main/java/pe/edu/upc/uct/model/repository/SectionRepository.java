package pe.edu.upc.uct.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.uct.model.entity.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section, String>{

}
