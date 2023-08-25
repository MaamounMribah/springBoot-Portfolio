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

import zrouga.example.demo.Model.Skill;
import zrouga.example.demo.Services.SkillService;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class SkillControllor {
	@Autowired
	private SkillService cs;
	
	@GetMapping(path = "/Skills")
	public @ResponseBody Iterable<Skill> getAll() {
		return cs.findAll();
	}

	@GetMapping(path = "/Skill/{id}")
	private Optional<Skill> getSkill(@PathVariable int id) {
		return cs.findbyid(id);

	}

	@PostMapping(path = { "/Skill/{id}" })
	private Skill addSkill(@RequestBody Skill Skill, @PathVariable int id) {
	return  cs.create(Skill);

	}

	@PutMapping(path = { "/Skill" })
	private Skill updateSkills(@RequestBody Skill Skill) {

		return this.cs.create(Skill);
	}

	@DeleteMapping(path = "/Skill/{id}")
	private boolean DeleteSkill(@PathVariable int id) {
		return this.cs.Delete(id);

	}

}
