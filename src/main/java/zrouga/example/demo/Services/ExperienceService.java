package zrouga.example.demo.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zrouga.example.demo.Model.Experiences;
import zrouga.example.demo.Repository.ExperienceRepo;
@Service
public class ExperienceService extends Abstarctservices<Experiences> {
	@Autowired
	private ExperienceRepo sr;

	@Override
	public Iterable<Experiences> findAll() {
		
		return sr.findAll();
	}

	@Override
	public Optional<Experiences> findbyid(int id) {
		// TODO Auto-generated method stub
		return sr.findById(id);
	}

	@Override
	public boolean Delete(int id) {
		// TODO Auto-generated method stub
		return sr.existsById(id);
	}

	@Override
	public Experiences update(Experiences a) {
		// TODO Auto-generated method stub
		return sr.save(a);
	}

	@Override
	public Experiences create(Experiences a) {
		// TODO Auto-generated method stub
		return sr.save(a);
	}

}
