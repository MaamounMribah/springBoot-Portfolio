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

import zrouga.example.demo.Model.Projects;
import zrouga.example.demo.Services.ProjectsService;





@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ProjectsControllor {
	@Autowired
	private ProjectsService cs;
	
	@GetMapping(path = "/Projects")
	public @ResponseBody Iterable<Projects> getAll() {
		return cs.findAll();
	}

	@GetMapping(path = "/Project/{id}")
	private Optional<Projects> getProject(@PathVariable int id) {
		return cs.findbyid(id);

	}

	@PostMapping(path = { "/Project/{id}" })
	private Projects addProject(@RequestBody Projects Project, @PathVariable int id) {
	return  cs.create(Project);

	}

	@PutMapping(path = { "/Project" })
	private Projects updateProjects(@RequestBody Projects Project) {

		return this.cs.create(Project);
	}

	@DeleteMapping(path = "/Project/{id}")
	private boolean DeleteProject(@PathVariable int id) {
		return this.cs.Delete(id);

	}

}
