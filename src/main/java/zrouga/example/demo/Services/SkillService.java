package zrouga.example.demo.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zrouga.example.demo.Model.Skill;
import zrouga.example.demo.Repository.SkillRepo;
@Service
public class SkillService extends Abstarctservices<Skill> {
	@Autowired
	private SkillRepo sr;

	@Override
	public Iterable<Skill> findAll() {
		
		return sr.findAll();
	}

	@Override
	public Optional<Skill> findbyid(int id) {
		// TODO Auto-generated method stub
		return sr.findById(id);
	}

	@Override
	public boolean Delete(int id) {
		// TODO Auto-generated method stub
		return sr.existsById(id);
	}

	@Override
	public Skill update(Skill a) {
		// TODO Auto-generated method stub
		return sr.save(a);
	}

	@Override
	public Skill create(Skill a) {
		// TODO Auto-generated method stub
		return sr.save(a);
	}

}
