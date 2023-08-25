package zrouga.example.demo.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zrouga.example.demo.Model.PersonalInfo;
import zrouga.example.demo.Repository.PersonalInfoRepo;
@Service
public class PersonnelinfoService extends Abstarctservices<PersonalInfo> {
	@Autowired
	private PersonalInfoRepo sr;

	@Override
	public Iterable<PersonalInfo> findAll() {
		
		return sr.findAll();
	}

	@Override
	public Optional<PersonalInfo> findbyid(int id) {
		// TODO Auto-generated method stub
		return sr.findById(id);
	}

	@Override
	public boolean Delete(int id) {
		// TODO Auto-generated method stub
		return sr.existsById(id);
	}

	@Override
	public PersonalInfo update(PersonalInfo a) {
		// TODO Auto-generated method stub
		return sr.save(a);
	}

	@Override
	public PersonalInfo create(PersonalInfo a) {
		// TODO Auto-generated method stub
		return sr.save(a);
	}

}
