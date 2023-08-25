package zrouga.example.demo.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zrouga.example.demo.Model.Sociallinks;
import zrouga.example.demo.Repository.LinksRepo;
@Service
public class LinksService extends Abstarctservices<Sociallinks> {
	@Autowired
	private LinksRepo sr;

	@Override
	public Iterable<Sociallinks> findAll() {
		
		return sr.findAll();
	}

	@Override
	public Optional<Sociallinks> findbyid(int id) {
		// TODO Auto-generated method stub
		return sr.findById(id);
	}

	@Override
	public boolean Delete(int id) {
		// TODO Auto-generated method stub
		return sr.existsById(id);
	}

	@Override
	public Sociallinks update(Sociallinks a) {
		// TODO Auto-generated method stub
		return sr.save(a);
	}

	@Override
	public Sociallinks create(Sociallinks a) {
		// TODO Auto-generated method stub
		return sr.save(a);
	}

}
