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

import zrouga.example.demo.Model.Experiences;

import zrouga.example.demo.Services.ExperienceService;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class experienceControllor {
	@Autowired
	private ExperienceService cs;
	
	@GetMapping(path = "/Experiences")
	public @ResponseBody Iterable<Experiences> getAll() {
		return cs.findAll();
	}

	@GetMapping(path = "/Experience/{id}")
	private Optional<Experiences> getExperience(@PathVariable int id) {
		return cs.findbyid(id);

	}

	@PostMapping(path = { "/Experience/{id}" })
	private Experiences addExperience(@RequestBody Experiences Experience, @PathVariable int id) {
	return  cs.create(Experience);

	}

	@PutMapping(path = { "/Experience" })
	private Experiences updateExperiences(@RequestBody Experiences Experience) {

		return this.cs.create(Experience);
	}

	@DeleteMapping(path = "/Experience/{id}")
	private boolean DeleteExperience(@PathVariable int id) {
		return this.cs.Delete(id);

	}

}
