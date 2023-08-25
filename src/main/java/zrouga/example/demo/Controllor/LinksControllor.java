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

import zrouga.example.demo.Model.Sociallinks;
import zrouga.example.demo.Services.LinksService;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class LinksControllor {
	@Autowired
	private LinksService cs;
	
	@GetMapping(path = "/Links")
	public @ResponseBody Iterable<Sociallinks> getAll() {
		return cs.findAll();
	}

	@GetMapping(path = "/links/{id}")
	private Optional<Sociallinks> getSociallinks(@PathVariable int id) {
		return cs.findbyid(id);

	}

	@PostMapping(path = { "/links/{id}" })
	private Sociallinks addSociallinks(@RequestBody Sociallinks Sociallinks, @PathVariable int id) {
	return  cs.create(Sociallinks);

	}

	@PutMapping(path = { "/links" })
	private Sociallinks updateLinksControllor(@RequestBody Sociallinks Sociallinks) {

		return this.cs.create(Sociallinks);
	}

	@DeleteMapping(path = "/links/{id}")
	private boolean DeleteSociallinks(@PathVariable int id) {
		return this.cs.Delete(id);

	}

}
