package ua.lviv.lgs;

import java.util.List;

public interface StudentDao {

	Student create(Student student);
	
	Student readById(int id);
	
	List<Student> readAll();
	
	Student update(Student student);
	
	void delete(int id);
	
}
