package pe.edu.upc.uct.business.crud;


import java.util.List;
import java.util.Optional;

import pe.edu.upc.uct.model.entity.User;

public interface UserService extends CrudService<User, Integer> {
	Optional<User> findByUsername(String username);
	
	public Integer insert(User user);

	List<User> list();

}
