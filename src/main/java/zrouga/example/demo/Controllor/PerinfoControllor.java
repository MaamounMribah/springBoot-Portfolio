package zrouga.example.demo.Controllor;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import zrouga.example.demo.Model.PersonalInfo;
import zrouga.example.demo.Services.PersonnelinfoService;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class PerinfoControllor {
	@Autowired
	private PersonnelinfoService cs;
	
	@GetMapping(path = "/info")
	public @ResponseBody Iterable<PersonalInfo> getAll() {
		return cs.findAll();
	}

	@GetMapping(path = "/info/{id}")
	private Optional<PersonalInfo> getinfo(@PathVariable int id) {
		return cs.findbyid(id);

	}

	@PostMapping(path = { "/info/{id}" })
	private PersonalInfo addinfo(@RequestBody PersonalInfo Experience, @PathVariable int id) {
	return  cs.create(Experience);

	}

	@PutMapping(path = { "/info" })
	private PersonalInfo updateinfo(@RequestBody PersonalInfo Experience) {

		return this.cs.create(Experience);
	}

	@DeleteMapping(path = "/info/{id}")
	private boolean Deleteinfo(@PathVariable int id) {
		return this.cs.Delete(id);

	}

}
