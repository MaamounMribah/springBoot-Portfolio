package zrouga.example.demo.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zrouga.example.demo.Model.Projects;
import zrouga.example.demo.Repository.ProjectsRepo;
@Service
public class ProjectsService extends Abstarctservices<Projects> {
	@Autowired
	private ProjectsRepo sr;

	@Override
	public Iterable<Projects> findAll() {
		
		return sr.findAll();
	}

	@Override
	public Optional<Projects> findbyid(int id) {
		// TODO Auto-generated method stub
		return sr.findById(id);
	}

	@Override
	public boolean Delete(int id) {
		// TODO Auto-generated method stub
		return sr.existsById(id);
	}

	@Override
	public Projects update(Projects a) {
		// TODO Auto-generated method stub
		return sr.save(a);
	}

	@Override
	public Projects create(Projects a) {
		// TODO Auto-generated method stub
		return sr.save(a);
	}

}
